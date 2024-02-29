/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import items.*;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Néstor y asociados
 */
public class Bibioteca {
    private int secciones;
    private String nombre;
    private String direccion;
    private int numPlazas;
    private TreeMap<Integer,Item> fondo;
    //get
    public int getSecciones() {
        return secciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    
    
    public TreeMap<Integer, Item> getFondo() {
        return fondo;
    }

    public Bibioteca(int secciones, String nombre, String direccion, int numPlazas) {
        this.secciones = secciones;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numPlazas = numPlazas;
        this.fondo = new TreeMap<>();
    }
    
    public void altaItem(Item i){
        if (fondo.containsKey(i.getCodigo())) {
            throw new IllegalArgumentException("Ese Item ya existe");
        }
        fondo.put(i.getCodigo(), i);
    }

    public void bajaItem(Item i){
        if (!fondo.containsKey(i.getCodigo())) {
            throw new IllegalArgumentException("Ese Item no existe");
        }
        fondo.remove(i.getCodigo());
    }
    
    public String listaLibros(){
        String libros = "Libros Disponibles\nISBN\t\tTitulo\tTemática\n";
        for (Map.Entry<Integer, Item> entry : fondo.entrySet()) {
            Object val = entry.getValue();
            if (val instanceof Libro) {
                if (!((Libro)val).isEstaPrestado()) {
                    libros += val+"\n";
                }
            }
        }
        return libros;
    }
    
    public String listaRevistas(){
        String revistas = "Revistas Disponibles\nEjemplar\t\tNombre\tTemática\n";
        for (Map.Entry<Integer, Item> entry : fondo.entrySet()) {
            Object val = entry.getValue();
            if (val instanceof Revista) {
                if (!((Revista)val).isEstaPrestado()) {
                    revistas += val+"\n";
                }
            }
        }
        return revistas;
    }
   
        
    public String listadoFondo(){
        return listaLibros()+"\n\n"+ listaRevistas();
    }
    
    public Item getitem(Integer clave){
        return this.fondo.get(clave);
    }
    
    public String listadoTema(Tematica t){
        String libros = "Libros Disponibles\nISBN\t\tTitulo\tTemática\n";
        for (Map.Entry<Integer, Item> entry : fondo.entrySet()) {
            Item val = entry.getValue();
            if (val instanceof Libro) {
                if (val.getTematica().equals(t)) {
                    libros += val+"\n";
                }
            }
        }
        return libros;
    }
}
