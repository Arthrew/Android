package com.example.pasardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText textoPasar;
    Button btnPasar, btnPasarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void acciones(){
        btnPasar.setOnClickListener(this);
        btnPasarDatos.setOnClickListener(this);

    }

    private void instancias(){
        textoPasar = findViewById(R.id.txt);
        btnPasar = findViewById(R.id.btnPasar);
        btnPasarDatos = findViewById(R.id.btnPasarDatos);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPasar:
                String palabra = textoPasar.getText().toString();
                if(palabra.isEmpty()){
                Toast.makeText(getApplicationContext(),"Introduce Datos", Toast.LENGTH_SHORT).show();
            } else {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
            }

            break;
            case R.id.btnPasarDatos:
                String palabraPasar = textoPasar.getText().toString();
                if (palabraPasar.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Introduce Datos", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("k1",palabraPasar);
                    startActivity(intent);
                }

        }
    }
}
