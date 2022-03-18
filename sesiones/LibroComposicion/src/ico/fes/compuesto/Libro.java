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
    
    private Editorial titulolibro;
    private Autor idioma;

    public Libro() {
    }

    public Libro(Editorial titulolibro, Autor idioma) {
        this.titulolibro = titulolibro;
        this.idioma = idioma;
    }

    public Editorial getTitulolibro() {
        return titulolibro;
    }

    public void setTitulolibro(Editorial titulolibro) {
        this.titulolibro = titulolibro;
    }

    public Autor getIdioma() {
        return idioma;
    }

    public void setIdioma(Autor idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulolibro=" + titulolibro + ", idioma=" + idioma + '}';
    }
    
    

    


}
