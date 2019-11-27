package com.example.myapplication.adaptadores;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.myapplication.utils.Marca;

import java.util.ArrayList;

public class AdaptadorSpinner extends BaseAdapter {


    ArrayList<Marca> listaDatos;

    public AdaptadorSpinner(ArrayList<Marca> listaDatos) {
        this.listaDatos = listaDatos;
    }

    //numero de filas o elementos que tendrá el spinner
    //del array de elementos(de marcas)
    @Override
    public int getCount() {
        return listaDatos.size();
    }

    //obtiene el objeto de la posicion correspondiente (i)
    //lista.get(i)
    @Override
    public Object getItem(int position) {
        return listaDatos.get(position);
    }

    //obtiene el id del elemento de la posicion correspondiente
    //lista.get(i).getID();
    @Override
    public long getItemId(int position) {
        return position;
    }

    // renderiza cada una de las filas
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
