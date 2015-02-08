package com.evhacks.qrmenu;

import java.util.ArrayList;

/**
 * Created by rohan on 2/7/2015.
 */
public class Restaurant {
    String name;
    ArrayList<Item> menu = new ArrayList<Item>();
    public Restaurant(String n, ArrayList<Item> m){
        name = n;
        menu = m;
    }
    public String toString(){
        String a = name + "/n";
        for(int i = 0 ; i < menu.size(); i++){
            a+=menu.get(i).toString() + "/n";
        }
        return a;
    }
    public String getMenu(){
        return menu.toString();
    }
    public String getName(){
        return name;
    }


}
