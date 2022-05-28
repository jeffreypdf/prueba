
package app;

import java.util.Scanner;

public class ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        int pagoHora = 12;
        
        // Variables de entrada
        int horasTrabajadas = 0;
        String nombre = "";
        
        // Variable de salida
        int pago = 0;
        
        // Proceso
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        
        System.out.println(nombre + " ingrese las horas trabajadas");
        horasTrabajadas = leer.nextInt();
        
        pago = pagoHora * horasTrabajadas;
        
        System.out.println("====================================");
        System.out.println("Bienvenido(a) " + nombre);
        System.out.println("El pago por hora es: " + pagoHora+" soles");
        System.out.println("Horas laboradas por usted: " + horasTrabajadas + " horas");
        System.out.println("Pago total: " + pago + " soles");
        System.out.println("====================================");
    }
}
