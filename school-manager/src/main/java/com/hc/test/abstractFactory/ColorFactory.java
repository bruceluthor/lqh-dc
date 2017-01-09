package com.hc.test.abstractFactory;

/**
 * Created by lenovo on 2016/12/28.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }else if (color.equalsIgnoreCase("black")){
            return new Black();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
