/*
Escribe un programa en Java que muestre la nota literal de un estudiante en función de su nota numérica usando `switch`.
*/

package estructuras_control.ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {
        int nota = 5;
        
        switch (nota) {
            case 10:
            case 9:
                System.out.println("Sobresaliente");                
                break;
            case 8:
            case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("La nota es errónea");
        }
    }

}
