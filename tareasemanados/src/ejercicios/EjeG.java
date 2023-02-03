/*
    Desarrollé un programa en el cual se puede imprimir la tabla de multiplicar 
    de X número indicado por el usuario usando el ciclo for, debe mostrar los
    múltiplos hasta 10.
*/

package ejercicios;

import java.util.Scanner;

public class EjeG{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tabla de multiplicar de X numero");
        System.out.println("-------------------------------");
        
        System.out.print("Ingrese el numero de la tabla de multiplicar "
                + "que desea visualizar");
        int num = scan.nextInt();
        int i;
        int mult;
        
        System.out.println("La tabla de multiplicacion de "+num+" es:");
        
        for(i=1; i<=10; i++){
            mult=num*i;
            
            System.out.println(num+"x"+i+"="+mult);
        }
    }
}

/*
    Francis Nicoll Martínez López
            20202100096
*/