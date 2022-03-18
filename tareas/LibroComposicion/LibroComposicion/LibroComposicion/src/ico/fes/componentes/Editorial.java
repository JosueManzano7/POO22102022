/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author sigma
 */
public class Editorial {
    
    private String nombre;
    private String tipografía;

    public Editorial() {
    }

    public Editorial(String nombre, String tipografía) {
        this.nombre = nombre;
        this.tipografía = tipografía;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipografía() {
        return tipografía;
    }

    public void setTipografía(String tipografía) {
        this.tipografía = tipografía;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", tipograf\u00eda=" + tipografía + '}';
    }
    
    public void publicar(){
        System.out.println("Publicando libro...");
    }
    
}
