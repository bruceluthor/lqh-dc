package com.hc.test.builder;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Coke extends ColdDrink {
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
