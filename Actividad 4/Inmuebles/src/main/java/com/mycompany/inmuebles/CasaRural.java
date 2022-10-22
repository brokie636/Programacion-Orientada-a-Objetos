package com.mycompany.inmuebles;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabecera;
    protected int altitud;
    
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabecera, int altitud){
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabecera=distanciaCabecera;
        this.altitud=altitud;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal = "+distanciaCabecera);
        System.out.println("Altura sobre nivel del mar = "+altitud+" metros");
        System.out.println();
    }
}