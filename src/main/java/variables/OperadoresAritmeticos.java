package variables;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        // Operadores aritméticos
        
        // Suma
        int i1 = 7;
        int i2 = 5;
        int i3 = i1 + i2;
        System.out.println(i3);
        
        float f1 = 7;
        float f2 = 5;
        float f3 = f1 + f2;
        System.out.println(f3);
        
        // Resta
        int i4 = 7;
        int i5 = 5;
        int i6 = i4 - i5;
        System.out.println(i6);
        
        // Multiplicación
        int x1 = 12;
        int x2 = 20;
        int x3 = x1 * x2;
        System.out.println(x3);
        
        // División
        int resultadoDivisionEntera = 3/2;
        System.out.println(resultadoDivisionEntera);
        
        float resultadoDivisionDecimales = 3.0f / 2.0f;
        System.out.println(resultadoDivisionDecimales);
        
        // Módulo o resto
        
        int z1 = 10;
        int z2 = 2;
        int z3 = z1 % z2;
        System.out.println(z3);
        
        // Operadores Aritméticos Unarios
        
        // Inverso negativo
        int e = 8;
        int eNegativo = -e;
        System.out.println(eNegativo);
        
        // Incremento y preincremento
        int n = 8;
        int preIncremento = ++n;
        System.out.println(preIncremento);
        System.out.println(n);
        
        n = 8;
        int incremento = n++;
        System.out.println(incremento);
        System.out.println(n);
        
        // Decremento y predecremento
         n = 8;
        int preDecremento = --n;
        System.out.println(preDecremento);
        System.out.println(n);
        
        n = 8;
        int decremento = n--;
        System.out.println(decremento);
        System.out.println(n);
        
    }

}
