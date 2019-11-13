package com.example.pantalla_carga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    Spinner spinnerNormal;
    ArrayList listaDatos;
    ArrayAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        rellenarSpinner();
        recuperarDatos();
    }

    private void rellenarSpinner() {
        for (int i = 0; i<100;i++){
            listaDatos.add(i);
        }

        adaptador = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,listaDatos);

        spinnerNormal.setAdapter(adaptador);
        adaptador.getItem(spinnerNormal.getSelectedItemPosition());
    }

    private void instancias() {
        spinnerNormal = this.findViewById(R.id.spinner_Normal);
        listaDatos = new ArrayList();
    }

    private void recuperarDatos() {
        if (getIntent().getExtras() != null){
            String recuperada = getIntent().getExtras().getString(MainActivity.TAG_ELEMENTO);
            String recuperaDos = (String) getIntent().getExtras().get(MainActivity.TAG_ELEMENTO);
        }
    }
}
