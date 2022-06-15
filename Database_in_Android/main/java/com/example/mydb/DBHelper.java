package com.example.mydb;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import java.sql.Array;
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
    public ArrayList getUsername()
    {
        SQLiteDatabase db=getReadableDatabase();
        ArrayList al=new ArrayList();
        Cursor c=db.query(tableName,new String[]{column1},null,null,null,null,"username");
        int count=c.getCount();
        System.out.println("total count is :"+count);
        while(c.moveToNext())
        {
            al.add(c.getString(0));
        }

        db.close();

        return al;
    }
    public int deleteASingleRecord(String uname)
    {
        SQLiteDatabase db=getWritableDatabase();

        String str[]={uname};
        int i=db.delete(tableName,"username=?",str);
        //db.delete(tableName,"username=?",new String[]{uname});



        db.close();
        return i;
    }
    public int deleteAll()
    {
        SQLiteDatabase db=getWritableDatabase();
        int i=db.delete(tableName,null,null);
        db.close();
        return i;
    }
    public ArrayList searchARecord(String uname)
    {
            SQLiteDatabase db=getReadableDatabase();
            ArrayList al=new ArrayList();
            Cursor c=db.query(tableName,null,"username=?",new String[]{uname},null,null,"username");
            System.out.println("value of c is :"+c);
            // Cursor c=db.query(tableName,null,null,null,null,null,"username");
            int count=c.getCount();  //row count
            System.out.println("records found:"+count);
            if(count!=0) {
                c.moveToNext();
                String s1 = c.getString(1);
                String s2 = c.getString(2);
                String s3 = c.getString(3);
                al.add(s1);
                al.add(s2);
                al.add(s3);
                System.out.println(al);
            }
            else
            {
                System.out.println("testing block1");
                return null;
            }
            db.close();
            return al;

    }

}
