package com.hc.test.builder;

/**
 * Created by lenovo on 2016/12/28.
 */
public abstract class Burge implements Item{
    public Packing packing(){
     return new Wrapper();
    }
    public abstract float price();
}
