package com.panzx.factorypatterns.abstractfactory;

/**
 * @author panzhixiong
 * @date 2018/11/22
 */
public class Main {
    public static void main(String[] args) {
        // 订购一个纽约风味的芝士披萨,不关心这个披萨怎么做出来的
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("ordered a " + pizza.getName());

        System.out.println("---------------------------");

        // 订购一个芝加哥风味的蛤蜊味披萨
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("ordered a " + pizza.getName());
    }
}
