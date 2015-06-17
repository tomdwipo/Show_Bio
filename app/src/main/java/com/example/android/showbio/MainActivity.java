package com.example.android.showbio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {
    private ImageView gambarSatu;
    private ImageView gambarDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gambarSatu = (ImageView)findViewById(R.id.gambarSatu);
        gambarDua = (ImageView)findViewById(R.id.gambarDua);

        gambarSatu.setOnClickListener(this);
        gambarDua.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gambarSatu:
                Intent satuIntent = new Intent(MainActivity.this, DetailsActivity.class);
                satuIntent.putExtra("satu","gambar penemuan pertama");
                startActivity(satuIntent);

                break;

            case R.id.gambarDua:
                Intent duaIntent = new Intent(MainActivity.this, DetailsActivity.class);
                duaIntent.putExtra("dua", "gambar penemuan kedua");
                startActivity(duaIntent);

                break;
        }

    }
}
