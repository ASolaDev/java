/*
Implementa un programa en Java que calcule la suma de los elementos de un array de enteros.
*/

package arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = new int[] {1,2,6,8,3,12,10};
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma total de los números del array es de: " + suma);
    }

}
