
package app;

import java.util.Scanner;


public class ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        double soles = 0;
        
        // Variable de salida
        double dolares = 0;
        
        // Proceso
        System.out.println("Ingrese la cantidad de soles");
        soles = leer.nextDouble();
        
        dolares = soles / 3.79;
        
        System.out.println("Ustes tiene: " + dolares + " dolares");

    }
}
