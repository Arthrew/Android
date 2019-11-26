package com.example.examen_1ev_pmdm;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    Spinner spinner_coches;
    ArrayList coches;
    ArrayAdapter adaptador;
    Button agregar_coche;
    TextView txt_marca,txt_modelo,txt_cv;
    final int REQ_COD = 1;
    final static int RES_COD_OK = 0;
    final static int RES_COD_FAIL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        instancias();
        spinnerRelleno();
        acciones();
    }

    private void spinnerRelleno() {
        adaptador = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, coches);
        spinner_coches.setAdapter(adaptador);
    }

    private void instancias() {
        agregar_coche = findViewById(R.id.btn_agregar);
        txt_marca = findViewById(R.id.txt_marca);
        txt_modelo = findViewById(R.id.txt_modelo);
        txt_cv = findViewById(R.id.txt_cv);
        spinner_coches = findViewById(R.id.spinner_coches);
        coches = new ArrayList();
    }

    private void acciones() {
        agregar_coche.setOnClickListener(this);
        spinner_coches.setOnItemSelectedListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RES_COD_FAIL){
            Toast.makeText(getApplicationContext(),"No se ha agregado ningun coche",Toast.LENGTH_SHORT).show();
        }else if (resultCode == RES_COD_OK){
            Coche coche = (Coche)data.getSerializableExtra(FormScreen.TAG_RESPUESTA);
            coches.add(coche);
            adaptador.notifyDataSetChanged();


        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_agregar:
                Intent intent = new Intent(getApplicationContext(),FormScreen.class);
                startActivityForResult(intent,REQ_COD);
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Coche coche = (Coche) adaptador.getItem(position);
        String marca = String.format("Marca: %s",coche.marca);
        txt_marca.setText(marca);
        String modelo = String.format("Modelo: %s",coche.modelo);
        txt_modelo.setText(modelo);
        String cv = String.format("Caballos: %d",coche.cv);
        txt_cv.setText(cv);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
