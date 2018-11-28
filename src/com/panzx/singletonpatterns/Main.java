package com.panzx.singletonpatterns;

/**
 * @author panzhixiong
 * @date 2018/11/28
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Singleton singleton = Singleton.getInstance();
        singleton.setName("panzx");
        System.out.println(singleton.getName());
        // 不会因为没有了外部引用就被垃圾回收，jdk1.2之前是会被回收的
        singleton = null;
        Thread.sleep(5000);
        System.gc();
        Thread.sleep(5000);
        singleton = Singleton.getInstance();
        System.out.println(singleton.getName());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("main finalize");
    }
}
