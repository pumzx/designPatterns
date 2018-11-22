package com.panzx.factorypatterns.factorymethod;

/**
 *
 * 纽约风格的芝士披萨
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NYStyleCheesePizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Grated Reggiano Cheese");
    }

    // 其实这个披萨也可以重写其他披萨制作的方法，代表它的独特制作方法

    /**
     * 纽约风味的芝士披萨有自己独特的切片方法
     */
    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
