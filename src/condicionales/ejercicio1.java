
package condicionales;

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        int num1 = 0;
        int num2 = 0;    

        // Lectura de variables por teclado
        System.out.println("Por favor ingrese el número 1");
        num1 = leer.nextInt();
        
        System.out.println("Por favor ingrese el número 2");
        num2 = leer.nextInt();

        System.out.println("=========================");
        System.out.println("El número 1 es: " + num1);
        System.out.println("El número 2 es: " + num2);              
        
        // Proceso
        if (num1 > num2) { // (6 > 6) es verdad?
            // Camino del "SI"
            System.out.println("El número 1 es mayor");
        } else if (num2 > num1) {
            // Camino del "NO"
            System.out.println("El número 2 es mayor");
        } else {
            // Segundo camino del "NO"
            System.out.println("Ambos números son iguales");
        }
 
//      Ejemplo de una condicional
//        if (condicion) {
//            // Camino del "SI"
//            // Codigo
//        } else {
//            // Camino del "NO"
//        }
    }
}
