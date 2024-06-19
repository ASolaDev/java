/*
Escribe un programa en Java que calcule la media de 3 números que se hayan leído desde el teclado y la muestre por consola.
*/

package variables.ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Introduce el primer número: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double n3 = sc.nextDouble();

        sc.close();
        
        double media = (n1 + n2 + n3) / 3;
        
        System.out.println("La media de los 3 números es " + media);
    }

}
