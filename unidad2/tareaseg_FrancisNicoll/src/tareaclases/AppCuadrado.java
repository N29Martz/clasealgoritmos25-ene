package tareaclases;

import java.util.Scanner;

public class AppCuadrado{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calcular area de un Cuadrado");
        System.out.println("------------------------------");
        
        System.out.print("Ingrese un lado del cuadrado: ");
        int lado = sc.nextInt();
        
        Cuadrado cuadrado = new Cuadrado(lado);
        double area = cuadrado.getCalcularArea();
        System.out.println("El area del cuadrado es: "+area);
    }
}

