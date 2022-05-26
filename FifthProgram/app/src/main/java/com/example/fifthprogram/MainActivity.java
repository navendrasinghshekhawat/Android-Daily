package com.example.fifthprogram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    listView=findViewById(R.id.lst);
    listView.setOnItemClickListener(this);
    registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Select your Action");
        menu.add(0,v.getId(),0,"call");
        menu.add(0,v.getId(),1,"sms");
        menu.add(0,v.getId(),2,"delete");
        menu.add(0,v.getId(),3,"exit");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        String str=item.getTitle().toString();
        Toast.makeText(this, str + "clicked", Toast.LENGTH_SHORT).show();
        if(str.equals("call")){

        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String str=adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this, str+ "clicked", Toast.LENGTH_SHORT).show();
    }
}