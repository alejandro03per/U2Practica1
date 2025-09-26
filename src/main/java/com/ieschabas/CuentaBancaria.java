package com.ieschabas;
/**
 * Clase Cuenta bancaria que implementa metodos para ingresar y retirar dinero
 * @author Alejandro Pérez
 * version 1.0
 */
public class CuentaBancaria {

    private double saldo;
    private String titular;

    /**
     * Constructor por defecto de la clase cuenta bancaria
     */
    public CuentaBancaria(){}

    public CuentaBancaria(double saldo, String titular){
        this.saldo=saldo;
        this.titular=titular;
    }

    //Setters
    /**
     * Metodo que establece el saldo
     * @param saldo
     */
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    /**
     * Metodo que establece titular
     * @param titular
     */
    public void setTitular(String titular){
        this.titular=titular;
    }

    //Getters

    /**
     * Metodo que devuelve saldo
     * @return saldo
     */
    public double getSaldo(){
        return this.saldo;
    }

    /**
     * Metodo que devuelve el titular
     * @return titular
     */
    public String  getTitular(){
        return this.titular;
    }

    //Metodo de ingresar
    public void ingresar(double ingreso){
        //this.saldo=this.saldo + ingreso;
        this.saldo+=ingreso;
    }

    //Metodo retirar
    public void retirar(double retiro){
        //this.saldo=this.saldo - retiro
        this.saldo-= retiro;
    }

}
