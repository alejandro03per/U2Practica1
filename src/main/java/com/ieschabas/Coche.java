package com.ieschabas;

/**
 * Clase coche que calcula la velocidad cuando se acelera y se frena
 * @author Alejandro Pérez
 * version 1.0
 */
public class Coche {
    private double velocidad;

    /**
     *Constructor por defecto de la clase coche para calcular la velocidad
     */
    public Coche(){
    }

    public Coche (double velocidad){
        this.velocidad = velocidad;
    }

    //Setters
    /**
     * Metodo que establece la velocidad
     * @param velocidad
     */
    public void setVelocidad(double velocidad){
        this.velocidad= velocidad;
    }
    //Getters

    /**
     * Metodo que devuelve la velocidad
     * @return velocidad
     */
    public double getVelocidad(){
        return this.velocidad;
    }

    /**
     * Metodo acelerar
     * @return acelerar
     */
    public void acelerar(double acelerar){
        //this.velocidad=this.velocidad + acelerar;
        this.velocidad+=acelerar;
    }

    /**
     * Metodo frenar
     * @param frenar
     */
    public void frenar(double frenar){
        //this.velocidad=this.velocidad - frenar
        this.velocidad-= frenar;
    }

}
