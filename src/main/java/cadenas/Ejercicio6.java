package cadenas;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        scanner.close();

        // Verificar si las longitudes son diferentes
        if (cadena1.length() != cadena2.length()) {
            System.out.println("Las cadenas no son anagramas.");
            return;
        }

        // Verificar si cada carácter en la primera cadena tiene una coincidencia en la segunda
        for (int i = 0; i < cadena1.length(); i++) {
            char caracter = cadena1.charAt(i);
            int index = cadena2.indexOf(caracter);
            if (index == -1) {
                System.out.println("Las cadenas no son anagramas.");
                return;
            }
            // Remover el carácter coincidente de la segunda cadena
            cadena2 = cadena2.substring(0, index) + cadena2.substring(index + 1);
        }

        // Si se llega hasta aquí, entonces son anagramas
        System.out.println("Las cadenas son anagramas.");
    }
}
