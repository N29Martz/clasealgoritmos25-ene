/*
    Declare dos variables numéricas, solicite al usuario que ingrese los 
    valores para las variables y muestre por salida del programa la suma, resta,
    multiplicación, división.
*/

package ejercicios;

import java.util.Scanner;

public class EjeA{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Operaciones");
        System.out.println("--------------------------------------");
        
        System.out.print("Ingrese el primer valor: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int b = scan.nextInt();
        
        int suma = a+b;
        int resta = a-b;
        int multiplicación = a*b;
        int division = a/b;
        
        System.out.println("La suma de " + a + "+" + b + " es: " + suma);
        System.out.println("La resta de " + a +"-" + b +" es: " + resta);
        System.out.println("La multiplicación de "+ a +"x" +b+ " es: " + 
                multiplicación);
        System.out.println("La división entre "+ a+ "/"+ b+ " es de: " + 
                division);
        
    }
    
}

/*
    Francis Nicoll Martínez López
            20202100096
*/