/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author sigma
 */
public class Autor {
    private String nombre;
    private String idioma;

    public Autor() {
    }

    public Autor(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    public void escribir(){   //metodo de uso general
        System.out.println("Escribiendo...");
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", idioma=" + idioma + '}';
    }
    
    
}
