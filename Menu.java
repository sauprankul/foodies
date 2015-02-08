
package com.evhacks.foodies;

import java.util.ArrayList;

/**
 * Created by rats on 2/7/2015.
 */
public class Menu {

   ArrayList<Item> getMenuItems(String restname){
       ArrayList<Item> m = new ArrayList<Item>();
       RestaurantList myList = new RestaurantList();
       ArrayList<Restaurant> r = myList.getList();
       for(int i = 0 ; i < r.size(); i++){
           if(restname == r.get(i).getName()){

            m =   r.get(i).getMenu();
               return m;
           }
       }
    return null;
   }






}
