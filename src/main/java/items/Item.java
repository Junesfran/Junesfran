/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;

/**
 *
 * @author Diurno
 */
public abstract class Item implements Comparable<Item> {

    private String titulo;
    private String editorial;
    private Tematica tematica;
    private int paginas;
    private boolean estaPrestado;
    private int codigo;

    public Item(String titulo, String editorial, Tematica tematica, int paginas, boolean estaPrestado, int codigo) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.tematica = tematica;
        this.paginas = paginas;
        this.estaPrestado = estaPrestado;
        this.codigo = codigo;
    }

    //get
    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public int getPaginas() {
        return paginas;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public int getCodigo() {
        return codigo;
    }

    //set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    @Override
    public int compareTo(Item o) {
//        if (this.codigo == o.codigo) {
//            return 0;
//        }else if(this.codigo < o.codigo){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
//necesita Integer para que usar la clase de envoltorio
        return ((Integer) this.getCodigo()).compareTo(o.getCodigo());
    }
}
