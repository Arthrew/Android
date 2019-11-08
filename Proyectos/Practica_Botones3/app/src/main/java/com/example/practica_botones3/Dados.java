package com.example.practica_botones3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Dados extends AppCompatActivity implements View.OnClickListener {

    private Button tirada;
    private ImageView imagenDado;
    int[] posibilidades = {R.drawable.dado_uno, R.drawable.dado_dos, R.drawable.dado_tres,R.drawable.dado_cuatro, R.drawable.dado_cinco, R.drawable.dado_seis};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
        instancias();
        acciones();
    }

    private void acciones() {
        tirada.setOnClickListener(this);
    }

    private void instancias() {
        tirada = findViewById(R.id.tiradaDado);
        imagenDado = findViewById(R.id.imagen_dado);
    }

    @Override
    public void onClick(View v) {

        if (v == tirada){
            int aleatorio = (int)(Math.random()*6);
            imagenDado.setImageDrawable(getResources().getDrawable(posibilidades[aleatorio], null));
            imagenDado.setImageResource(posibilidades[aleatorio]);

        }

    }
}
