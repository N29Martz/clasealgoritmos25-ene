package sobreescritura.personas;

import java.util.Scanner;

public class AppPersonasArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[3];
        
        System.out.print("Cuantas personas desea ingresar: ");
        int cant= sc.nextInt();
        
        Personas[] personas = new Personas[cant];
        
        int contador=0;
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese los datos solicitados a continuacion");
            sc.nextLine();
            System.out.print("Nombre persona No." +contador+": ");
            String nombre = sc.nextLine();
            
            
            System.out.print("Genero persona No. "+contador+": ");
            char genero = sc.nextLine().charAt(0);
            System.out.print("Edad persona No. "+contador+": ");
            int edad = sc.nextInt();
            
            personas[i] = new Personas(nombre, genero, edad);
            
            System.out.println("Personas ingresadas");
            System.out.println(personas[contador].toString());
        }
        
        
    }
}
