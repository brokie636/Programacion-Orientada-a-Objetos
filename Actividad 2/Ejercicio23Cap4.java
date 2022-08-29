import java.util.Scanner;
public class Ejercicio23Cap4 {
    public static void main(String args[]) {
        double solucion1, solucion2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("La ecuacion cuadratica tiene la forma Ax^2+Bx+C = 0 ");
        System.out.println("Ingrese el valor del coeficiente A de la ecuacion: ");
        double A = entrada.nextDouble();
        System.out.println("Ingrese el valor del coeficiente B de la ecuacion: ");
        double B = entrada.nextDouble();
        System.out.println("Ingrese el valor del coeficiente C de la ecuacion: ");
        double C = entrada.nextDouble();
        if (A==0) {
            System.out.println("La ecuacion no es cuadratica");
        }
        else if ((Math.pow(B,2)-4*A*C)<0){
         System.out.println("La ecuacion no tiene soluciones reales");   
        }
        else if ((Math.pow(B,2)-4*A*C)==0){
            solucion1=-B/(2*A);
            System.out.println("La unica solucion para la ecuacion es: "+solucion1);   
        }
        else {
            solucion1=(-B+Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
            solucion2=(-B-Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
            System.out.println("La solucion 1 de la ecuacion es: "+solucion1);
            System.out.println("La solucion 2 de la ecuacion es: "+solucion2);   
        }   
    }
}
