

package laboratoriodevariable066208;

import java.util.Scanner;

 class LaboratorioDeVariable066208 {

    public static void main(String[] args) {
       // Primera parte : Declaración de variables primitivas
        boolean booleano;
        char caracter;
        byte numeroMuyPequeño;
        short numeroPequeño;
        int entero;
        long largo;
        float flotante;
        double doble;
        //Segunda parte: Diferencia entre los tipos de datos  
        entero = 97;
        doble = 97;
        caracter = 97;
        System.out.println("El valor 97 como entero es:" + entero);
        System.out.println("El valor 97 como doble es:" + doble);
        System.out.println("El valor 97 como caracter es:" + caracter);
        // Tercera parte: Variables de Referencia
        String cadena = new String("Variables de Referencia!");
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Los Strings en Java son" + cadena);
        System.out.println("");
        // Cuarta parte: Literales
        booleano = true;
        caracter = 7;
        System.out.println(booleano);
        System.out.println(caracter);
        System.out.println("");
        booleano = false;
        caracter = \u0037;
        System.out.println(booleano);
        System.out.println(caracter);
        caracter = '\n';
        
        System.out.println("El caracter salto de linea en acción:");
        System.out.println(caracter);
        //13
        flotante = 3.14159265f;
        System.out.println(flotante);
        //15
        cadena = "¡Puedes asignar valores a un String con literales!";
        System.out.println(cadena);
        System.out.println(caracter);
        //16
        
        System.out.println("¿Cómo te llamas?:");
        String nombre = leer.nextLine();
        
        System.out.println("¿Cuántos años tienes?:");
        int edad = leer.nextInt();
        
        System.out.println("¡Te llamas" + nombre + "y tienes" + edad + "años");
    }
    
}
