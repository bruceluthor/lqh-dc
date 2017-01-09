package com.hc.test.singleton;

/**
 * Created by lenovo on 2016/12/28.
 */
public class SingleObject {
    private static SingleObject instance=new SingleObject();

    public static SingleObject getInstance() {
        return instance;
    }
    private SingleObject(){}
    public void message(){
        System.out.println("message");
    }
}
