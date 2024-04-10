
package instadam;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana_InstaDam extends JFrame{

    private JPanel panel;
    
    public Ventana_InstaDam(){
        super("INSTA DAM");
        setSize(500,300);
        setLocationRelativeTo(null);
        
        //Llamamos a los métodos
        colocarPanel();
        colocarBotones();
        colocarTexto();
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
            
    private void colocarBotones(){
        JButton boton1 = new JButton("Registrarse");
        boton1.setBounds(300, 200, 120, 40);
        
        JButton boton2 = new JButton("Ingresar");
        boton2.setBounds(100, 200, 100, 40);
        panel.add(boton1);
        panel.add(boton2);
    }
    
    private void colocarTexto(){
        JLabel etiqueta1 = new JLabel("INICIA SESIÓN");
        etiqueta1.setForeground(Color.WHITE);
        etiqueta1.setBounds(200, 20, 200, 30);
        panel.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel("Usuario:");
        etiqueta2.setForeground(Color.WHITE);
        etiqueta2.setBounds(120, 60, 200, 30);
        panel.add(etiqueta2);
        
        JTextField texto2 = new JTextField(20);
        texto2.setBounds(200, 60, 160, 30);
        panel.add(texto2);
        
        JLabel etiqueta3 = new JLabel("Contraseña:");
        etiqueta3.setForeground(Color.WHITE);
        etiqueta3.setBounds(100, 90, 200, 30);
        panel.add(etiqueta3);
        
        JTextField texto3 = new JTextField(20);
        texto3.setBounds(200, 90, 160, 30);
        panel.add(texto3);
    }

}
