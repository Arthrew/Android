package com.example.examen_tema2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        recuperarDatos();
    }

    private void recuperarDatos() {

        PasaDatos datosRecuperados;


        datosRecuperados = (PasaDatos) getIntent().getExtras().get(MainActivity.TAG_1);

        int ent = (int) datosRecuperados.rsultado;
        String mensaje;

        if ((datosRecuperados.rsultado - ent) == 0){
             mensaje = String.format("El resultado de la %s es %d", datosRecuperados.operacion, ent);
        }else{
            mensaje = String.format("El resultado de la %s es %.3f", datosRecuperados.operacion, datosRecuperados.rsultado);
        }
        resultado.setText(mensaje);
    }

    private void instancias() {
        resultado = findViewById(R.id.resultado);
    }

}
