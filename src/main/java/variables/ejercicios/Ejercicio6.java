/*
Escribe un programa que determine si un número es par o impar usando el operador ternario.
*/

package variables.ejercicios;

public class Ejercicio6 {

    public static void main(String[] args) {
        int numero = 9;
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número " + numero + " es " + resultado);
    }

}
