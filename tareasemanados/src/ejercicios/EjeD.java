package ejercicios;

import java.util.Scanner;

public class EjeD{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cala, calb, calc, cald, cale, calf, calg, calh, cali, calj, calk;
        int x, y, a, b, c, d, e, f, g, h, j, m, n, p, q, r, s;
        
        System.out.println("Calculadoras");
        System.out.println("---------------------------------------------");
        
        System.out.println("Que expresion desea calcular?");
        System.out.println("a. (3/2) +(4/3)" );
        System.out.println("b. (1/(x-5))-((3*x*y)/4)");
        System.out.println("c. (1/2)+7");
        System.out.println("d. 7+(1/2)");
        System.out.println("e. ((a*a)/(b-c))+((d-e)/(f-((g*h)/j)))");
        System.out.println("f. (m/n)+p");
        System.out.println("g. m+(n/(p-q))");
        System.out.println("h. ((a*a)/(b*b))+((c*c)/(d*d))");
        System.out.println("i. (m+(n/p))/(q-(r/s))");
        System.out.println("j. ((3*a)+b)/(c-((d+(5*e))/(f+((g)/(2h))))");
        System.out.println("k. ((a*a)+2(a*b)+(b*b))/((1/(x*x))+2)");
        System.out.print("Ingrese su eleccion: ");
        char op= scan.next().charAt(0);
        
