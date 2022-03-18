/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.equipos;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author lenovo
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor pantalla;
    private Mouse raton;
    private Procesador cpu;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor pantalla, Mouse raton, Procesador cpu, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.cpu = cpu;
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", raton=" + raton + ", cpu=" + cpu + ", teclado=" + teclado + '}';
    }
    
    
}
