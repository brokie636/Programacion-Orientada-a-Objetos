package ejercicios_2;

import java.util.Scanner;

public class Capitulo4_ejercicio_7 {
	public static void main(String[] args) {
		int a, b ;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el valor a:");
		a = entrada.nextInt();
		System.out.println("Ingrese el valor b:");
		b = entrada.nextInt();
		
		if (a>b) {
			
			System.out.println("a es mayor que b");
			
		}
		else if (a==b) {
			
			System.out.println("a es igual a b");
			
		}
		else {
			System.out.println("a es menor que b");
		}
		
	}
}
