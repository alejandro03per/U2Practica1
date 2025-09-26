package com.ieschabas;

/**Clase que calcular el area de un circulo con el radio
 * @author Alejandro
 * version 1.0
 */
public class Circulo {
    private double radio;

    // Constructor

    /**
     *Constructor por defecto para calcular el radio
     */
    public Circulo() {}

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter

    /**
     * Inserta el radio sobre la clase circulo
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    // Setter

    /**
     * Devuelve el radio sobre la clase radio
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    /**
     * devuelve el area sobre la clase circulo
     * @return area
     */
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
