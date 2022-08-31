import java.util.Scanner;

public class Capitulo4_ejercicio_11 { 
    public static void main(String[] args) {

        /* Encontrar el número mayor entre tres números*/

        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Ingrese el número 1: " );
        n1 = entrada.nextInt();
        System.out.println("Ingrese el número 2: " );
        n2 = entrada.nextInt();
        System.out.println("Ingrese el número 3: " );
        n3 = entrada.nextInt();
        System.out.println(" ");
        
        if (n1 > n2 && n1 > n3){
            System.out.println("El número " + n1 + " es el mayor");
        }
        else if (n2 > n1 && n2 > n3){ 
            System.out.println("El número " + n2 + " es el mayor");
        }
        else if (n3 > n1 && n3 > n2){
            System.out.println("El número " + n3 + " es el mayor");
        }
   }
}
