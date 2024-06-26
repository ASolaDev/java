/*
Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, como por ejemplo, una sonda espacial,
que se mueve a velocidad constante.
Podemos suponer que el objeto ha recorrido un espacio inicial de 150.000 km y se mueve a una velocidad 17 km por segundo.
*/

package variables.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int espacioInicial = 150000;
        int velocidad = 17;
        int espacioRecorrido;
        
        System.out.println("Cuanto tiempo de viaje lleva (en segundos): ");
        int tiempo = sc.nextInt();

        sc.close();
        
        espacioRecorrido = espacioInicial + velocidad * tiempo;
        
        System.out.println("Lleva recorridos " + espacioRecorrido + " kilómetros");
    }

}
