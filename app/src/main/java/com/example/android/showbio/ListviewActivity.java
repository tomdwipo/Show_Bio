package com.example.android.showbio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListviewActivity extends Activity {
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String name = extras.getString("listview");
            Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();
            listview = (ListView)findViewById(R.id.ListView);
            final String[] list = new String[]{
                    "f","h","g","h","e","t", "w","p","a",  "f","h","g","h","e","t", "w","p","a"
                    ,  "f","h","g","h","e","t", "w","p","a",  "f","h","g","h","e","t", "w","p","a"
            };
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                   android.R.layout.simple_list_item_1,android.R.id.text1,list);
            listview.setAdapter(adapter);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int intPosition = position;
                    String Click = listview.getItemAtPosition(intPosition).toString();
                    Toast.makeText(getApplicationContext(),Click,Toast.LENGTH_LONG).show();
                }
            });

        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listview, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
