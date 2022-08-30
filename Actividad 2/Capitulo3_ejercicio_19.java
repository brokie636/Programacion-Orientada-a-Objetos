package ejercicios_2;

import java.util.Scanner;

public class Capitulo3_ejercicio_19 {
	public static void main(String[] args) {
		double lado, altura;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el lado del triángulo:");
		lado = entrada.nextDouble();
		altura = ((Math.sqrt(3)*lado)/2);
		System.out.println("El perimetro es " + 3*lado + " , su altura es " + altura + "  y su area es: " + lado*altura/2);

		

			
	}

}
