package com.example.demomenus;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.mymenu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId()==R.id.item1)
        {
            Toast.makeText(getApplicationContext(),"option1 clicked",Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.item2)
        {
            Toast.makeText(getApplicationContext(),"option2 clicked",Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.item3)
        {
            Toast.makeText(getApplicationContext(),"option3 clicked",Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.item4)
        {
            Toast.makeText(getApplicationContext(),"option4 clicked",Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.item5)
        {
            Toast.makeText(getApplicationContext(),"option5 clicked",Toast.LENGTH_LONG).show();
        }

//        switch(item.getTitle().toString())
//        {
//            case "Option1":
//                Toast.makeText(getApplicationContext(),"option1 clicked",Toast.LENGTH_LONG).show();
//                break;
//
//            case "Option2":
//                Toast.makeText(getApplicationContext(),"option2 clicked",Toast.LENGTH_LONG).show();
//                break;
//
//            case "Option3":
//                Toast.makeText(getApplicationContext(),"option3 clicked",Toast.LENGTH_LONG).show();
//                break;
//
//            case "Option4":
//                Toast.makeText(getApplicationContext(),"option4 clicked",Toast.LENGTH_LONG).show();
//                break;
//
//            case "Option5":
//                Toast.makeText(getApplicationContext(),"option5 clicked",Toast.LENGTH_LONG).show();
//                break;
//
//
//
//        }


        return super.onOptionsItemSelected(item);
    }
}