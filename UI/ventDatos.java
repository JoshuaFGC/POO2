package UI;

import javax.swing.*;
import java.awt.*;


public class ventDatos {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Control de datos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints posicion = new GridBagConstraints();	
            
            
            JLabel info = new JLabel("Datos para la corrección");//Acá irán los datos para corregir datos malos


            JPanel alertCircle = new JPanel();
            alertCircle.setPreferredSize(new Dimension(30, 30));
            alertCircle.setBackground(Color.GREEN); //Esta es la alerta que cambiará a rojo

            JLabel presion = new JLabel("Presión: ");
            JLabel humedad = new JLabel("Humedad: ");
            
            JLabel pActual = new JLabel("Dato de P actual");//Estos dos labels mostrarán los datos 
            JLabel hActual = new JLabel("Dato de H actual");//recolectados

            JLabel correccion = new JLabel("Corrección");
            JLabel limit = new JLabel("----------------------------------------------");
            
            JLabel pre = new JLabel("Presión: ");
            JLabel hum = new JLabel("Humedad: ");
            
            JTextField nPre = new JTextField(20);
            nPre.setEditable(false);
            
            JTextField nHum = new JTextField(20);//Estos text estan desactivados porque en el
            nHum.setEditable(false); 			//momento en que la luz pase a roja todo va a parar
            									//y se van a activar para corregir datos
            
            JButton guardar = new JButton("Guardar");//Este guarda los datos corregidos
            
            JButton recalibrar = new JButton("Recalibrar dispositivos");//Este botón abrirá la ventana de calibración
            recalibrar.setEnabled(false); //Este boton tambien se va a activar cuando la luz pase a roja
            

            
            posicion.gridx = 10;
            posicion.gridy = 1;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(info, posicion);
            
            
            posicion.gridx = 5;
            posicion.gridy = 0;
            posicion.anchor = GridBagConstraints.EAST;
            panel.add(alertCircle, posicion);
            
            posicion.gridx = 0;
            posicion.gridy = 1;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(presion, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 1;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(pActual, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 2;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(hActual, posicion);
            
            posicion.gridx = 0;
            posicion.gridy = 2;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(humedad, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 5;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(limit, posicion);
            
            posicion.gridx = 0;
            posicion.gridy = 5;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(correccion, posicion);

            posicion.gridx = 0;
            posicion.gridy = 6;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(pre, posicion);

            posicion.gridx = 0;
            posicion.gridy = 7;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(hum, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 6;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(nPre, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 7;
            posicion.gridwidth = 1;
            posicion.anchor = GridBagConstraints.WEST;
            panel.add(nHum, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 8;
            posicion.gridwidth = 2;
            posicion.fill = GridBagConstraints.HORIZONTAL;
            panel.add(guardar, posicion);
            
            posicion.gridx = 1;
            posicion.gridy = 9;
            posicion.gridwidth = 2;
            posicion.fill = GridBagConstraints.HORIZONTAL;
            panel.add(recalibrar, posicion);

            frame.add(panel);
            frame.setSize(600, 600);
            frame.setVisible(true);
        });
    }
}
