/*
    Desarrolle un programa en el cual se puede imprimir la tabla de 
    multiplicar de X número hasta los múltiplos Y utilizando el ciclo while 
    (el usuario ingresa los valores de X y Y).
*/

package ejercicios;

import java.util.Scanner;

public class EjeH{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tabla de multiplicar de X*Y numero");
        System.out.println("-----------------------------------");
        
        System.out.print("Ingrese el valor de X: ");
        int x=scan.nextInt();
        System.out.print("Ingrese el valor de Y: ");
        int y=scan.nextInt();
        
        int i, mult;
        
        System.out.println("La tabla de multiplicacion de "+x+" es:");
        
        for(i=1; i<=y; i++){
            mult=x*i;
            System.out.println(x+"x"+i+"="+mult);
        }
    }
}

/*
    Francis Nicoll Martínez López
            20202100096
*/