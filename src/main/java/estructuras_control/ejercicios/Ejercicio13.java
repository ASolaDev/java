/*
Escribe un programa en Java que permita calcular el n-ésimo término de la sucesión de Fibonacci. En dicha sucesión se da que:
- f(0) = 0;
- f(1) = 1;
- f(n) = f(n-1) + f(n-2), con n>=2.
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int fibo1 = 1;
        int fibo2 = 1;
        int suma;

        System.out.println("Introduce un número mayor que 1: ");
        numero = sc.nextInt();

        System.out.println("Los " + numero + " primeros números de la serie Fibonacci son: ");

        System.out.println(fibo1 + " ");
        for (int i = 2; i <= numero; i++) {
            suma = fibo1 + fibo2;
            fibo2 = fibo1;
            fibo1 = suma;
            System.out.print(suma + " ");
        }
        System.out.println();
    }

}
