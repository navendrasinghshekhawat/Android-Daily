package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View v)
    {
        if(v.getId()==R.id.button1)
        {
            startActivity(new Intent(this,AddNewRecord.class));
        }
        if(v.getId()==R.id.button2)
        {
            startActivity(new Intent(this,SearchRecord.class));
        }
        if(v.getId()==R.id.button3)
        {
            startActivity(new Intent(this,DeleteAllRecords.class));
        }
        if(v.getId()==R.id.button4)
        {
            startActivity(new Intent(this,SearchRecord.class));
        }
        if(v.getId()==R.id.button5)
        {
            startActivity(new Intent(this,ViewAllRecords.class));
        }
    }
}