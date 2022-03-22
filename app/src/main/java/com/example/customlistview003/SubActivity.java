package com.example.customlistview003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    TextView txt_subitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        txt_subitem = findViewById(R.id.txt_subitem);
        //Nhan Intent
        Intent myintent = getIntent();
        //Lay du lieu
        String nameitem = myintent.getStringExtra("name");
        txt_subitem.setText(nameitem);
    }
}