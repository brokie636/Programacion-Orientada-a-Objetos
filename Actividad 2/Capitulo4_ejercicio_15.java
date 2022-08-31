import java.util.Scanner;

public class Capitulo4_ejercicio_15 { 
    public static void main(String[] args) {
        /* Encontrar la bola con diferente peso y decir si es mayor o menor que las otras*/
        Scanner entrada = new Scanner(System.in);
        double pesoa, pesob, pesoc, pesod;
        System.out.println("Ingrese el peso A: " );
        pesoa = entrada.nextDouble();
        System.out.println("Ingrese el peso B: " );
        pesob = entrada.nextDouble();
        System.out.println("Ingrese el peso C: " );
        pesoc = entrada.nextDouble();
        System.out.println("Ingrese el peso D: " );
        pesod = entrada.nextDouble();
        System.out.println(" ");
        
        if (pesoa==pesob && pesoa==pesoc){
            System.out.println("El peso D es diferente");
            if (pesoa > pesod){
                System.out.println("D es de menor peso");  
                }else{
                     System.out.println("D es de mayor peso");                
                } }  
        if (pesoa==pesob && pesoa==pesod){
            System.out.println("El peso C es diferente");
            if (pesoa > pesoc){
                System.out.println("C es de menor peso");
                }else{
                     System.out.println("C es de mayor peso");                
                } }  
        if (pesoa==pesoc && pesoa==pesod){
            System.out.println("El peso B es diferente");
            if (pesoa > pesob){
                System.out.println("B es de menor peso");
                }else{
                     System.out.println("B es de mayor peso");                
                } }  
        if (pesob==pesoc && pesob==pesod) {
            System.out.println("El peso A es diferente");
            if (pesoa > pesob){
                System.out.println("A es de mayor peso");
               }else{
                     System.out.println("A es de menor peso");                
                } }  } } 
