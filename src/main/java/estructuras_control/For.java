package estructuras_control;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 5 primeros números, empezando por el 1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        System.out.println("------------");
        
        // 5 primeros números, empezando por el 5
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("------------");
        
        // Imprimir los números pares entre 0 y 100
        for (int i = 0; i <= 100; i+=2) {
            System.out.println(i);
        }
        
        System.out.println("------------");
        
        // Sumar los 100 primeros números naturales
        int suma = 0;        
        for (int i = 0; i <= 100; i++) {
            suma += i;
            //suma = suma + i;
        }
        System.out.println(suma);
        
        System.out.println("------------");
        
        // break (sale del bloque)
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        
        boolean esPrimo = true;
        
        if (numero < 2) {
            esPrimo = false;
        }
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
        
        System.out.println("------------");
        
        // continue (para saltar una iteración concreta y continuar el bucle)
        int sumador = 0;
        
        for (int i = 1; i <= 10; i++) {
            if (i == 7) continue;
            sumador = sumador + i;
        }
        
        System.out.println("La suma de los números del 1 al 10 excepto el 7 es: " + sumador);
        
        sc.close();
    }

}
