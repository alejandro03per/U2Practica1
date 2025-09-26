package com.ieschabas;

/**Clase que hace la función de calculadora usando la funcion Scanner piiendo al usuaro insertar numero
 * @Author: Alejandro
 * Version 1.0
 */
public class Calculadora {
    private double numero1;
    private double numero2;

    // Constructor por defecto
    public Calculadora() {}

    // Constructor con parámetros
    /**
     * Constructor por defecto de parametros con numeros
     */
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters
    /**
     * Inserta numero sobre la clase Calculadora
     */

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    // Setters
    /**
     * Devuelve el  resultado
     * @return numero
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Método para suma
    public double suma() {
        return numero1 + numero2;
    }

    // Método para resta
    public double resta() {
        return numero1 - numero2;
    }

    // Método para multiplicación
    public double multiplicacion() {
        return numero1 * numero2;
    }

    // Método para división
    public double division() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }

}
