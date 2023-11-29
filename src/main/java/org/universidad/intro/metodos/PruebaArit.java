package org.universidad.intro.metodos;

/**
 *
 * @author Jose Angel Silva
 */
public class PruebaArit {
    public static void main(String[] args) {
        Aritmetica arit1 = new Aritmetica();
        arit1.a = 45;
        arit1.b = 23;
        
        arit1.sumar();
        var suma = arit1.sumarConRetorno(); // tomamos el valor del metodo con retorno con int
        System.out.println("suma = " + suma);
        
        var sumaArgs = arit1.sumaArgs(45, 8, 23);
        System.out.println("sumaArgs = " + sumaArgs);
    }
}
