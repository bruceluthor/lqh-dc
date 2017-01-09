package com.hc.test.prototype;

import java.util.Hashtable;

/**
 * Created by lenovo on 2016/12/28.
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();
    public static Shape getShape(String shapeId){
        Shape shapeChache=shapeMap.get(shapeId);
        return (Shape) shapeChache.clone();
    }
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);
    }
}
