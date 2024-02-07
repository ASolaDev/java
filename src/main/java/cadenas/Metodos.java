package cadenas;

public class Metodos {
    public static void main(String[] args) {

        // length(), devuelve la longitud de la cadena (nº de carácteres)
        String str = "Esto es una prueba de longitud";
        System.out.println(str.length());

        // charAt(índice), devuelve el carácter que se encuentra en una posición específica (comienza por 0)
        char c = str.charAt(1);
        System.out.println(c); //Devuelve la s

        // subString(incio, fin), devuelve una subcadena de la original, comenzando y acabando en las posiciones indicadas
        String sub = str.substring(12, 18);
        System.out.println(sub); //Devuelve 'prueba'

        //toUpperCase, toLowerCase - Pasa a mayúsculas o minúsculas
        String mayus = str.toUpperCase();
        System.out.println(mayus);

        String minus = str.toLowerCase();
        System.out.println(minus);

        // equals - Devuelve true si ambas cadenas son iguales
        String cadena1 = "HOLA";
        String cadena2 = "hola";
        System.out.println(cadena1.equals(cadena2));

        // equalsIgnoreCase - Devuelve true si coinciden (ignora mayúsculas o minúsculas)
        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        /* startsWidth (prefijo), endsWidth (sufijo) - Devuelve true si la cadena comienza con el prefijo y termina con el
        sufijo especificado, falso en cualquier otro caso */
        System.out.println(str.startsWith("Esto"));
        System.out.println(str.endsWith("Esto"));

        // contains, Devuelve si la cadena contiene la secuencia pasada como argumento
        System.out.println(cadena1.contains("HO"));

        /* indexOf (str o char), lastIndexOf(str o char) - Busca la primera ocurrencia de un caracter o cadena comenzando
        desde el inicio de la cadena  o desde el final */
        System.out.println(str.indexOf("n")); //La primera n posición 9
        System.out.println(str.lastIndexOf("n")); //La segunda n posición 24

        // replace, transforma una cadena en otra
        System.out.println(str.replace('a', 'o'));

        // join, acepta un número variable de cadenas y un separador. Devuelve una cadena uniendo las demás con el separador
        String cadena3 = "En programacion manda Java";
        System.out.println(cadena3.join(" - ", "Python", "JS"));

        // trim, elimina los espacios en blanco al inicio y al final en una cadena de carácteres
        String espacios = "       " + str + "      ";
        System.out.println(espacios);
        System.out.println("Longitud: " + espacios.length());
        System.out.println("Longitud: " + espacios.trim().length());

        // isEmpty, devuelve true si es igual a == 0 o false si es != 0
        System.out.println(str.isEmpty());
        
    }
}
