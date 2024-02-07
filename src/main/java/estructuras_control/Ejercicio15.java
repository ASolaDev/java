/*
Aunque no lo parezca, siguen existiendo locutorios para realizar llamadas telefónicas internacionales. El coste cuando se realiza una llamada es el siguiente:
- Como base, se cobran 0.50€ si el otro usuario coge el teléfono.
- Los primeros 3 minutos cuestan 0.75€ por minuto.
- Los siguientes 4 minutos, cuestan 0.65€ por minuto.
- A partir del 8º minuto, cuestan 0.50€ por minuto.
- Si la llamada se realiza por la noche (22:00 - 7:59), tiene un recargo de un 5% sobre el precio.
- Si la llamada se realiza en domingo, tiene un recargo del 3%
Implementar un programa en Java que pida por teclado todos los datos necesarios e implemente el algoritmo de cálculo del precio final de una llamada.
*/

package estructuras_control;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double precioBase = 0.50;
        double precioMinuto = 0.75;
        double precioExtra1 = 0.65;
        double precioExtra2 = 0.50;
        double recargoNocturno = 0.5;
        double recargoDomingo = 0.3;
        double precioFinal = 0;

        System.out.println("Introduce el día de la semana (número entero): ");
        int dia = sc.nextInt();
        System.out.println("Hora de comienzo de la llamada (número real): ");
        double hora = sc.nextDouble();
        System.out.println("Introduce el tiempo de la llamada en minutos (número entero): ");
        int minutos = sc.nextInt();

        sc.close();

        if (minutos <= 3) {
            precioFinal = precioBase + (minutos * precioMinuto);
        } else if (minutos >= 4 && minutos <= 7) {
            precioFinal = precioFinal + (minutos - 3) * precioExtra1;
        } else if (minutos > 8) {
            precioFinal = precioFinal + (minutos - 7) * precioExtra2;
        }
        
        if (hora >= 22.00 && hora <= 7.59) precioFinal = precioFinal + (precioFinal * recargoNocturno);
        if (dia == 7) precioFinal = precioFinal + (precioFinal * recargoDomingo);


        System.out.println("El precio de la llamada es de " + precioFinal + " euros");

    }
}
