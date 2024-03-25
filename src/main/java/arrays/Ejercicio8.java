/*
Crea un programa en Java que calcule la suma de todos los elementos de un array de tamaño 3x3.
*/

package arrays;

public class Ejercicio8 {

    public static void main(String[] args) {
        int[][] numeros;
        numeros = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                suma += numeros[i][j];
            }
        }
        
        System.out.println("La suma de todos los elementos del array es: " + suma);
    }

}
