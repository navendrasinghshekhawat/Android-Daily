package com.example.demomenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class DemoContextMenu extends AppCompatActivity
{
   ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_context_menu);
        listView=findViewById(R.id.listview1);

        registerForContextMenu(listView);  //registration between context menu and list
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        menu.setHeaderTitle("Action");
        menu.add(0,v.getId(),4,"CAll");
        menu.add(0,v.getId(),3,"SMS");
        menu.add(0,v.getId(),2,"DELETE");
        menu.add(0,v.getId(),1,"VIEW");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        String s=item.getTitle().toString();
        if(s.equalsIgnoreCase("call"))
        {
            Toast.makeText(this,"Calling.........",Toast.LENGTH_LONG).show();
        }
        if(s.equalsIgnoreCase("sms"))
        {
            Toast.makeText(this,"sending sms.........",Toast.LENGTH_LONG).show();
        }
        if(s.equalsIgnoreCase("delete"))
        {
            Toast.makeText(this,"are u sure u want to delete ?.........",Toast.LENGTH_LONG).show();
        }
        if(s.equalsIgnoreCase("view"))
        {
            Toast.makeText(this,"info.........",Toast.LENGTH_LONG).show();
        }

        return super.onContextItemSelected(item);
    }
}