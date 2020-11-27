package com.leo.miprimeraapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends BaseAdapter {
    private Context context;
    private List<Ciudades> arrayList;
    public Adaptador(Context context, List<Ciudades> arraylist) {
        this.context = context;
        this.arrayList = arraylist;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.tarjetas,null);
        }
        TextView titulo = convertView.findViewById(R.id.titulo);
        titulo.setText(arrayList.get(position).getNombre());
        return convertView;
    }
}
