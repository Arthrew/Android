package com.example.practica_botones3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton aleatorio, campeon, dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        aleatorio.setOnClickListener(this);
        campeon.setOnClickListener(this);
        dados.setOnClickListener(this);
    }

    private void instancias() {
        aleatorio = findViewById(R.id.aleatorio);
        campeon = findViewById(R.id.campeon);
        dados = findViewById(R.id.dados);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.aleatorio:
                Intent iPasar = new Intent(getApplicationContext(),Aleatorios.class);
                startActivity(iPasar);
                break;
            case R.id.campeon:
                Intent iPasarDos = new Intent(getApplicationContext(),Campeon.class);
                startActivity(iPasarDos);
                break;
            case R.id.dados:
                Intent iPasarTres = new Intent(getApplicationContext(),Dados.class);
                startActivity(iPasarTres);
                break;
        }

    }
}
