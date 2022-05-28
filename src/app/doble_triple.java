package app;

import java.util.Scanner;

public class doble_triple {
    
    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);
        
        // Variables de entrada
        int num = 0;
        
        // Variable de salida
        int doble = 0;
        int triple = 0;      
        
        // Proceso
        System.out.println("Ingrese el número");
        num = leer.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        
        System.out.println("El número ingresado es: " + num);
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);

    }
}
