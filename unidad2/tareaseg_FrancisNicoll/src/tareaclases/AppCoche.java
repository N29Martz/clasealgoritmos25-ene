package tareaclases;

import java.util.Scanner;

public class AppCoche{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ejercicio 3");
        System.out.println("-----------------------");
        
        Coche miCoche = new Coche();
        
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese el modelos del vehiculo: ");
        String modelo = sc.nextLine();
       
        System.out.print("Ingrese la velocidad inicial: ");
        int velocidad = sc.nextInt();
        
        miCoche.arrancar();
        
        System.out.println("Desea Acelerar el vehiculo? 1. Si / 2.No");
        int aumentar = sc.nextInt();
        
        miCoche.acelerar(aumentar);
        
        System.out.println("Desea Frenar el vehiculo? 1. Si / 2.No");
        int detener = sc.nextInt();
        
        miCoche.frenar(detener);
        
        System.out.println("Los Datos del vehiculo son: ");
        miCoche = new Coche(marca, modelo, velocidad);
        miCoche.imprimirDatos();
        
    }
}
