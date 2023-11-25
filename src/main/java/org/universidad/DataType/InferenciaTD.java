package org.universidad.DataType;

public class InferenciaTD {
    public static void main(String[] args) {
        var numero = 10; // infiere un tipo int
        System.out.println("numero = " + numero);

        var numero2 = 234.45; // infiere un tipo double
        System.out.println("numero2 = " + numero2);

        var numero3 = 234.45465f; // infiere un tipo float
        System.out.println("numero3 = " + numero3);

        var numero4 = (byte)234; // infiere un tipo byte
        System.out.println("numero4 = " + numero4);
    }
}
