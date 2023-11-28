package org.universidad.intro.Variables;

import java.util.Scanner;

public class EntradaConsola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.printf("Hola %s \n", nombre);
    }
}
