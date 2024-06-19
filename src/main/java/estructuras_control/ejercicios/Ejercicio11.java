/*
Escribe un programa en Java que encuentre cuál es el mayor de 3 números usando sentencias if-else.
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double num3 = sc.nextDouble();
        
        double mayor;
        
        if (num1 > num2 && num1 > num3) mayor = num1;
        else if (num2 > num1 && num2 > num3) mayor = num2;
        else mayor = num3;
        
        System.out.println("El número " + mayor + " es el mayor");
        
                
        sc.close();
    }

}
