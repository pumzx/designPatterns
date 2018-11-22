package com.panzx.factorypatterns.abstractfactory;

/**
 *
 * 芝加哥风味披萨原料工厂
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
