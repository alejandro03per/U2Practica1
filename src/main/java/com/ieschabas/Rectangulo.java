package com.ieschabas;

/**
 * Clase que define un rectangulo
 * @author Alejandro Pérez
 * @version 1.0
 */
public class Rectangulo {

    private double base;
    private double altura;

    /**
     * Constructo por defecto de la clase rectangulo
     */
    public Rectangulo(){}

    /**
     * Constructor sobrecargado de la clase rectangulo
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura){
        this.base= base;
        this.altura=altura;
    }

    //Setters

    /**
     * Metodo que establece la base del rectagulo
     * @param base
     */
    public void setBase(double base){
        this.base=base;
    }

    /**
     *  Metodo que estable la altura del rectangulo
     */

    public void setAltura(double altura){
        this.altura=altura;
    }

    //Getters

    /**
     * Método que devuelve la base del rectangulo
     * @return base
     */
    public double getBase(){
        return this.base;
    }

    /**
     * Metodo que devuelve la altura del rectangulo
     * @return altura
     */
    public double getAltura(){
        return this.altura;
    }

    /**
     * Método que calcula el area del rectangulo
     * @return area
     */
    public double calcularArea(){
        return this.base * this.altura;
    }


}
