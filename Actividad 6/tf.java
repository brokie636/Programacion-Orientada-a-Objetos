package com.mycompany.tf;

import java.io.IOException;

public class tf {
   /*hacer un programa que permita la gestion de datos de contactos(cedula, nombre, apellido) en un archivo de texto*/
    public static void main(String[] args) throws IOException {
        System.out.println("Que desea hacer: \n 1: Crear Archivo \n 2: Cargar Archivo \n Otro Num: Salir");
        int opcion = menuInter.rOpcion();
        switch (opcion){
            case 1:
                String archivo = menuInter.Nuevo();
                new crud(archivo).menu();
                break;
            case 2:
                String archivoC = menuInter.Subir();
                new crud(archivoC).menu();
                break;
            default: System.out.println("Finalizado");
        }

    }
}