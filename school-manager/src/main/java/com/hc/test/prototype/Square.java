package com.hc.test.prototype;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Square extends Shape {
    public Square(){
        type="square";
    }
    @Override
    public void draw() {
        System.out.println("square");
    }
}
