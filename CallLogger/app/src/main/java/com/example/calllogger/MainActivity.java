package com.example.calllogger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.CallLog;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ListView list;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        String callArray[] = new String[records];


        //step 4 :getting index no of columns
        int numberIdx = cursor.getColumnIndex(CallLog.Calls.NUMBER);
        int nameIdx = cursor.getColumnIndex(CallLog.Calls.CACHED_NAME);
        int typeIdx = cursor.getColumnIndex(CallLog.Calls.TYPE);
        int callDurIdx = cursor.getColumnIndex(CallLog.Calls.DURATION);
        int index = 0;
        while (cursor.moveToNext())
        {
            String number = cursor.getString(numberIdx);
            String name = cursor.getString(nameIdx);
            String duration = cursor.getString(callDurIdx);
            int t = cursor.getInt(typeIdx);
            String type;
            if (t == CallLog.Calls.INCOMING_TYPE)
                type = "IN";
            else if (t == CallLog.Calls.OUTGOING_TYPE)
                type = "OUT";
            else
                type = "?";

            if (name == null)
                callArray[index] = number + " | " + type+" | Sec "+duration;
            else
                callArray[index] = name + " | " + type+" |  Sec "+duration;

            Log.i("logviewer", "value[" + index + "] :" + callArray[index]);
            index++;
        }

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, callArray);
        list.setAdapter(listAdapter);
        Log.i("logviewer", "list adapter created and added to the list...");

    }

    @Override
    public void onClick(View view) {
        finish();
        Log.i("logviewer", "view activity completed.");
    }
}