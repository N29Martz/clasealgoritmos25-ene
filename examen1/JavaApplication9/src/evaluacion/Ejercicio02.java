package evaluacion;


/*
Dada una matriz de números enteros, encontrar el número menor y el número mayor.

*/
import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Numero Menor y Mayor");
        System.out.println("-----------------------------");
        
        int op, mayor=0, menor=0;
        
        do {
            System.out.println("Ingrese el numero de filas: ");
            int filas = sc.nextInt();
            
            System.out.println("Ingrese el numero de columnas");
            int columnas = sc.nextInt();
            
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
