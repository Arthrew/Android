package com.example.proyecto_final_android.Ventanas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto_final_android.R;

public class MenuPrincipal extends AppCompatActivity {
    Button btnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        instacias();
        acciones();
    }

    private void acciones() {

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciarSesion = new Intent(MenuPrincipal.this, Login.class);
                MenuPrincipal.this.startActivity(iniciarSesion);
            }
        });
    }

    private void instacias() {
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
    }
}
