package ejercicios_2;

import java.util.Scanner;

public class Capitulo4_ejercicio_13 {

	public static void main(String[] args) {
		double pdes, valpag;
		String color, a = "blanco", b = "verde" , c = "amarillo", d = "azul";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el color de la bola:");
		color = entrada.nextLine();
		System.out.println("Ingrese el valor de la compra:");
		int valcomp = entrada.nextInt();
		
		if (color.equalsIgnoreCase(a)){
			pdes = 0;
		}
		else if (color.equalsIgnoreCase(b)) {
			pdes = 10;
		}
		else if (color.equalsIgnoreCase(c)) {
			pdes = 25;
		}
		else if (color.equalsIgnoreCase(d)) {
			pdes = 50;
		}
		else {
			pdes = 100;
		}
		
		valpag = valcomp-((pdes*valcomp)/100);
		System.out.println("El cliente debe pagar: $"+ valpag);
	}
}
