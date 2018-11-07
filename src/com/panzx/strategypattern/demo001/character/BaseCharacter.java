package com.panzx.strategypattern.demo001.character;

import com.panzx.strategypattern.demo001.behavior.WeaponBehavior;

/**
 *
 * 角色类
 *
 * @author panzhixiong
 * @date 2018/11/7
 */
public abstract class BaseCharacter {
    /**
     * 使用武器的行为接口,has-a关系
     */
    private WeaponBehavior weaponBehavior;

    /**
     * 每个角色的战斗方式不一样
     */
    public abstract void fight();

    /**
     * 使用武器 委托给 使用武器的行为类，独立于角色本身而存在
     */
    public void useWeapon() {
        weaponBehavior.useWeapon();
    }

    /**
     * 投降-每个角色的投降动作是一样的
     */
    public void surrender() {
        System.out.println("投降");
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
