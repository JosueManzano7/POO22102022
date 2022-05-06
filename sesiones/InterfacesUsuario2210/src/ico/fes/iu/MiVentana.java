/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author sigma
 */
public class MiVentana extends Frame implements MouseListener{
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
    //private EventosRaton eventosRaton;
    
    public MiVentana() throws HeadlessException{
        setTitle("Mi ventana");
        setSize(300,200);
        layout=new FlowLayout();
        setLayout(layout);
        boton1 =new Button("Saludar");
        cuadroTexto=new TextField(15);
        etiqueta=new Label("Valor inicial");
        //eventosRaton=new EventosRaton();
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        this.boton1.addMouseListener(this);
        
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         System.out.println("Clic");
         //System.out.println(cuadroTexto.getText());
         etiqueta.setText("Hola "+cuadroTexto.getText());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entró");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Salió");
    }
    
}
