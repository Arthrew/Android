package com.example.examen_tema2;

import java.io.Serializable;

public class PasaDatos implements Serializable {

    float rsultado;
    String operacion;

    public PasaDatos(float rsultado, String operacion) {
        this.rsultado = rsultado;
        this.operacion = operacion;
    }

    public float getRsultado() {
        return rsultado;
    }

    public void setRsultado(float rsultado) {
        this.rsultado = rsultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}

