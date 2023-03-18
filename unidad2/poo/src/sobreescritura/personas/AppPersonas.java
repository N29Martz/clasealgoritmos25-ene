package sobreescritura.personas;

import java.util.Scanner;

public class AppPersonas{
    public static void main(String[] args) {
        Personas personas[] = new Personas[3];
        Scanner sc = new Scanner(System.in);
        
        int contador=0;
        
        do {            
            
            System.out.print("Nombre: ");
            String n= sc.nextLine();
            personas[contador].getNombre();
            contador++;
        } while (contador<5);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(personas[i].toString());
        
        }
    }
}
