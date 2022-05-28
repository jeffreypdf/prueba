
package condicionales;

import java.util.Scanner;


public class ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        int num = 0;

        System.out.println("Ingrese el número a evaluar");
        num = leer.nextInt();        
        
        System.out.println("Número ingresado: " + num);
        
        // Proceso
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
    
}
