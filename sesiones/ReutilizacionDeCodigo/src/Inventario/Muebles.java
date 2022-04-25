/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author sigma
 */
public class Muebles {
    private int idInventario;
    private String color;
    private String material;
    private int largo;
    private int ancho;
    private int disponibilidad;

    public Muebles() {
    }

    public Muebles(int idInventario, String color, String material, int largo, int ancho, int disponibilidad) {
        this.idInventario = idInventario;
        this.color = color;
        this.material = material;
        this.largo = largo;
        this.ancho = ancho;
        this.disponibilidad = disponibilidad;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Muebles{" + "idInventario=" + idInventario + ", color=" + color + ", material=" + material + ", largo=" + largo + ", ancho=" + ancho + ", disponibilidad=" + disponibilidad + '}';
    }
    
    /*public void sacar(){
        if(this.disponibilidad>=cantidad){
        this.disponibilidad-=cantidad;
            if(this.disponibilidad<10){
                System.out.println("Mensaje: Solicitar mas muebles del modelo: "+this.idInventario);
            }
        }
        else{
            System.out.println("Insuficiente "+this.disponibilidad);
        }
    }*/
}
