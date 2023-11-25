package org.universidad.DataType;

public class DTFlotante {
    public static void main(String[] args) {
        // Tipo de dato float
        float dtFlotante = 4156.234f;
        float numTestFloat = (float) 234.34; // casteo de tipo de dato double a float
        System.out.println("dtFlotante = " + dtFlotante);
        System.out.println("Valor min: " + Float.MIN_VALUE);
        System.out.println("Valor max: " + Float.MAX_VALUE);
        System.out.println();

        double dtDouble = 23435243.2345;
        System.out.println("dtDouble = " + dtDouble);
        System.out.println("Valor min: " + Double.MIN_VALUE);
        System.out.println("Valor max: " + Double.MAX_VALUE);
    }
}
