/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author sigma
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=22;
        Integer edad2=new Integer(2);
        float x=edad2.floatValue();
        System.out.println(x);
        String dias="23";
        System.out.println(dias+3);
        int temp=Integer.parseInt(dias);
        
        edad2.parseInt("33");
        System.out.println("Dias= "+(temp+3));
        
        
        Perro dog1=new Perro("Poddle", 1);
        Perro dog2=new Perro("Poddle", 1);
        Perro dog3=new Perro("Poddle", 1);
        System.out.println(dog1);
        System.out.println(Perro.cola);
        System.out.println(dog1.cola);
        System.out.println(dog2.cola);
        System.out.println(dog3.cola);
        
        Perro.ladrar();
        dog1.ladrar();
        
        String cad1="Hola ";
        String cad2="Mundo ";
        String cad3=cad1+cad2;
        System.out.println(cad3);
        System.out.println("Edad: "+edad+ " años");

        String res="";
        edad=15;
        if (edad>=18){
        res="Mayor de edad";
        }
        else{
        res="Menor de edad";
        }
        System.out.println("Eres: "+res);
        
        System.out.println("--------------------");
        
        res=(edad>=18)?"Mayor de edad":"Menor de edad";
        System.out.println("Eres: "+res);
        
        System.out.println("--------Lo de hoy------------");
        int  val1 = 7;
        int  val2 = 2;
        System.out.println( val1 | val2);
        System.out.println( val1 & val2);
        /*
        val1 = 000...0111
        val2 = 000...0010
        ------------------
               000...0010   // 2 decimal
        */
        // desplazamiento a nuvel de bits
        int val3 = 1;//000...0001
        int val4 = val3<<1;// desplazar los bits una poscision a la izq
        
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        
        System.out.println("---- arreglos ----");
        
        int [] edades; //aquí solo se declara
        int [] edades2 = new int[5]; //aquí se declara y se reserva a la memoria
        int [] edades3 = {22,21,18,19,18};// en este, se declara, reserva e inicializa
        
        /*
        ahora, se usa igual como en leng C, C++, Python...etc
        
        */
        
        edades2[0]=33;
        System.out.println( edades2[0] ); //33
        System.out.println( edades2[1] );
        
        // ahora imprimimos las edades3
        System.out.println("Edades 3 a mano");
        System.out.println( edades3[0] );
        System.out.println( edades3[1] );
        System.out.println( edades3[2] );
        System.out.println( edades3[3] );
        System.out.println( edades3[4] );
        // ahora, lo combinamos con For
        System.out.println("Automatizado");
        for (int i = 0; i < edades3.length; i++){
            System.out.println(edades3[i]);
        }
        
        // Orden inverso
        System.out.println("--------------");
        for(int j = 4; j >= 0; j = j -1){
            System.out.println(edades3[j]);
        }
        System.out.println("otra forma");
        
        System.out.println("orden inverso");
        for(int i = edades3.length-1; i >= 0; i--){
            System.out.println(edades3[i]);
        }
        System.out.println("edades a 18");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);
        }
        
        /*
        for Each es un for especial, introducido en la version 2 
        El objetivo del For Each es simplificar la forma de recorrer arreglos 
        escriban:
        fore + tecla tabulador
        */
        System.out.println("con for each");
        for (int ed : edades3) {
            System.out.println( ed );
        }
        // lo comparamos vs el original
        System.out.println("Automatizado");
        for (int i = 0 ; i < edades3.length; i++) {
            System.out.println(edades3[i]);
          
        }
        
        /*
        El for each lo seguiremos usando
        Es una sintaxis totalmente nueva, los : significan que
        del arreglo que esta al frente de los ":" , sacar el siguiente elemento y
        asignarlo a lo que esta a la izquierda de los :
        */
        
        System.out.println("Arreglo de la clase perro");
        
        Perro [] lista = new Perro[3];
        lista [0] = new Perro(" Poddle", 1);
        lista [1] = new Perro(" San bernardo", 3);
        lista [2] = new Perro(" Akita", 2);
        // fore + TAB
        for (Perro perro : lista) {
            perro.comer();
        }
        
        System.out.println("Todos los perros a doverman");
        for (Perro perro : lista) {
            perro.setRaza("Doverman");
        }
        
        //Volvemos a imprimir la lista
        for (Perro perro : lista) {
            System.out.println( perro );
        }
        
        
    }
    
}
