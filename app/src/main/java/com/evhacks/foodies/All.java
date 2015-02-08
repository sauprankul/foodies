package com.evhacks.foodies;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class All extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
        RestaurantList mahlist = new RestaurantList();
        TextView text_field = (TextView) this.findViewById(R.id.rest1);
        text_field.setText(mahlist.next());
        text_field = (TextView) this.findViewById(R.id.rest2);
        text_field.setText(mahlist.next());
        text_field = (TextView) this.findViewById(R.id.rest3);
        text_field.setText(mahlist.next());
        text_field = (TextView) this.findViewById(R.id.rest4);
        text_field.setText(mahlist.next());
        text_field = (TextView) this.findViewById(R.id.rest5);
        text_field.setText(mahlist.next());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_all, menu);
        return true;
    }

    public void open_menu(View v) {
        TextView view = (TextView) v;
        RestaurantList mahRestList= new RestaurantList();
        String rest_name = (String)(view.getText());
        Intent intent = new Intent(this, MenuDisplay.class);
        intent.putExtra("rest_name", rest_name);
//        intent.getStringExtra("rest_name")
        startActivity(intent);
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
        Intent intent = new Intent(All.this, Favorites.class);
        startActivity(intent);
    }

    public void start_all(){
        Intent intent = new Intent(All.this, All.class);
        startActivity(intent);
    }

    public void start_friends(){
        Intent intent = new Intent(All.this, Friends_list.class);
        startActivity(intent);
    }
}
