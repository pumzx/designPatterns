package com.panzx.strategypattern.demo001.behavior;

/**
 *
 * 使用宝剑的行为类
 *
 * @author panzhixiong
 * @date 2018/11/7
 */
public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("使用宝剑挥舞");
    }
}
