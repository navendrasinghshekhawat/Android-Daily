package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchRecord extends AppCompatActivity {


    ListView listView;
   Spinner auto1;
    DBHelper obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_record);
        listView=findViewById(R.id.listview1);

         auto1=findViewById(R.id.auto);
         obj=new DBHelper(this);
         ArrayList arrayList=obj.getUsername();
         ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,arrayList);

          auto1.setAdapter(adapter);
    }


    public void search(View v)
    {
        String s="";
        s = auto1.getSelectedItem().toString();
        if(v.getId()==R.id.btn_search) {

           System.out.println("testing block3...."+s);

            ArrayList alist = obj.searchARecord(s);

//         if(alist!=null)
//         {
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, alist);
            listView.setAdapter(adapter);
//         }
//         else
//         {
//             Toast.makeText(this,"no match found",Toast.LENGTH_LONG).show();
//         }
        }
        if(v.getId()==R.id.btn_delete_search)
        {
            System.out.println("testing block 2:"+s);
             int i= obj.deleteASingleRecord(s);
             Toast.makeText(this,i+" record deleted",Toast.LENGTH_LONG).show();
            finish();
        }

    }

}