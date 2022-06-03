package com.example.demo_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity

{

    EditText e2;
    Button b2;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e2=findViewById(R.id.et2);
        b2=findViewById(R.id.btn2);
        tv2=findViewById(R.id.tv2);

        Intent i=getIntent();
        String s1=i.getStringExtra("id");
        tv2.setText(s1);


        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s=e2.getText().toString();
                Intent i=new Intent();
                i.putExtra("id1",s);
                setResult(1,i);
                finish();  //to close the current activity
            }
        });

    }

}