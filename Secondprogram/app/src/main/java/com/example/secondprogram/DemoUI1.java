package com.example.secondprogram;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DemoUI1 extends AppCompatActivity implements View.OnClickListener{

    EditText e1,e2;
    TextView t1;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_ui1);
        e1=findViewById(R.id.et1);  //to get teh reference of edit text 1 on the java page.
        e2=findViewById(R.id.et2); ////to get teh reference of edit text 2 on the java page.
        t1=findViewById(R.id.tv1);
        counter=1;
    }
    public void onPress(View view){
        String s1=e1.getText().toString(); //getting the value from e1 above
        String s2=e2.getText().toString();
        int a1=Integer.parseInt(s1);
        int a2=Integer.parseInt(s2);
        int sum=a1+a2;
        Toast.makeText(this, ""+sum, Toast.LENGTH_LONG).show();
        t1.setText(""+sum);
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Button clicked"+counter, Toast.LENGTH_LONG).show();
        counter++;
    }
}