package cadenas;

public class Declaracion {
    public static void main(String[] args) {

        String saludo = "Hola a todos";
        var despedida = "Hasta luego!";

        System.out.println(saludo);
        System.out.println(despedida);

        String copia = despedida;
        System.out.println(copia);

        // Desde Java 15 - Strings multilinea
        /*
        String multilinea = """
            Hola a todos
                desde varias líneas
               de texto
            """;
        */

        // Mediante el constructor
        String str = new String("Hola mundo");
        System.out.println(str);

        // Mediante un array de chars
        char array[] = {'H', 'o', 'l', 'a'};
        String nuevoSaludo = new String(array);
        System.out.println(nuevoSaludo);
    }
}
