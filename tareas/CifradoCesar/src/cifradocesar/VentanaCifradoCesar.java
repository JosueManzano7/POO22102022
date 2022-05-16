
package cifradocesar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VentanaCifradoCesar extends JFrame{
    private FlowLayout layout;
    private JTextField desplazamiento, texto;
    private JLabel cifrado,mensaje1,mensaje2,mensaje3;
    private JButton cifrar;
    private String Mayus="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";//0-26,o sea 27 en total
    private String Minus="abcdefghijklmnñopqrstuvwxyz";
    private String resultado="",mensaje;
    private int numero,posicion,desplazar,nuevaposicion;

    public VentanaCifradoCesar() throws HeadlessException {
        this.setTitle("Cifrado Cesar");
        this.setSize(700,200);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        layout=new FlowLayout();
        this.setLayout(layout);

        
        mensaje1=new JLabel("Desplazamiento: ");
        desplazamiento=new JTextField(2);
        mensaje2= new JLabel("Texto a cifrar: ");
        texto=new JTextField(15);
        mensaje3=new JLabel("Cifrado: ");
        cifrado=new JLabel();
        cifrar=new JButton("Cifrar");
        

        //Agragamos el contenido
        this.getContentPane().add(mensaje1);
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(mensaje2);
        this.getContentPane().add(texto);
        this.getContentPane().add(cifrar);
        this.getContentPane().add(mensaje3);
        this.getContentPane().add(cifrado);
        this.setVisible(true);

        
        this.addWindowListener(new WindowAdapter() { 
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        
        this.cifrar.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                   mensaje=texto.getText();
                   numero=Integer.parseInt(desplazamiento.getText());
                   for(int i=0; i<mensaje.length(); i++){
                       if(Character.isUpperCase(mensaje.charAt(i))){
                           posicion=Mayus.indexOf(mensaje.charAt(i));//posición en  la que se encuentra una letra
                           desplazar=posicion+numero;
                           if (posicion==-1){
                           resultado+=mensaje.charAt(i);
                           }
                           else if(desplazar>26){
                           nuevaposicion=desplazar-27;
                           resultado+=Mayus.charAt(nuevaposicion);
                           }
                           else{
                           resultado+=Mayus.charAt(desplazar);
                           }
                       }
                       else{
                           posicion=Minus.indexOf(mensaje.charAt(i));
                           desplazar=posicion+numero;
                           if (posicion==-1){
                           resultado+=mensaje.charAt(i);}
                           else if(desplazar>26){
                           nuevaposicion=desplazar-27;
                           resultado+=Minus.charAt(nuevaposicion);
                           }
                           else {
                           resultado+=Minus.charAt(desplazar);
                           }
                       }
                       
                   }
                   cifrado.setText(resultado);
                }
                 
             });

    }
    
}
