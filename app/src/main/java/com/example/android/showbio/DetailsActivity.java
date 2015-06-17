package com.example.android.showbio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    private ImageView profileImage;
    private TextView textBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        profileImage = (ImageView)findViewById(R.id.detailImage);
        textBio = (TextView)findViewById(R.id.detailTextView);

        extras = getIntent().getExtras();
        if (extras != null){
            String name = extras.getString("name");



            showDetails(name);


        }
    }
    public void showDetails(String nName){
        Toast.makeText(this, nName, Toast.LENGTH_LONG).show();

        if (nName.equals("satu")){
            profileImage.setImageDrawable(getResources().getDrawable(R.drawable.satu));
            textBio.setText(extras.getString("satu"));
        }else if (nName=="dua"){
            profileImage.setImageResource(R.drawable.dua);
            textBio.setText(extras.getString("dua"));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
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
