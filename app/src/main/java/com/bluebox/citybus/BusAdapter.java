package com.bluebox.citybus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BusAdapter extends ArrayAdapter<Bus> {

    Context context;
    List<Bus> arraybus;

    public BusAdapter(@NonNull Context context, List<Bus> arraybus ) {
        super(context,R.layout.custom_route,arraybus);
        this.context=context;
        this.arraybus=arraybus;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_route,null,true);


        TextView bname=view.findViewById(R.id.bname);
        TextView broute=view.findViewById(R.id.broute);


        bname.setText(arraybus.get(position).getBus_name());
        broute.setText(arraybus.get(position).getBus_route());


        return view;
    }
}
