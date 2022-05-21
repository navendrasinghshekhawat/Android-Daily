package com.example.thirdprogram_button;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class FifthProgram_radioButton extends AppCompatActivity implements View.OnClickListener
{
  Button b;
  RadioGroup rg;
  RadioButton r1;
  LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_program_radio_button);
        b=findViewById(R.id.button12);
        rg=findViewById(R.id.radioGroup);
        b.setOnClickListener(this);
        linear=findViewById(R.id.linear1);
    }

    @Override
    public void onClick(View view)
    {
        // int i=rg.getCheckedRadioButtonId();
         r1=findViewById(rg.getCheckedRadioButtonId());
         String s=r1.getText().toString();
         switch(s)
         {
             case "red":
                 linear.setBackgroundColor(Color.RED);
                 break;
             case "green":
                 linear.setBackgroundColor(Color.GREEN);
                 break;
             case "blue":
                 linear.setBackgroundColor(Color.BLUE);
                 break;
             case "white":
                 linear.setBackgroundColor(Color.WHITE);
                 break;

         }
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}