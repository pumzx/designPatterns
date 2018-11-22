package com.panzx.factorypatterns.abstractfactory;

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
        PizzaIngredientFactory chicagoIngredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case "cheese" :
                pizza = new CheesePizza(chicagoIngredientFactory);
                pizza.setName("Chicago Cheese Pizza");
                break;
            case "clam" :
                pizza = new ClamPizza(chicagoIngredientFactory);
                pizza.setName("Chicago Clam Pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}
