/*
a. El precio final de venta de un ordenador es la suma de:
- El coste de fabricación
- El margen (en porcentaje) de beneficio de ganancia del vendedor
- Los impuestos (calculados sobre el coste de fabricación más el margen de beneficio).

b. Si suponemos que la ganacia del vendedor va a ser del 30% de cada ordenador, y que el impuesto aplicable es del 21%,
diseñar un algoritmo que calcule el precio final del ordenador y lo muestre por pantalla. El precio del coste de
fabricación se debe obtener leyéndolo por teclado.

c.Además de mostrar el precio final por consola, debe mostrar si el portátil tiene un precio NORMAL o de LUJO mediante
la siguiente fórmula:
- Precio final <= 600: NORMAL
- Precio final > 600: LUJO
*/

package variables;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costeF;
        double margenB = 0.30;
        double impuestos = 0.21;
        double precioSinImpuestos;
        double precio;
        
        System.out.println("Introduce el coste de fabricación del portátil: ");
        costeF = sc.nextDouble();
        
        precioSinImpuestos = costeF + (costeF * margenB);
        precio = precioSinImpuestos + (precioSinImpuestos * impuestos);
        
        System.out.println(precio);
        
        String categoria = (precio <= 600) ? "El ordenador tiene un precio NORMAL" : "El ordenador tiene un precio de LUJO";
        System.out.println(categoria);
    }

}
