package org.universidad.Variables;

import java.util.Scanner;

/**
 *
 * @author Jose Angel Silva
 */
public class ClaseScanner {
    public static void main(String[] args) {
        // Creando un objeto de tipo Scanner para ingreso de datos por consola
        Scanner inp =  new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        var nombre = inp.nextLine(); // toma el valor como un String
        System.out.println("nombre = " + nombre);
    }
}
