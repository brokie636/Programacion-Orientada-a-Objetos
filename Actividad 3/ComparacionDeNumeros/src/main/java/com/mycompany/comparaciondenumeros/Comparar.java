package com.mycompany.comparaciondenumeros;

public class Comparar {
    public static String Comparacion(double num1, double num2){
        if (num1>num2){
            return "Mayor que B";
        } else if (num1<num2){
            return "Menor que B";
        }
        else{
            return "igual a B";
        }
    }
}
