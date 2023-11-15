package Metodos;

import Enemigos.obsta_enemigo;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class escenario extends JFrame implements Runnable {

    int x = 0;
    int y = 0;
public ArrayList<obsta_enemigo>listaenemigo=new ArrayList<>();


    public escenario() {
        this.setLayout(null);
        this.setTitle("Espacial");
        this.setSize(510, 510);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.nave();

    }

    public void nave() {

        Panel pan8 = new Panel();
        pan8.setBounds(120 + x, 248 + y, 20, 5);
        pan8.setBackground(Color.gray);
        this.add(pan8);

        Panel pan7 = new Panel();
        pan7.setBounds(115 + x, 240 + y, 5, 24);
        pan7.setBackground(Color.gray);
        this.add(pan7);

        //llama de nave 
        Panel pan13 = new Panel();
        pan13.setBounds(35 + x, 240 + y, 20, 5);
        pan13.setBackground(Color.yellow);
        this.add(pan13);

        Panel pan14 = new Panel();
        pan14.setBounds(35 + x, 245 + y, 20, 5);
        pan14.setBackground(Color.red);
        this.add(pan14);

        Panel pan15 = new Panel();
        pan15.setBounds(35 + x, 250 + y, 20, 5);
        pan15.setBackground(Color.yellow);
        this.add(pan15);

        Panel pan16 = new Panel();
        pan16.setBounds(30 + x, 245 + y, 5, 5);
        pan16.setBackground(Color.red);
        this.add(pan16);

        Panel pan17 = new Panel();
        pan17.setBounds(20 + x, 245 + y, 5, 5);
        pan17.setBackground(Color.red);
        this.add(pan17);

        //cabina 
        Panel pan18 = new Panel();
        pan18.setBounds(85 + x, 242 + y, 5, 15);
        pan18.setBackground(Color.DARK_GRAY);
        this.add(pan18);

        Panel pan19 = new Panel();
        pan19.setBounds(90 + x, 242 + y, 5, 15);
        pan19.setBackground(Color.BLUE);
        this.add(pan19);

        Panel pan20 = new Panel();
        pan20.setBounds(95 + x, 247 + y, 5, 5);
        pan20.setBackground(Color.BLUE);
        this.add(pan20);

        //complemetos internos de la nave 
        Panel pan12 = new Panel();
        pan12.setBounds(68 + x, 248 + y, 8, 5);
        pan12.setBackground(Color.DARK_GRAY);
        this.add(pan12);
        Panel pan11 = new Panel();
        pan11.setBounds(60 + x, 248 + y, 8, 5);
        pan11.setBackground(Color.red);
        this.add(pan11);

        Panel pan9 = new Panel();
        pan9.setBounds(60 + x, 240 + y, 8, 20);
        pan9.setBackground(Color.DARK_GRAY);
        this.add(pan9);

        Panel pan10 = new Panel();
        pan10.setBounds(68 + x, 245 + y, 5, 8);
        pan10.setBackground(Color.DARK_GRAY);
        this.add(pan9);

        //cuadro principal cuerpo
        Panel pan6 = new Panel();
        pan6.setBounds(60 + x, 232 + y, 55, 40);
        pan6.setBackground(Color.gray);
        this.add(pan6);

        Panel pan5 = new Panel();
        pan5.setBounds(60 + x, 224 + y, 30, 8);
        pan5.setBackground(Color.gray);
        this.add(pan5);

        Panel pan4 = new Panel();
        pan4.setBounds(55 + x, 216 + y, 30, 8);
        pan4.setBackground(Color.gray);
        this.add(pan4);

        Panel pan3 = new Panel();
        pan3.setBounds(50 + x, 208 + y, 30, 8);
        pan3.setBackground(Color.gray);
        this.add(pan3);

        Panel pan2 = new Panel();
        pan2.setBounds(40 + x, 200 + y, 5, 8);
        pan2.setBackground(Color.BLACK);
        this.add(pan2);

        Panel pan1 = new Panel();
        pan1.setBounds(40 + x, 200 + y, 45, 8);
        pan1.setBackground(Color.GRAY);
        this.add(pan1);

        //ala parte inferior
        Panel pan30 = new Panel();
        pan30.setBounds(60 + x, 272 + y, 30, 8);
        pan30.setBackground(Color.GRAY);
        this.add(pan30);

        Panel pan31 = new Panel();
        pan31.setBounds(55 + x, 280 + y, 30, 8);
        pan31.setBackground(Color.GRAY);
        this.add(pan31);

        Panel pan32 = new Panel();
        pan32.setBounds(50 + x, 288 + y, 30, 8);
        pan32.setBackground(Color.GRAY);
        this.add(pan32);

        Panel pan34 = new Panel();
        pan34.setBounds(40 + x, 296 + y, 5, 8);
        pan34.setBackground(Color.BLACK);
        this.add(pan34);

        Panel pan33 = new Panel();
        pan33.setBounds(40 + x, 296 + y, 45, 8);
        pan33.setBackground(Color.GRAY);
        this.add(pan33);
        

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                Thread moverNave = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (e.getKeyCode() == KeyEvent.VK_UP) {
                            y -= 5;

                            pan8.setBounds(120 + x, 248 + y, 20, 5);
                            pan7.setBounds(115 + x, 240 + y, 5, 24);

                            pan18.setBounds(85 + x, 242 + y, 5, 15);
                            pan19.setBounds(90 + x, 242 + y, 5, 15);
                            pan20.setBounds(95 + x, 247 + y, 5, 5);
                            pan12.setBounds(68 + x, 248 + y, 8, 5);
                            pan11.setBounds(60 + x, 248 + y, 8, 5);
                            pan9.setBounds(60 + x, 240 + y, 8, 20);
                            pan10.setBounds(68 + x, 245 + y, 5, 8);
                            pan6.setBounds(60 + x, 232 + y, 55, 40);
                            pan5.setBounds(60 + x, 224 + y, 30, 8);
                            pan4.setBounds(55 + x, 216 + y, 30, 8);
                            pan3.setBounds(50 + x, 208 + y, 30, 8);
                            pan2.setBounds(40 + x, 200 + y, 5, 8);
                            pan1.setBounds(40 + x, 200 + y, 45, 8);
                            pan30.setBounds(60 + x, 272 + y, 30, 8);
                            pan31.setBounds(55 + x, 280 + y, 30, 8);
                            pan32.setBounds(50 + x, 288 + y, 30, 8);
                            pan34.setBounds(40 + x, 296 + y, 5, 8);
                            pan33.setBounds(40 + x, 296 + y, 45, 8);
                            try {
                                //inicio de llama creando retrazo al desplazar
                                TimeUnit.MILLISECONDS.sleep(100);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(escenario.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            pan13.setBounds(35 + x, 240 + y, 20, 5);
                            pan14.setBounds(35 + x, 245 + y, 20, 5);
                            pan15.setBounds(35 + x, 250 + y, 20, 5);
                            pan16.setBounds(30 + x, 245 + y, 5, 5);
                            pan17.setBounds(20 + x, 245 + y, 5, 5);
                            //final de retrazo
                        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                            y += 5;
                            pan8.setBounds(120 + x, 248 + y, 20, 5);
                            pan7.setBounds(115 + x, 240 + y, 5, 24);
                            
                            pan18.setBounds(85 + x, 242 + y, 5, 15);
                            pan19.setBounds(90 + x, 242 + y, 5, 15);
                            pan20.setBounds(95 + x, 247 + y, 5, 5);
                            pan12.setBounds(68 + x, 248 + y, 8, 5);
                            pan11.setBounds(60 + x, 248 + y, 8, 5);
                            pan9.setBounds(60 + x, 240 + y, 8, 20);
                            pan10.setBounds(68 + x, 245 + y, 5, 8);
                            pan6.setBounds(60 + x, 232 + y, 55, 40);
                            pan5.setBounds(60 + x, 224 + y, 30, 8);
                            pan4.setBounds(55 + x, 216 + y, 30, 8);
                            pan3.setBounds(50 + x, 208 + y, 30, 8);
                            pan2.setBounds(40 + x, 200 + y, 5, 8);
                            pan1.setBounds(40 + x, 200 + y, 45, 8);
                            pan30.setBounds(60 + x, 272 + y, 30, 8);
                            pan31.setBounds(55 + x, 280 + y, 30, 8);
                            pan32.setBounds(50 + x, 288 + y, 30, 8);
                            pan34.setBounds(40 + x, 296 + y, 5, 8);
                            pan33.setBounds(40 + x, 296 + y, 45, 8);
                            try {
                                //inicio de llama creando retrazo al desplazar
                                TimeUnit.MILLISECONDS.sleep(100);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(escenario.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            pan13.setBounds(35 + x, 240 + y, 20, 5);
                            pan14.setBounds(35 + x, 245 + y, 20, 5);
                            pan15.setBounds(35 + x, 250 + y, 20, 5);
                            pan16.setBounds(30 + x, 245 + y, 5, 5);
                            pan17.setBounds(20 + x, 245 + y, 5, 5);
                            //final de retrazo
                        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                            x -= 5;
                            pan8.setBounds(120 + x, 248 + y, 20, 5);
                            pan7.setBounds(115 + x, 240 + y, 5, 24);
                            
                            pan18.setBounds(85 + x, 242 + y, 5, 15);
                            pan19.setBounds(90 + x, 242 + y, 5, 15);
                            pan20.setBounds(95 + x, 247 + y, 5, 5);
                            pan12.setBounds(68 + x, 248 + y, 8, 5);
                            pan11.setBounds(60 + x, 248 + y, 8, 5);
                            pan9.setBounds(60 + x, 240 + y, 8, 20);
                            pan10.setBounds(68 + x, 245 + y, 5, 8);
                            pan6.setBounds(60 + x, 232 + y, 55, 40);
                            pan5.setBounds(60 + x, 224 + y, 30, 8);
                            pan4.setBounds(55 + x, 216 + y, 30, 8);
                            pan3.setBounds(50 + x, 208 + y, 30, 8);
                            pan2.setBounds(40 + x, 200 + y, 5, 8);
                            pan1.setBounds(40 + x, 200 + y, 45, 8);
                            pan30.setBounds(60 + x, 272 + y, 30, 8);
                            pan31.setBounds(55 + x, 280 + y, 30, 8);
                            pan32.setBounds(50 + x, 288 + y, 30, 8);
                            pan34.setBounds(40 + x, 296 + y, 5, 8);
                            pan33.setBounds(40 + x, 296 + y, 45, 8);
                            try {
                                //inicio de llama creando retrazo al desplazar
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(escenario.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            pan13.setBounds(35 + x, 240 + y, 20, 5);
                            pan14.setBounds(35 + x, 245 + y, 20, 5);
                            pan15.setBounds(35 + x, 250 + y, 20, 5);
                            pan16.setBounds(30 + x, 245 + y, 5, 5);
                            pan17.setBounds(20 + x, 245 + y, 5, 5);
                            //final de retrazo
                        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                            x += 5;
                            pan8.setBounds(120 + x, 248 + y, 20, 5);
                            pan7.setBounds(115 + x, 240 + y, 5, 24);
                            
                            pan18.setBounds(85 + x, 242 + y, 5, 15);
                            pan19.setBounds(90 + x, 242 + y, 5, 15);
                            pan20.setBounds(95 + x, 247 + y, 5, 5);
                            pan12.setBounds(68 + x, 248 + y, 8, 5);
                            pan11.setBounds(60 + x, 248 + y, 8, 5);
                            pan9.setBounds(60 + x, 240 + y, 8, 20);
                            pan10.setBounds(68 + x, 245 + y, 5, 8);
                            pan6.setBounds(60 + x, 232 + y, 55, 40);
                            pan5.setBounds(60 + x, 224 + y, 30, 8);
                            pan4.setBounds(55 + x, 216 + y, 30, 8);
                            pan3.setBounds(50 + x, 208 + y, 30, 8);
                            pan2.setBounds(40 + x, 200 + y, 5, 8);
                            pan1.setBounds(40 + x, 200 + y, 45, 8);
                            pan30.setBounds(60 + x, 272 + y, 30, 8);
                            pan31.setBounds(55 + x, 280 + y, 30, 8);
                            pan32.setBounds(50 + x, 288 + y, 30, 8);
                            pan34.setBounds(40 + x, 296 + y, 5, 8);
                            pan33.setBounds(40 + x, 296 + y, 45, 8);
                            try {
                                //inicio de llama creando retrazo al desplazar
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(escenario.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            pan13.setBounds(35 + x, 240 + y, 20, 5);
                            pan14.setBounds(35 + x, 245 + y, 20, 5);
                            pan15.setBounds(35 + x, 250 + y, 20, 5);
                            pan16.setBounds(30 + x, 245 + y, 5, 5);
                            pan17.setBounds(20 + x, 245 + y, 5, 5);
                            //final de retrazo
                        }
                    }

                });
                moverNave.start();
            }

            @Override
            public void keyReleased(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_SPACE) {

                
                }
            }

        });

    }
    public void agregarEnemigos(obsta_enemigo enemigo1){
         ImageIcon lateral = new ImageIcon("Lateral.png");
        Image escalar = lateral.getImage().getScaledInstance(70, 50, Image.SCALE_DEFAULT);
        ImageIcon rescaladolateral = new ImageIcon(escalar);
        
        JLabel obstaculolateral = new JLabel(rescaladolateral);
        obstaculolateral.setSize(100,200);
        add(obstaculolateral);
        listaenemigo.add(enemigo1);
    }
    

    @Override
    public void run() {
        /*
        Panel pan34 = new Panel();
        pan34.setBounds(40 + x, 296 + y, 5, 8);
        pan34.setBackground(Color.BLACK);
        this.add(pan34);

        Panel pan2 = new Panel();
        pan2.setBounds(40 + x, 200 + y, 5, 8);
        pan2.setBackground(Color.BLACK);
        this.add(pan2);

        try {
            while (true) {
                Thread.sleep(100);
                pan34.setBackground(Color.red);
                Thread.sleep(100);
                pan34.setBackground(Color.green);

            }

        } catch (InterruptedException ex) {
            Logger.getLogger(escenario.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }

}
