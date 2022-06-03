package com.example.demo_scroll;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity
{

    EditText e1;
    Button b1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        e1=findViewById(R.id.et1);
        b1=findViewById(R.id.btn1);
        tv1=findViewById(R.id.tv1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                Intent i=new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("id",s1);
                startActivityForResult(i,0);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String s=data.getStringExtra("id1");

        tv1.setText(s+","+resultCode+","+requestCode);
        e1.setText(null);  //to clear the edittext

    }
}