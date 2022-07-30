package com.example.otonomaprojekti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class OtonItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;

    public OtonItemAdapter(Context c, String[] n){
        names = n;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    String[] names;

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.my_listview_layout, null);
        TextView namesTextView = (TextView) v.findViewById(R.id.myNameTextView);

        String name = names[position];

        namesTextView.setText(name);




        return v;
    }


}
