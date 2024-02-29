/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;

/**
 *
 * @author Diurno
 */
public class Revista extends Item{
    private String adjunto;
    private int año, edicion;

    public Revista(String adjunto, int año, int edicion, String titulo, String editorial, Tematica tematica, int paginas, boolean estaPrestado, int codigo) {
        super(titulo, editorial, tematica, paginas, estaPrestado, codigo);
        this.adjunto = adjunto;
        this.año = año;
        this.edicion = edicion;
    }
    
//get
    public String getAdjunto() {
        return adjunto;
    }

    public int getAño() {
        return año;
    }

    public int getEdicion() {
        return edicion;
    }

//set

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return año + "-" + edicion + "\t" + this.getTitulo() + "\t" + this.getTematica();
    }
    
    
    
}
