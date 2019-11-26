package com.example.examen_1ev_pmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class FormScreen extends AppCompatActivity implements View.OnClickListener {

    private Button agregarCoche, volver;
    private Spinner spinner_marcas;
    private ArrayList marcas;
    private ArrayAdapter adaptador;
    private EditText modelo_txt,cv_txt;
    final static String TAG_RESPUESTA = "respuesta";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_screen);
        instancias();
        rellenarSpinner();
        acciones();
    }

    private void rellenarSpinner() {
        marcas.add(0, "Ford");
        marcas.add(1, "Toyota");
        marcas.add(2, "Mercedes");
        marcas.add(3, "Audi");
        marcas.add(4, "Volkswagen");
        marcas.add(5, "BMW");
        marcas.add(6, "Mini");
        marcas.add(7, "Nissan");
        marcas.add(8, "Otra...");
        adaptador = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, marcas);
        spinner_marcas.setAdapter(adaptador);
    }

    private void instancias() {
        spinner_marcas = findViewById(R.id.spnr_marca);
        marcas = new ArrayList();
        agregarCoche = findViewById(R.id.agregar_coche);
        volver = findViewById(R.id.volver);
        modelo_txt = findViewById(R.id.modelo_txt);
        cv_txt = findViewById(R.id.cv_txt);
    }

    private void acciones() {
        agregarCoche.setOnClickListener(this);
        volver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.agregar_coche:
                if (modelo_txt.getText().toString().isEmpty() || cv_txt.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Introduce todos los datos",Toast.LENGTH_SHORT).show();
                }else {
                    String marca = String.valueOf(adaptador.getItem(spinner_marcas.getSelectedItemPosition()));
                    String modelo = modelo_txt.getText().toString();
                    int cv = Integer.parseInt(cv_txt.getText().toString());
                    Coche coche = new Coche(marca, modelo,cv);

                    Intent iRespuesta = new Intent();
                    iRespuesta.putExtra(TAG_RESPUESTA,coche);
                    setResult(HomeScreen.RES_COD_OK,iRespuesta);
                }
                finish();
                break;
            case R.id.volver:
                setResult(HomeScreen.RES_COD_FAIL);
                finish();
                break;
        }
    }
}
