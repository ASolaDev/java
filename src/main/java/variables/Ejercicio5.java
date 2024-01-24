/*
Escribir un programa que, dada una cantidad de euros, nos indique cuál es su valor en dólares americanos.
Además de la variable para la cantidad de euros, se debe declarar otra para el cambio (el valor de un dólar en euros)
y para el resultado final. Muestra el resultado por consola.
*/

package Variables;

public class Ejercicio5 {

    public static void main(String[] args) {
        double cantidad = 10;
        double dolar = 1.09;
        double resultado = cantidad * dolar;
        System.out.println(cantidad + " euros equivalen a " + resultado + " dólares");
    }

}
