/*
Modifica el ejercicio 3 para que tanto el tamaño del array como los elementos del mismo se introduzcan a través de consola.
Como pista, te diré que posiblemente tengas que pedir primero el nº de elementos del array, y después hacer un bucle de ese número
de iteraciones para solicitar todos los elementos.
*/

package arrays;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        int numero;
        
        System.out.print("Introduce cuantos elementos tendra el array: ");
        longitud = sc. nextInt();
        
        sc.close();
        
        int[] numeros = new int[longitud];
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " + i + ": ");
            numero = sc.nextInt();
            numeros[i] = numero;
            suma += numeros[i];
        }
        
        System.out.println("La suma total de los numeros del array es de: " + suma);
    }

}
