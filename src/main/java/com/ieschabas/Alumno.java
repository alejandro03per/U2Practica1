package com.ieschabas;

/**Clase que dice si un alumno esta aprobado o no lo esta
 * @Author Alejandro Pérez
 * version 1.0
 */
public class Alumno {

    private String nombre;
    private double nota;
    //Constructores

    /**
     * Constructor por defecto crea una instancia con nombre y nota
     */
    public Alumno(String nombre, double nota){
        this.nombre=nombre;
        this.nota=nota;
    }
    //Getters
    /**
     * Devuelve el nombre sobre el objeto alumno
     * @return enombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve la nota sobre el objeto alumno
     * @return nota
     */
    public double getNota(){
        return nota;
    }
    //Setters
    /**
     * Inserta el nombre sobre el objeto alumno
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     * Inserta la nota sobre el objeto alumno
     * @param nota
     */
    public void setNota(double nota){
        this.nota=nota;
    }
    //Método boolean aprobado: true si la nota >= 5
    public boolean aprobado() {
        return nota >= 5;
    }
}
