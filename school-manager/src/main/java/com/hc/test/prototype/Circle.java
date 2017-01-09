package com.hc.test.prototype;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Circle extends Shape {
    public Circle(){
        type="circle";
    }
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
