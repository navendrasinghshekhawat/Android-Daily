package com.example.fifthprogram;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class DemoListView2 extends AppCompatActivity implements AdapterView.OnItemClickListener
{
   ListView listview2;
    String str[]={"c","cpp","java","python","php","android","ML","AI","JS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list_view2);
        listview2=findViewById(R.id.listview2);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_checked,str);
        listview2.setAdapter(adapter);
        listview2.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(this,str[i],Toast.LENGTH_LONG).show();

    }
}