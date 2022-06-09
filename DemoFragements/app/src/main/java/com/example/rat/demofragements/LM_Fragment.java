package com.example.rat.demofragements;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class LM_Fragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final RelativeLayout mRelativeLayout = (RelativeLayout) inflater.inflate(R.layout.lm__fragment, container, false);

        Button mButton = (Button) mRelativeLayout.findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
                Toast.makeText(getActivity(),"Button clicked",Toast.LENGTH_SHORT).show();
            }
        });
        return mRelativeLayout;
    }

}