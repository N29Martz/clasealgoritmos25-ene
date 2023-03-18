package tareaclases;

import java.util.Scanner;

public class AppEstudiante{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiantes datosEstudiantes = new Estudiantes();
        
        System.out.println("Datos Estudiante");
        System.out.println("---------------------------------");
        
        System.out.println(
                "Ingrese los datos del estudiante solicitaos a continuacion:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Carrera: ");
        String carrera = sc.nextLine();
        
        System.out.print("Calificacion del curso: ");
        double calificacion= sc.nextDouble();
        
        double promedio=calificacion;
        
        System.out.println("Datos:");
        
        datosEstudiantes= new Estudiantes(nombre, edad, carrera, promedio);
        datosEstudiantes.imprimirDatos();
        datosEstudiantes.aprobarCurso(calificacion);
    }
}
