package arreglosymatrices;

import java.util.Scanner;

public class Foro01{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("REGISTRO");
        System.out.println("----------------------------");
        
        System.out.print("Cuantas personas desea registrar: ");
        int num = sc.nextInt();

        String[] nombre = new String[num];
        String[] apellido = new String[num];
        String[] dni = new String[num];
        char[] genero = new char[num];
        int[] edad = new int[num];
        
        for (int i = 0; i <num; i++) {
            
            System.out.println(
                    "Ingresa los datos solicitados a continuacion:");
            
            sc.nextLine();
            
            System.out.print("Ingre el nombre de la persona No. "+ (i+1) +": ");
            nombre[i]= sc.nextLine();
            
            System.out.print("Ingrese el apellido de la persona No. "+ 
                    (i+1) +": ");
            apellido[i]= sc.nextLine();
            
            System.out.print(
                    "Ingrese el numero de identidad de la persona No. "+ 
                            (i+1) +": ");
            dni[i]=sc.nextLine();
            
            System.out.print("Ingrese el genero de la persona No. "+ 
                    (i+1) +": ");
            genero[i]=sc.nextLine().charAt(0);
            
            System.out.print("Ingrese la edad de la persona No. "+ (i+1) +": ");
            edad[i]=sc.nextInt();
        }
        
        System.out.println("\n---------------------------------------");
        System.out.print(
                "NO. NOMBRE\t APELLIDO\t DNI\t \tGENERO\t \tEDAD\n");
        
        //Mostrar tabla
        
        for (int t = 0; t < nombre.length; t++) {
            System.out.print("-" + (t + 1) + ". " + nombre[t]);
            System.out.print("\t" + apellido[t]);
            System.out.print("\t  " + dni[t]);
            System.out.print("\t\t" + genero[t]);
            System.out.print("\t\t" + edad[t]);
            System.out.println("\n");
        }

    }
}

