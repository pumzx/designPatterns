package com.panzx.factorypatterns.factorymethod;

/**
 * @author panzhixiong
 * @date 2018/11/22
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "ChicagoStyleClamPizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";
        topping.add("Shredded Mozzarella Cheese");
    }
}
