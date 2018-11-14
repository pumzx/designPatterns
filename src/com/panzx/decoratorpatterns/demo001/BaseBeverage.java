package com.panzx.decoratorpatterns.demo001;

/**
 *
 * 抽象类-饮料类
 *
 * @author panzhixiong
 * @date 2018/11/14
 */
public abstract class BaseBeverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
