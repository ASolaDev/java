/*
Implementa un programa en Java que dada un fecha,  nos indique cuál es la estación del año. (Según tu hemisferio).
El día del mes y el mes del año se deben introducir como número entero por teclado. 
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        String estacion = "";
        
        System.out.println("Introduce el número del día (1-31): ");
        dia = sc.nextInt();
        System.out.println("Introduce el número del mes (1-12): ");
        mes = sc.nextInt();
        
        if (mes == 1 || mes == 2 || (mes == 3 && dia <= 20) || (mes == 12 && dia >= 21)) {
            estacion = "invierno";
        } else if (mes == 4 || mes == 5 || (mes == 3 && dia >= 21) || (mes == 6 && dia <= 20)) {
            estacion = "primavera";
        } else if (mes == 7 || mes == 8 || (mes == 9 && dia <= 23) || (mes == 6 && dia >= 21)) {
            estacion = "verano";
        } else if (mes == 10 || mes == 11 || (mes == 9 && dia >= 24) || (mes == 12 && dia <= 20)) {
            estacion = "otoño";
        } else {
            System.out.println("Error");
        }
        
        System.out.println("La estación del año de la fecha introducida es: " + estacion);
        
        sc.close();
    }

}
