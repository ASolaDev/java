/*
Escribe un programa en Java que acepte por teclado dos números enteros y calcule su máximo común divisor usando el algoritmo de Euclides. Dicho algoritmo tiene los siguientes pasos:

a) Se divide el número mayor (`a`) entre el menor (`b`).

b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.

c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y
continuamos de esta forma hasta obtener una división exacta. El m.c.d. es el último divisor.

*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        int a = num1;
        int b = num2;
        
        while(b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + a);
        
        sc.close();
    }

}
