/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author sigma
 */
public class Alumno extends Persona{
    private String numeroCuenta;
    private String carrera;
    private int semestre;

    public Alumno() {
    }

    /* public Alumno(String numeroCuenta, String carrera, int semestre) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }*/
    
    public Alumno(String numeroCuenta, String carrera, int semestre, String nombre, int edad) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }  

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }
   
}
