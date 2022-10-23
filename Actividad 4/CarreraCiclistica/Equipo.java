
package carrera;

import java.util.Vector;
import java.util.Scanner;

public class Equipo {
    private String nombre; 
    private static double totalTiempo; 
    private String país; 
    Vector listaCiclistas; 
    
    public Equipo(String nombre, String país) {
    this.nombre = nombre;
    this.país = país;
    totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
    listaCiclistas = new Vector();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String getPaís() {
        return país;
    }
    
    private void setPaís(String país) {
        this.país = país;
    }
    
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }
    void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); 
        System.out.println(c.getNombre());
    }}
    
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in); 
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) { 
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
        if (c.getNombre().equals(nombreCiclista)) { 
            System.out.println(c.getNombre());
    }}}
    
    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) { 
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); 
        totalTiempo = totalTiempo + c.getTiempoAcumulado();
}}
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + país);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
}}
