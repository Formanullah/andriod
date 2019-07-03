package com.example.sajib.worldsevenwonders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String sevenwonders[];
    int flags[];
    LayoutInflater inflater;
    public CustomAdapter(Context context,String wonders[],int flags[])
    {
        sevenwonders=wonders;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));

    }




    @Override
    public int getCount() {
        return sevenwonders.length;
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
        TextView name=view.findViewById(R.id.txt_sevenwonders);
        image.setImageResource(flags[position]);
        name.setText(sevenwonders[position]);
        return view;
    }
}
