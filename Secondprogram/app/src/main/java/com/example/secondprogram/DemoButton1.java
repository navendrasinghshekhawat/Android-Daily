package com.example.secondprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DemoButton1 extends AppCompatActivity implements View.OnClickListener
{
    EditText e1,e2;
    Button b1,b2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_button1);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.button2);
        tv=findViewById(R.id.tv1);

        b1.setOnClickListener(this); //registration method between source and listener
        //here b1 is a source and "this" is for listener
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.b1)
        {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            if (s1.length() == 0 || s2.length() == 0)
                Toast.makeText(this, "Enter both values", Toast.LENGTH_SHORT).show();
            else {
                double d1 = Double.parseDouble(s1);
                double d2 = Double.parseDouble(s2);
                double sum = d1 + d2;
                tv.setText("Result is :"+sum);
               // Toast.makeText(this, "sum is:" + sum, Toast.LENGTH_LONG).show();
            }
        }
            if (view.getId() == R.id.button2)
            {
                e1.setText(null);
                e2.setText(null);
                tv.setText("");
            }
        }
    }
