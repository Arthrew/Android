package com.example.proyecto_final_android.Ventanas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto_final_android.R;

public class Login extends AppCompatActivity {
    EditText usuario_login, password_login;
    Button btnIniciarSesion, btnEliminar, btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        instacias();
        acciones();
    }

    private void instacias() {
        usuario_login = findViewById(R.id.usuario_login);
        password_login = findViewById(R.id.password_login);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnEliminar = findViewById(R.id.btnEliminar);
        btnRegistrar = findViewById(R.id.btnAgregar);

    }

    private void acciones() {

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciarSesion = new Intent(Login.this, MenuPrincipal.class);
                Login.this.startActivity(iniciarSesion);
            }
        });
    }


}
