package com.panzx.strategypattern.demo001.behavior;

/**
 *
 * 使用斧头的行为类
 *
 * @author panzhixiong
 * @date 2018/11/7
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用斧头劈砍");
    }
}
