package com.hc.test.builder;

/**
 * Created by lenovo on 2016/12/28.
 */
public abstract class ColdDrink implements Item {
    public Packing packing(){
        return new Bottle();
    }
    public abstract float price();
}
