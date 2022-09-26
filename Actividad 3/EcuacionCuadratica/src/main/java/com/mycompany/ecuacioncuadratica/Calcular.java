
package com.mycompany.ecuacioncuadratica;


public class Calcular {
    
    public static String CalcularX(double A, double B, double C){
        double X1, X2;
        if (A==0){
            return "No es cuadratica";
        }
        else if ((Math.pow(B, 2)-4*A*C)<0){
            return "Valores complejos";
        }
        else if ((Math.pow(B, 2)-4*A*C)==0){
            return String.valueOf("X₁ = "+-B/2*A);
        }
        else {
            X1=-B+Math.sqrt((Math.pow(B, 2)-4*A*C))/2*A;
            X2=-B-Math.sqrt((Math.pow(B, 2)-4*A*C))/2*A;
            return String.valueOf("X₁ = "+String.format("%.5f",X1)+"  X₂ = "+String.format("%.5f",X2));
        }
    }
    
}
