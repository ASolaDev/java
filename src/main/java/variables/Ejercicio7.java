/*
Escribe un programa que lea dos números enteros por teclado, y realice las operaciones básicas de una calculadora con ellos: suma, resta, multiplicación, división y resto. Debe mostrar todos los resultados por consola.
*/

package variables;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();

        sc.close();
        
        int sumaNumeros = num1 + num2;
        int restaNumeros = num1 - num2;
        int multiNumeros = num1 * num2;
        int divNumeros = num1 / num2;
        int restoDivisionNum = num1 % num2;
        
        System.out.println("La suma es " + sumaNumeros);
        System.out.println("La resta es " + restaNumeros);
        System.out.println("La multiplicación es " + multiNumeros);
        System.out.println("La división es " + divNumeros);
        System.out.println("El resto es " + restoDivisionNum);
    }

}
