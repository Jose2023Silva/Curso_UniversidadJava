package org.universidad.operadores;

/**
 *
 * @author Jose Angel Silva
 */
public class OperadorAritmeticos {
    public static void main(String[] args) {
        /**
         * En java hay una gran cantidad de operadores para el desarrollo de 
         * nuestro programa.
         * por lo que hay
         * Aritmeticos
         * Relacion 
         * logicos
         * unarios
         * a nivel bits
         * Asignacion
         * condicional 
         * 
         * Todo ellos tienen un nivel de prioridad como jerarquia de operaciones.
         * 
         */
        
        // OPERADORES ARITMETICOS
        int a = 3, b = 2;
        var suma = a + b; // suma
        System.out.println("suma = " + suma);
        
        var resta = a - b; // resta
        System.out.println("resta = " + resta);
        
        var mult = a * b; // prod
        System.out.println("mult = " + mult);
        
        var div = a / b;  //div entero ya que los valores son enteros
        // ya que el var es tipo entero, va ser entero o las literales son enteros
        System.out.println("div = " + div);
        
        var mod = a % b;  // resto de la div entera
        System.out.println("mod = " + mod);
        
    }
}
