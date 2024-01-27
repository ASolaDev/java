package variables;

import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println("El número es " + numero);
        
        System.out.println("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();
        System.out.println("El área del rectángulo es: " + base * altura);
        
        sc.close();
    }

}
