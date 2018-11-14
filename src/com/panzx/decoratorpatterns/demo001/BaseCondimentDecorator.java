package com.panzx.decoratorpatterns.demo001;

/**
 *
 * 抽象的调味类
 *
 * @author panzhixiong
 * @date 2018/11/14
 */
public abstract class BaseCondimentDecorator extends BaseBeverage{
    @Override
    public abstract String getDescription();
}
