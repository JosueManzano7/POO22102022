/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author lenovo
 */
public class Teclado {
    private String marca;
    private int numeroTeclas;
    private boolean multimedia;  //true = multimedia

    public Teclado() {
    }

    public Teclado(String marca, int numeroTeclas, boolean multimedia) {
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
        this.multimedia = multimedia;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
    
}
