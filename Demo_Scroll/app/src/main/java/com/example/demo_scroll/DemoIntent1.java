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

public class DemoIntent1 extends AppCompatActivity {

    Button b,b1;
    EditText e1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_intent1);


        b1=findViewById(R.id.button2);
        e1=findViewById(R.id.et1);
        tv=findViewById(R.id.tv1);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String str=e1.getText().toString();
               Intent i=new Intent(getApplicationContext(),DemoIntent2.class);
            //   i.putExtra("id",str);  //single value

               String values[]={"abhishek","abhiraj"};
               i.putExtra("id",values);  //pasing array
               startActivityForResult(i,3);
           }
       });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Toast.makeText(this,requestCode+":"+resultCode,Toast.LENGTH_LONG).show();
        String s=data.getStringExtra("id1");
        tv.setText(s);
        e1.setText(null);
    }
}