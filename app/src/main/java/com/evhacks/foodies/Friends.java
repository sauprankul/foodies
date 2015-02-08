package com.evhacks.foodies;
import java.util.ArrayList;
import java.util.Random;


public class Friends {
    RestaurantList myList = new RestaurantList();
   public ArrayList<Person> friends = new ArrayList<Person>();
    public Friends(){
        //creating James
        Person James = new Person("James");
        Random r = new Random();

        for(int i = 0; i < 2; i++) {
            Restaurant j = myList.getList().get(r.nextInt(5));
            System.out.print(myList.getList().size());
            James.addFavorites(j);
            int x = r.nextInt(j.getMenu().size());
//            James.addFoods(j.getMenu().get(x), j);


        }


        //creating Amy
        Person Amy = new Person("Amy");
        for(int i = 0 ; i < 2; i++) {
            Restaurant j = myList.getList().get(r.nextInt(5));
            Amy.addFavorites(j);
            int x = r.nextInt(j.getMenu().size());
//            Amy.addFoods(j.getMenu().get(x), j);
        }


        //creating Jane
        Person Jane = new Person("Jane");
        for(int i = 0 ; i < 2 ; i ++){
            Restaurant j = myList.getList().get(r.nextInt(5));
            Jane.addFavorites(j);
            int x = r.nextInt(j.getMenu().size());
//            Jane.addFoods(j.getMenu().get(x), j);
        }
        friends.add(Jane); friends.add(Amy); friends.add(James);

    }
    int counter = 0;
    public String next(){
        counter++;
        return friends.get(counter - 1).getName();
    }
}
