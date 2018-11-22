package com.panzx.factorypatterns.abstractfactory;

/**
 *
 * 芝士披萨
 * 没考虑地域差异是因为原料工厂就可以区分开地域了（纽约原料工厂和芝加哥原料工厂）
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    void prepare() {
        // 披萨不关心这些原料，它只关心如何制作披萨，所以披萨和原料之间解耦了
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
