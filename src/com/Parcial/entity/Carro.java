package com.Parcial.entity;

import com.Parcial.entity.Color;
import com.Parcial.entity.Vehiculo;

public class Carro extends Vehiculo {

    private int numeroPuertas;

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(String referencia, Color color, float velocidadMaxima, int numeroPuertas) {
        super(referencia, color, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPuertas=" + numeroPuertas +
                '}';
    }
}
