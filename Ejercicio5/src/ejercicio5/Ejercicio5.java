package ejercicio5;

import java.util.Scanner;
/**
 *
 * @author Brayan Loachamin
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Meses del Año");
        System.out.println("Ingrese un numero: ");
        int opc = scan.nextInt();
        
        if(opc>=1 && opc<=12){
        System.out.println("El numero representa el mes de: ");
        }
        
        switch(opc){
        
        case 1:
            System.out.println("Enero");
            break;
            
            case 2:
            System.out.println("Febrero");
            break;
            
            case 3:
            System.out.println("Marzo");
            break;
            
            case 4:
            System.out.println("Abril");
            break;
            
            case 5:
            System.out.println("Mayo");
            break;
            
            case 6:
            System.out.println("Junio");
            break;
            
            case 7:
            System.out.println("Julio");
            break;
            
            case 8:
            System.out.println("Agosto");
            break;
            
            case 9:
            System.out.println("Septiembre");
            break;
            
            case 10:
            System.out.println("Octubre");
            break;
            
            case 11:
            System.out.println("Noviembre");
            break;
            
            case 12:
            System.out.println("Diciembre");
            break;
            
            default:
                if(opc<=0 || opc>12){
                    System.out.println("Ingrese otro valor");
                }   
                break;
        }
        
    }
    
}
