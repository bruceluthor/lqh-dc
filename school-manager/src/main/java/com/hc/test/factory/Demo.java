package com.hc.test.factory;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Demo {
    public static void main(String args[]){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("rectangle");
        shape1.draw();
    }
}
