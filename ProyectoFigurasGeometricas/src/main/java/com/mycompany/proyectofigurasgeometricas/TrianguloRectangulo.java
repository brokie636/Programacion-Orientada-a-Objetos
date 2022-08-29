package com.mycompany.proyectofigurasgeometricas;

public class TrianguloRectangulo {
    int base;
    int altura;
    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea(){
        return (base*altura)/2;
    }
    
    double calcularHipotenusa(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }
    
    double calcularPerimetro(){
        return base+altura+calcularHipotenusa();
    }
    
    void clasificarTriangulo(){
        if(base==altura && altura==calcularHipotenusa() && base==calcularHipotenusa()){
            System.out.println("Triangulo equilatero");
        }
        else if(base!=altura && altura!=calcularHipotenusa() && base!=calcularHipotenusa()){
            System.out.println("Triangulo escaleno");
        }
        else{
            System.out.println("Triangulo isosceles");
        }
    }
}
