package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DeleteAllRecords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_all_records);
    }
    public void deleteAll(View v)
    {
        DBHelper obj=new DBHelper(this);

        int i=obj.deleteAll();
        Toast.makeText(this,i+" record deleted",Toast.LENGTH_LONG).show();

    }
}