package com.panzx.factorypatterns.factorymethod;

/**
 *
 * 芝加哥风味的披萨店
 * 可以生产芝士味和蛤蜊的披萨
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese" :
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "clam" :
                pizza = new ChicagoStyleClamPizza();
            default:
                break;
        }
        return pizza;
    }
}
