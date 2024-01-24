package Variables;

public class OtrosOperadores {

    public static void main(String[] args) {
                
        // Operador TERNARIO
        final int TEMPERATURA_ALTA = 30;
        int temperatura = 32;
        
        var tipoTemperatura = (temperatura > TEMPERATURA_ALTA) ? "La temperatura es alta" : "La temperatura es normal";
        System.out.println(tipoTemperatura);
        
        // Operadores a nivel de bits
        
        // Desplazamiento de bits a la derecha
        int x1 = 10; //00001010
        int y1 = x1 << 2; //00101000
        System.out.println(x1 + " - " + Integer.toBinaryString(x1));
        System.out.println();
        System.out.println(y1 + " - " + Integer.toBinaryString(y1));
        
        // Desplazamiento de bits a la izquierda
        x1 = 40; //00101000
        y1 = x1 >> 2; //00001010
        System.out.println(x1 + " - " + Integer.toBinaryString(x1));
        System.out.println();
        System.out.println(y1 + " - " + Integer.toBinaryString(y1));
        
        
        // Desplezamiento de bits a la derecha sin signo
        x1 = -40;
        y1 = x1 >>> 2;
        System.out.println(x1 + " - " + Integer.toBinaryString(x1));
        System.out.println();
        System.out.println(y1 + " - " + Integer.toBinaryString(y1));
        
        
        // AND bit a bit
        int x2 = 10; //00001010
        int y2 = 20; //00010100
        int res2 = x2 & y2;
        System.out.println(x2 + " - " + Integer.toBinaryString(x2));
        System.out.println();
        System.out.println(y2 + " - " + Integer.toBinaryString(y2));
        System.out.println(res2 + " - " + Integer.toBinaryString(res2));
        
        
        // OR bit a bit
        x2 = 10;
        y2 = 20;
        res2 = x2 | y2;
        System.out.println(x2 + " - " + Integer.toBinaryString(x2));
        System.out.println();
        System.out.println(y2 + " - " + Integer.toBinaryString(y2));
        System.out.println(res2 + " - " + Integer.toBinaryString(res2));
        
        // XOR bit a bit
        x2 = 10;
        y2 = 20;
        res2 = x2 ^ y2;
        System.out.println(x2 + " - " + Integer.toBinaryString(x2));
        System.out.println();
        System.out.println(y2 + " - " + Integer.toBinaryString(y2));
        System.out.println(res2 + " - " + Integer.toBinaryString(res2));
        
        // NOT bit a bit
        x2 = 10;
        res2 = ~x2;
        System.out.println(x2 + " - " + Integer.toBinaryString(x2));
        System.out.println();
        System.out.println(res2 + " - " + Integer.toBinaryString(res2));

    }

}
