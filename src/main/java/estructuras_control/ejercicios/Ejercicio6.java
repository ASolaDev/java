/*
Escribe un programa en Java que acepte por teclado un número entero entre 1 y 10 y muestre su tabla de multiplicar.
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entre el 1 y el 10: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        sc.close();
    }

}
