package com.example.proyecto_final_android.Ventanas;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto_final_android.R;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private FirebaseAuth mAuth;
    //private ProgressDialog progressDialog;

    EditText usuario_login, password_login;
    Button btnIniciarSesion, btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        instacias();
        acciones();
        // Initialize Firebase Auth

    }

    private void instacias() {
        usuario_login = findViewById(R.id.usuario_login);
        password_login = findViewById(R.id.password_login);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnRegistrar = findViewById(R.id.btnAgregar);
        mAuth = FirebaseAuth.getInstance();
        //progressDialog = new ProgressDialog(this);

    }

    private void acciones() {

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro = new Intent(Login.this, Registro.class);
                Login.this.startActivity(registro);
            }
        });


    }


}
