package com.example.firstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/*
* the followings are the lifecycle(methods) of any android activity
*
* */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        System.out.println("onCreate method called");
        Log.i("testing block", "onCreate method called");

        /*
        Toast class
        Methods of this class are used to display the msg on the android activity on the foreground.

         */
//Toast Function
       Toast t=Toast.makeText(this, "Demo of toast::"+ Gravity.CENTER,Toast.LENGTH_LONG);
       t.setGravity(17,0,0);
       t.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
//        System.out.println("onStart method called");
        Log.i("testing block", "onStart method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
//        System.out.println("onStop method called");
        Log.i("testing block", "onStop method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
//        System.out.println("onResume method called");
        Log.i("testing block", "onResume method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        System.out.println("onRestart method called");
        Log.i("testing block", "onRestart method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
//        System.out.println("onPause method called");
        Log.i("testing block", "onPause method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        System.out.println("onDestroy method called");
        Log.i("testing block", "onDestroy method called");
    }


    /*
    * In order to print any msg on log...we can use a predefined class that is log class of util package.
    * This class contains few methods which are used to print the msg on the background screen.
    * syntax:
    *  Log.i("testing block", "onDestroy method called");
    *
    * Log.i, Log.d, log.e, Log.w
     * */
}