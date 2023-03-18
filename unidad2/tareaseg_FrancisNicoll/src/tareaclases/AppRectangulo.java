package tareaclases;

import java.util.Scanner;

public class AppRectangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calcular area de un Rectangulo");
        System.out.println("------------------------------");
        
        System.out.print("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();
        
        Rectangulo rec = new Rectangulo(base, altura);
        double area = rec.getCalcularArea();
        System.out.println("El area del rectangulo es: "+area);
    }
}
