/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author sigma
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola clic de ratón");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Botón presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Botón liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Botón entró al componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Botón salió del componente");
    }
    
}
