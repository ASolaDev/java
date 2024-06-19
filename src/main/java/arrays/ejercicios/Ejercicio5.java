// Modifica el ejercicio 1 para obtener en lugar del mayor elemento de un array de enteros el segundo mayor elemento.

package arrays.ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {
        int[] array = new int[] {12,2,8,18,1};
        int mayor = array[0];
        int segundoMayor = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            } else if (array[i] > segundoMayor && array[i] < mayor) {
                segundoMayor = array[i];
            }
        }
        
        System.out.println("El mayor numero del array es: " + mayor);
        System.out.println("El segundo mayor numero del array es: " + segundoMayor);
    }

}
