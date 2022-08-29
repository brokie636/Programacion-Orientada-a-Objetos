package com.mycompany.proyectofigurasgeometricas;

public class ProyectoFigurasGeometricas {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5 = new Rombo(2,2,2);
        Trapecio figura6 = new Trapecio(3,4,5);
        System.out.println("El area del circulo es: "+figura1.calcularArea());
        System.out.println("El perimetro del circulo es: "+figura1.calcularPerimetro());
        System.out.println("------------------------------------------------");
        System.out.println("El area del Rectangulo es: "+figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+figura2.calcularPerimetro());
        System.out.println("------------------------------------------------");
        System.out.println("El area del cuadrado es: "+figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es: "+figura3.calcularPerimetro());
        System.out.println("------------------------------------------------");
        System.out.println("El area del triangulo rectangulo es: "+figura4.calcularArea());
        System.out.println("El perimetro del triangulo rectangulo es: "+figura4.calcularPerimetro());
        figura4.clasificarTriangulo();
        System.out.println("------------------------------------------------");
        System.out.println("El area del rombo es: "+figura5.calcularArea());
        System.out.println("El perimetro del rombo es: "+figura5.calcularPerimetro());
        System.out.println("------------------------------------------------");
        System.out.println("El area del trapecio es: "+figura6.calcularArea());
        System.out.println("El perimetro del trapecio es: "+figura6.calcularPerimetro());
    }
    
}
