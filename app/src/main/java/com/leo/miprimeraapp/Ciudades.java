package com.leo.miprimeraapp;

public class Ciudades {
    private String nombre,ubicacion,poblacion;

    public Ciudades(String nombre, String ubicacion, String poblacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
}
