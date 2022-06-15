package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewAllRecords extends AppCompatActivity implements AdapterView.OnItemClickListener
{
   ListView listView;
    DBHelper obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_records);

        listView=findViewById(R.id.listView1_viewall);
        obj=new DBHelper(this);
        //displaying all usernames on the ListView
        ArrayList alist=obj.getUsername();
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,alist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    //getting the entire record from database on the click event of the item of ListView
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
      //  String str=adapterView.getSelectedItem().toString();

          String str=((TextView)view).getText().toString();
          ArrayList alist=obj.searchARecord(str); //getting the entire record of the username passed
          System.out.println("ViewAllRecords Activity testing block2:"+alist);
          //sending the record on the next activity to display
          Intent intent=new Intent(this,DisplayRecord.class);
          intent.putStringArrayListExtra("values",alist);//passing arraylist to next activity
          startActivity(intent);


    }
}