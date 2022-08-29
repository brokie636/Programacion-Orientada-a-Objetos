package com.mycompany.proyectofigurasgeometricas;

public class Rectangulo {
    int base;
    int altura;
    
    Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    double calcularArea(){
        return base*altura;
    }
    double calcularPerimetro(){
        return 2*base+2*altura;
    }
}
