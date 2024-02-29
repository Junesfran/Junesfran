/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;

/**
 *
 * @author Diurno
 */
public class Libro extends Item{
    private String autor;
    private String ISBN;

    public Libro(String autor, String ISBN, String titulo, String editorial, Tematica tematica, int paginas, boolean estaPrestado, int codigo) {
        super(titulo, editorial, tematica, paginas, estaPrestado, codigo);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  ISBN + "\t" + super.getTitulo()+"\t"+ super.getTematica();
    }
    
    
    
}
