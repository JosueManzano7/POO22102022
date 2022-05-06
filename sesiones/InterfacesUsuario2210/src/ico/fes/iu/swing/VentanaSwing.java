package ico.fes.iu.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class VentanaSwing extends JFrame{
    private FlowLayout layout;
    private JTextField cuadroTexto;

    public VentanaSwing() throws HeadlessException {
            this.setTitle("Mi ventana Swing");
            this.setSize(300, 220);
            this.setVisible(true);
            layout=new FlowLayout();
            this.setLayout(layout);
            cuadroTexto=new JTextField(15);
            this.getContentPane().add(cuadroTexto);
            this.validate();
            
            
            
             this.addWindowListener(new WindowAdapter() { //ctrl+esp
                @Override
                public void windowClosing(WindowEvent e) { //ctrl+esp+enter+enter
                    System.exit(0);
                   //((JFrame) e.getSource()).setVisible(false);
                }
            });
        
    }

}