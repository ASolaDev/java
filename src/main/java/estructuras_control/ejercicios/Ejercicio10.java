/*
Escribe un programa en Java que comprueba si un año es bisiesto o no.
Recuerda que los años bisiestos son aquellos que son divisibles entre 4 pero que no son divisibles entre 100,
o que son divisibles entre 400.
*/

package estructuras_control.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un año: ");
        int año = sc.nextInt();
        
        if ((año % 4 == 0 && año % 100 !=0) || año % 400 == 0 ) {
            System.out.println("El año " + año + " es bisiesto");
        } else 
            System.out.println("El año " + año + " no es bisiesto");
        
        sc.close();
    }

}
