
package com.mycompany.salarioempleados1;


public class Salarios {
    public static double salarioBruto(double numHoras, double valHora){
     return numHoras*valHora;
 }   
 public static double salarioNeto(double numHoras, double valHora, double retencion){
     return valHora*numHoras-(valHora*numHoras)*(retencion/100);
 }
}

