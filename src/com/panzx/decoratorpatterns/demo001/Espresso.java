package com.panzx.decoratorpatterns.demo001;

/**
 *
 * 组件-浓咖啡
 *
 * @author panzhixiong
 * @date 2018/11/14
 */
public class Espresso extends BaseBeverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
