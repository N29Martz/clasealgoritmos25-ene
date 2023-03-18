package tareaclases;

import java.util.Scanner;

public class AppDatosRectangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Datos de un Rectangulo");
        System.out.println("----------------------------------");
        
        System.out.println("Ingrese el largo de la figura: ");
        int largo= sc.nextInt();
        System.out.println("Ingrese el ancho de la figura: ");
        int ancho= sc.nextInt();
        
        DatosRectangulo datosRectangulo = new DatosRectangulo();
        datosRectangulo.calcularArea(largo, ancho);
        datosRectangulo.calcularPerimetro(largo, ancho);
        datosRectangulo.esCuadrado(largo, ancho);
    }
}
