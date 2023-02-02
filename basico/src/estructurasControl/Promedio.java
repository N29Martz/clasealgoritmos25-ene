
/*
    Solicitar 3 notas al usuario y calcular el promedio
    mostrar un mensaje seun el promedio obtenido

    Promedio menor a 70 reprobado
    promedio mayor a 70 aprobado
    promedio mayor a 80 bueno
    promedio mayor a 90 sobresaliente
*/

package estructurasControl;

import java.util.Scanner;

public class Promedio{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Promedio");
        System.out.println("------------------------");
        
        System.out.print("Ingrese la primer nota:");
        int n1= scan.nextInt();
        System.out.print("Ingrese la seunda nota:");
        int n2 = scan.nextInt();
        System.out.print("Ingrese la tercera nota: ");
        int n3 = scan.nextInt();
        
        int prom = (n1+n2+n3)/3;
        
        System.out.println("Su promedio es de " + prom);
        
        if (prom < 70) {
            System.out.println("El alumno esta REPROBADO");
        } 
        else if (prom >=70 && prom <80) {
            System.out.println("El alumno a APROBADO");
        } 
        else if (prom >=80 && prom <90) {
            System.out.println("El alumno a aprobado y tiene un BUEN promedio");
        }
        else if (prom >=90) {
            System.out.println("El alumno a aprobado y tiene un promedio SOBRESALIENTE");
        }else{
            System.out.println("REPROBADO");
        }
    }
}
