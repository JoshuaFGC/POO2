package UI;

import javax.swing.*;
import java.awt.*;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class ventData {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Control de datos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints posicion = new GridBagConstraints();	
            
            //Creacion del borde de los labels
            Border borde = LineBorder.createBlackLineBorder();
            
            
            
            JTextArea datBaro = new JTextArea(10, 1);//Paneles para los datos
            JTextArea datHigro = new JTextArea(10, 1);//de los dispositivos
            
            datBaro.setBorder(borde);
            datHigro.setBorder(borde);
            
            datBaro.setEditable(false); //
            datHigro.setEditable(false);//
            							//Estas lineas son para que los textArea
            datBaro.setFocusable(false);// no se puedan editar ni se pueda seleccionar nada
            datHigro.setFocusable(false);//en ellos
            
            JLabel alerta = new JLabel("Alerta: ");
            
            JPanel alertCircle = new JPanel();
            alertCircle.setPreferredSize(new Dimension(30, 30));
            alertCircle.setBackground(Color.GREEN); //Esta es la alerta que cambiará a rojo

            
            JButton recalibrar = new JButton("Recalibrar dispositivos");//Este botón abrirá la ventana de calibración
            recalibrar.setEnabled(false); //Este boton tambien se va a activar cuando la luz pase a roja
            
            JLabel fecha = new JLabel("Fecha");//Tomaran la fecha y hora con funciones especificas
            JLabel hora = new JLabel("Hora");
            
            //Panel para tener un mejor orden en la interfaz
            JPanel panelB = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            panelB.add(alerta);
            panelB.add(alertCircle);
            panelB.add(recalibrar);
            panelB.add(fecha);
            panelB.add(hora);
            
            //Lista de regiones
            JComboBox<String> regiones = new JComboBox<>(new String[] {"Quircot", "El Carmen", "Upala", "San Carlos", "Cooperosales"});
     
            //Datos barometro
            posicion.gridx = 0;
            posicion.gridy = 0;
            datBaro.append("Datos barometro");
            panel.add(datBaro, posicion);
            
            //Datos higrometro
            posicion.gridx = 5;
            posicion.gridy = 0;
            datHigro.append("Datos Higrometro");
            panel.add(datHigro, posicion);
            
            //Lista regiones
            posicion.gridx = 1;
            posicion.gridy = 0;
            panel.add(regiones, posicion);
            
            //Panel de botones y alerta
            posicion.gridx = 0;
            posicion.gridy = 1;
            posicion.gridwidth = 2;
            panel.add(panelB, posicion);


            frame.add(panel);
            frame.setSize(800, 800);
            frame.setVisible(true);
        });
    }
}