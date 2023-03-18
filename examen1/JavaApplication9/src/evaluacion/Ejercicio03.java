package evaluacion;

import java.util.Scanner;

/*
Escribir un programa que solicite al usuario una lista de números enteros y 
encuentre el número más común en la lista
*/

public class Ejercicio03{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Suma de Filas y Columnas");
        System.out.println("-------------------------------------");
        
        int op, comun=0;
        
        do {            
          System.out.println("Ingrese el numero de filas: ");
            int filas = sc.nextInt();
            
            System.out.println("Ingrese el numero de columnas");
            int columnas = sc.nextInt();
            
            System.out.println("Filas: "+filas+" Columnas: "+columnas);
            
            int[][] matriz = new int[filas][columnas];
            
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
            
            System.out.println("Desea continuar?\n 1. Si / 2. No");
            op = sc.nextInt();
        } while (op==1);
    }
}
