package com.example.sivaprasad.list;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Siva Prasad on 9/5/2015.
 */
public class ContactAdapter extends BaseAdapter{

    Context context;
    String[][] cars;

    public ContactAdapter(Context ctxt, String[][] carData){
        super();
        cars = carData;
        context = ctxt;
    }

    @Override
    public int getCount() {
        return cars.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView = new TextView(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (cars[position][1].equals("standard")) {
            convertView = inflater.inflate(R.layout.standard_car, parent, false);
            textView = (TextView) convertView.findViewById(R.id.textView4);
        }
        else if (cars[position][1].equals("premium")){
            convertView = inflater.inflate(R.layout.premium_car, parent, false);
            textView = (TextView) convertView.findViewById(R.id.textView3);
        }

        if (textView !=null){
            textView.setText(cars[position][0]);
        }

        return convertView;
    }
}
