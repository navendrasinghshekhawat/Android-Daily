package com.example.fifthprogram;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
public class DemoProgressBar extends AppCompatActivity implements View.OnTouchListener
{
    TextView tv;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        bar=findViewById(R.id.progress11);
       bar.setOnTouchListener(this);
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        int i=bar.getProgress();
        Toast.makeText(this,"Loading:"+i,Toast.LENGTH_LONG).show();
        return false;
    }
}