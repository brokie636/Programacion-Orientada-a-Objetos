package com.mycompany.tf;

public class contacto {
    String Documento;
    String Nombre;
    String Apellido;
    contacto(String doc, String nom, String ape){
        this.Documento = doc;
        this.Nombre = nom;
        this.Apellido = ape;
    }

    String resumen(){
        return "Cedula: "+Documento+", Nombre: "+Nombre+", Apellido: "+Apellido;
    }
}