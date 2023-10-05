package UI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;

public class ventCalib {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ventana de calibración");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints posicion = new GridBagConstraints();
            
            
            Border borde = LineBorder.createBlackLineBorder();
            
            JTextArea hBarometro = new JTextArea(10, 1); //Aca va a estar la informacion del JSon que va a usar el usuario
            JTextArea hHigrometro = new JTextArea(10, 1);											//para calibrar los dispositivos
            
            hBarometro.setBorder(borde);
            hHigrometro.setBorder(borde);
            
            hBarometro.setEditable(false); //
            hHigrometro.setEditable(false);//
            							//Estas lineas son para que los textArea
            hBarometro.setFocusable(false);// no se puedan editar ni se pueda seleccionar nada
            hHigrometro.setFocusable(false);//en ellos
            
            JTextField calibD1 = new JTextField(20);
            calibD1.setEditable(true);
            
            JTextField calibD2 = new JTextField(20);
            calibD2.setEditable(true);
            
            JLabel baro = new JLabel("Barómetro: ");
            JLabel higro = new JLabel("Higrómetro: ");
            
            JButton calibrar = new JButton("Calibrar");

            
            JComboBox<String> regiones = new JComboBox<>(new String[] {"Cartago", "Limon", "Alajuela", "Heredia", "San Jose"});


            // Posicion de todo usando los ejes x y y, dando el ancho y la alineacion del texto a la izquierda
            posicion.gridx = 0;
            posicion.gridy = 0;
            hBarometro.append("Historial barometro");
            panel.add(hBarometro, posicion);

            posicion.gridx = 5;
            posicion.gridy = 0;
            hHigrometro.append("Historial barometro");
            panel.add(hHigrometro, posicion);

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
            panel.add(regiones, posicion);
            
            
            frame.add(panel);
            frame.setSize(500, 500);
            frame.setVisible(true);
        });
    }
}