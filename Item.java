package com.evhacks.qrmenu;

/**
 * Created by rohan on 2/7/2015.
 */
public class Item {
    String foodName;
    double price;
    public Item(String f, double p){
        foodName = f;
        price = p;
    }
    public String toString(){
        return foodName + " $" + price;
    }
    public String getFoodName(){
        return foodName;
    }
    public double getPrice(){
        return price;
    }
}
