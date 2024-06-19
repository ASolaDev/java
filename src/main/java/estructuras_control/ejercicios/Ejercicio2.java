/*
Realiza un programa en Java, que dado un día de la semana como número entero, nos indique
el día como texto.
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el día de la semana (1-7): ");
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miércoles");
                break;
            case 4: System.out.println("Jueves");
                break;
            case 5: System.out.println("Viernes");
                break;
            case 6: System.out.println("Sábado");
                break;
            case 7: System.out.println("Domingo");
                break;
            default:
                System.out.println("Error");
        }
        
        sc.close();
    }

}
