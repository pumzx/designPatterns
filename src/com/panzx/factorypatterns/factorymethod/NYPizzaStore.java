package com.panzx.factorypatterns.factorymethod;

/**
 *
 * 纽约披萨店，有自己独特的披萨类型
 * 芝士味或蛤蜊味披萨
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class NYPizzaStore extends PizzaStore {

    /**
     *
     * 决定创造什么种类的披萨
     *
     * @param type：披萨口味
     * @return
     */
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese" :
                pizza = new NYStyleCheesePizza();
                break;
            case "clam" :
                pizza = new NYStyleClamPizza();
            default:
                    break;
        }
        return pizza;
    }
}
