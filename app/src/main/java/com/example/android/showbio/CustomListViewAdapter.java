package com.example.android.showbio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by tommy on 6/18/15.
 */
public class CustomListViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<HashMap<String, String>> books;
    private ArrayList<HashMap<String,Integer>> data1;
    private static LayoutInflater inflater = null;



    public CustomListViewAdapter(Context context, ArrayList<HashMap<String, String>> data, ArrayList<HashMap<String,Integer>> data11){
        mContext = context;
        books = data;
        data1 = data11;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null){
            view = inflater.inflate(R.layout.list_row,null);
            TextView title = (TextView)view.findViewById(R.id.title);
            TextView author = (TextView)view.findViewById(R.id.author);
            TextView pages = (TextView)view.findViewById(R.id.pages);
            ImageView image = (ImageView)view.findViewById(R.id.image);

            HashMap<String, String> mBook = new HashMap<>();
            mBook = books.get(position);

            title.setText(mBook.get("title"));
            author.setText(mBook.get("author"));
            pages.setText(mBook.get("pages"));
           // image.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.ic_launcher));
           HashMap<String,Integer> mdata1 = new HashMap<>();
            mdata1 = data1.get(position);
            image.setImageResource(mdata1.get("Image"));
        }


        return view;
    }
}
