package com.evhacks.qrmenu;

import java.util.ArrayList;

/**
 * Created by rats on 2/7/2015.
 */

//make a food list for each restaurant
    // make a remove method
public class Person {
String name;
    Restaurant[] tracker = new Restaurant[5];
ArrayList<Restaurant> favorites;
ArrayList<ArrayList<Item>> foodsFromRestaurants;
ArrayList<Item> myOrder;
    Restaurant currentRestaurant;

public Person(String name){
    this.name = name;
    favorites = null;
    foodsFromRestaurants = null;
    currentRestaurant = null;
}


int counter = 0;
public void addFavorites(Restaurant r){
    favorites.add(r);
    currentRestaurant = r;
}

    void addFoods(Item i, Restaurant r){
       if(currentRestaurant == r) {
           foodsFromRestaurants.get(counter).add(i);
       }
        else{
           counter ++ ;
           foodsFromRestaurants.get(counter).add(i);
       }
        tracker[counter%5] = currentRestaurant;
    }


    ArrayList<Restaurant> getFavoriteRestaurants(){
        return favorites;
    }
    ArrayList<Item> getFavoriteFoods(Restaurant r){
        //find index of r
        int index = 0;
        for(int i = 0 ; i < tracker.length; i ++){
            if(tracker[i] == r){
                index = i;
            }//end if
        }//end for
        return foodsFromRestaurants.get(index);
    }

    double getPricesOfItems(Restaurant r){
     int index = 0;
        for(int i = 0; i < tracker.length; i ++){
            if(tracker[i] ==r){
                index = i;
            }//if
        }//fpr
        double sum = 0;
        ArrayList<Item> f = foodsFromRestaurants.get(index);
        for(int i = 0; i <f.size(); i++){
            sum+=f.get(i).getPrice();
        }
        return sum;
    }

   String getName(){
        return name;
    }



}
