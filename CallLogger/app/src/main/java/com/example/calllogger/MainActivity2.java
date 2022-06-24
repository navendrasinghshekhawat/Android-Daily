package com.example.calllogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.CallLog;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener
{

    ListView list;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        list=(ListView) findViewById(R.id.lstview);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        Log.i("logviewer", "onCreate() of Logviewer completed...");

        //getting or requesting permission

    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.i("logviewer", "obtaining provider...");

        //step 1
        ContentResolver resolver = getContentResolver();

        Log.i("logviewer", "resolver obtained executing query...");


        //step 2
        Cursor cursor = resolver.query(CallLog.Calls.CONTENT_URI, null, null,
                null, null);


        Log.i("logviewer", "cursor obtained.");

        //step 3
        int records = cursor.getCount();
        System.out.println("total records:" + records);


        String callArray[] = new String[records];


        //step 4 :getting index no of columns
        int numberIdx = cursor.getColumnIndex(CallLog.Calls.NUMBER);
        int nameIdx = cursor.getColumnIndex(CallLog.Calls.CACHED_NAME);
        int typeIdx = cursor.getColumnIndex(CallLog.Calls.TYPE);
        int callDurIdx = cursor.getColumnIndex(CallLog.Calls.DURATION);
        System.out.println(numberIdx + ":" + nameIdx + ":" + typeIdx + ":" + callDurIdx);
        int index = 0;
        while (cursor.moveToNext())
        {
            String number=cursor.getString(numberIdx);
            String name=cursor.getString(nameIdx);
            int type=cursor.getInt(typeIdx);
            String callduration=cursor.getString(callDurIdx);
            System.out.println("type is ::::::::"+type);
            String call_type="";
            if(type==CallLog.Calls.INCOMING_TYPE)
            {
               call_type="Incoming";
            }
            if(type==CallLog.Calls.OUTGOING_TYPE)
            {
                call_type="Outgoing";
            }
            if(type==CallLog.Calls.MISSED_TYPE)
            {
                call_type="Missed";
            }
           if(name==null)
           {
            callArray[index]=number+"||"+call_type+"||"+callduration;
           }
           else
           {
               callArray[index]=name+"||"+call_type+"||"+callduration;
           }
        //   callArray[index]="a"+index;
          System.out.println(callArray[index]);
           index++;
        }
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.select_dialog_singlechoice,callArray);
        list.setAdapter(adapter);
    }
    public void onClick(View v)
    {
        finish();
    }
}