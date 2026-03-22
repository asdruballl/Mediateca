package personal_practice;
import javax.swing.*;


public class Interfaz {
    public static void main (String[] args)
    {
        //1. Creacion del marco
        JFrame ventana = new JFrame("Hola mundo!");
        //2. Configuracion de cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //3. Configuracion de tamaño
        ventana.setSize(400,200);
        //4. Creacion de contenido
        JLabel etiqueta = new JLabel("Este es mi primer interfaz grafica en Java Swing", SwingConstants.CENTER);
        //5. Agregar la etiqueta al marco
        ventana.add(etiqueta);
        // Darle visibilidad a la ventana
        ventana.setVisible(true);

    }
}
