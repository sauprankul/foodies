package com.evhacks.foodies;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class RestaurantsView extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_view);
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
        getMenuInflater().inflate(R.menu.menu_restaurants_list, menu);
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
}
