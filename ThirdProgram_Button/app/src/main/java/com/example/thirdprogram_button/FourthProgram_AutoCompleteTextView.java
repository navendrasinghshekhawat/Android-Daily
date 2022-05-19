package com.example.thirdprogram_button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
public class FourthProgram_AutoCompleteTextView extends AppCompatActivity {
AutoCompleteTextView auto;
String values[]={"abhi","abhishek","abhinav","abhimanyu","bharat","bharti","raj","raju","rajkumar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_program_auto_complete_text_view);
        auto=findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,values);

        auto.setThreshold(2);
        auto.setAdapter(adapter);

    }
}