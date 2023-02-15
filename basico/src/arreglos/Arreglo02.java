package arreglos;

import java.util.Random;

public class Arreglo02{
    public static void main(String[] args) {
        int[] numeros = new int[20];
        
        Random rand = new Random();
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=rand.nextInt(100)+1;
            
            System.out.println("Numeros ["+i+"]"+numeros[i]);
        }
    }
}
