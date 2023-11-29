package org.universidad;

import org.universidad.lab.caja.Caja;

public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja(5, 5, 5);
        System.out.println("Volumen: " + caja1.calcVolumen() + " u cubicas");
    }
}
