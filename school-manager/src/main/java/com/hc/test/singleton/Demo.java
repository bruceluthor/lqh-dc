package com.hc.test.singleton;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Demo {
    public static void main(String args[]){
        SingleObject singleObject=SingleObject.getInstance();
        singleObject.message();
    }
}
