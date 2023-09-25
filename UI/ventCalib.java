package UI;

import javax.swing.*;
import java.awt.*;

public class ventCalib {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ventana de calibración");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints posicion = new GridBagConstraints();

            JLabel infoJson = new JLabel("Datos Json"); //Aca va a estar la informacion del JSon que va a usar el usuario
            											//para calibrar los dispositivos
            
            JTextField calibD1 = new JTextField(20);
            calibD1.setEditable(true);
            
            JTextField calibD2 = new JTextField(20);
            calibD2.setEditable(true);
            
            JLabel baro = new JLabel("Barómetro: ");
            JLabel higro = new JLabel("Higrómetro: ");
            
            JButton calibrar = new JButton("Calibrar");
            JButton recolectar = new JButton("Recolectar"); //Este botón abrirá la ventana de datos

            // Posicion de todo usando los ejes x y y, dando el ancho y la alineacion del texto a la izquierda
            posicion.gridx = 0;
            posicion.gridy = 0;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(infoJson, posicion);

            posicion.gridx = 0;
            posicion.gridy = 1;
            panel.add(baro, posicion);

            posicion.gridx = 1;
            posicion.gridy = 1;
            panel.add(calibD1, posicion);

            posicion.gridx = 0;
            posicion.gridy = 2;
            panel.add(higro, posicion);

            posicion.gridx = 1;
            posicion.gridy = 2;
            panel.add(calibD2, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 3;
            posicion.gridwidth = 2;
            posicion.fill = GridBagConstraints.HORIZONTAL;
            panel.add(calibrar, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 4;
            posicion.gridwidth = 2;
            posicion.fill = GridBagConstraints.HORIZONTAL;
            panel.add(recolectar, posicion);

            frame.add(panel);
            frame.setSize(500, 500);
            frame.setVisible(true);
        });
    }
}