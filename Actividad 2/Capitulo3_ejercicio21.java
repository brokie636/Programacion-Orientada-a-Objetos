import java.util.Scanner;

public class Capitulo3_ejercicio21 { 
    public static void main(String[] args) {
        /* Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo. */
        Scanner entrada = new Scanner(System.in);
        double lado1, lado2, lado3, perimetro, semiperimetro, area;
        double a, b, c;
        System.out.println("Ingrese lado 1: " );
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese lado 2: " );
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese lado 3: " );
        lado3 = entrada.nextDouble();
        
        perimetro = lado1 + lado2 + lado3;
        semiperimetro = (perimetro/2); 
        a = semiperimetro - lado1; 
        b = semiperimetro - lado2; 
        c = semiperimetro - lado3;
        area = Math.sqrt(semiperimetro*(a)*(b)*(c)); //Heron
        
        System.out.println(" ");
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);     
   }
}
