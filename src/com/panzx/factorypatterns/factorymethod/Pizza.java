package com.panzx.factorypatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 披萨类
 * 有一些属性，也有一些制作过程
 * 不同面团，酱料，佐料构成类不同口味的披萨，即不一样的子类
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public abstract class Pizza {
    /**
     * 名称
     */
    String name;
    /**
     * 面团类型
     */
    String dough;
    /**
     * 酱料类型
     */
    String sauce;
    /**
     * 一套佐料
     */
    List<String> topping = new ArrayList<>();

    /**
     * 默认的准备动作
     */
    void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough: " + dough);
        System.out.println("adding sauce: " + sauce);
        System.out.println("adding toppings:  ");
        for (int i = 0; i < topping.size(); i++) {
            System.out.println(topping.get(i));
        }
    }

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
}
