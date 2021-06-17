package com.example.imagenesdesdeservidorweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context miContexto;
    private ArrayList<Platos> miArraylist;

    public Adaptador(Context miContexto, ArrayList<Platos> miArraylist) {

        this.miContexto = miContexto;
        this.miArraylist = miArraylist;
    }


    @Override
    public int getCount() {
        return miArraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return miArraylist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(miContexto);
        view = layoutInflater.inflate(R.layout.itemlista, null);

        TextView nombre = (TextView) view.findViewById(R.id.tvNombre);
        ImageView imagen = (ImageView) view.findViewById(R.id.ivImagen);

        nombre.setText(miArraylist.get(i).getNombre());
        imagen.setImageResource(miArraylist.get(i).getImg());

        return view;
    }
}






