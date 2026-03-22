package personal_practice;

import java.util.Scanner;

public class Variable
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        //Bienvenida
        System.out.println("------------------------------------");
        System.out.println("Bienvenid@ a este programa en JAVA");
        System.out.println("------------------------------------");

        //Ingreso de datos
        System.out.println("Por favor, ingresa tu nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Por favor ingresa tu DUI");
        String dui = leer.nextLine();
        System.out.println("Por favor ingresa tu telefono: ");
        String telefono = leer.nextLine();

        //Impresion de datos

        System.out.println("\n--- DATOS REGISTRADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("DUI: " + dui);
        System.out.println("Telefono: " + telefono);
    leer.close();
    }
}