/*
Escribe un programa en Java en el que le pases una cadena por teclado y te devulva la cadena del revés (inversa).
*/

package estructuras_control;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cadena: ");
        String cadena = sc.next();
        
        String cadenaInvertida = "";
        
        for (int i = cadena.length()-1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        
        System.out.println(cadenaInvertida);
        
        sc.close();
    }

}
