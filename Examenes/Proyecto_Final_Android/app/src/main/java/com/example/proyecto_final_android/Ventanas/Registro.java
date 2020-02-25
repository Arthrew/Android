package com.example.proyecto_final_android.Ventanas;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto_final_android.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {

    private FirebaseAuth mAuth;

    EditText correo_registro, contraseña_registro;
    Button btn_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_layout);
        instancias();
        acciones();
}

    private void instancias() {
        correo_registro = findViewById(R.id.correo_registro);
        contraseña_registro = findViewById(R.id.password_registro);
        btn_registro = findViewById(R.id.btn_registro);
        mAuth = FirebaseAuth.getInstance();
    }

    private void acciones() {

        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarUsuario();
            }
        });
    }

    private void registrarUsuario() {

        //Obtenemos el email y la contraseña desde las cajas de texto
        String email = correo_registro.getText().toString().trim();
        String password  = correo_registro.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Se debe ingresar un email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Falta ingresar la contraseña",Toast.LENGTH_LONG).show();
            return;
        }


        //progressDialog.setMessage("Realizando registro en linea...");
        //progressDialog.show();

        //creating a new user
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if(task.isSuccessful()){

                            Toast.makeText(Registro.this,"Se ha registrado el usuario con el email: "+ correo_registro.getText(),Toast.LENGTH_LONG).show();
                        }else{

                            Toast.makeText(Registro.this,"No se pudo registrar el usuario ",Toast.LENGTH_LONG).show();
                        }
                        //progressDialog.dismiss();
                    }
                });

    }

}
