package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Brayan Loachamin
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Paridad");
        System.out.println("Ingrese un numero: ");
        int numero = scan.nextInt();
        System.out.println("Su numero es: " + numero);
        
        if(numero%2==0){
            System.out.println("El numero es par");       
        
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}

