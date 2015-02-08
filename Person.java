package com.evhacks.qrmenu;

import java.util.ArrayList;

/**
 * Created by rats on 2/7/2015.
 */
public class Person {
String name;
ArrayList<Restaurant> favorites;
ArrayList<Item> foods;
    
public Person(String name){
    this.name = name;
    favorites = null;
    foods = null;
}
    
   
    
public void addFavorites(Restaurant r){
    favorites.add(r);
}
   
    void addFoods(Item i){
        foods.add(i);
    }
    
    
    ArrayList<Restaurant> getFavoriteRestaurants(){
        return favorites;
    }
    ArrayList<Item> getFavoriteFoods(){
        return foods;
    }
    
   String getName(){
        return name;
    }
    
    

}
