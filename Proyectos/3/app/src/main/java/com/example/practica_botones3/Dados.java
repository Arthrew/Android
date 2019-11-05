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
            int aleatorio = (int)(Math.random()*6)+1;

            switch (aleatorio){
                case 1:
                    imagenDado.setImageResource(R.drawable.dado_uno);
                    break;
                case 2:
                    imagenDado.setImageResource(R.drawable.dado_dos);
                    break;
                case 3:
                    imagenDado.setImageResource(R.drawable.dado_tres);
                    break;
                case 4:
                    imagenDado.setImageResource(R.drawable.dado_cuatro);
                    break;
                case 5:
                    imagenDado.setImageResource(R.drawable.dado_cinco);
                    break;
                case 6:
                    imagenDado.setImageResource(R.drawable.dado_seis);
                    break;
            }
        }

    }
}
