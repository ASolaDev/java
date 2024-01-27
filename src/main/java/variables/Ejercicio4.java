/*
Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola.
El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
- area = PI * r * 2
- perimetro = 2 * PI * r
*/

package variables;

public class Ejercicio4 {

    public static void main(String[] args) {
        double radio  = 5.0;
        
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        
        System.out.println("El área del círculo es de " + area);
        System.out.println("El perímetro del círculo es de " + perimetro);
    }

}
