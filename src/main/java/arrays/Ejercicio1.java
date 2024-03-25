/*
Mostrar el número mayor en un array de enteros.
*/

package arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,8,12,18};
        int mayor = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        
        System.out.println("El mayor número del array es: " + mayor);
    }

}
