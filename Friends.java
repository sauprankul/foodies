import java.util.ArrayList;


public class Friends {
	RestaurantList myList = new RestaurantList();

    public Friends(){
        //creating James
    	Person James = new Person("James");
    	James.addFavorites(myList.getList().get(0));
    	James.addFavorites(myList.getList().get(1));
    	
    	//creating Amy
    	Person Amy = new Person("Amy");
    	Amy.addFavorites(myList.getList().get(3));
    	Amy.addFavorites(myList.getList().get(1));
    
    	//creating SpongeBob
    	Person Spongebob = new Person("Spongebob");
    	Spongebob.addFavorites(myList.getList().get(2));
    	Spongebob.addFavorites(myList.getList().get(4));
    }
}
