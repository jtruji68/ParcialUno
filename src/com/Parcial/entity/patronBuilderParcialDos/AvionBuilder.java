package com.Parcial.entity.patronBuilderParcialDos;

import com.Parcial.entity.Color;

// Parcial dos metodo builders
public class AvionBuilder {

    private Avion avion;

    public AvionBuilder (String referencia, Color color, float velocidadMaxima, float altitudMaxima){
        this.avion = new Avion(referencia,color,velocidadMaxima,altitudMaxima);
    }

    public AvionBuilder(){
    }

    public AvionBuilder referencia (String referencia){
        this.avion.setReferencia(referencia);
        return this;
    }

    public AvionBuilder color(Color color){
        this.avion.setColor(color);
        return this;
    }


    public AvionBuilder velocidadMaxima(float velocidadMaxima){
        this.avion.setVelocidadMaxima(velocidadMaxima);
        return this;
    }

    public AvionBuilder altitudMaxima(float altitudMaxima){
        this.avion.setAltitudMaxima(altitudMaxima);
        return this;
    }

    public Avion build(){
        return this.avion;
    }
}
