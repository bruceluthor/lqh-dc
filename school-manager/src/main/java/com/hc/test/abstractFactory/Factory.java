package com.hc.test.abstractFactory;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Factory {
    public static AbstractFactory getFactory(String factory){
        if(factory==null){
            return null;
        }
        if(factory.equalsIgnoreCase("shapeFactory")){
            return new ShapeFactory();
        }else if (factory.equalsIgnoreCase("colorFactory")){
            return new ColorFactory();
        }
        return null;
    }
}
