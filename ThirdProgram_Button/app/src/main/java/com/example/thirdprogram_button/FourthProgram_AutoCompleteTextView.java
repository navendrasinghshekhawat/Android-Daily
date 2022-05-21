package com.example.thirdprogram_button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;
public class FourthProgram_AutoCompleteTextView extends AppCompatActivity {
AutoCompleteTextView auto;
MultiAutoCompleteTextView multi;
Button b;
String values[]={"abhi","abhishek","abhinav","abhimanyu","bharat","bharti","raj","raju","rajkumar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_program_auto_complete_text_view);
        auto=findViewById(R.id.autoCompleteTextView);
        multi=findViewById(R.id.multi);
        b=findViewById(R.id.button);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,values);

        auto.setThreshold(2);
        auto.setAdapter(adapter);

        multi.setThreshold(3);
        multi.setAdapter(adapter);
        multi.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=auto.getText().toString();
                Toast.makeText(FourthProgram_AutoCompleteTextView.this,"value is :"+s,Toast.LENGTH_LONG).show();
            }
        });

        auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s=auto.getText().toString();
                Toast.makeText(FourthProgram_AutoCompleteTextView.this,"value is :"+s,Toast.LENGTH_LONG).show();
            }
        });


    }
}