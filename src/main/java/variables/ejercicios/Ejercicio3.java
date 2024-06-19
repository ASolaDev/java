/*
Escribir un programa que calcule el área y el perímetro de un rectángulo y la muestre por consola.
La `altura` y la `anchura` del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
*/

package variables.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alto;
        double ancho;
        double area;
        double perimetro;
        
        System.out.println("Introduce el alto del rectángulo: ");
        alto = sc.nextDouble();
        System.out.println("Introduce el ancho del rectángulo: ");
        ancho = sc.nextDouble();

        sc.close();
        
        area = alto * ancho;
        perimetro = (alto * 2) + (ancho * 2);
        
        System.out.println("El área del rectángulo es de " + area);
        System.out.println("El perímetro del rectángulo es de " + perimetro);
    }

}
