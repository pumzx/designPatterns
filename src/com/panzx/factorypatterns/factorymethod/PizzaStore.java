package com.panzx.factorypatterns.factorymethod;

/**
 *
 * 披萨店，提供了预定披萨的功能
 * 披萨店也有纽约的披萨店和芝加哥的披萨店，两个地方的披萨不一样，但是预定的流程是一样的。未来可能还有加州的披萨。
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // 因为制作披萨的流程是一样的，所以不关心是什么种类的披萨，由子类决定。
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 工厂方法
     * @param type：披萨口味
     * @return
     */
    protected abstract Pizza createPizza(String type);

    // 其他方法...

}
