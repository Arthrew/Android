package com.example.juego_cartas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnArriba,btnAbajo;
    ImageView carta;
    final static String TAG_RESPUESTA = "respuesta";
    int[] posibilidades = {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6, R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10, R.drawable.c11, R.drawable.c12, R.drawable.c13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        instancias();
        acciones();
    }

    private void acciones() {
        btnArriba.setOnClickListener(this);
        btnAbajo.setOnClickListener(this);
    }

    private void instancias() {
        btnArriba = findViewById(R.id.btn_Arriba);
        btnAbajo = findViewById(R.id.btn_Abajo);
        carta = findViewById(R.id.imagen_carta);
    }

    @Override
    public void onClick(View v) {
        int cartas = (int)(Math.random()*12);
        carta.setImageResource(posibilidades[cartas]);
        switch (v.getId()){
            case R.id.btn_Arriba:
                break;
            case R.id.btn_Abajo:
                break;
        }
       /* switch (v.getId()){
            case R.id.btnResponder:
                if (txt_Respuesta.getText().toString().isEmpty()){
                    setResult(MainActivity.RES_COD_FAIL);
                }else {
                    Intent iRespuesta = new Intent();
                    iRespuesta.putExtra(TAG_RESPUESTA,txt_Respuesta.getText().toString());
                    setResult(MainActivity.RES_COD_OK,iRespuesta);
                }
                finish();
                break;
        }*/
    }
}
