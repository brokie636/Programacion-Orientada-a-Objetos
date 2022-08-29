package com.mycompany.proyectofigurasgeometricas;

public class Rombo {
    int lado;
    int diagonal;
    int Diagonal;
    
    Rombo(int lado, int diagonal, int Diagonal){
        this.lado = lado;
        this.Diagonal = Diagonal;
        this.diagonal = diagonal;
    }
    
    double calcularArea(){
        return ((Diagonal*diagonal)/2);
    }
    
    double calcularPerimetro(){
        return (lado*4);
    }
}
