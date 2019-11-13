package com.example.practica_botones3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Campeon extends AppCompatActivity implements View.OnClickListener {

    Button agregarCon, ganador;
    TextView parrillaCon;
    EditText concursante;
    ArrayList concursantes;
    Boolean estado_parrilla = false;
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeon);
        instacias();
        acciones();
    }

    private void acciones() {
        agregarCon.setOnClickListener(this);
        ganador.setOnClickListener(this);
    }

    private void instacias() {
        agregarCon = findViewById(R.id.agregar_con);
        ganador = findViewById(R.id.ganador);
        parrillaCon = findViewById(R.id.parrilla);
        concursante = findViewById(R.id.concursante);
        concursantes = new ArrayList();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.agregar_con:
                if (!concursante.getText().toString().isEmpty()) {
                    if (estado_parrilla == false){
                        parrillaCon.setText("");
                        String con = concursante.getText().toString();
                        concursantes.add(posicion, con);
                        parrillaCon.append(con + "\n");
                        concursante.setText("");
                        estado_parrilla = true;
                        posicion++;
                    }else{
                        String con = concursante.getText().toString();
                        concursantes.add(posicion, con);
                        parrillaCon.append(con + "\n");
                        concursante.setText("");
                        estado_parrilla = true;
                        posicion++;
                    }

                } else {
                    Toast.makeText(getApplicationContext(),"Introduce concursante",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ganador:
                if (!concursantes.isEmpty()) {
                    int aleatorio = (int) (Math.random() * concursantes.size());
                    String prueba = concursantes.get(aleatorio).toString();
                    parrillaCon.setText("El ganador es -" + prueba + "-");
                    concursantes.clear();
                    estado_parrilla = false;
                    posicion = 0;
                }else{
                    Toast.makeText(getApplicationContext(),"No hay concursantes",Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
