package arreglos;

import java.util.Scanner;

/*
    Crear un programa en el cual se ingrese un numero de una tabla que se quiera
    Visualizar e ingresar otro numero para la cantidad de multiplos a generar.
    Almacenar los valores en una matriz y mostrar en una matriz y mostrar los 
    datosal finalizar el proceso.
*/

public class Arreglo07{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int opcion;
        
        do{
        System.out.print("Ingrese el numero de la tabla a mostrar: ");
        int num= sc.nextInt();
        System.out.print("Multiplos a visualizar:");
        int tam= sc.nextInt();
        
        int [][] tabla= new int[tam][3];
        
        for (int i = 0; i < tam; i++) {
            tabla[i][2] = num * (1+i);
            tabla[i][1] = i+1;
            tabla[i][0]=num;
        }
        
        System.out.println("La tabla del numero" + num+ "es:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i][0]+" x "+ tabla[i][1]+"="+tabla[i][2]);
        }
        
            System.out.println("Desea continuar 1. Si 2. No");
            opcion=sc.nextInt();
        } while(opcion ==1);
    }

    
}

