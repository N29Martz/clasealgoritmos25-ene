/*
    Desarrolle un programa en donde el usuario debe ingresar dos números y el
    programa muestra como resultado la operación (a+b)*(a-b).
*/

package ejercicios;

import java.util.Scanner;

public class EjeB{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Operación (a+b)*(a-b)");
        System.out.println("----------------------------------");
        
        System.out.print("Ingrese el valor de a: ");
        int a= scan.nextInt();
        System.out.print("Inrese el valor de b:");
        int b= scan.nextInt();
        
        int op = (a+b)*(a-b);
        
        System.out.println("El resultado de ("+a+"+"+b+")*("+a+"-"+b+") es:"+op);
    }
}

/*
    Francis Nicoll Martínez López
            20202100096
*/