/*
- Realiza un programa en Java que calcule la nota media de un alumno en la asignatura de Programación.
- La nota media se calcula como el promedio de las 3 notas trimestrales.
- Muestra la nota promedio redondeada y además, muestra un mensaje que indique si el alumno está APROBADO
  (nota final >= 5) o está SUSPENSO (nota final < 5).
*/

package Variables;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double nota1;
        double nota2;
        double nota3;
        double notaMedia;
        
        System.out.println("Introduce la nota de la 1ª evaluación: ");
        nota1 = sc.nextDouble();
        System.out.println("Introduce la nota de la 2ª evaluación: ");
        nota2 = sc.nextDouble();
        System.out.println("Introduce la nota de la 3ª evaluación: ");
        nota3 = sc.nextDouble();
        
        notaMedia = (nota1 + nota2 + nota3) / 3;
        double notaRedondeada = Math.round(notaMedia);
        int notaEntera = (int) notaRedondeada;
        System.out.println("La nota media sin redondear es " + notaMedia);
        System.out.println("La nota media redondeada es " + notaEntera);
        
        String estado = (notaRedondeada >= 5) ? "APROBADO" : "SUSPENSO";
        System.out.println("El alumno está " + estado);
    }

}
