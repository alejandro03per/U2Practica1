package com.ieschabas;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciamos un objeto persona
        Persona persona1 = new Persona();
        //Hemos añadido datos al objeto persona1
        persona1.setNombre("Alejandro");
        persona1.setApellidos("Perez Serra");
        persona1.setDni("55555555E");
        persona1.setEdad(27);
        persona1.setTelefono("55555555");
        //Imprimimos los datos por consola
        System.out.println(persona1.toString());

        //Instanciamos un objeto Persona con constructor sobrecargado
        Persona persona2 = new Persona(22, "5555555L", "Alicia", "FFF", "+34478745837");
        System.out.println(persona2.toString());

        //Cambiar la edad a 50 e imprimir el objeto
        persona1.setEdad(50);
        //Comprobamos que la edad se ha establecido
        System.out.println("Nueva edad: " + persona1.getEdad());
        //Imprimimos todo el objeto
        System.out.println(persona1.toString());


    }
}