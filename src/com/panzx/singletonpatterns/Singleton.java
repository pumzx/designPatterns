package com.panzx.singletonpatterns;

/**
 *
 * 单例模式
 *
 * 问题：如果是用不同的类加载器去加载单例类，会造成有多个单例的实例存在
 *
 * @author panzhixiong
 * @date 2018/11/28
 */
public class Singleton {
    private volatile static Singleton singleton;
    // 共享资源
    private String name;
    private Singleton(){}

    public static Singleton getInstance() {
        // 此处判断等于null，是为了让非第一次请求的线程不用去获取锁，提高效率
        if (null == singleton) {
            synchronized (Singleton.class) {
                // 此处判断等于null，是线程第一次请求过来的时候判断实例是否已经创建
                // 假设线程A和线程B都来到来上面synchronized这里，
                // 线程A获得锁，创建实例，退出锁。
                // 线程B获取锁，因为singleton是volatile的，所以是A创建的实例对B马上可见，发现singleton已经不是null了，就退出锁。
                if (null == singleton) {
                    System.out.println("create singleton");
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("singleton finalize");
    }
}
