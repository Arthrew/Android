package com.example.examen_tema2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText tablon1, tablon2;
    private Button btnsuma, btnrestar, btnmultiplicacion, btndivision, permitir;
    private CheckBox validar;
    String operacion;
    float operando1, operando2, resultado;
    static final String TAG_1 = "texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        btnsuma.setOnClickListener(this);
        btnrestar.setOnClickListener(this);
        btnmultiplicacion.setOnClickListener(this);
        btndivision.setOnClickListener(this);
        permitir.setOnClickListener(this);
    }

    private void instancias() {

        tablon1 = findViewById(R.id.tablon1);
        tablon2 = findViewById(R.id.tablon2);
        btnsuma = findViewById(R.id.btnsuma);
        btnrestar = findViewById(R.id.btnresta);
        btnmultiplicacion = findViewById(R.id.btnmultiplicacion);
        btndivision = findViewById(R.id.btndivision);
        permitir = findViewById(R.id.permitir);
        validar = findViewById(R.id.validar);

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
                    if (operacion.equals("multiplicacion")) {
                        resultado = (operando1 * operando2);

                    }
                    if (operacion.equals("division")) {
                        resultado = (operando1 / operando2);

                    }
                    if (operacion.equals("resta")) {
                        resultado = (operando1 - operando2);

                    }
                    PasaDatos pasarDatos = new PasaDatos(resultado, operacion);
                    Intent iPasar = new Intent(getApplicationContext(), SecondActivity.class);
                    iPasar.putExtra(TAG_1, pasarDatos);
                    startActivity(iPasar);
                }
                if (tablon1.getText().toString().isEmpty()
                        || tablon2.getText().toString().isEmpty()
                        || operacion.isEmpty()
                        || !validar.isChecked()){
                    Toast.makeText(getApplicationContext(),"Por favor introduzca todos los datos",Toast.LENGTH_LONG).show();
                }
                break;

            default:
                break;
        }

    }

}

