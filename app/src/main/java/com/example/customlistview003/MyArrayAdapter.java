package com.example.customlistview003;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<Item> {
    Activity context;
    int IdLayout;
    ArrayList<Item> myList;
    // tao constructore de maninActivity goi den va truyen cac tham so nay vao

    public MyArrayAdapter(Activity context, int idLayout, ArrayList<Item> myList) {
        super(context, idLayout,myList);
        this.context = context;
        IdLayout = idLayout;
        this.myList = myList;
    }
    //Goi ham getView dew tien hanh sap xep du lieu

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Tao 1 cai de de chua layout
        LayoutInflater myflater = context.getLayoutInflater();
        //Dat idlayout len cai inflater de tao thanh view
        convertView = myflater.inflate(IdLayout,null);
        // Lay 1 phan tu du lieu trong mang do len cai view
        Item myitem = myList.get(position);
        // Khai bao, tham chieu  id va hien thi anh len list view
        ImageView img_item = convertView.findViewById(R.id.img_item);
        img_item.setImageResource(myitem.getImage());
        //khai bao, tham chieu id va hien thi ten item len thiet bi
        TextView txt_item = convertView.findViewById(R.id.txt_item);
        txt_item.setText(myitem.getName());
        TextView txt_price = convertView.findViewById(R.id.txt_price);
        txt_price.setText(myitem.getName());
        return convertView;
    }
}
