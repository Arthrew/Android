package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            suma, resta, multiplicar, dividir, igual, punto, reinicio,
            log, raiz, seno, coseno, tang;
    EditText tablon;
    Float valor1, valor2;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        log = findViewById(R.id.log);
        raiz = findViewById(R.id.raiz);
        seno = findViewById(R.id.sin);
        coseno = findViewById(R.id.cos);
        tang = findViewById(R.id.tan);
        multiplicar = findViewById(R.id.multiplicar);
        dividir = findViewById(R.id.dividir);
        igual = findViewById(R.id.igual);
        punto = findViewById(R.id.punto);
        reinicio = findViewById(R.id.reinicio);
        tablon = findViewById(R.id.tablon);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        igual.setOnClickListener(this);
        punto.setOnClickListener(this);
        reinicio.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn0:
                tablon.setText(tablon.getText() + "0");
                break;

            case R.id.btn1:
                tablon.setText(tablon.getText() + "1");
                break;

            case R.id.btn2:
                tablon.setText(tablon.getText() + "2");
                break;

            case R.id.btn3:
                tablon.setText(tablon.getText() + "3");
                break;

            case R.id.btn4:
                tablon.setText(tablon.getText() + "4");
                break;

            case R.id.btn5:
                tablon.setText(tablon.getText() + "5");
                break;

            case R.id.btn6:
                tablon.setText(tablon.getText() + "6");
                break;

            case R.id.btn7:
                tablon.setText(tablon.getText() + "7");
                break;

            case R.id.btn8:
                tablon.setText(tablon.getText() + "8");
                break;

            case R.id.btn9:
                tablon.setText(tablon.getText() + "9");
                break;

            case R.id.suma:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    valor1 = Float.parseFloat(String.valueOf(tablon.getText()));
                    operacion = "suma";
                    tablon.setText(null);
                }
                break;

            case R.id.resta:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    valor1 = Float.parseFloat(String.valueOf(tablon.getText()));
                    operacion = "resta";
                    tablon.setText(null);
                }
                break;

            case R.id.multiplicar:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    valor1 = Float.parseFloat(String.valueOf(tablon.getText()));
                    operacion = "multiplicar";
                    tablon.setText(null);
                }
                break;

            case R.id.dividir:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    valor1 = Float.parseFloat(String.valueOf(tablon.getText()));
                    operacion = "dividir";
                    tablon.setText(null);
                }
                break;

            case R.id.log:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    tablon.setText("Log(");
                    operacion = "log";
                }
                break;

            case R.id.raiz:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    tablon.setText("√(");
                    operacion = "raiz";
                }
                break;

            case R.id.sin:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    tablon.setText("Sin(");
                    operacion = "seno";
                }
                break;

            case R.id.cos:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    tablon.setText("Cos(");
                    operacion = "coseno";
                }
                break;

            case R.id.tan:
                if (tablon == null) {
                    tablon.setText(null);
                } else {
                    tablon.setText("Tan(");
                    operacion = "tang";
                }
                break;

            case R.id.igual:
                valor2 = Float.parseFloat(String.valueOf(tablon.getText()));

                if (operacion.equals("suma")) {
                    tablon.setText(valor1 + valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));

                } else if (operacion.equals("resta")) {
                    tablon.setText(valor1 - valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));

                } else if (operacion.equals("multiplicar")) {
                    tablon.setText(valor1 * valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));

                } else if (operacion.equals("dividir")) {
                    tablon.setText(valor1 / valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));


                } else if (operacion.equals("log")) {
                    /*
                    tablon.setText(valor1 / valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));
*/

                } else if (operacion.equals("raiz")) {
                    /*
                    tablon.setText(valor1 / valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));
                    */



                } else if (operacion.equals("seno")) {
                    /*
                    tablon.setText(valor1 / valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));
*/

                } else if (operacion.equals("coseno")) {
                    /*
                    tablon.setText(valor1 / valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));
                     */


                } else if (operacion.equals("tang")) {
                    /*
                    tablon.setText(valor1 / valor2 + "");
                    valor2 = Float.parseFloat(String.valueOf(tablon.getText()));

                     */

                }
                break;

            case R.id.punto:
                tablon.setText(tablon.getText() + ".");
                break;

            case R.id.reinicio:
                tablon.setText("");
                valor1 = null;
                valor2 = null;
            default:
                break;
        }
    }
}
