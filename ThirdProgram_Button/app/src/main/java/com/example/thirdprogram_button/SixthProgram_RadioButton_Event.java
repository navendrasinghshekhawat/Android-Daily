package com.example.thirdprogram_button;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class SixthProgram_RadioButton_Event extends AppCompatActivity {
    LinearLayout ll;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_program_radio_button_event);
        ll=findViewById(R.id.linear2);
        rg=findViewById(R.id.rg1);

         rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {
                RadioButton r1=findViewById(i);
                String s=r1.getText().toString();
                //Toast.makeText(SixthProgram_RadioButton_Event.this,s+":::"+i,Toast.LENGTH_LONG).show();
                switch(s)
                {
                    case "RED":
                        ll.setBackgroundColor(Color.parseColor("#FF0000"));
                        break;

                    case "GREEN":
                        ll.setBackgroundColor(Color.GREEN);
                        break;

                    case "BLUE":
                        ll.setBackgroundColor(Color.BLUE);
                        break;

                    case "WHITE":
                        ll.setBackgroundColor(Color.WHITE);
                        break;
                }

            }
        });
    }
}