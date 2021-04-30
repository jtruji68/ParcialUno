package com.Parcial.entity;

import com.Parcial.entity.Color;
import com.Parcial.entity.Vehiculo;

public class Yate extends Vehiculo{

    private float maxPeso;

    public float getMaxPeso() {
        return maxPeso;
    }

    public void setMaxPeso(float maxPeso) {
        this.maxPeso = maxPeso;
    }

    public Yate(String referencia, Color color, float velocidadMaxima, float maxPeso) {
        super(referencia, color, velocidadMaxima);
        this.maxPeso = maxPeso;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "maxPeso=" + maxPeso +
                '}';
    }
}
