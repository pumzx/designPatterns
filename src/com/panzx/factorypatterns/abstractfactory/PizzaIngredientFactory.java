package com.panzx.factorypatterns.abstractfactory;

/**
 *
 * 披萨原料工厂---抽象工厂，生产一组产品（这里只有2个）
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public interface PizzaIngredientFactory {
    /**
     * 创建面团
     * @return
     */
    public Dough createDough();

    /**
     * 创建酱料
     * @return
     */
    public Sauce createSauce();
    // create*()......
}
