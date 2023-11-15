
package Enemigos;
import Metodos.automatico;
import Metodos.escenario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
public class obsta_enemigo extends automatico{
    public int z;

    public obsta_enemigo(){
        enemigoDerecha();
    }
    
    
   public void enemigoDerecha(){
        Panel pan88 = new Panel();
        pan88.setBounds(300 , 248 , 20, 5);
        pan88.setBackground(Color.gray);
        add(pan88);
        
        ImageIcon lateral = new ImageIcon("Lateral.png");
        Image escalar = lateral.getImage().getScaledInstance(70, 50, Image.SCALE_DEFAULT);
        ImageIcon rescaladolateral = new ImageIcon(escalar);
        
        JLabel obstaculolateral = new JLabel(rescaladolateral);
        obstaculolateral.setSize(100,200+z);
        add(obstaculolateral);
        
       Timer enemigo = new Timer (100, new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               
               
           }
           
       });
       enemigo.start();
       
    }
    
}
