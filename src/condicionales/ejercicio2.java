
package condicionales;

import java.util.Scanner;


public class ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        int num1 = 0;
        int num2 = 0;
        int suma = 0;

        // Lectura de variables por teclado
        System.out.println("Por favor ingrese el número 1");
        num1 = leer.nextInt();
        
        System.out.println("Por favor ingrese el número 2");
        num2 = leer.nextInt();

        System.out.println("=========================");
        System.out.println("El número 1 es: " + num1);
        System.out.println("El número 2 es: " + num2);

        // Proceso
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        
        if ((suma > 10) && (suma < 20)) {
            System.out.println("El número SI está entre 10 y 20");
        } else {
            System.out.println("El número NO está entre 10 y 20");
        }
    }
}
