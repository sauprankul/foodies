package com.evhacks.qrmenu;

import java.util.ArrayList;

/**
 * Created by rats on 2/7/2015.
 */
public class Person {
String name;
ArrayList<Restaurant> favoriteRestaurants = new ArrayList<Restaurant>();

    public void generateFavoriteRestaurants(){
        RestaurantList mahList = new RestaurantList();
        for(int i = 0; i <mahList.getList().size(); i++){
            if(mahList.getList().get(i).getFavorite() == true){
                favoriteRestaurants.add(mahList.getList().get(i));
            }
        }//end for
    }//end method
    public Person(String name){
        this.name = name;
        generateFavoriteRestaurants();
    }

}
