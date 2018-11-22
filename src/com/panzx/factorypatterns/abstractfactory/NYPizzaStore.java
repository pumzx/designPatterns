package com.panzx.factorypatterns.abstractfactory;

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
        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese" :
                pizza = new CheesePizza(nyIngredientFactory);
                pizza.setName("NY Cheese Pizza");
                break;
            case "clam" :
                pizza = new ClamPizza(nyIngredientFactory);
                pizza.setName("NY Clam Pizza");
                break;
            default:
                    break;
        }
        return pizza;
    }
}
