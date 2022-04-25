/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author sigma
 */
public class Cuentahabiente {
    private String idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
        if(monto<=this.balance){
                this.balance-=monto;
          }
        else{
                System.out.println("DINERO INSUFICIENTE, NO PUEDES HACER RETIRO DE ESE MONTO");
          }
    
    }
    
    public String evaluarNivelCliente(){
        String cliente=(balance>50000)?"*CLIENTE PREMIUM*":"*CLIENTE REGULAR*";
        return cliente;
    }
    
    
} 
