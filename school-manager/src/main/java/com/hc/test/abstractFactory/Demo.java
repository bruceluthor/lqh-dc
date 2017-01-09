package com.hc.test.abstractFactory;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Demo {
    public static void main(String args[]){
        AbstractFactory colorFactory=Factory.getFactory("colorFactory");
        AbstractFactory shapeFactory=Factory.getFactory("shapeFactory");
        Shape shape=shapeFactory.getShape("circle");
        Color color=colorFactory.getColor("blue");
        color.fill();
        shape.draw();
    }
}
