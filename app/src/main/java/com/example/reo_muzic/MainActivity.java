package com.example.reo_muzic;


import android.Manifest;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;

    String arr[]={"song 1","song 2","song 3","song 4","song 5","song 6","song 7","song 8","song 9","song 10"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Welcome !", Toast.LENGTH_SHORT).show();
        listview=findViewById(R.id.listview);


        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listview.setAdapter(ad);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position , long id) {
                Toast.makeText(MainActivity.this, "Playing Now", Toast.LENGTH_SHORT).show();
                MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.a1);
                music.start();
                Intent intent=new Intent(MainActivity.this,playingsong.class);
                startActivity(intent);
            }
        });


    }
}