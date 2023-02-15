package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Arreglo03{
    public static void main(String[] args) {
        int[] numeros = new int [20];
        
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        Random rand = new Random();
        
        do {            
            for (int i = 0; i < numeros.length; i++) {
                numeros[i]=rand.nextInt(100)+1;
                System.out.println("Numeros ["+i+"]="+numeros[i]);
            }
            
            System.out.println("---------------------------");
            System.out.println(
                    "DEsea generar un nuevo arreglo?\n 1. Si 2.No");
            opcion=sc.nextInt();
        } while (opcion==1);
    }
}
