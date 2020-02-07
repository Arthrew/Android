package com.example.myapplication.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.utils.Marca;

import java.util.ArrayList;

public class AdaptadorSpinner extends BaseAdapter {


    ArrayList<Marca> listaDatos;
    Context c;

    public AdaptadorSpinner(ArrayList<Marca> listaDatos, Context c) {
        this.listaDatos = listaDatos;
        this.c = c;
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
    //traigo el xml creado
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(c).inflate(R.layout.spinner_personalizado,
                parent,false);

        Marca mActual = listaDatos.get(position);

        TextView nombre = convertView.findViewById(R.id.texto_spinner);
        ImageView imagen = convertView.findViewById(R.id.imagen_spinner);

        nombre.setText(mActual.getNombre());
        imagen.setImageResource(mActual.getLogo());

        return convertView;
    }
}
