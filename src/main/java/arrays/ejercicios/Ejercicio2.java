/*
Limpiar un array de elementos repetidos, dejando como resultado un array de elementos únicos.
*/

package arrays.ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[] {1,2,3,4,4,5,6,6,6,7,8,8,9};
        int longitud = numeros.length;
        
        int[] original = numeros.clone();
        
        for (int i = 0; i < longitud; i++) {
            for (int j = i + 1; j < longitud; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[j] = numeros[longitud - 1];
                    longitud--;
                    j--;
                }
            }
        }
        
        int[] resultado = Arrays.copyOf(numeros, longitud);
        Arrays.sort(resultado); // Ordenado el array de menor a mayor
        
        System.out.println("Array original: ");
        for (int numero: original) {
            System.out.print(numero + ", ");
        }
        
        System.out.println("");
        
        System.out.println("Array final: ");
        for (int numero: resultado) {
            System.out.print(numero + ", ");
        }
        
    }

}
