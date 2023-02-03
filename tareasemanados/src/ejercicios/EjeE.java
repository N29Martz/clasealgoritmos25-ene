/*
    Investigue el objeto Random de java y desarrolle un juego en el cual el 
    usuario debe adivinar un número generado en un rango de 1 a 20 con un 
    límite de tres intentos, adicional a esto cuando termine el juego el 
    programa le debe realizar la pregunta al usuario si quiere seguir jugando 
    para reiniciar el juego.
*/

package ejercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EjeE{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Adivina el numeros");
        System.out.println("-----------------------------");
        
        int aleatorio = ThreadLocalRandom.current().nextInt(1, 20);
        int intentos=3;
        boolean x=false;
        
        do{
            System.out.println("Tienes "+intentos+" intentos");
            System.out.print("Ingrese el numero a adivinar: ");
            int num=scan.nextInt();
            
            intentos--;
            
            if(num==aleatorio){
                
                x=true;
            }else{
                System.out.println("Numero incorrecto");
            }
            
        } while(intentos >0 && !x);
            if(x){
                System.out.println("Ganaste!!!! Has adivinado el numero");
            }else{
                System.out.println("Perdiste 7n7");
                System.out.println("El numero corecto era: "+aleatorio);
            }
    }
        
 
}

/*
    Francis Nicoll Martínez López
            20202100096
*/