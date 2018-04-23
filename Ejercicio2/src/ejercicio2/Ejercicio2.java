package ejercicio2;

import java.util.Scanner;
/**
 *
 * @author Brayan Loachamin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Saludo");
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Hola " + nombre);
    }
    
}