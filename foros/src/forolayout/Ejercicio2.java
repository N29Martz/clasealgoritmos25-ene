package forolayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Uso de CardLayout
 * @author Nico
 */
public class Ejercicio2 extends JFrame{
    
    private JLabel lblVentana1;
    private JLabel lblVentana2;
    
    private JButton btnVentana;
    
    private CardLayout Ventanas;
    
    private JPanel pnlVentanas;
    private JPanel pnlSuperior;
    private JPanel pnlVentana1;
    private JPanel pnlVentana2;
    
    public Ejercicio2(){
        super("CARDLAYOUT");
        
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        pnlSuperior = new JPanel();
        pnlSuperior.setBorder(
                BorderFactory.createTitledBorder(
                        "Ventana Principal"));
        btnVentana = new JButton("Cambiar Ventana");
        
        btnVentana.addActionListener(e -> {
                Ventanas.next(pnlVentanas);
        });
        
        pnlSuperior.add(btnVentana);
        
        add(pnlSuperior,BorderLayout.NORTH);
        
        Ventanas = new CardLayout();
        pnlVentanas = new JPanel();
        pnlVentanas.setLayout(Ventanas);
        
        pnlVentana1 = new JPanel();
        pnlVentana2 = new JPanel();
        pnlVentana1.setBackground(Color.white);
        pnlVentana1.setBorder(BorderFactory.createTitledBorder(
                "Ventana Inferior"));
        pnlVentana2.setBackground(Color.gray);
        pnlVentana2.setBorder(BorderFactory.createTitledBorder(
                "Ventana Inferior"));
        
        nuevoBoton(pnlVentana1, "Estas en la primera Ventana");
        
        nuevoBoton(pnlVentana2, "Estas en la segunada Ventana");
        
        pnlVentanas.add(pnlVentana1, "Ventas1");
        pnlVentanas.add(pnlVentana2, "Ventana2");

        //Muestro la primera
        Ventanas.show(pnlVentanas, "Ventana1");

        add(pnlVentanas,BorderLayout.CENTER);

        enPantalla();
    }
    
    private void enPantalla() {

        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void nuevoBoton(JPanel panel, String titulo){
        JLabel mensaje = new JLabel(titulo);
        panel.add(mensaje);

    }
    
    public static void main(String[] args) {
        new Ejercicio2();
    }
}
