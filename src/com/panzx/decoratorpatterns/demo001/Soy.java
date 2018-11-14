package com.panzx.decoratorpatterns.demo001;

/**
 *
 * 调味料-豆浆
 *
 * @author panzhixiong
 * @date 2018/11/14
 */
public class Soy extends BaseCondimentDecorator {
    BaseBeverage beverage;

    public Soy(BaseBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3.3;
    }
}
