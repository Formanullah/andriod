package com.example.sajib.myfavouritenewspaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String banglaNews[];
    int banglanewsflag[];
    LayoutInflater inflater;
    public CustomAdapter(Context context, String News[], int flags[])
    {
        banglaNews=News;
        banglanewsflag=flags;
        inflater=(LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return banglaNews.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.list_items,viewGroup,false);
        ImageView image=view.findViewById(R.id.imageView);
        TextView name=view.findViewById(R.id.txt_newsname);
        image.setImageResource(banglanewsflag[position]);
        name.setText(banglaNews[position]);
        return view;
    }
}
