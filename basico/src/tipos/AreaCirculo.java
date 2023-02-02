package tipos;

import java.util.Scanner;

public class AreaCirculo{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Área del Círculo");
        System.out.println("-------------------------------");
        
        System.out.print("Inrese el radio del Círculo: ");
       
        double radio = leer.nextDouble();
        
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El área del círculo es de " + area);
    }
}
