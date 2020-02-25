package com.example.proyecto_final_android.Ventanas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto_final_android.R;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal_layout);
        instacias();
        acciones();
    }

    private void acciones() {

    }

    private void instacias() {
    }
}
