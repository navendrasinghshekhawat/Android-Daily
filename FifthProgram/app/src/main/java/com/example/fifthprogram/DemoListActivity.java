package com.example.fifthprogram;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class DemoListActivity extends ListActivity
{
    String str[]={"c","cpp","java","python","php","android","ML","AI","JS"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_checked,str);
        setListAdapter(adapter);

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        String s1=str[position];
        Toast.makeText(this,s1+" selected",Toast.LENGTH_LONG).show();
    }
}