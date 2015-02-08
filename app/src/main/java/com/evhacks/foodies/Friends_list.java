package com.evhacks.foodies;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.TextView;


public class Friends_list extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_list);

//        RestaurantList mahlist = new RestaurantList();
        Friends friends = new Friends();
        TextView text_field = (TextView) this.findViewById(R.id.rest1);
        text_field.setText(friends.next());
        text_field = (TextView) this.findViewById(R.id.rest2);
        text_field.setText(friends.next());
        text_field = (TextView) this.findViewById(R.id.rest3);
        text_field.setText(friends.next());
        text_field = (TextView) this.findViewById(R.id.rest4);
        text_field.setText("not coded");
        text_field = (TextView) this.findViewById(R.id.rest5);
        text_field.setText("also not coded");



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_friends_list, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.start_all) {
            Intent intent = new Intent(this, All.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.start_favs) {
            Intent intent = new Intent(this, Favorites.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.start_friends) {
            Intent intent = new Intent(this, Friends_list.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void start_favs(){
        Intent intent = new Intent(Friends_list.this, Favorites.class);
        startActivity(intent);
    }

    public void start_all(){
        Intent intent = new Intent(Friends_list.this, All.class);
        startActivity(intent);
    }

    public void start_friends(){
        Intent intent = new Intent(Friends_list.this, Friends_list.class);
        startActivity(intent);
    }
}
