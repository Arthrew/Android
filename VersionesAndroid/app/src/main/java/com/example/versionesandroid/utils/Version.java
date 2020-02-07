package com.example.versionesandroid.utils;

import java.io.Serializable;

public class Version implements Serializable {
    private String nombre, fecha, numeroVersion;
    private int logo, foto,descripcion;

    public Version(String nombre, int logo, String fecha, int descripcion, String numeroVersion, int foto) {
        this.nombre = nombre;
        this.logo = logo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.numeroVersion = numeroVersion;
        this.foto = foto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(String numeroVersion) {
        this.numeroVersion = numeroVersion;
    }
}
