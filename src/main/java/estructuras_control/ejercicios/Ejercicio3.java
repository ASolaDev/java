/*
Escribe un programa en Java que acepte por teclado un número entero y nos diga la cantidad de dígitos que tiene.
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        int numero = sc.nextInt();
        int cantidad = 0;
        
        while (numero != 0) {
            numero = numero /10;
            cantidad++;
        }
        
        System.out.println("Tiene " + cantidad + " dígitos");
        
        sc.close();
    }

}
