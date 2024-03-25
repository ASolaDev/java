package arrays;

public class array2D {

    public static void main(String[] args) {
        // Declaración
        int[][] array2d = new int[3][2];
        int[][] array2d2 = {{1,2},{3,4},{5,6}};
        
        // Recorrer el array con bucles anidados
        for (int i = 0; i < array2d2.length; i++) {
            for (int j = 0; j < array2d2[0].length; j++) {
                System.out.println(array2d2[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
