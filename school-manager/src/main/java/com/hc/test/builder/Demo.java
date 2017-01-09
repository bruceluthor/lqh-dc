package com.hc.test.builder;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Demo {
    public static void main(String args[]){
        MealBuilder mealBuilder=new MealBuilder();
        Meal meal=mealBuilder.prepare();
        meal.showItem();
        System.out.print(meal.getCost());
    }
}
