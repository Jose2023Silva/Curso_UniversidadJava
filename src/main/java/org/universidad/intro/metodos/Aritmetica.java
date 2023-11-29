package org.universidad.intro.metodos;

/**
 *
 * @author Jose Angel Silva
 */
public class Aritmetica {
    int a;
    int b;
    
    /**
     * Metodo publica de la clase que no retorna nada, es decir, vacio llamada
     * sumar y no contiene parametros de la funcion.
     */
    public void sumar(){
        var result = this.a + this.b;
        System.out.println("Suma: " + result);
    }
    
    /**
     * Suma de dos numeros.
     * @return la suma con un numero tipo int.
     */
    public int sumarConRetorno(){
        /*
        El uso del key this es para referir a los atributos de la clase, por lo que
        se puede tener variables con el mismo nombre pero con el this. se refiere 
        solamente a los atributos declarados
        */
        return this.a + this.b;
    }
    
    /**
     * Suma con argumanetos enteros
     * @param a tipo entero 
     * @param b tipo entero
     * @param c tipo entero
     * @return  suma de tres numeros enteros reales
     */
    public int sumaArgs(int a, int b, int c){
        return a + b + c ;
    }
}
