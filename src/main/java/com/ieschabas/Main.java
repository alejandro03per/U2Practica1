package com.ieschabas;
import java.util.Scanner;
import java.lang.Math.*;

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
        Persona persona2 = new Persona(22, "5555555L", "Alicia", "Ruiz", "+34478745837");
        System.out.println(persona2.toString());

        //Cambiar la edad a 50 e imprimir el objeto
        persona1.setEdad(50);
        //Comprobamos que la edad se ha establecido
        System.out.println("Nueva edad: " + persona1.getEdad());
        //Imprimimos todo el objeto
        System.out.println(persona1.toString());


        //Uso de la clase rectangulo
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2.3, 2.5);

        //Setear  la base y la altura del rectangulo1
        rectangulo1.setBase(5.2);
        rectangulo1.setAltura(6.2);

        System.out.println("Area del rectangulo 1: " + rectangulo1.calcularArea());
        System.out.println("Area del rectangulo 2: " + rectangulo2.calcularArea());

        //Uso de la CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(2000, "Alejandro");
        cuenta1.ingresar(20);
        System.out.println("El saldo actual es: " + cuenta1.getSaldo() + " de titular: " + cuenta1.getTitular());
        cuenta1.retirar(500);
        System.out.println("El saldo actual es: " + cuenta1.getSaldo() + " de titular: " + cuenta1.getTitular());

        //Velocidad
        Coche coche1 = new Coche(40);
        System.out.println("Velocidad inicial: " + coche1.getVelocidad() + " km/h");

        coche1.acelerar(50);
        System.out.println("Después de acelerar: " + coche1.getVelocidad() + " km/h");

        coche1.frenar(20);
        System.out.println("Después de frenar: " + coche1.getVelocidad() + " km/h");

        coche1.frenar(40);
        System.out.println("Después de frenar mucho: " + coche1.getVelocidad() + " km/h");

        // Calcular raíz cuadrada y potencia usando Math
        Scanner scanner = new Scanner(System.in);
        PotenciaYRaiz calc = new PotenciaYRaiz();

        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();
        calc.setNumero(numero);

        System.out.print("Introduce el exponente: ");
        double exponente = scanner.nextDouble();
        calc.setExponente(exponente);

        double raiz = calc.calcularRaizCuadrada();
        double potencia = calc.calcularPotencia();

        System.out.println("Raíz cuadrada de " + calc.getNumero() + " es: " + raiz);
        System.out.println(calc.getNumero() + " elevado a " + calc.getExponente() + " es: " + potencia);

        scanner.close();


        //Mostar informacion de un libro
        Libro libro1 = new Libro("Revelión en la granja", "George Orwell", 144);


        libro1.mostrarInformacion();

        libro1.setTitulo("Revelión en la granja");
        libro1.setAutor("George orwell");
        libro1.setPaginas(144);

        System.out.println("Después de modificar datos:");

        libro1.mostrarInformacion();

        //Motrar informacion si un alumno ha aprobado o no
        Alumno alumno1 = new Alumno("Alejandro", 6.5);

        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Nota: " + alumno1.getNota());

        if (alumno1.aprobado()) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Reprobado");
        }

        alumno1.setNombre("Alejandro");
        alumno1.setNota(4.3);

        System.out.println("Después de cambiar datos:");
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Nota: " + alumno1.getNota());

        if (alumno1.aprobado()) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Suspendido");
        }
        //Calcular area de un circulo
        Circulo c = new Circulo();

        c.setRadio(5.0);

        double area = c.calcularArea();
        System.out.println("El área del círculo con radio " + c.getRadio() + " es de : " + area);


        //Calculadora
        Calculadora calc1 = new Calculadora();

        calc1.setNumero1(10.0);
        calc1.setNumero2(5.0);

        System.out.println("Número 1: " + calc1.getNumero1());
        System.out.println("Número 2: " + calc1.getNumero2());
        System.out.println("Suma: " + calc1.suma());
        System.out.println("Resta: " + calc1.resta());
        System.out.println("Multiplicación: " + calc1.multiplicacion());

        try {
            System.out.println("División: " + calc1.division());
            // Probar división por cero
            calc1.setNumero2(0);
            System.out.println("División por cero: " + calc1.division());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}


        /**

//Uso del ojeto Scanner para la clase persona
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce el nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Intruduce el DNI");
        String dni = lector.nextLine();
        System.out.println("Introduce la edad: ");
        String edad = lector.nextLine();
        Persona persona = new Persona(5, dni, nombre,"","");
        System.out.println("Datos introducidos correctamente: " + persona.toString());

        //Cierre del scanner
        lector.close();
         */
