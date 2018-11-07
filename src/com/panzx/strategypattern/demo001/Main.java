package com.panzx.strategypattern.demo001;

import com.panzx.strategypattern.demo001.behavior.AxeBehavior;
import com.panzx.strategypattern.demo001.behavior.SwordBehavior;
import com.panzx.strategypattern.demo001.character.BaseCharacter;
import com.panzx.strategypattern.demo001.character.King;

/**
 *
 * 有很多角色，每个角色都可以战斗，并且一次只能使用一种武器
 * 每个角色都有自己的战斗方式
 * 每个角色都可以投降
 * 每个角色可以更换使用武器方式
 *
 * 策略模式定义类算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 * 理解：算法的变化就是这里的WeaponBehavior和它的不同实现类，使用算法的客户就是BaseCharacter
 *
 * @author panzhixiong
 * @date 2018/11/7
 */
public class Main {
    public static void main(String[] args) {
        BaseCharacter character = new King();
        // 动态的设定行为
        character.setWeaponBehavior(new SwordBehavior());
        character.fight();
        character.useWeapon();
        character.surrender();

        // 更换使用武器的形式
        character.setWeaponBehavior(new AxeBehavior());
        character.fight();
        character.useWeapon();
        character.surrender();
    }
}
