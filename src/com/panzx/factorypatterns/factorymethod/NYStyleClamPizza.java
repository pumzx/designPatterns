package com.panzx.factorypatterns.factorymethod;

/**
 *
 * 纽约风格的蛤蜊味披萨
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NYStyleClamPizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Grated Reggiano Cheese");
    }
}
