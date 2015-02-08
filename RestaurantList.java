package com.evhacks.qrmenu;

import java.util.ArrayList;

/**
 * Created by Rohan on 2/7/2015.
 */
public class RestaurantList {
    static ArrayList<Restaurant> rlist = new ArrayList<Restaurant>();
    public RestaurantList (){
        //creating mcdonalds
        ArrayList<Item> MCDMenu = new ArrayList<Item>();
        MCDMenu.add(new Item("McChicken", 1.0));
        MCDMenu.add(new Item("French Fries", 1.0));
        MCDMenu.add(new Item("Soda", 1.0));
        MCDMenu.add(new Item("Big Mac", 4.00));
        Restaurant McDonalds = new Restaurant("Mc Donalds", MCDMenu);

        //creating STARBUCKS

        ArrayList<Item> StarbucksMenu = new ArrayList<Item>();
        StarbucksMenu.add(new Item("Caramel Latte", 3.95));
        StarbucksMenu.add(new Item("Caramel Frappuccino", 4.95));
        StarbucksMenu.add(new Item("Vanilla Bean Frappuccino", 4.95));
        StarbucksMenu.add(new Item("Hot Chocolate", 3.95));
        Restaurant Starbucks = new Restaurant("Starbucks", StarbucksMenu);

        //creating taco bell


        ArrayList<Item> TacoMenu = new ArrayList<Item>();
        TacoMenu.add(new Item("Chicken Soft Taco", 1.50));
        TacoMenu.add(new Item("Bean Burrito", 1.29));
        TacoMenu.add(new Item("Fiesta Potatoes", 1.29));
        TacoMenu.add(new Item("Mexican Pizza", 3.95));
        Restaurant TacoBell = new Restaurant("Taco Bell", TacoMenu);


        //creating Panda Express
        ArrayList<Item> PandaMenu = new ArrayList<Item>();
        PandaMenu.add(new Item("Orange Chicken", 3.99));
        PandaMenu.add(new Item("Fried Rice", 2.00));
        PandaMenu.add(new Item("Chow Mein", 1.29));
        PandaMenu.add(new Item("Eggrolls", 3.95));
        Restaurant PandaExpress = new Restaurant("Panda Express", PandaMenu);



        //creating Subway
        ArrayList<Item> SubwayMenu = new ArrayList<Item>();
        SubwayMenu.add(new Item("Veggie Delite", 5.00));
        SubwayMenu.add(new Item("Oven Roasted Chicken", 5.00));
        SubwayMenu.add(new Item("Sliced Ham", 5.00));
        SubwayMenu.add(new Item("Meatball Marinara", 5.00));
        Restaurant Subway = new Restaurant("Subway", SubwayMenu);

        rlist.add(McDonalds);
        rlist.add(Starbucks);
        rlist.add(Subway);
        rlist.add(PandaExpress);
        rlist.add(TacoBell);






    }

    int counter = 0;
    public String next(){
        counter++;
        return rlist.get(counter - 1).getName();
    }
    public String toString(){
        String a = "";
        for(int i = 0; i <rlist.size(); i++){
            a = rlist.get(i).toString();
        }
        return a;
    }
    public ArrayList<Restaurant> getList(){
        return rlist;
    }



}
