package org.universidad.intro.sentenciasControl;

/**
 *
 * @author Jose Angel Silva
 */
public class SentenciaSwitch {
    public static void main(String[] args) {
        // SENTENCIA Switch
        
        var no = 3;
       // try{
        switch (no) {
            case 1:
                System.out.println("Hola Uno");
                break;
            case 2:
                System.out.println("Hola Dos");
                break;
            case 3:
                System.out.println("Hola tres");
                break;
            default:
                //throw new RuntimeException("Error de sistema ");
                System.out.println("No hay parametros");
        }
       /* }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
       
        switch (no) {
            case 1,2,4,5:
                System.out.println("Menu");
                break;
            default:
                System.out.println("Salida  ");
        }
    }
}
