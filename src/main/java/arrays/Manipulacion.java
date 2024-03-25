package arrays;

public class Manipulacion {

    public static void main(String[] args) {
        int[] array = new int[7];
        System.out.println(array.length);
        System.out.println("--");
        
        // Recorrer el array según su  longitud
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
        
        System.out.println("---------");
        
        // For-each en Java
        for (int elem: array) {
            System.out.println(elem);
        }
        
        System.out.println("---------");

        
        // Clonación del array usando var
        var array2 = array.clone();
        
        for (var elem: array2) {
            System.out.println(elem);
        }
        
    }
    
}
