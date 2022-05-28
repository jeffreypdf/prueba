
package app;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        int num1 = 0;
        int num2 = 0;

        // Variable de salida
        int suma = 0;
        int resta = 0;
        int multi = 0;
        double div;
        
        // Proceso
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        
        // Operaciones matemáticas
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + div);
    }
}
