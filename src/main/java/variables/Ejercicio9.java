/*
Escribe un programa en Java que intercambie el valor de dos variables.
*/

package variables;

public class Ejercicio9 {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int intercambio;
        
        intercambio = a;
        
        a = b;
        b = intercambio;
        
        System.out.println("A vale " + a);
        System.out.println("B vale " + b);

    }

}
