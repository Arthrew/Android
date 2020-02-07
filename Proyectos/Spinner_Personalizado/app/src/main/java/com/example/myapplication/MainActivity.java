package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.myapplication.adaptadores.AdaptadorSpinner;
import com.example.myapplication.utils.Marca;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<Marca> listaMarcas;
    AdaptadorSpinner adaptadorSpinner;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenatLista();
        acciones();
    }

    private void acciones() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Marca mActual = (Marca) adaptadorSpinner.getItem(position);
                imagen.setImageResource(mActual.getLogo());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void rellenatLista() {
        spinner.setAdapter(adaptadorSpinner);
        listaMarcas.add(new Marca("Ford",R.drawable.ford));
        listaMarcas.add(new Marca("Audi",R.drawable.audi));
        listaMarcas.add(new Marca("Mercedes",R.drawable.mercedes));
        listaMarcas.add(new Marca("Mini",R.drawable.mini));
        listaMarcas.add(new Marca("Volkswagen",R.drawable.vw));
        listaMarcas.add(new Marca("Toyota",R.drawable.toyota));
        listaMarcas.add(new Marca("Nissan",R.drawable.nissan));
        listaMarcas.add(new Marca("BMW",R.drawable.bmw));
        adaptadorSpinner.notifyDataSetChanged();
    }

    private void instancias() {

        spinner = findViewById(R.id.spinner_personalizado);
        listaMarcas = new ArrayList<>();
        adaptadorSpinner = new AdaptadorSpinner(listaMarcas,getApplicationContext());
        imagen = findViewById(R.id.imagen_Marca);
    }
}
