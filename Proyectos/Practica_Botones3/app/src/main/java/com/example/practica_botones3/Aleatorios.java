package com.example.practica_botones3;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Aleatorios extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rango_si, rango_no;
    private EditText minimo, maximo, num_decimales,numeros;
    CheckBox decimales_P;
    ImageButton Num_Obtener;
    TextView txt_resultado;
    int[] numerosTotales = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorios);
        instancias();
        acciones();
    }

    private void acciones() {
        rango_si.setOnClickListener(this);
        rango_no.setOnClickListener(this);
        decimales_P.setOnClickListener(this);
        Num_Obtener.setOnClickListener(this);
    }

    private void instancias() {
        rango_no = findViewById(R.id.rangoNO);
        rango_si = findViewById(R.id.rangoSI);
        minimo = findViewById(R.id.minimo);
        maximo = findViewById(R.id.maximo);
        decimales_P = findViewById(R.id.permitir_decimales);
        num_decimales = findViewById(R.id.decimales);
        Num_Obtener = findViewById(R.id.obtenerNum);
        txt_resultado = findViewById(R.id.txt_resultado);
        numeros = findViewById(R.id.numeros);
    }

    @Override
    public void onClick(View v) {

        int generado;
        int min,max;

        switch (v.getId()){
            case R.id.rangoNO:
                minimo.setEnabled(false);
                maximo.setEnabled(false);
                break;
            case R.id.rangoSI:
                minimo.setEnabled(true);
                maximo.setEnabled(true);
                break;
            case R.id.permitir_decimales:
                if (decimales_P.isChecked()) {
                    num_decimales.setEnabled(true);
                }else {
                    num_decimales.setEnabled(false);
                }
                break;
            case R.id.obtenerNum:



                if(!numeros.getText().toString().isEmpty()) {

                    txt_resultado.setText("");

                    //Cuantos numeros se generan
                    int numero = Integer.parseInt(numeros.getText().toString());

                    //Imprimir numeros en el TextView con las condiciones
                    for (int i = 0; i < numero; i++) {//

                        if (!minimo.getText().toString().isEmpty() && !maximo.getText().toString().isEmpty()) {
                            min = Integer.parseInt(maximo.getText().toString());
                            max = (Integer.parseInt(minimo.getText().toString())) - min;
                            if (max > min) {
                                Toast.makeText(getApplicationContext(), "Introduce valores máximos y mínimos correctos", Toast.LENGTH_SHORT).show();
                            } else {
                                generado = (int) ((Math.random()) * max) + min;
                                txt_resultado.append(String.valueOf(generado) + "\n");
                            }
                        } else {
                            generado = (int) (Math.random() * 99999);
                            txt_resultado.append(String.valueOf(generado) + "\n");

                        }

                    }
                }else {
                    Toast.makeText(getApplicationContext(),"Introduce todos los datos",Toast.LENGTH_SHORT).show();
                }


                break;

        }

    }
}
