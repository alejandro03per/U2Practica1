package com.ieschabas;

/**
 * Clase que calcula raiz cuadrada de un numero
 * @author Alejandro
 * version 1.0
 */
public class PotenciaYRaiz {
    private double numero;
    private double exponente;

    // Getter y setter para numero
    /**
     * Devuelve numero sobre ojeto potencia y raiz
     * @return numero
     */
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    // Getter y setter para exponente
    /**
     * Devuelve el exponente
     * @return exponente
     */
    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }

    // Método para calcular raíz cuadrada

    public double calcularRaizCuadrada() {
        return Math.sqrt(numero);
    }

    // Método para calcular potencia
    public double calcularPotencia() {
        return Math.pow(numero, exponente);
    }
}
