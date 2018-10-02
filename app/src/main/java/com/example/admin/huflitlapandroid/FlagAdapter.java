package com.example.admin.huflitlapandroid;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FlagAdapter extends ArrayAdapter {

    Context context;
    ArrayList<Flag> arrayList;
    int layout;

    public FlagAdapter(@NonNull Context context, int resource,@NonNull ArrayList<Flag> objects) {
        super(context, resource, objects);

        this.context = context;
        this.arrayList = objects;
        this.layout = resource;
    }


    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView,@NonNull ViewGroup parent) {

        Flag flag = arrayList.get(position);

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }
        ImageView img = convertView.findViewById(R.id.imageFlag);
        img.setImageResource(flag.getId());

        TextView txt = convertView.findViewById(R.id.flagName);
        txt.setText(flag.getName());

        return convertView;
    }
}
