package com.hc.test.builder;

/**
 * Created by lenovo on 2016/12/28.
 */
public class MealBuilder {
    public Meal prepare(){
        Meal meal=new Meal();
        meal.addItem(new VegBurge());
        meal.addItem(new VegBurge());
        meal.addItem(new Coke());
        return meal;
    }
}
