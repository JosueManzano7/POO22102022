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
      
      System.out.println("-----Metodo 1------");
      Libro libro=new Libro();
      libro.setTitulo("Batallas en el Desierto");
      libro.setGenero("Ficcion");
      libro.setAutor(new Autor("Jose Emilio Pacheco", "mexicana"));//llenado autor
      libro.setEditorial(new Editorial("Tusquets","Arial"));
            
      System.out.println(libro);
      
      System.out.println("-----Metodo 2------");
      Autor autor=new Autor();//llenado autor
      autor.setNacionalidad("mexicana");
      autor.setNombre("Pepe");
      libro.setAutor(autor);

      
      System.out.println(libro);
        
    }
    
}
