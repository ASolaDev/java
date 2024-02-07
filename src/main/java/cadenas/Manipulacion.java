package cadenas;

public class Manipulacion {
    public static void main(String[] args) {

        // Concatenación
        String msg = "Hola " + "mundo";
        System.out.println(msg);

        String msg2 = "Hola ";
        msg2 += "a todos";
        System.out.println(msg2);

        String msg3 = "Hola ";
        msg3 = msg3.concat("amigos de Java");
        System.out.println(msg3);

        String msgPrecio = "El precio del producto es de " + 40.00 + " euros";
        System.out.println(msgPrecio);

        // Escape de carácteres
        String msg5 = "Este mensaje tiene \n un salto de línea";
        System.out.println(msg5);

        String msg6 = "Fuimos a la función en el teatro \"Romea\"";
        System.out.println(msg6);

        String msg7 = "Esta línea tiene \t un par de \t tabulaciones";
        System.out.println(msg7);

        // Formateo de cadenas
        /*
        * %s -> cadena
        * %c -> caracter
        * %d -> número, %o -> número octal, %x -> hexadecimal
        * %.f -> número con decimales, %.nf -> número con N decimales
        * %e -> número con decimales, notación exponencial.
        */
        String msg8 = String.format("Hola, me llamo %s y estoy encantado de saludarte", "Antonio");
        System.out.println(msg8);

    }
}
