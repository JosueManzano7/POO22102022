package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MiVentanaVersion2 extends Frame {
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
    //private EventosRaton eventosRaton;
    
    public MiVentanaVersion2() throws HeadlessException{
        setTitle("Mi ventana versión 2");
        setSize(300,200);
        layout=new FlowLayout();
        setLayout(layout);
        boton1 =new Button("Saludar");
        cuadroTexto=new TextField(15);
        etiqueta=new Label("Valor inicial");
      
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                etiqueta.setText("Hola "+cuadroTexto.getText());
                System.out.println("X"+e.getX());
                System.out.println("Y"+e.getY());
                System.out.println("Qué boton? "+e.getButton());
                
                
            }
        });
        
        this.addWindowListener(new WindowAdapter() { //ctrl+esp
            @Override
            public void windowClosing(WindowEvent e) { //ctrl+esp+enter+enter
                System.exit(0);
            }
        });
        
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                System.out.println("Tecla: "+ e.getKeyChar());
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        System.out.println("Se dió enter");
                        break;
                    default:
                        System.out.println("Tecla: "+ e.getKeyChar());
                       
                }
            }
            
        });
        
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        
        setVisible(true);
    }


    
}
