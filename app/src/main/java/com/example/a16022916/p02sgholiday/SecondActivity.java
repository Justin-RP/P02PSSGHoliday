package com.example.a16022916.p02sgholiday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16022916 on 24/4/2018.
 */

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvCat;
    ArrayList<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.listViewItem);
        tvCat = (TextView) findViewById(R.id.textViewCat);

        Intent i = getIntent();
        String hol = i.getStringExtra("hol");
        tvCat.setText(hol);

        itemList = new ArrayList<Item>();
        if(hol.equalsIgnoreCase("Secular")){
            itemList.add(new Item("New Year's Day","1 Jan 2017",1,1));
            itemList.add(new Item("Labour Day","1 May 2017",2,1));
        } else {
            itemList.add(new Item("Chinese New Year","28-29 Jan 2017",1,2));
            itemList.add(new Item("Good Friday","14 April 2017",2,2));
        }
        ArrayAdapter aa = new CustomAdapter(this, R.layout.row, itemList);
        lv.setAdapter(aa);


    }
}
