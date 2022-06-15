package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DisplayRecord extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_record);
        listView=findViewById(R.id.listView1_display);
        Intent i=getIntent();
        ArrayList alist=i.getCharSequenceArrayListExtra("values");//getting the Arraylist from the previous activity
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,alist);
        listView.setAdapter(adapter);
    }
}