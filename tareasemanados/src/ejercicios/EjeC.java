/*
    Desarrolle un programa en el cual le pida una cantidad de un producto, el
    precio y el programa devuelva la cantidad total a pagar.
*/

package ejercicios;

import java.util.Scanner;

public class EjeC{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Total a Pagar");
        System.out.println("------------------------------------");
        
        System.out.print("Ingrese la cantidad de producto: ");
        int cant = scan.nextInt();
        System.out.print("Ingrese el precio del producto: ");
        int precio = scan.nextInt();
        
        int total = cant*precio;
        
        System.out.println("El total a pagar es de: " + total);
      
    }
}

/*
    Francis Nicoll Martínez López
            20202100096
*/