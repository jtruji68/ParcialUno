package com.Parcial.entity;

public class Vehiculo {

    private String referencia;
    private Color color;
    private float velocidadMaxima;


    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(String referencia, Color color, float velocidadMaxima) {
        this.referencia = referencia;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "referencia='" + referencia + '\'' +
                ", color=" + color +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
