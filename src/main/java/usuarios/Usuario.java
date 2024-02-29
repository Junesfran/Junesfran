/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import items.*;
import java.util.Map;

/**
 *
 * @author Diurno
 */
public class Usuario {
    private final String numero;
    private String nombre;
    private String dni;
    private String tlf;
    private boolean estaSancionado;
    private Item[] prestamos;

    public Usuario(String numero, String nombre, String dni, String tlf) {
        this.numero = numero;
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
        this.estaSancionado = false;
        this.prestamos = new Item[5];
    }

    //get
    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTlf() {
        return tlf;
    }

    public boolean isEstaSancionado() {
        return estaSancionado;
    }

    public Item[] getPrestamos() {
        return prestamos;
    }

    //set
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setEstaSancionado(boolean estaSancionado) {
        this.estaSancionado = estaSancionado;
    }

    public void setPrestamos(Item[] prestamos) {
        this.prestamos = prestamos;
    }
    
    public boolean tomerItem(Item i){
        if(i.isEstaPrestado()){
            return false;
        }
        if (this.isEstaSancionado()) {
            return false;
        }
        for (int j = 0; j < this.prestamos.length; j++) {
            if (prestamos[j] == null) {
                prestamos[j] = i;
                i.setEstaPrestado(true);
                return true;
            }
        }
        return false;
    }
    
    public boolean devolverItem(Item i){
        if(!i.isEstaPrestado()){
            return false;
        }
        
        for (int j = 0; j < this.prestamos.length; j++) {
            if (prestamos[j] != null) {
                if (this.prestamos[j] == i) {
                    i.setEstaPrestado(false);
                    prestamos[j] = null;
                     return true;
                }
            }
        }
        return false;
    }

public String listadoUsuario(){
            String libros = "Libros Prestados\nISBN\t\tTitulo\tTemática\n";
        for (int i = 0; i < prestamos.length; i++) {
            Object val = prestamos[i];
            if (val instanceof Libro) {
                libros += val.toString()+"\n";
            }
        }
        libros += "Revistas Prestados\nEjemplar\t\tNombre\tTemática\n";
        for (int i = 0; i < prestamos.length; i++) {
            Object val = prestamos[i];
            if (val instanceof Revista) {
                libros += val.toString()+"\n";
            }
        }
        return libros;
}
    

}
