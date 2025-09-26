package com.ieschabas;

/**
 * La clase persona define un objeto de tipo persona con atributos como,
 * nombre,apellidos,edad,dni y telefono
 * @author Alejandro
 * @version 1.0
 */
public class Persona {
    //Atributos de la clase
    private int edad;
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;

    //Constructores

    /**
     * Constructor por defecto crea una instancia de persona sin datos
     */

    public Persona(){
    }
    public Persona(int edad, String dni, String nombre, String apellidos, String telefono){
        this.edad=edad;
        this.dni= dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
    }

    //Setters

    /**
     * Inserta la edad sobre el objeto pesona
     * @param edad
     */
    public void setEdad(int edad){
        this.edad = edad;
    }

    /**
     * Inserta DNI sobre objeto persona
     * @param dni
     */
    public void setDni(String dni){
        this.dni=dni;
    }

    /**
     * Insert el nombre sobre objeto persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Inserta apellidos sobre objeto persona
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Inserta el telefono sobre el objeto persona
     * @param telefono
     */
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }


    //Getters

    /**
     * Devuelve edad sobre objeto persona
     * @return edad
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Devuelve el DNI sobre objeto persona
     * @return dni
     */
    public String getDni() {
        return this.dni;
    }

    /**
     * Devuelve el nombre sobre objeto persona
     * @return nombre
     */
    public String  getNombre() {
        return this.nombre;
    }

    /**-
     * Devuelve los apellidos sobre objeto persona
     * @return apellidos
     */
    public String getApellidos(){
        return this.apellidos;
    }
    /**
     * Devuelve telefono sobre objetos personas
     */
    public String getTelefono(){
        return this.telefono;
    }

    /**
     * Constructores sobrecargando de la clase Persona, crea
     * @return
     */

    //Método que imprime el objeto

    /**
     * devuelve el objet personas en formato cadena
     * @return cadena con los valores de persona
     */
    public String toString (){
        return "Nombre " + this.nombre + "\nApellidos: " + this.apellidos + "\nEdad: " + this.edad + "\nDNI: " + this.dni + "\nTelefono: " + this.telefono;


    }
}
