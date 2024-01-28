package estructuras_control;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Mostrar los números del 1 al 10
        int n = 1;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
        
        System.out.println("-----");
        
        // Mostrar si es primo o no lo es
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        
        boolean esPrimo = true;
        int divisor = 2;
        
        if (numero < 2) {
            esPrimo = false;
        }
        
        while (divisor <= numero / 2 && esPrimo) {
            if (numero % divisor == 0){
                esPrimo = false;
            }
            divisor++;
        }
        
        if (esPrimo) System.out.println("Es primo");
        else System.out.println("No es primo>");
        
        sc.close();
    }

}
