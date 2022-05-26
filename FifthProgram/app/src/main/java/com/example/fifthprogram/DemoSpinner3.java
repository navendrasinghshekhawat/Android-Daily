package com.example.fifthprogram;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class DemoSpinner3 extends AppCompatActivity implements View.OnClickListener
{
  Button b1;
  Spinner sp;
  TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_spinner3);
        b1=findViewById(R.id.button13);
        sp=findViewById(R.id.spinner3);
        tv=findViewById(R.id.tv1);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.RED);
        b1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        String str=sp.getSelectedItem().toString();
        if(str.equalsIgnoreCase("c"))
            tv.setTextColor(Color.BLACK);
        else
        {
            tv.setTextColor(Color.RED);
        }

        tv.setText(str);
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}