package com.acadgild.s6A3TextColorChanger;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView bodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Text Color Changer");
        setContentView(R.layout.activity_main);

        bodyText = (TextView) findViewById(R.id.body_text);
        bodyText.setTextColor(Color.BLACK);

        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.menu_heading:{
                break;}

            case R.id.DEFAULT:{
                bodyText.setTextColor(Color.BLACK);
                break;}
            case R.id.RED:{
                bodyText.setTextColor(Color.RED);
                break;}
            case R.id.BLUE:{
                bodyText.setTextColor(Color.BLUE);
                break;}
            case R.id.GREEN:{
                bodyText.setTextColor(Color.GREEN);
                break;}

            default:{
                bodyText.setTextColor(Color.BLACK);
                break;
            }
        }

        return true;
    }
}
