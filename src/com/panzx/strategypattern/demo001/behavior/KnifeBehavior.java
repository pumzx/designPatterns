package com.panzx.strategypattern.demo001.behavior;

/**
 *
 * 使用匕首的行为类
 *
 * @author panzhixiong
 * @date 2018/11/7
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用匕首刺杀");
    }
}
