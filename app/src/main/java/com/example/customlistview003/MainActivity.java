package com.example.customlistview003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int image[]={R.drawable.pink_donut1,R.drawable.donut_red1,R.drawable.donut_yellow,R.drawable.green_donut1,R.drawable.tasty_donut1};
    String name[]={"Pink Donut","Tasty Donut","Tasty Donut","Yellow Donut","Green Donut"};
    //String price[]={"$20.00","$90.00","$30.00","$70.00","$50.00"};
    //khai bao listView
    ArrayList<Item> myList;
    MyArrayAdapter myadapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        myList = new ArrayList<>();//Tao moi mang(mang nay rong)
        for (int i = 0; i < name.length; i++) {
            myList.add(new Item(image[i],name[i]));
        }
        myadapter = new MyArrayAdapter(MainActivity.this,R.layout.layout_item, myList);
        lv.setAdapter(myadapter);
        //xu ly click
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myintent = new Intent(MainActivity.this,SubActivity.class);
                myintent.putExtra("name",name[i]);
                startActivity(myintent);
            }
        });
    }
}