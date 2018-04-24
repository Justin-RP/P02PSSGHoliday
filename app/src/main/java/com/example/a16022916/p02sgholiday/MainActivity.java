package com.example.a16022916.p02sgholiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvTypeHol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTypeHol = (ListView)findViewById(R.id.lvTypesOfHol);
        String[] array = new String[]{"Secular","Ethnic & Religion"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, array);
        lvTypeHol.setAdapter(adapter);

        lvTypeHol.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lvTypeHol, View view, int position, long id) {
                String hol = (String) lvTypeHol.getAdapter().getItem(position);
                Intent intent = new Intent(lvTypeHol.getContext(), SecondActivity.class);
                intent.putExtra("hol", hol);

                startActivity(intent);
            }
        });
    }
}
