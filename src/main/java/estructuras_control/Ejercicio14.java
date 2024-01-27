/*
Implementa un programa en Java que determine si un número introducido por teclado es primo o no. Recuerda que:
- Un número es primo cuando sus únicos divisores son 1 y él mismo.
- Para un número primo `p`, hay que buscar divisores que sean menores o iguales que `p/2`.
*/

package estructuras_control;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        
        boolean numPrimo = true;
        
        if (numero < 2) numPrimo = false;
        
        
        
        sc.close();
    }

}
