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
    	
    }
}
