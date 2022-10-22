package com.mycompany.inmuebles;

public class ApartamentoFamiliar extends Apartamento{
    public static double valorArea=2000000;
    protected int valorAdministracion;
    
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int valorAdministracion){
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion=valorAdministracion;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion = $"+valorAdministracion);
        System.out.println();
    }
}
