import java.util.Scanner;
public class Ejercicio18Cap3 {
    public static void main(String args[]) {
        double salbru, salnet;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del empleado: ");
        String code = entrada.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        String name = entrada.nextLine();
        System.out.println("Ingrese las horas trabajadas por el empleado al mes: ");
        double hours = entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora del empleado: ");
        double valorhora = entrada.nextDouble();
        System.out.println("Ingrese el porentaje de la retencion en la fuente del empleado: ");
        double ret = entrada.nextDouble();
        
        salbru = valorhora*hours;
        salnet = salbru - salbru*ret;
        
        System.out.println("Codigo: " +code);
        System.out.println("Nombre: " +name);
        System.out.println("Salario bruto: "+salbru);
        System.out.println("Salario neto: "+salnet);
        

    }
}
