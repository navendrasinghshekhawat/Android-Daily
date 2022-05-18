package com.example.secondprogram;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ThirdProgram extends AppCompatActivity implements View.OnClickListener
{
    LinearLayout l1;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_program);
        l1=findViewById(R.id.linearLayout1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.b1)
        {
            l1.setBackgroundColor(Color.RED);
        }
        if(view.getId()==R.id.b2)
        {
            l1.setBackgroundColor(Color.GREEN);
        }
        if(view.getId()==R.id.b3)
        {
            l1.setBackgroundColor(Color.BLUE);
        }
        if(view.getId()==R.id.b4)
        {
            l1.setBackgroundColor(Color.YELLOW);
        }
    }
}