package com.Parcial.entity.patronBuilderParcialDos;

import com.Parcial.entity.Color;
import com.Parcial.entity.Vehiculo;

public class Avion extends Vehiculo {

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

    @Override
    public String toString() {
        return "Avion{" +
                "altitudMaxima=" + altitudMaxima +
                '}';
    }
}
