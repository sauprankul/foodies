package com.evhacks.foodies;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.content.res.Resources;
import android.util.Log;

import java.util.ArrayList;


public class MenuDisplay extends ActionBarActivity {

    String rest_name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_display);
        Intent intent = getIntent();
        rest_name = intent.getStringExtra("rest_name");
//        Log.w("debug", "-" + rest_name + "-"); name is fine
        TextView view = (TextView)this.findViewById(R.id.rest_name);
        view.setText(rest_name);

        ArrayList<Item> mahMenus = MenuPrice.getMenuItems(rest_name);

        Resources r = getResources();
        String pkg = getPackageName();
        for (int i = 0; i < mahMenus.size(); i++){
            String thisid = "item" + (i + 1);
            TextView tv1 = (TextView)findViewById(r.getIdentifier(thisid, "id", pkg));
            tv1.setText(mahMenus.get(i).getFoodName());
            thisid = "price" + (i + 1);
            TextView tv2 = (TextView)findViewById(r.getIdentifier(thisid, "id", pkg));
            tv2.setText("$" + mahMenus.get(i).getPrice());

        }
    }

    public MenuPrice getMenu(String rest_name) {
        return new com.evhacks.foodies.MenuPrice();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //   getMenuInflater().inflate(R.menu.menu_menu_display, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void open_item(View view) {
        Intent intent = new Intent(this, ItemActivity.class);
        TextView v = (TextView)(view);
        String itemname = (String)v.getText();
        intent.putExtra("itemname", itemname);
        intent.putExtra("restname", rest_name);
        startActivity(intent);
    }


    public void onToggleClicked(View view) {
        // Is the toggle on?
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {

            //get the user's person thing


            // find rest_name in restaurant
            RestaurantList myList = new RestaurantList();
            int index = 0;
            for(int i = 0 ; i < myList.getList().size(); i++){
                if(rest_name == myList.getList().get(i).getName()){
                    index = i; break;
                }
            }
            MainActivity.thisUser.addFavorites(myList.getList().get(index));


            //add it to favorites array
            //set isFavorite to true if needed in restaurant list

            myList.getList().get(index).setFavorite(); //idk if this is needed

        } else {
            RestaurantList myList = new RestaurantList();
            int index = 0;
            for(int i = 0 ; i < myList.getList().size(); i++){
                if(rest_name == myList.getList().get(i).getName()){
                    index = i; break;
                }
            }
            MainActivity.thisUser.removeFavorites(myList.getList().get(index));
        }
    }

}
