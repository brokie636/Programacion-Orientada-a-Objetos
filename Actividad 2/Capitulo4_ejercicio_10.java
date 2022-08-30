package Clase_3;

import java.util.Scanner;

public class Capitulo4_ejercicio_10 {
	public static void main(String[] args) {
		int ni,pat,est;
		double pagmat;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		String nom = entrada.nextLine();
		System.out.println("Ingrese el numero de inscripción: ");
		ni = entrada.nextInt();
		System.out.println("Ingrese el patrimonio: ");
		pat = entrada.nextInt();
		System.out.println("Ingrese el estrato social: ");
		est = entrada.nextInt();
		
		pagmat=50000;
		
		if ((pat>2000000)&&(est>3)){
			pagmat= pagmat +0.03*pat;
		}
	System.out.println("El estudiante con el numero de inscripción "+ ni + " y nombre " + nom +" debe pagar: $"  + pagmat);
		
	}

}
