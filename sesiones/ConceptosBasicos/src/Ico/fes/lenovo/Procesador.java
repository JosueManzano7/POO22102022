/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.lenovo;

/**
 *
 * @author sigma
 */
public class Procesador {
    private String marca;
    private float frecuencia;
    private String subMarca;

    //constructor, crea los objetos en memoria
    public Procesador() {  //ctrl+espacio+enter
    }

    //constructor sobrecargado
    public Procesador(String marca, float frecuencia, String subMarca) {//ctrl+espacio+enter
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.subMarca = subMarca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        if(frecuencia<=5.3f)
          this.frecuencia = frecuencia; 
        else System.out.println("Valor fuera de rango");
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuencia=" + frecuencia + ", subMarca=" + subMarca + '}';
    }
    
    
}
