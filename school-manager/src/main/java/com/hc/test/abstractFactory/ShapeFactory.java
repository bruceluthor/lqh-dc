package com.hc.test.abstractFactory;

/**
 * Created by lenovo on 2016/12/28.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("square")){
            return new Square();
        }else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
