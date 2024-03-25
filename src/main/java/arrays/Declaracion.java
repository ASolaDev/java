package arrays;

public class Declaracion {
    public static void main(String[] args) {
    	// Indicando el tipo de dato
    	int[] array1 = new int[10];
    	
    	// Con inferencia de tipo
    	var array2 = new double[10];
    	
    	// Indicando el tipo de dato (declaración-inicialización)
    	String[] array3 = new String[] {"Hola", "Mundo"};
    	
    	// Forma abreviada
    	String[] array4 = {"Hola", "Mundo"};
    	
    	// Usando var
    	var array5 = new int[] {1, 2, 3, 4, 5};
    	
    	
    	// Operador []
    	array1[0] = 1234;
        System.out.println(array1[0]);
        
        // Declaración e inicialización por separado
        String[] array6 = new String[5];
        array6[0] = "Hola";
        array6[1] = "Mundo";
        array6[2] = "en";
        array6[3] = "Java";
        array6[4] = "!";
        System.out.println(array6[0]);
        System.out.println(array6[1]);
        System.out.println(array6[2]);
        System.out.println(array6[3]);
        System.out.println(array6[4]);
    }
}
