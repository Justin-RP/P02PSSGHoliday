package com.example.a16022916.p02sgholiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16022916 on 24/4/2018.
 */

public class CustomAdapter extends ArrayAdapter<Item>{
    private ArrayList<Item> item;
    private Context context;
    private TextView tvName;
    private ImageView ivItem;
    private TextView tvDate;

    public CustomAdapter(Context context, int resource, ArrayList<Item> object) {
        super(context, resource, object);
        // Store the food that is passed to this adapter
        item = object;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.textViewName);
        // Get the ImageView object
        ivItem = (ImageView) rowView.findViewById(R.id.imageViewItem);
        // The parameter "position" is the index of the row ListView is requesting. We get back the food at the same index.
        tvDate = (TextView) rowView.findViewById(R.id.textViewDate);
        Item currentItem = item.get(position);
        // Set the TextView to show the food
        tvName.setText(currentItem.getName());
        tvDate.setText(currentItem.getDate());
        if(currentItem.getImgType()==1) {
            if(currentItem.getImg()==1) {
                ivItem.setImageResource(R.drawable.new_year);
            } else {
                ivItem.setImageResource(R.drawable.labour_day);
            }
        } else if (currentItem.getImgType()==2) {
            if(currentItem.getImg()==1) {
                ivItem.setImageResource(R.drawable.cny);
            } else {
                ivItem.setImageResource(R.drawable.good_friday);
            }
        }

        // Return the nicely done up View to the ListView
        return rowView;

    }
}


