package com.example.mydb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
public class DBHelper extends SQLiteOpenHelper
{
     public static int dbVersion=1;
     public static String dbName="college.db";
     public static String tableName="registration";
     public static String column1="username";
     public static String column2="mobile";
     public static String column3="email";
     public static String query="create table registration(_id integer primary key autoincrement,username text,mobile text,email text)";

    public DBHelper(@Nullable Context context)
    {
        super(context, dbName, null, dbVersion);  //it will create ur database
        System.out.println("database created!!");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
           sqLiteDatabase.execSQL(query); //it will create the table
           System.out.println("table created!!");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public long save(String s1,String s2,String s3)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(column1,s1);
        cv.put(column2,s2);
        cv.put(column3,s3);
        long count=db.insert(tableName,null,cv);
        System.out.println("total record inserted:"+count);
        db.close();
        return count;

    }
    public void search(String uname)
    {


    }

}
