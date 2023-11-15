package Metodos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class automatico extends escenario {

    private escenario es;
    public int x;
    public int y;
    public int q;
    public int w;
    public int ee;
    public int r;
    public int t;
    public int u;

    public automatico() {
        obstaculos();
        obstaculo1();
        obta2();
        obta3();
        obta4();
        obta5();
        obta6();
    }

    public void obstaculos() {
        ImageIcon image = new ImageIcon("Lateral meteoro.png");
        Image escalar = image.getImage().getScaledInstance(70, 15, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro = new ImageIcon(escalar);

        JLabel movi1 = new JLabel(rescaladometeoro);
        movi1.setSize(1100 + x, 200 + y);
        add(movi1);

        JLabel movi2 = new JLabel(rescaladometeoro);
        movi2.setSize(1100 + x, 400 + y);
        add(movi2);

        JLabel movi3 = new JLabel(rescaladometeoro);
        movi3.setSize(1100 + x, 600 + y);
        add(movi3);

        JLabel movi4 = new JLabel(rescaladometeoro);
        movi4.setSize(1100 + x, 800 + y);
        add(movi4);
        //otros grandes meteoros            

        JLabel movi21 = new JLabel(rescaladometeoro);
        movi21.setSize(1400 + x, 600 + y);
        add(movi21);

        JLabel movi22 = new JLabel(rescaladometeoro);
        movi22.setSize(1700 + x, 800 + y);
        add(movi22);

        JLabel movi23 = new JLabel(rescaladometeoro);
        movi23.setSize(1900 + x, 400 + y);
        add(movi23);

        Image escalarpeque = image.getImage().getScaledInstance(60, 10, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro2 = new ImageIcon(escalarpeque);

        JLabel movi7 = new JLabel(rescaladometeoro2);
        movi7.setSize(1100 + x, 500 + y);
        add(movi7);

        JLabel movi9 = new JLabel(rescaladometeoro2);
        movi9.setSize(1000 + x, 900 + y);
        add(movi9);
        //       

        //                 
        Timer time = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread ve = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        x += 8;

                        if (x > 1150) {
                            x = 0;

                        } else {

                            movi1.setSize(1100 - x, 200 + y);
                            movi2.setSize(1100 - x, 400 + y);
                            movi3.setSize(1100 - x, 600 + y);
                            movi4.setSize(1100 - x, 800 + y);
                            movi7.setSize(1100 - x, 500 - y);
                            movi9.setSize(1100 - x, 900 - y);

                        }

                        if (x > 1450) {

                        } else {
                            movi21.setSize(1400 - x, 600 + y);

                        }

                        //nuevos meteoros
                        /*
                            movi16.setSize(2100 - x, 700 + y);
                            movi25.setSize(2120 - x, 800 + y);
                         */
                        movi1.repaint();
                        movi2.repaint();
                        movi3.repaint();
                        movi4.repaint();
                        movi7.repaint();

                    }

                });
                ve.start();
            }

        });
        time.start();
    }

    public void obstaculo1() {
        ImageIcon image = new ImageIcon("Lateral meteoro.png");
        Image escalarpeque = image.getImage().getScaledInstance(60, 10, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro2 = new ImageIcon(escalarpeque);

        JLabel movi5 = new JLabel(rescaladometeoro2);
        movi5.setSize(1200 + x, 100 + y);
        add(movi5);

        JLabel movi6 = new JLabel(rescaladometeoro2);
        movi6.setSize(1200 + x, 300 + y);
        add(movi6);

        Timer time1 = new Timer(80, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q += 8;
                if (q > 1250) {
                    q = 0;

                } else {
                    movi5.setSize(1200 - q, 100 + y);
                    movi6.setSize(1200 - q, 300 + y);

                }
                movi5.repaint();
                movi6.repaint();
                return;
            }

        });

        time1.start();

    }

    public void obta2() {
        ImageIcon image = new ImageIcon("Lateral meteoro.png");
        Image escalarpeque = image.getImage().getScaledInstance(60, 10, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro2 = new ImageIcon(escalarpeque);

        JLabel movi12 = new JLabel(rescaladometeoro2);
        movi12.setSize(1300 + x, 500 + y);
        add(movi12);

        JLabel movi8 = new JLabel(rescaladometeoro2);
        movi8.setSize(1300 + x, 700 + y);
        add(movi8);

        Image escalar = image.getImage().getScaledInstance(70, 15, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro = new ImageIcon(escalar);

        JLabel movi20 = new JLabel(rescaladometeoro);
        movi20.setSize(1300 + x, 400 + y);
        add(movi20);

        Timer timer2 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                w += 8;
                if (w > 1350) {
                    w = 0;
                } else {
                    movi8.setSize(1300 - w, 700 - y);
                    movi12.setSize(1300 - w, 500 + y);
                    movi20.setSize(1300 - w, 400 + y);

                }

                movi8.repaint();
                movi12.repaint();
                movi20.repaint();
                return;
            }

        });
        timer2.start();
    }

    public void obta3() {
        ImageIcon image = new ImageIcon("Lateral meteoro.png");
        Image escalarpeque = image.getImage().getScaledInstance(60, 10, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro2 = new ImageIcon(escalarpeque);

        JLabel movi11 = new JLabel(rescaladometeoro2);
        movi11.setSize(1500 + x, 300 + y);
        add(movi11);

        JLabel movi13 = new JLabel(rescaladometeoro2);
        movi13.setSize(1500 + x, 700 + y);
        add(movi13);

        Image escalar = image.getImage().getScaledInstance(70, 15, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro = new ImageIcon(escalar);

        JLabel movi18 = new JLabel(rescaladometeoro);
        movi18.setSize(1500 + x, 200 + y);
        add(movi18);

        Timer timer3 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ee += 10;
                if (ee > 1550) {
                    ee = 0;
                } else {
                    movi11.setSize(1500 - ee, 300 + y);
                    movi13.setSize(1500 - ee, 700 + y);
                    movi18.setSize(1500 - ee, 200 + y);

                }
                return;
            }

        });
        timer3.start();
    }

    public void obta4() {
        ImageIcon image = new ImageIcon("Lateral meteoro.png");
        Image escalarpeque = image.getImage().getScaledInstance(60, 10, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro2 = new ImageIcon(escalarpeque);

        JLabel movi10 = new JLabel(rescaladometeoro2);
        movi10.setSize(1700 + x, 100 + y);
        add(movi10);

        JLabel movi14 = new JLabel(rescaladometeoro2);
        movi14.setSize(1700 + x, 900 + y);
        add(movi14);

        Image escalar = image.getImage().getScaledInstance(70, 15, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro = new ImageIcon(escalar);

        JLabel movi22 = new JLabel(rescaladometeoro);
        movi22.setSize(1700 + x, 800 + y);
        add(movi22);

        Timer timer4 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r += 8;
                if (r > 1750) {
                    r = 0;
                } else {
                    movi10.setSize(1700 - r, 100 + y);
                    movi14.setSize(1700 - r, 900 + y);
                    movi22.setSize(1700 - r, 800 + y);

                }
                return;
            }

        });
        timer4.start();
    }

    public void obta5() {
        ImageIcon image = new ImageIcon("Lateral meteoro.png");
        Image escalarpeque = image.getImage().getScaledInstance(60, 10, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro2 = new ImageIcon(escalarpeque);

        JLabel movi15 = new JLabel(rescaladometeoro2);
        movi15.setSize(1900 + x, 500 + y);
        add(movi15);

        Image escalar = image.getImage().getScaledInstance(70, 15, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro = new ImageIcon(escalar);

        JLabel movi23 = new JLabel(rescaladometeoro);
        movi23.setSize(1900 + x, 400 + y);
        add(movi23);

        Timer timer5 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t += 8;
                if (x > 1950) {
                    t = 0;
                } else {
                    movi15.setSize(1900 - t, 500 + y);
                    movi23.setSize(1900 - t, 400 + y);

                }
                movi15.repaint();
                movi23.repaint();
                return;
            }

        });
        timer5.start();
    }

    public void obta6() {
        ImageIcon image = new ImageIcon("Lateral meteoro.png");
        Image escalarpeque = image.getImage().getScaledInstance(60, 10, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro2 = new ImageIcon(escalarpeque);

        JLabel movi16 = new JLabel(rescaladometeoro2);
        movi16.setSize(2000 + x, 700 + y);
        add(movi16);

        JLabel movi17 = new JLabel(rescaladometeoro2);
        movi17.setSize(2100 + x, 900 + y);
        add(movi17);

        Image escalar = image.getImage().getScaledInstance(70, 15, Image.SCALE_DEFAULT);
        ImageIcon rescaladometeoro = new ImageIcon(escalar);

        JLabel movi25 = new JLabel(rescaladometeoro);
        movi25.setSize(2200 + x, 800 + y);
        add(movi25);

        JLabel movi24 = new JLabel(rescaladometeoro);
        movi24.setSize(2100 + x, 600 + y);
        add(movi24);

        Timer timer6 = new Timer(150, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (u > 2150) {
                    u = 0;
                } else {
                    movi17.setSize(2100 - u, 900 + y);
                    movi24.setSize(2100 - u, 600 + y);
                    movi16.setSize(2100 - u, 700 + y);
                    movi25.setSize(2120 - u, 800 + y);
                }
                movi17.repaint();
                movi24.repaint();
                movi16.repaint();
                movi25.repaint();
                return;
            }

        });
        timer6.start();
        /*ImageIcon imagen = new ImageIcon("Fondo.gif");
        JLabel fondo = new JLabel(imagen);
        add(fondo);
        fondo.setSize(500, 500);
        this.add(fondo);
        */
    }
    /*
    public void lineasecenasrio() {
        Panel disparo = new Panel();
        disparo.setBounds(135 + x, 248, 5, 5);
        disparo.setBackground(Color.red);
        this.add(disparo);
        disparo.addKeyListener(new KeyAdapter() {
           
            @Override
            public void keyPressed(KeyEvent e) {
                Thread dispar = new Thread(new Runnable() {
                        boolean mover=false;

                    @Override
                    public void run() {
                        if (e.getKeyCode() == KeyEvent.VK_UP) {
                           if(!mover){
                            y -= 5;
                            disparo.setBounds(135 + x, 248 + y, 5, 5);
                           }else{
                               
                           }
                        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                           if(!mover){
                            y += 5;
                            disparo.setBounds(135 + x, 248 + y, 5, 5);
                        }
                        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                            x -= 5;
                            disparo.setBounds(135 + x, 248 + y, 5, 5);

                        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                           
                            x += 5;
                            disparo.setBounds(135 + x, 248 + y, 5, 5);

                        } else if (e.getKeyCode() == KeyEvent.VK_W) {
                           
                            
                            while (true) {
                                mover=true;
                                try {
                                    TimeUnit.MILLISECONDS.sleep(500);
                                } catch (InterruptedException ex) {
                                    System.out.println("" + ex.getMessage());
                                }
                                r+= 5;
                                if (r > 500-r) {
                                    r = 0;
                                } else {
                                    disparo.setBounds(135 + x+r, 248 + y, 5, 5);
                                disparo.repaint();
                                }
                            }
                        }
                    }
                });
                dispar.start();
            }           

        });
        ImageIcon imagen = new ImageIcon("Fondo.gif");
        JLabel fondo = new JLabel(imagen);
        Panel pan = new Panel();
        pan.add(fondo);
        pan.setSize(500, 500);
        pan.setBackground(Color.white);
        this.add(pan);
    }
     */
}
