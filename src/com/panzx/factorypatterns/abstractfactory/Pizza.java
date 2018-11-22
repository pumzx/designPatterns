package com.panzx.factorypatterns.abstractfactory;

/**
 * @author panzhixiong
 * @date 2018/11/22
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;

    /**
     * 准备原料---让抽象工厂去创建原料对象
     */
    abstract void prepare();

    /**
     * 烘烤
     */
    void bake() {
        System.out.println("bake for 25 min at 350");
    }

    /**
     * 切片
     */
    void cut() {
        System.out.println("cut the pizza");
    }

    /**
     * 装盒
     */
    void box() {
        System.out.println("place the pizza in box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
