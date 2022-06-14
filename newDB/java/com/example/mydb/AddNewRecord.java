package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddNewRecord extends AppCompatActivity {

    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_record);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.btn1)
        {
             String s1=e1.getText().toString();
             String s2=e2.getText().toString();
             String s3=e3.getText().toString();
             DBHelper obj=new DBHelper(this);
             long num=obj.save(s1,s2,s3);
            Toast.makeText(this,num+" record inserted!",Toast.LENGTH_LONG).show();


        }
        if(v.getId()==R.id.btn2)
        {
             e1.setText(null);
             e2.setText(null);
             e3.setText(null);

        }
    }
}