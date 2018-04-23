package ejercicio3;
 import java.util.Scanner;
/**
 *
 * @author Brayan Loachamin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informacion de edad");
        System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();
        System.out.println("Su edad es: " + edad);
        
        if(edad >= 18){
            System.out.println("Usted es mayor de edad");
        
       }else if(edad < 0){
            System.out.println("No existen edades negativas");
                   
       }else{
            System.out.println("Usted es menor de edad");
        }
    }
    
}
