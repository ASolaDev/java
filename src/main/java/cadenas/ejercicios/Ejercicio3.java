package cadenas.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena a verificar: ");
        String cadena = sc.nextLine();

        sc.close();

        boolean repetido = false;
        char caracterRepetido = ' ';
        int i = 0;

        while (i < cadena.length() && !repetido) {
            char c = cadena.charAt(i);
            int j = 0;

            while (j < cadena.length() && !repetido) {
                if (c == cadena.charAt(j)) {
                    repetido = true;
                    caracterRepetido = c;
                } else {
                    j++;
                }
            }
            i++;
        }

        if (repetido)
            System.out.println("El primer carácter repetido es: " + caracterRepetido);
        else
            System.out.println("No hay ningún carácter repetido");
    }

}
