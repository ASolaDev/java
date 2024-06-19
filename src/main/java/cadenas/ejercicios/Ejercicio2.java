package cadenas.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean tieneMayus = false;
        boolean tieneMinus = false;
        boolean tieneNum = false;
        boolean tieneCarRaro = false;
        boolean tieneLongitud = false;
        
        // Pedimos la contraseña por teclado
        System.out.println("Introduce una contraseña para validar: ");
        String pass = sc.next();
        
        // Comprobamos la longitud 8-20
        if (pass.length() >= 8 && pass.length() <= 20) tieneLongitud = true;

        //Comprobamos si tiene mayúsculas y minúsculas
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (Character.isUpperCase(c)) tieneMayus = true;
            if (Character.isLowerCase(c)) tieneMinus = true;
            if (Character.isDigit(c)) tieneNum = true;
            if (c == '$' || c == '%' || c == '_' || c == '*' || c == '=' || c == '?') tieneCarRaro = true;
        }
        
        if (tieneMayus == true && tieneMinus == true && tieneNum == true && tieneCarRaro == true && tieneLongitud == true)
            System.out.println("La contraseña es válida");
        else
            System.out.println("La contraseña no es válida");
        
        sc.close();
    }
    
}
