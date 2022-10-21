package com.mycompany.personas1;
import java.util.*;

public class ListaPersonas {
     List listaPersonas = new ArrayList();
    public ListaPersonas() {
    listaPersonas = new ArrayList(); 
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

