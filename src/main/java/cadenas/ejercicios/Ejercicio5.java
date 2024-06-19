/*
Escribir un programa en Java que tome una cadena escrita por el usuario y la escriba en mayúsculas y al revés.
*/

package cadenas.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena a convertir: ");
        String cadena = sc.nextLine();

        sc.close();

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena es: " + cadenaMayus);

        for (int i = cadenaMayus.length() - 1; i >= 0; i--) {
            System.out.println(cadenaMayus.charAt(i));
        }
    }

}
