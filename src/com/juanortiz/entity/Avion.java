package com.juanortiz.entity;

public class Avion extends Vehiculo{

    private float altitudMaxima;

    public float getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(float altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public Avion(String referencia, Color color, float velocidadMaxima, float altitudMaxima) {
        super(referencia, color, velocidadMaxima);
        this.altitudMaxima = altitudMaxima;
    }
}
