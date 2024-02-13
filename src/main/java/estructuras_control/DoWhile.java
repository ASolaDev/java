package estructuras_control;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Preguntar hasta introducir un número del rango pedido
        int numero;
        
        do {
            System.out.println("Introduce un número (1-10): ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);
      
        // Menú con Do-while y switch
        int opcion;
        
        do {
            System.out.println("    MENÚ    ");
            System.out.println("------------");
            System.out.println("1. Ventas");
            System.out.println("2. Almacén");
            System.out.println("3. Clientes");
            System.out.println("4. Pedidos");
            System.out.println("0. Salir");
            System.out.println("------------");
            System.out.println("Selecciona la opción del menú: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: System.out.println("Accediendo a Ventas");
                    break;
                case 2: System.out.println("Accediendo a Almacén");
                    break;
                case 3: System.out.println("Accediendo a Clientes");
                    break;
                case 4: System.out.println("Accediendo a Pedidos");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion < 0 || opcion > 4);
        
        System.out.println("Has salido del programa");
        
        sc.close();
    }

}
