package com.mycompany.numeromayor;

public class Comparacion {
    public static Double Comparar(double A, double B, double C, double D, double E){
        double numeros[]={A,B,C,D,E};
        double mayor;
        mayor=0;
        for(int i =0; i<=4; i=i+1){
            if (numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        return mayor;
    }
}
