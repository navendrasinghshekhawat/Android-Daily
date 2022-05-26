package com.example.fifthprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DemoSpinner2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    String str[]={"c","cpp","java","python","php","android","ML","AI","JS"};
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_spinner2);
        sp=findViewById(R.id.spinner2);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_checked,str);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String s=((TextView)view).getText().toString();
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}