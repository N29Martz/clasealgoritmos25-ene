package arreglos;

import java.util.Scanner;

public class Arreglo05{
    public static void main(String[] args) {
        // El usario determina el tamaño de la matriz
        // El usuario ingresa los datos
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de colummnas");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor para la fila " +i+ " calumna " +j+":");
                matriz[i][j]= sc.nextInt();
            }
        }
        
        for(int f=0; f<3; f++){
            for (int c = 0; c < 3; c++) {
                System.out.print(" "+ matriz[f][c]);
            }
            System.out.println("");
        }
    }
}
