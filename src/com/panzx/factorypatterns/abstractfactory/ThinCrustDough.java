package com.panzx.factorypatterns.abstractfactory;

/**
 *
 * 纽约的薄壳面团
 *
 * @author panzhixiong
 * @date 2018/11/22
 */
public class ThinCrustDough implements Dough {
    public ThinCrustDough() {
        System.out.println("create ThinCrustDough");
    }
}
