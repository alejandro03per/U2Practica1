package com.ieschabas;

public class CuentaBancaria {

    private double saldo;
    private String titular;

    public CuentaBancaria(){}

    public CuentaBancaria(double saldp, String titular){
        this.saldo=saldo;
        this.titular=titular;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public void setTitular(String titulat){
        this.titular=titular;
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
//
    public CuentaBancaria(double saldo, String titular){
        this.saldo=saldo;
        this.titular=titular;
    }

    //Setters
    /**
     * Metodo que devuelve el saldo
     * @param saldo
     */
    public setSaldo(double saldo){
        this.saldo=saldo;
    }

    /**
     * Metodo que devuelve el titular
     * @param titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Getters

}
