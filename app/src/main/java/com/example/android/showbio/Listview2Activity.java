package com.example.android.showbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Listview2Activity extends AppCompatActivity {
    private ListView listView;
    private CustomListViewAdapter customListViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);
        final String[] bookTitle = new String[]{
                "the",
                "arm",
                "oke",
                "mantam",
                "nice",
                "wow",
                "epoc",
                "wooow",
                "sembilam",
                "sepuluh"
        };
        final String[] author = new String[]{
                "a",
                "b",
                "g",
                "f",
                "g",
                "tt",
                "frg",
                "grgr",
                "gfg",
                "fgbf"

        };
        final String[] bookPages = new String[]{
                "4 pages",
                "20 pages",
                "300 pages",
                "500 pages",
                "505 pages",
                "66 pages",
                "70 pages",
                "88 pages",
                "90 pages",
                "100 pages"
        };
        ArrayList<HashMap<String, String>> authorlist = new ArrayList<>();
        for (int i = 0; i<10; i++){
            HashMap<String,String> data = new HashMap<>();
            data.put("title", bookTitle[i]);
            data.put("pages", bookPages[i]);
            data.put("author", author[i]);

            authorlist.add(data);
        }
        listView = (ListView)findViewById(R.id.listview2);
        customListViewAdapter = new CustomListViewAdapter(getApplicationContext(),authorlist);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int myPosition = position;

                String itemClickId = listView.getItemAtPosition(myPosition).toString();
                Toast.makeText(getApplicationContext(),itemClickId,Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listview2, menu);
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
