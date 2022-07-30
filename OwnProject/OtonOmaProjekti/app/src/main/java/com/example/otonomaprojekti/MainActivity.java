package com.example.otonomaprojekti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //https://developer.android.com/guide/topics/ui/notifiers/toasts
        Button toastBtn = (Button) findViewById(R.id.toastBtn);

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Hello World Toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button listActivityBtn = (Button) findViewById(R.id.listBtn);
        listActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivityIntent = new Intent(getApplicationContext(), ItemListActivity.class);
                startActivity(listActivityIntent);
            }
        });



        //Night mode tutorial: https://www.youtube.com/watch?v=6toOIUQqy-Q
        Switch themeSwitch = (Switch) findViewById(R.id.themeSwitch);
        themeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("something", "MESSAGE");
                if(isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        WebView browser = (WebView) findViewById(R.id.WebView);
        browser.loadUrl("https://www.google.com");



    }
}