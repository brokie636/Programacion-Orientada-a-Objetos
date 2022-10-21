package com.mycompany.personas1;
import java.util.*;

public class ListaPersonas {
    //Vector listaPersonas; 
     List listaPersonas = new ArrayList();
    public ListaPersonas() {
    listaPersonas = new ArrayList(); // Crea el vector de personas
    }
    public void añadirPersona(Persona p) {
    listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
    listaPersonas.remove(i);
    }

    public void borrarLista() {
    listaPersonas.clear();
    }
}

