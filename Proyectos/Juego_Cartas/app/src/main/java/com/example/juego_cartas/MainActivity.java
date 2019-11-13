package com.example.juego_cartas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_Pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        btn_Pasar.setOnClickListener(this);
    }

    private void instancias() {
        btn_Pasar = findViewById(R.id.btnPasar);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnPasar:
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                break;
        }

    }
}
