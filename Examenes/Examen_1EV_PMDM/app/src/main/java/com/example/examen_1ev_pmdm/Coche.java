package com.example.examen_1ev_pmdm;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Coche implements Serializable {
    String marca,modelo;
    int cv;

    public Coche() {
    }

    public Coche(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @NonNull
    @Override
    public String toString() {
        return getModelo();
    }
}
