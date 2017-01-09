package com.hc.test.builder;

/**
 * Created by lenovo on 2016/12/28.
 */
public class VegBurge extends Burge {
    public String name() {
        return "vegBurge";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
