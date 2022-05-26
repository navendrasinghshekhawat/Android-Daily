package com.example.fifthprogram;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
public class DemoSeekBar extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener
{

    SeekBar sb;
    TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_seek_bar);
        sb=findViewById(R.id.seekBar);
        sb.setProgress(50);
        tv=findViewById(R.id.tv2);
        tv1=findViewById(R.id.tv3);
        sb.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        tv.setText("volume  "+sb.getProgress());

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar)
    {
         tv1.setText("start...............");

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        tv1.setText("stop...............");
    }
}