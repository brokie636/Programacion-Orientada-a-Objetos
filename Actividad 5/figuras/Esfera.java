package com.mycompany.figuras;

public class Esfera extends FiguraGeometrica{
    private double radio;
    public Esfera(double radio){
        this.radio=radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
        
    }
    public double calcularVolumen(){
        double volumen=(4/3)*Math.PI*Math.pow(this.radio,3);
        return volumen;
    }
    public double calcularSuperficie(){
        double superficie=4*Math.PI*Math.pow(this.radio,3);
        return superficie;
    }
}
