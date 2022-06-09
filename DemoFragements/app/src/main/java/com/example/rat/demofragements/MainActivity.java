package com.example.rat.demofragements;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

        /**
         * Check the device orientation and act accordingly
         */
        Resources resources=getResources();
        Configuration config = resources.getConfiguration();
        Toast.makeText(this,"value is:"+config.orientation,Toast.LENGTH_LONG).show();
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            /**
             * Landscape mode of the device
             */

            fragmentTransaction.replace(android.R.id.content, new LM_Fragment());
        }

        else
        {
            /**
             * Portrait mode of the device
             */
            fragmentTransaction.replace(android.R.id.content, new PM_Fragment());
        }
        System.out.println(config.orientation);
        fragmentTransaction.commit();//save the changes
    }
}
