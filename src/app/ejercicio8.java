
package app;

import java.util.Scanner;


public class ejercicio8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        double dolares = 0;
        
        // Variable de salida
        double soles = 0;
        
        // Proceso
        System.out.println("Ingrese la cantidad de dólares");
        dolares = leer.nextDouble(); // 100
        
        soles = dolares * 3.79;
        
        System.out.println("Ustes tiene: " + soles + " soles");

    }
}
