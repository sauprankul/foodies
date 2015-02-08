package com.evhacks.foodies;

import java.util.ArrayList;

/**
 * Created by rats on 2/7/2015.
 */

//make a food list for each restaurant
    // make a remove method
public class Person {
String name;
    Restaurant[] tracker = new Restaurant[5];
ArrayList favorites;
ArrayList foodsFromRestaurants = new ArrayList();
ArrayList myOrder;
    Restaurant currentRestaurant;

public Person(String name){
    this.name = name;
    favorites = new ArrayList<Restaurant>();
    foodsFromRestaurants = new ArrayList<ArrayList<com.evhacks.foodies.Item>>();

    currentRestaurant = null;
}


int counter = 0;
public void addFavorites(Restaurant r){
    if (r == null) {
        System.exit(-1);
    }
    favorites.add(r);
    currentRestaurant = r;
}

    void addFoods(com.evhacks.foodies.Item i, Restaurant r){
       if(currentRestaurant == r) {
           ArrayList thislist = (ArrayList)foodsFromRestaurants.get(counter);
           thislist.add(i);
       }
        else{
           counter ++ ;
           ArrayList thislist = (ArrayList)foodsFromRestaurants.get(counter);
           thislist.add(i);
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
        return (ArrayList)foodsFromRestaurants.get(index);
    }

    double getPricesOfItems(Restaurant r){
     int index = 0;
        for(int i = 0; i < tracker.length; i ++){
            if(tracker[i] ==r){
                index = i;
            }//if
        }//fpr
        double sum = 0;
        ArrayList f = (ArrayList)foodsFromRestaurants.get(index);
        for(int i = 0; i <f.size(); i++){
            sum+= ((Item)(f.get(i))).getPrice();
        }
        return sum;
    }

   String getName(){
        return name;
    }



}
