import java.util.Scanner;
public class Capitulo4_ejercicio_24 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la masa de la esfera A: ");
        int A = entrada.nextInt();
        System.out.println("Ingrese la masa de la esfera B: ");
        int B = entrada.nextInt();
        System.out.println("Ingrese la masa de la esfera C: ");
        int C = entrada.nextInt();
        if (A==B && A==C && B==C){
            System.out.println("Las esferas tienen la misma masa");
        }
        else if (A>B && A>C){
            System.out.println("La bola A es la que tiene mayor masa ");
        }
        else if (B>A && B>C){
            System.out.println("La bola B es la que tiene mayor masa ");
        }
        else if (C>A && C>B){
            System.out.println("La bola C es la que tiene mayor masa ");
        }
    }
}
