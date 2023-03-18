package evaluacion;

import java.util.Scanner;

/*
Escribir un programa que genere una matriz cuadrada de tamaño N (ingresado por 
el usuario), donde cada elemento de la matriz sea un número aleatorio entre 
1 y 100. Luego, el programa deberá imprimir en la consola la suma de cada una 
de las filas y la suma de cada una de las columnas de la matriz.
*/

public class Ejercicio01{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Suma de Fila y Columnas");
        System.out.println("-----------------------------------");
        
        int op;
                
        do {            
            System.out.print("Ingrese el tamaño de la matriz: ");
        int n= sc.nextInt();
        
        int[][] matriz = new int[n][n];
       
        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+i+","+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+ matriz[i][j]);
            }
            System.out.println("");
        }
        
        int sumaf = 0, sumac=0;
        
        for (int i = 0; i < matriz.length; i++) {
            sumaf += matriz[i][i];
            
        }
                
        for (int j = 0; j < matriz.length; j++) {
            sumac += matriz[j][j];
        }
        
        System.out.println("La suma de las filas es: "+sumaf);
        System.out.println("La suma de las columnas es: "+sumac);
        
            System.out.println("Desea continuar?\n 1. Si / 2. No");
            op=sc.nextInt();
        } while (op==1);
                    
        
    }
}
