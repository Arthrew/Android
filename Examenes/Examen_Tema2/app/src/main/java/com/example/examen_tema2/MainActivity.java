package com.example.examen_tema2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText tablon1, tablon2;
    private Button btnsuma, btnresta, btnmultiplicacion, btndivision, permitir;
    private CheckBox validar;
    String operacion;
    float operando1, operando2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        btnsuma.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnmultiplicacion.setOnClickListener(this);
        btndivision.setOnClickListener(this);
        permitir.setOnClickListener(this);
    }

    private void instancias() {

        tablon1 = findViewById(R.id.tablon1);
        tablon2 = findViewById(R.id.tablon2);
        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmultiplicacion = findViewById(R.id.btnmultiplicacion);
        btndivision = findViewById(R.id.btndivision);
        validar = findViewById(R.id.validar);
        permitir = findViewById(R.id.permitir);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnsuma:
                operacion = "suma";
                break;
             case R.id.btnresta:
                operacion = "resta";
                break;
            case R.id.btnmultiplicacion:
                operacion = "multiplicacion";
                break;
            case R.id.btndivision:
                operacion = "division";
                break;
            case R.id.permitir:
                if (!tablon1.getText().toString().isEmpty()
                        && !tablon2.getText().toString().isEmpty()
                        && !operacion.isEmpty()
                        && validar.isChecked()) {

                    resultado = 0;
                    operando1 = Float.parseFloat(tablon1.getText() + "");
                    operando2 = Float.parseFloat(tablon2.getText() + "");

                    if (operacion.equals("suma")) {
                        resultado = (operando1 + operando2);
                    }
                    if (operacion.equals("resta")) {
                        resultado = (operando1 - operando2);

                    }
                    if (operacion.equals("multiplicacion")) {
                        resultado = (operando1 * operando2);

                    }
                    if (operacion.equals("division")) {
                        resultado = (operando1 / operando2);

                    }
                    System.out.println("Tu numero es " + resultado);
                    Float pasar = resultado;
                    Intent iPasar = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(iPasar);
                }
                break;

            default:
                break;
        }

    }
}
