package com.example.demo_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DemoIntent2 extends AppCompatActivity implements View.OnClickListener
{

    TextView tv;
    Button b;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_intent2);
        et=findViewById(R.id.et11);
        b=findViewById(R.id.button21);
        tv=findViewById(R.id.tv2);

        //getting values from previous activity's intent
        Intent i=getIntent();
        String s=i.getStringExtra("id");
        tv.setText(s);
      //--------------code end-----------------------------------

        b.setOnClickListener(this); //registration step

    }

    @Override
    public void onClick(View view) {
        String s=et.getText().toString();
        Intent i=new Intent();
        i.putExtra("id1",s);
        setResult(4,i);
        finish();  //it will shut down the current activity

    }
}