import java.util.Scanner;
public class Capitulo4_ejercicio_22 {

    public static void main(String args[]) {
        double salariomensual;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el salario basico por horas del empleado: ");
        double salario = entrada.nextDouble();
        System.out.println("Ingrese las horas trabajadas en el mes: ");
        double horas = entrada.nextDouble();
        
        salariomensual = salario*horas;
        
        if (salariomensual>450000) {
            System.out.println("Nombre: "+nombre);
            System.out.println("Salario mensual: " + String.format("%.2f", salariomensual));
        }
        else {
            System.out.println("Nombre: "+nombre);
        }
    }
}
