package com.example.demomenus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileHandling extends AppCompatActivity  implements View.OnClickListener
{
   EditText e1,e2;
   Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_file_handling);

        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
           if(view.getId()==R.id.button)
           {
               String filename=e1.getText().toString();
               String message=e2.getText().toString();
               try
               {
                   FileOutputStream out=openFileOutput(filename,MODE_PRIVATE);  //creating a file
                   System.out.println("Testing block1");
                   byte b[]=message.getBytes(); //converting into bytes array
                   out.write(b); //writing into file
                   out.close();  //closing the file
                   Toast.makeText(this,"File created!!",Toast.LENGTH_LONG).show();
                   e1.setText(null); //reseting the edittexts
                   e2.setText(null);
               }
              catch(FileNotFoundException e)
              {
                  System.out.println("Exception :"+e);
              }
               catch (IOException e)
               {
                   e.printStackTrace();
               }

           }
        if(view.getId()==R.id.button2) {
            String filename = e1.getText().toString();//
            if (filename.length() == 0)
            {
                Toast.makeText(this, "Enter file name", Toast.LENGTH_LONG).show();
            }
            else {
                try {
                    FileInputStream fin = openFileInput(filename); //opening the file into read mode
                    int i = 0;
                    String message = "";
                    while ((i = fin.read()) != -1)  //reading one by one  integer value of each character from the file
                    {
                        char ch = (char) i;  //converting the integer value again into char.
                        message = message + Character.toString(ch);  //creating the string
                        e2.setText(message);  //writing into edittext
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (view.getId() == R.id.button3) {
                e1.setText(null);
                e2.setText(null);

            }
        }
    }
}