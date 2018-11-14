package com.panzx.decoratorpatterns.demo001;

/**
 * @author panzhixiong
 * @date 2018/11/14
 */
public class Main {
    public static void main(String[] args) {
        // 一杯加豆浆加摩卡的浓咖啡
        BaseBeverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        // beverage是Soy的实例，调用Soy中的getDescription(),
        // Soy中的getDescription()中的beverage是new Mocha(beverage);实例，所以调用的是Mocha中的getDescription()；
        // Mocha中的getDescription()中的beverage是new Espresso();实例，所以调用的是Espresso中的getDescription()
        // Espresso中的getDescription()就返回"Espresso"，
        // 代入到Mocha中的getDescription()就是"Espresso, Mocha"
        // 代入到Soy中的getDescription()就是"Espresso, Mocha, Soy"
        System.out.println(beverage.getDescription() + ", " + beverage.cost());
        System.out.println("--------------");
        BaseBeverage beverage1 = new Soy(new Mocha(new Espresso()));
        System.out.println(beverage1.getDescription() + ", " + beverage1.cost());
    }


}
