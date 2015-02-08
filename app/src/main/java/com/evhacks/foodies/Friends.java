package com.evhacks.foodies;
import java.util.ArrayList;
import java.util.Random;


public class Friends {
    RestaurantList myList = new RestaurantList();
    ArrayList<Person> friends = new ArrayList<Person>();
    public Friends(){
        //creating James
        Person James = new Person("James");
        Random r = new Random(5);

        for(int i = 0; i < 2; i++) {
            Restaurant j = myList.getList().get(r.nextInt());
            James.addFavorites(j);
            int x = new Random(j.getMenu().size()).nextInt();
            James.addFoods(j.getMenu().get(x), j);


        }


        //creating Amy
        Person Amy = new Person("Amy");
        for(int i = 0 ; i < 2; i++) {
            Restaurant j = myList.getList().get(r.nextInt());
            Amy.addFavorites(j);
            int x = new Random(j.getMenu().size()).nextInt();
            Amy.addFoods(j.getMenu().get(x), j);
        }


        //creating Jane
        Person Jane = new Person("Jane");
        for(int i = 0 ; i < 2 ; i ++){
            Restaurant j = myList.getList().get(r.nextInt());
            Jane.addFavorites(j);
            int x = new Random(j.getMenu().size()).nextInt();
            Jane.addFoods(j.getMenu().get(x), j);
        }
        friends.add(Jane); friends.add(Amy); friends.add(James);

    }
}
