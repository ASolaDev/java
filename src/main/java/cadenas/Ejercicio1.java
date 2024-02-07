package cadenas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Leémos la entrada
        System.out.println("Introduce la palabra o frase:");
        String entrada = sc.nextLine();

        //Pasamos a minusculas
        String minus = entrada.toLowerCase();
        
        //Limpiar la cadena


        //Espacios en blanco
        String limpia1 = minus.trim();
        String limpia = "";

        for (int i = 0; i < limpia1.length(); i++) {
            String sub = limpia1.substring(i, i+1);

            if (!sub.isBlank()) {
                switch(sub) {
                    case "á":
                        sub = "a";
                    case "é":
                        sub = "e";
                    case "í":
                        sub = "i";
                    case "ó":
                        sub = "o";
                    case "ú":
                        sub = "u";
                    default:
                        sub = sub;
                }
                limpia += sub;
            }
        }

        // Obtenemos la cadena inversa
        String inversa = "";

        for (int i = limpia.length() - 1; i >= 0; i--) {
            inversa += limpia.charAt(i);
        }

        //Comprobamos sin son iguales
        if (limpia.equals(inversa)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        sc.close();
    }
}
