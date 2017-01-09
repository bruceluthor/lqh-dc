package com.hc.test.factory;

/**
 * Created by lenovo on 2016/12/28.
 */
public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape==null){
            return null;
        }
        if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
