/*
Escribe un programa en Java que pinte una pirámide con asteriscos. El número de pisos debe ser introducido a través del teclado.
*/

package estructuras_control;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de pisos de la pirámide: ");
        int pisos = sc.nextInt();
        
        for (int altura = 1; altura <= pisos; altura++) {
            
            for (int blancos = 1; blancos <= pisos - altura; blancos++) {
                System.out.println(" ");
            }
            
            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.println("*");
            }
            
            System.out.println();
        }
        
        sc.close();
    }

}
