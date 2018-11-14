package com.panzx.decoratorpatterns.demo001;

/**
 *
 * 调味料-摩卡
 *
 * @author panzhixiong
 * @date 2018/11/14
 */
public class Mocha extends BaseCondimentDecorator{
    BaseBeverage beverage;

    public Mocha(BaseBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.5;
    }
}
