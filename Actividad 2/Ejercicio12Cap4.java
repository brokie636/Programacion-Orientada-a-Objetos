import java.util.Scanner;
public class Ejercicio12Cap4 {
    public static void main(String args[]) {
        int HET, HEE8, SALARIO=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        String NOM = entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        int NHT = entrada.nextInt();
        System.out.println("Ingrese el valor de hora normal trabajada: ");
        int VHN = entrada.nextInt();
        if (NHT>40){
         HET = NHT-40;
            if (HET>8){
                HEE8 = HET-8;
                SALARIO = 40*VHN + 16*VHN + HEE8*3*VHN;
            }
            else {
                SALARIO = 40*VHN + HET*2*VHN;
                    
            }
        }
        System.out.println("El trabajador "+NOM +" devengo: $"+SALARIO);
    }
}
