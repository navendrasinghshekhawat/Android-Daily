package com.example.fifthprogram;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
public class DemoListView extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list_view);
        listView=findViewById(R.id.listview1);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {

        TextView tv=(TextView)view;
        String str=tv.getText().toString();
        //String str=((TextView)view).getText().toString();
        Toast.makeText(this,str+":"+i,Toast.LENGTH_LONG).show();

    }
}