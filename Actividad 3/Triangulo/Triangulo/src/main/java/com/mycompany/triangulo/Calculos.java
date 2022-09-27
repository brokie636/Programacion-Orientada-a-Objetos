package com.mycompany.triangulo;

public class Calculos {
    
    
    public static double calcularPerimetro(double lado){
        return lado*3;
    }
    public static double calcularAltura(double lado){
        return ((Math.sqrt(3)*lado)/2);
    }
    public static double calcularArea(double lado, double calcularAltura){
        return lado*((Math.sqrt(3)*lado)/2)/2;
    }
}
