package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.myapplication.adaptadores.AdaptadorSpinner;
import com.example.myapplication.utils.Marca;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<Marca> listaMarcas;
    AdaptadorSpinner adaptadorSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenatLista();
    }

    private void rellenatLista() {
        listaMarcas.add(new Marca("Ford",R.drawable.ford));
        listaMarcas.add(new Marca("Audi",R.drawable.audi));
        listaMarcas.add(new Marca("Mercedes",R.drawable.mercedes));
        listaMarcas.add(new Marca("Mini",R.drawable.mini));
        listaMarcas.add(new Marca("Volkswagen",R.drawable.vw));
        listaMarcas.add(new Marca("Toyota",R.drawable.toyota));
        listaMarcas.add(new Marca("Nissan",R.drawable.nissan));
        listaMarcas.add(new Marca("BMW",R.drawable.bmw));
    }

    private void instancias() {

        spinner = findViewById(R.id.spinner_personalizado);
        listaMarcas = new ArrayList<>();
        adaptadorSpinner = new AdaptadorSpinner(listaMarcas);
    }
}
