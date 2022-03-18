/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librocomposicion;

import ico.fes.componentes.Autor;
import ico.fes.componentes.Editorial;
import ico.fes.compuesto.Libro;

/**
 *
 * @author sigma
 */
public class LibroComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Libro libro=new Libro();
      libro.setTitulo("Batallas en el Desierto");
      libro.setGenero("Ficcion");
      libro.setAutor(new Autor("Jose Emilio Pacheco", "mexicana"));
      libro.setEditorial(new Editorial("Tusquets","Arial"));
      
      System.out.println(libro);
        
    }
    
}
