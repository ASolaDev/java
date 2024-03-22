package cadenas;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena: ");
        String cadena = sc.nextLine();

        sc.close();

        String cadenaMinus = cadena.toLowerCase();
        int totalVocales = 0;

        for (int i = 0; i < cadenaMinus.length(); i++) {
            char c = cadenaMinus.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'á' || c == 'é' || c == 'é' || c == 'ó' || c == 'ú') {
                totalVocales++;
            }
        }

        System.out.println("El total de vocales de la cadena es de: " + totalVocales);
    }

}
