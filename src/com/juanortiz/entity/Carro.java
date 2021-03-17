package com.juanortiz.entity;

public class Carro extends Vehiculo{

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
}
