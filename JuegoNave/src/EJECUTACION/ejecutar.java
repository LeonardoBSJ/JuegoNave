package EJECUTACION;

import Enemigos.obsta_enemigo;
import Metodos.automatico;
import Metodos.escenario;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import movimiento_escena.simplificacion;

public class ejecutar {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "mueve la nave con flechas de movimiento");
        obsta_enemigo enemigo = new obsta_enemigo();
        enemigo.enemigoDerecha();

        escenario ejecutar = new escenario();
        ejecutar.nave();
        ejecutar.agregarEnemigos(enemigo);
        
        simplificacion auto = new simplificacion(ejecutar);
        auto.setLocationRelativeTo(null);
        auto.setVisible(true);
        auto.Daometodos();

    }
}
