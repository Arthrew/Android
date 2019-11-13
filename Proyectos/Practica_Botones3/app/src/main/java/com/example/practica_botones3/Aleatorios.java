package com.example.practica_botones3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Aleatorios extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rango_si, rango_no;
    private EditText minimo, maximo, num_decimales, numeros;
    CheckBox permitirDecimales;
    ImageButton Num_Obtener;
    TextView txt_resultado;
    Switch swt_repetir;
    List<String> numeros_aleatorios = new ArrayList<String>();
    Hashtable<Integer, String> numerosTotales = new Hashtable<>();

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
        permitirDecimales.setOnClickListener(this);
        Num_Obtener.setOnClickListener(this);
    }

    private void instancias() {
        rango_no = findViewById(R.id.rangoNO);
        rango_si = findViewById(R.id.rangoSI);
        minimo = findViewById(R.id.minimo);
        maximo = findViewById(R.id.maximo);
        permitirDecimales = findViewById(R.id.permitir_decimales);
        num_decimales = findViewById(R.id.decimales);
        Num_Obtener = findViewById(R.id.obtenerNum);
        txt_resultado = findViewById(R.id.txt_resultado);
        numeros = findViewById(R.id.numeros);
        swt_repetir = findViewById(R.id.repetir);
    }

    @Override
    public void onClick(View v) {

        int generado, min, max, txt_decimales, decimales;
        String resultado;

        switch (v.getId()) {
            case R.id.rangoNO:
                minimo.setText("");
                maximo.setText("");
                minimo.setEnabled(false);
                maximo.setEnabled(false);
                break;
            case R.id.rangoSI:
                minimo.setEnabled(true);
                maximo.setEnabled(true);
                break;
            case R.id.permitir_decimales:
                if (permitirDecimales.isChecked()) {
                    num_decimales.setEnabled(true);
                } else {
                    num_decimales.setText("");
                    num_decimales.setEnabled(false);
                }
                break;

            case R.id.obtenerNum:

                if (!numeros.getText().toString().isEmpty()) {

                    txt_resultado.setText("");

                    //Cuantos numeros se generan
                    int numero = Integer.parseInt(numeros.getText().toString());

                    //Imprimir numeros en el TextView con las condiciones
                    for (int i = 0; i < numero; i++) {//

                        if (!minimo.getText().toString().isEmpty() && !maximo.getText().toString().isEmpty()) {
                            min = Integer.parseInt(minimo.getText().toString());
                            max = Integer.parseInt(maximo.getText().toString());
                            //Controlando si elige maximos y minimos
                            if (max < min) {
                                Toast.makeText(getApplicationContext(), "Introduce valores máximos y mínimos correctos", Toast.LENGTH_SHORT).show();
                            } else {
                                //Controlando la opcion de decimales
                                if (permitirDecimales.isChecked()) {
                                    if (num_decimales.getText().toString().isEmpty()) {
                                        Toast.makeText(getApplicationContext(), "Introduce numero de decimales", Toast.LENGTH_SHORT).show();
                                    } else {
                                        txt_decimales = Integer.parseInt(num_decimales.getText().toString());
                                        generado = (int) ((Math.random()) * (max - min)) + min;
                                        decimales = (int) (Math.random() * ((Math.pow(10, txt_decimales) - 1) - (Math.pow(10, (txt_decimales - 1))))) + ((int) Math.pow(10, (txt_decimales - 1)));
                                        if (decimales < 0) {
                                            decimales = decimales * -1;
                                        }
                                        resultado = String.format(generado + "." + decimales + " ");
                                        numerosTotales.put(i, resultado);
                                        txt_resultado.append(numerosTotales.get(i) + " ");


                                    }
                                } else {
                                    if (!swt_repetir.isChecked()) {
                                        generado = (int) ((Math.random()) * (max + 1 - min)) + min;
                                        Log.v("TAG", String.valueOf(numerosTotales.contains(generado)));

                                        if (numerosTotales.contains(generado)) {
                                            do {
                                                generado = (int) ((Math.random()) * (max + 1 - min)) + min;
                                                Log.v("TAG", String.valueOf(generado));

                                            } while (numerosTotales.contains(generado));

                                        }
                                        numerosTotales.put(i, Integer.toString(generado));
                                        //txt_resultado.append(numerosTotales.get(i) + " ");
                                        //Log.v("TAG",String.valueOf(generado));


                                    } else {


                                        /*generado = (int) ((Math.random()) * (max + 1 - min)) + min;
                                        numerosTotales.put(i, Integer.toString(generado));
                                        txt_resultado.append(numerosTotales.get(i) + " ");*/

                                    }


                                }
                            }

                        } else {
                            if (permitirDecimales.isChecked()) {
                                if (num_decimales.getText().toString().isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Introduce numero de decimales", Toast.LENGTH_SHORT).show();
                                } else {
                                    txt_decimales = Integer.parseInt(num_decimales.getText().toString());
                                    generado = (int) (Math.random() * 999);
                                    decimales = (int) (Math.random() * ((Math.pow(10, txt_decimales) - 1) - (Math.pow(10, (txt_decimales - 1))))) + ((int) Math.pow(10, (txt_decimales - 1)));
                                    if (decimales < 0) {
                                        decimales = decimales * -1;
                                    }
                                    resultado = String.format(generado + "." + decimales + " ");
                                    txt_resultado.append(resultado + " ");
                                }
                            } else {
                                generado = (int) (Math.random() * 999);
                                txt_resultado.append(generado + "  ");
                            }
                        }

                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Introduce todos los datos", Toast.LENGTH_SHORT).show();
                }


                break;

        }

    }

    private void control_repeticion() {
    }
}
