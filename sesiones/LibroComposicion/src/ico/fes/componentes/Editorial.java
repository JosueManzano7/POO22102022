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
    
    private String titulolibro;
    private String tipografía;

    public Editorial() {
    }

    public Editorial(String titulolibro, String tipografía) {
        this.titulolibro = titulolibro;
        this.tipografía = tipografía;
    }

    public String getTitulolibro() {
        return titulolibro;
    }

    public void setTitulolibro(String titulolibro) {
        this.titulolibro = titulolibro;
    }

    public String getTipografía() {
        return tipografía;
    }

    public void setTipografía(String tipografía) {
        this.tipografía = tipografía;
    }

    @Override
    public String toString() {
        return "Editorial{" + "titulolibro=" + titulolibro + ", tipograf\u00eda=" + tipografía + '}';
    }
    
    

  
    
    
}
