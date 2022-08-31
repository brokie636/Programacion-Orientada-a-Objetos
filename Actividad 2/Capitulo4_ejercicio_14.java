import java.util.Scanner;

public class Capitulo4_ejercicio_14 { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vd1, vd2, vd3, salar, totven, porven, salar1, salar2, salar3;
        System.out.println("Ingrese las ventar del departamento 1: " );
        vd1 = entrada.nextDouble();
        System.out.println("Ingrese las ventar del departamento 2: " );
        vd2 = entrada.nextDouble();
        System.out.println("Ingrese las ventar del departamento 3: " );
        vd3 = entrada.nextDouble();
        System.out.println("Ingrese el salario que reciben los vendedores en cada departamento: " );
        salar = entrada.nextDouble();
        System.out.println(" ");
        
        totven = vd1 + vd2 + vd3;
        System.out.println("Total ventas en la empresa: " + totven);
        porven = 0.33 * totven;
        System.out.println("Porcentaje equivalente al 33% de ventas totales: " + porven);
       
        
        if (vd1 > porven){
            salar1 = salar + (0.2*salar);
            System.out.println("Ventas del departamento 1: " + vd1);
            System.out.println("Salario vendedores depto. 1: " + salar1);
            }else{
                salar1 = salar;
                System.out.println("Ventas del departamento 1: " + vd1);
                System.out.println("Salario vendedores depto. 1: " + salar1);}               
        if (vd2 > porven){
            salar2 = salar + (0.2*salar);
            System.out.println("Ventas del departamento 2: " + vd2);
            System.out.println("Salario vendedores depto. 2: " + salar2);
            }else{
                salar2 = salar;
                System.out.println("Ventas del departamento 2: " + vd2);
                System.out.println("Salario vendedores depto. 2: " + salar2);}                
        if (vd3 > porven) {
            salar3 = salar + (0.2*salar);
            System.out.println("Ventas del departamento 3: " + vd3);
            System.out.println("Salario vendedores depto. 2: " + salar3);
            }else{
                salar3 = salar;
                System.out.println("Ventas del departamento 3: " + vd1);
                System.out.println("Salario vendedores depto. 3: " + salar3);
        }}}   
