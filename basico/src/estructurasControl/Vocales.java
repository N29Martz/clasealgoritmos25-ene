package estructurasControl;

import java.util.Scanner;

public class Vocales{
    public static void main(String[] args){
        // switch (variables) {casos1, casos2, caso3, ...}
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Mostrar Frutas por vocal");
        System.out.println("--------------------------------------------\n");
        
        System.out.print("Ingrese una vocal: ");
        char vocal = sc.next().charAt(0);
        
        switch (vocal) {
            case 'a': case 'A':
                 System.out.println(
                         "Arandano, Annona, Aguacate, Albaricoque, Almendra");
                break;
            case 'e': case 'E':
                System.out.println("Elote, Ejote");
                break;
            case 'i': case 'I':
                System.out.println("Icaco, Ilama, Imbe");
                break;
            case 'o': case 'O':
                System.out.println("Olivas, oroblanco");
                break;
            case 'u': case 'U':
                System.out.println("Uvas, ...");
                break;
            default:
                System.out.println("No es una vocal valida");
                break;
       
        }
    }
}
