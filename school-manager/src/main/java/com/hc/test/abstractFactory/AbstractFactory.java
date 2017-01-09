package com.hc.test.abstractFactory;

/**
 * Created by lenovo on 2016/12/28.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
