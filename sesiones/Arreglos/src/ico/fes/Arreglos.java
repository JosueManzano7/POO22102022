/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ico.fes;

/**
 *
 * @author sigma
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] numeros =new int[10];
        int[]numeros;
        numeros =new int[10];
        numeros[0]=2;
        System.out.println("Valor: "+numeros[0]);
        
        System.out.println("-----------------------------");
        
        String[]nombres=new String[5];
        nombres[0]="Jose";
        nombres[1]="Pedro";
        nombres[2]="Diana";
        nombres[3]="Alberto";
        nombres[4]="Jenny";
        for(int i=0;i<nombres.length;i++)
        {
            System.out.println("Nombre: "+nombres[i]);
        }
        
        System.out.println("-----------------------------");
        
        for(String i: nombres){
            System.out.println(i);
        }
    }
    
}
