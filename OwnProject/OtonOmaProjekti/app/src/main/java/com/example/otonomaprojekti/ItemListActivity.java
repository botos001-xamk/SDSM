package com.example.otonomaprojekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

public class ItemListActivity extends AppCompatActivity {

    ListView myListView;
    String[] names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);



        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        names = res.getStringArray(R.array.names);

        OtonItemAdapter otonItemAdapter = new OtonItemAdapter(this, names);
        myListView.setAdapter(otonItemAdapter);

    }
}