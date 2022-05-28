
package condicionales;

import java.util.Scanner;


public class ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        // Variables de entrada
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int nota5 = 0;        
        
        // Variable de salida
        int promedio = 0;        

        // Lectura de variables por teclado
        System.out.println("Por favor ingrese la nota 1");
        nota1 = leer.nextInt();
        
        System.out.println("Por favor ingrese la nota 2");
        nota2 = leer.nextInt();
        
        System.out.println("Por favor ingrese la nota 3");
        nota3 = leer.nextInt();
        
        System.out.println("Por favor ingrese la nota 4");
        nota4 = leer.nextInt();
        
        System.out.println("Por favor ingrese la nota 5");
        nota5 = leer.nextInt();
                
        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Tu promedio de notas es: " + promedio);
        
        // Proceso
        if (promedio >= 13) {
            System.out.println("Estás aprobado! :D");
        } else {
            System.out.println("Desaprobaste, no te rindas :c");
        }

    }
    
}
