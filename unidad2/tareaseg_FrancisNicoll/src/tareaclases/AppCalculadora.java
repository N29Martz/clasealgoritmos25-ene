package tareaclases;

import java.util.Scanner;

public class AppCalculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora operaciones basicas");
        System.out.println("--------------------------------------");
        
        System.out.print("Ingrese el primer valor: ");
        int num1= sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int num2 = sc.nextInt();
        
        Calculadora miCalculadora = new Calculadora(num1, num2);
        
        int suma = miCalculadora.getSuma();
        System.out.println("La suma de "+num1+"+"+num2+" es: "+suma);
        int resta = miCalculadora.getResta();
        System.out.println("La resta de "+num1+"-"+num2+" es: "+resta);
        int mult = miCalculadora.getMult();
        System.out.println(
                "La multiplicacion de "+num1+"*"+num2+" es: "+mult);
        double dividir = miCalculadora.getDividir();
        System.out.println(
                "La division de "+num1+"/"+num2+" es: "+dividir);
    }
}

/*
    Francis Nicoll Martinez
        20202100096
*/