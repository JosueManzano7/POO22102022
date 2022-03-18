/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.compuesto;

import ico.fes.componentes.Autor;
import ico.fes.componentes.Editorial;

/**
 *
 * @author sigma
 */
public class Libro {
    
    private String titulo;
    private String genero;
    private Autor autor;  //clase que vamos a reutilizar
    private Editorial editorial;  //clase que vamos a reutilizar
    

    public Libro() {
    }

    public Libro(String titulo, String genero, Editorial editorial, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }



    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void cambiarPag(){
        System.out.println("Cambiando de pagina...");
    }





}
