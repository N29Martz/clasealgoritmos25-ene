package arreglos;

import java.util.Scanner;

/*
    Escribir un progrma donde en una matriz nxn definida por el usuario, 
    se suma la diagonal de izquierda a derecha despues que el usuario ingrese 
    los dats de la matriz
*/


public class Arreglo06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Suma de matriz nxn");
        System.out.println("--------------------------");
        
        System.out.print("Ingrese el numero el tamaño de la matriz: ");
        int n= sc.nextInt();
        
        int[][] matriz = new int[n][n];
        
        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+ i+", "+ j+"]: ");
                matriz[i][j]= sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+ matriz[i][j]);
            }
            System.out.println("");
        }
        
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
            
        }
        
        System.out.println("La suma es: " +suma);
        
    }
}
