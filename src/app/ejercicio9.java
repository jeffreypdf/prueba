
package app;

import java.util.Scanner;


public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        double gradosC = 0;
        
        // Variable de salida
        double gradosF = 0;
        
        // Proceso
        System.out.println("Ingrese la cantidad de Grados Centígrados");
        gradosC = leer.nextDouble();
        
        gradosF = 32 + ( 9 * gradosC / 5);
        
        System.out.println("Grados Fahrenheit: " + gradosF);
        
    }
}
