package com.panzx.factorypatterns.abstractfactory;

/**
 *
 * 纽约披萨原料工厂
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