        switch (op) {
            case 'a': case 'A':
                System.out.println("=>(3/2)+(4/3)");
                cala=(3/2)+(4/3);
                System.out.println("La suma de las fracciones es de: "+cala);
                break;
            case 'b': case 'B':
                System.out.println("=>(1/(x-5))-((3*x*y)/4)");
                System.out.print("Ingrese el valor de x: ");
                x= scan.nextInt();
                System.out.print("Ingrese el valor de y: ");
                y=scan.nextInt();
                
                calb=(1/(x-5))-((3*x*y)/4);
                
                System.out.println("");
                System.out.println("El resultado de (1/("+x+"-5))-((3*"+x+"*"+y
                        +")/4) es: "+ calb);
                break;
            case 'c': case 'C':
                System.out.println("=>(1/2)+7");
                calc=(1/2)+7;
                System.out.println("El resultado de (1/2)+7 es: "+calc);
                break;
            case 'd': case 'D':
                System.out.println("=>7+(1/2)");
                cald=7+(1/2);
                System.out.println("El resultado de 7+(1/2) es: "+cald);
                break;
            case 'e': case 'E':
                System.out.println("=>((a*a)/(b-c))+((d-e)/(f-((g*h)/j)))");
                
                System.out.print("Ingrese el valor de a: ");
                a= scan.nextInt();
                System.out.print("Ingrese el valor de b: ");
                b= scan.nextInt();
                System.out.print("Ingrese el valor de c: ");
                c= scan.nextInt();
                System.out.print("Ingrese el valor de d: ");
                d= scan.nextInt();
                System.out.print("Ingrese el valor de e: ");
                e= scan.nextInt();
                System.out.print("Ingrese el valor de f: ");
                f= scan.nextInt();
                System.out.print("Ingrese el valor de g: ");
                g= scan.nextInt();
                System.out.print("Ingrese el valor de h: ");
                h= scan.nextInt();
                System.out.print("Ingrese el valor de j: ");
                j= scan.nextInt();
                
                cale=((a*a)/(b-c))+((d-e)/(f-((g*h)/(j))));
                
                System.out.println("El resultado de (("+a+"*"+a+")/"
                        + "("+b+"-"+c+"))+(("+d+"-"+e+")/("+f+"-(("+g+"*"+h+")"
                                + "/"+j+"))) es: "+cale);
                break;
            case 'f': case 'F':
                System.out.println("=>(m/n)+p");
                
                System.out.print("Ingrese el valor de m: ");
                m = scan.nextInt();
                System.out.print("Ingrese el valor de n: ");
                n = scan.nextInt();
                System.out.print("Ingrese el valor de p: ");
                p = scan.nextInt();
                
                calf=(m/n)+p;
                
                System.out.println("El resultado de ("+m+"/"+n+")+"+p+""
                        + " es: "+calf);
                break;
            case 'g': case 'G':
                System.out.println("=>m+(n/(p-q))");
                
                System.out.print("Ingrese el valor de m: ");
                m = scan.nextInt();
                System.out.print("Ingrese el valor de n: ");
                n = scan.nextInt();
                System.out.print("Ingrese el valor de p: ");
                p = scan.nextInt();
                System.out.print("Inrese el valor de q:");
                q = scan.nextInt();
                
                calg= m+(n/(p-q));
                
                System.out.println("El resultado de "+m+"+("+n+"/("+p+"-"
                        +q+")) es: " +calg);
                break;
            case 'h': case 'H':
                System.out.println("=>((a*a)/(b*b))+((c*c)/(d*d))");
                
                System.out.print("Ingrese el valor de a: ");
                a= scan.nextInt();
                System.out.print("Ingrese el valor de b: ");
                b= scan.nextInt();
                System.out.print("Ingrese el valor de c: ");
                c= scan.nextInt();
                System.out.print("Ingrese el valor de d: ");
                d= scan.nextInt();
                
                calh= ((a*a)/(b*b))+((c*c)/(d*d));
                
                System.out.println("El resultado de (("+a+"*"+a+")/("+b+"*"
                        +b+"))+(("+c+"*"+c+")/("+d+"*"+d+")) es: "+calh);
                break;
            case 'i': case 'I':
                System.out.println("=>(m+(n/p))/(q-(r/s))");
                
                System.out.print("Ingrese el valor de m: ");
                m = scan.nextInt();
                System.out.print("Ingrese el valor de n: ");
                n = scan.nextInt();
                System.out.print("Ingrese el valor de p: ");
                p = scan.nextInt();
                System.out.print("Inrese el valor de q: ");
                q = scan.nextInt();
                System.out.print("Ingrese el valor de r: ");
                r= scan.nextInt();
                System.out.print("Ingrese el valor de s: ");
                s= scan.nextInt();
                
                cali= (m+(n/p))/(q-(r/s));
                
                System.out.println("El resultado de ("+m+"+("+n+"/"+p+"))/"
                        + "("+q+"-("+r+"/"+s+")) es: "+cali);
                break;
            case 'j': case 'J':
                System.out.println("=>((3*a)+b)/(c-((d+(5*e))/(f+((g)/"
                        + "(2*h))))");
                
                System.out.print("Ingrese el valor de a: ");
                a= scan.nextInt();
                System.out.print("Ingrese el valor de b: ");
                b= scan.nextInt();
                System.out.print("Ingrese el valor de c: ");
                c= scan.nextInt();
                System.out.print("Ingrese el valor de d: ");
                d= scan.nextInt();
                System.out.print("Ingrese el valor de e: ");
                e= scan.nextInt();
                System.out.print("Ingrese el valor de f: ");
                f= scan.nextInt();
                System.out.print("Ingrese el valor de g: ");
                g= scan.nextInt();
                System.out.print("Ingrese el valor de h: ");
                h= scan.nextInt();
                
                calj = ((3*a)+b)/(c-((d+(5*e))/(f+((g)/(2*h)))));
                
                System.out.println("El resltado de ((3*"+a+")+"+b+")/("+c+"-("
                        + "("+d+"+(5*"+e+"))/("+f+"+(("+g+")/(2*"+h+")))) es: "
                                + ""+calj);
                break;
            case 'k': case 'K':
                System.out.println("=>((a*a)+2*(a*b)+(b*b))/((1/(x*x))+2)");
                
                System.out.print("Ingrese el valor de a: ");
                a = scan.nextInt();
                System.out.print("Ingrese el valor de b: ");
                b = scan.nextInt();
                System.out.print("Inrese el valor de x: ");
                x = scan.nextInt();
                
                calk= ((a*a)+2*(a*b)+(b*b))/((1/(x*x))+2);
                
                System.out.println("El resultado de (("+a+"*"+a+")+"+2+"*"
                        + "("+a+"*"+b+")+("+b+"*"+b+"))/((1/("+x+"*"+x+"))+2) "
                                + "es: " +calk);
                break;
            default:
                System.out.println("No es un opcion valida");
        }
      
    }
}

/*
    Francis Nicoll Martínez López
            20202100096
*/