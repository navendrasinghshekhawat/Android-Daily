package com.example.secondprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ForthProgram extends AppCompatActivity
{
    Button b1;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_program);
       b1=findViewById(R.id.button);
       linear=findViewById(R.id.ll);
       b1.setOnClickListener(new View.OnClickListener()
       {
           public void onClick(View v)
           {
               linear.setBackgroundColor(Color.RED);
           }
       });
    }
}