package com.hc.test.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/12/28.
 */
public class Meal {
    private List<Item> items=new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float price=0.0f;
        for(Item item: items){
            price+=item.price();
        }
        return price;
    }
    public void showItem(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
