package com.example.ejemploinicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonPulsar;
    Button botonInicialDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        botonPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Ejemplo inicial correcto",Toast.LENGTH_SHORT).show();
            }
        });
        botonInicialDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Ejemplo inicial correcto dos",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void instancias() {
        botonPulsar = findViewById(R.id.btnPulsar);
        botonInicialDos = findViewById(R.id.btnInicial2);
    }


}
