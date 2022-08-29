package com.mycompany.proyectofigurasgeometricas;

public class Trapecio {
    int basemenor;
    int basemayor;
    int altura;
    
    Trapecio(int basemenor, int basemayor, int altura){
        this.basemenor = basemenor;
        this.basemayor = basemayor;
        this.altura = altura;
    }
    
    double calcularArea(){
        return altura*((basemenor+basemayor)/2);
    }
    double calcularLadosobrante(){
        return (basemayor-basemenor)/2;
    }
    double calcularHipotenusa(){
        return Math.sqrt(Math.pow(altura, 2)+Math.pow(calcularLadosobrante(),2));
    }
    double calcularPerimetro(){
        return calcularHipotenusa()*2+basemenor+basemayor;
    }
}
