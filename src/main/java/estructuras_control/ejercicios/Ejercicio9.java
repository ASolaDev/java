/*
Escribe un programa en Java que compruebe si un carácter es vocal o no.
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un carácter: ");
        char caracter = sc.next().charAt(0);
        
        if (caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E' || caracter == 'i' || caracter == 'I' || caracter == 'o' || caracter == 'O' || caracter == 'u' || caracter == 'U') {
            System.out.println("El carácter es una vocal");
        } else {
            System.out.println("El carácter no es una vocal");
        }

        sc.close();
    }

}
