package forolayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * Uso de BorderLayout
 * @author Nico
 */
public class Ejercicio1 extends JFrame{
    
    private JTextField txtPalabra;
    private JTextArea txtaVocal;
    private JTextArea txtaConsonante;
    private JTextArea txtaContador;
    
    private JLabel lblPalabra;
    private JLabel lblVocal;
    private JLabel lblConsonante;
    private JLabel lblCant;
    
    private JButton btnIngresar;
    private JButton btnLimpiar;
    
    private JPanel pnlSuperior;
    private JPanel pnlIzquiera;
    private JPanel pnlDerecha;
    private JPanel pnlCentro;
    private JPanel pnlInferior;
    
    private int vocal=0;
    private int consonantes=0;
    
    public void PanelSuperior(){
        pnlSuperior = new JPanel();
        lblPalabra = new JLabel("Ingrese una palabra:");
        txtPalabra = new JTextField(10);
        btnIngresar = new JButton("Ingresar");
        
        btnIngresar.addActionListener(e -> Listar());
        
        pnlSuperior.setLayout(new FlowLayout());
        
        pnlSuperior.add(lblPalabra);
        pnlSuperior.add(txtPalabra);
        pnlSuperior.add(btnIngresar);
    }
    
    public void PanelIzquierdo(){
        pnlIzquiera = new JPanel();
        lblVocal = new JLabel("\t Inicia con Vocal");
        txtaVocal = new JTextArea(5, 10);
        
        pnlIzquiera.setLayout(new BoxLayout(
                pnlIzquiera,BoxLayout.Y_AXIS));
        
        pnlIzquiera.add(lblVocal);
        pnlIzquiera.add(txtaVocal);
    }
    
    public void PanelCentral(){
        pnlCentro = new JPanel();
        lblConsonante = new JLabel("Incia con Conzonante");
        txtaConsonante= new JTextArea(5, 10);
        
        pnlCentro.setLayout(new BoxLayout(
                pnlCentro, BoxLayout.Y_AXIS));
        
        pnlCentro.add(lblConsonante);
        pnlCentro.add(txtaConsonante);
    }
    
    public void PanelDerecha(){
        pnlDerecha = new JPanel();
        lblCant = new JLabel("Cantidad de palabras ingresadas:");
        txtaContador = new JTextArea(5, 10);
        
        pnlDerecha.setLayout(new BoxLayout(
                pnlDerecha,BoxLayout.Y_AXIS));
        
        pnlDerecha.add(lblCant);
        pnlDerecha.add(txtaContador);
    }
    
    public void PanelInferior(){
        pnlInferior = new JPanel();
        btnLimpiar = new JButton("Limpiar");
        
        btnLimpiar.addActionListener(e -> limpiar());
        
        pnlInferior.setLayout(new FlowLayout());
        
        pnlInferior.add(btnLimpiar);
    }
    
    public void Ventana() {
        
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5));
        vocal=0;
        consonantes=0;
        
        add(pnlSuperior,BorderLayout.NORTH);
        add(pnlIzquiera,BorderLayout.WEST);
        add(pnlCentro,BorderLayout.CENTER);
        add(pnlDerecha,BorderLayout.EAST);
        add(pnlInferior,BorderLayout.SOUTH);
        
    }
    
    public Ejercicio1(){
        super("BORDERLAYOUT");
        PanelSuperior();
        PanelIzquierdo();
        PanelCentral();
        PanelDerecha();
        PanelInferior();
        Ventana();
    }

    public static void main(String[] args) {
        Ejercicio1 app = new Ejercicio1();
        app.setVisible(true);
    }

    private void Listar() {
            String palabra = txtPalabra.getText();
            
            if(palabra.matches("[aeiouAEIOU].*")){
               txtaVocal.append(palabra+"\n");
               vocal++;
            }else{
                txtaConsonante.append(palabra+"\n");
                consonantes++;
            }
            
            txtaContador.append("\nCon vocales: "+vocal+ "\nCon consonantes: "+
                    consonantes);
            txtPalabra.setText(null);
    }

    private void limpiar() {
        vocal=0;
        consonantes=0;
        
        txtPalabra.setText(null);
        
        txtaVocal.setText(null);
        txtaConsonante.setText(null);
        txtaContador.setText(null);
    }
}
