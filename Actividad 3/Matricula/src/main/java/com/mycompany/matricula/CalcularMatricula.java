package com.mycompany.matricula;

public class CalcularMatricula {
    public static double valorMatricula(double estrato, double patrimonio){
        if (patrimonio>2000000 && estrato>3){
            return 50000+patrimonio*0.03;
        }
        else {
            return 50000;
        }
    }
}
