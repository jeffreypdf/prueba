
package app;

import java.util.Scanner;


public class App {

public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);
        
        // Variables de entrada
        int num1 = 0;
        int num2 = 0;
        
        // Variable de salida
        int suma = 0;
        
        // Proceso
        System.out.println("Vamos a sumar 2 números");
        System.out.println("Ingrese el número 1");
        num1 = leer.nextInt();
                
        System.out.println("Ingrese el número 2");
        num2 = leer.nextInt();
        
        // Suma de los números ingresados
        suma = num1 + num2;
        
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
    }
    
}
