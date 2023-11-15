package movimiento_escena;

import Metodos.automatico;
import Metodos.escenario;
import javax.swing.SwingUtilities;

public class simplificacion extends automatico {

    private escenario escena;

    public simplificacion(escenario escena) {
        this.escena = escena;
    }

    public void Daometodos() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                obstaculos();
                obstaculo1();
                obta2();
                obta3();
                obta4();
                obta5();
                obta6();
            }
        });
    }
}
