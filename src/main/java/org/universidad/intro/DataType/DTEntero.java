package org.universidad.intro.DataType;

public class DTEntero {
    public static void main(String[] args) {
        // ingresando una variable de tipo byte
        byte number1 = 10;
        System.out.println("number1 = " + number1);
        System.out.println("Valor min: " + Byte.MIN_VALUE);
        System.out.println("Valor min: " + Byte.MAX_VALUE);

        System.out.println();
        short number2 = 25;
        System.out.println("number2 = " + number2);
        System.out.println("Valor min: " + Short.MIN_VALUE);
        System.out.println("Valor min: " + Short.MAX_VALUE);

        System.out.println();
        int number3 = 56226;
        System.out.println("number3 = " + number3);
        System.out.println("Valor min: " + Integer.MIN_VALUE);
        System.out.println("Valor min: " + Integer.MAX_VALUE);

        System.out.println();
        long valor4 = 5622565;
        System.out.println("valor4 = " + valor4);
        System.out.println("Valor min: " + Long.MIN_VALUE);
        System.out.println("Valor min: " + Long.MAX_VALUE);
    }
}
