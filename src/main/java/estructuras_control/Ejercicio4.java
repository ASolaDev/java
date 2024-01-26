/*
Calcula cuál es el resultado de sumar los "n" primeros números positivos. Introduce el valor "n" por teclado.
*/

package estructuras_control;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número positivo: ");
        int numero = sc.nextInt();
        int suma = 0;
        
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los " + numero + " números positivos es: " + suma);
        
        sc.close();
    }

}
