package org.universidad.intro.metodos;

/**
 *
 * @author Jose Angel Silva
 */
public class PruebaArit {
    public static void main(String[] args) {
        // Para diferenciar entre heap y stack,
        // Memoria Stack = memoria Heap - Referencia de objeto
        // La variable arit1 almacena la referencia y es estack
        // el new Aritmetica() es el heap y esto se administra de forma dinamica por la JVM
        Aritmetica arit1 = new Aritmetica();
        arit1.a = 45;
        arit1.b = 23;
        
        arit1.sumar();
        var suma = arit1.sumarConRetorno(); // tomamos el valor del metodo con retorno con int
        System.out.println("suma = " + suma);
        
        var sumaArgs = arit1.sumaArgs(45, 8, 23);
        System.out.println("sumaArgs = " + sumaArgs);
        
        // creando un objeto con un constructor con parametros
        Aritmetica arit2 = new Aritmetica(56, 120);
        var resultadoSuma = arit2.sumarConRetorno();
        System.out.println("resultadoSuma = " + resultadoSuma);
    }
}
