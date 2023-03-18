package forolayout;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Uso de BoxLayout
 * @author Nico
 */
public class Ejercicio4 extends JFrame{
    
    private JPanel pnlSuperior, pnlMedio, pnlInferior, pnlBotones;
    private JLabel lblDatos, lblName, lblApellido, lblMostrar;
    private JTextField txtName, txtApellido;
    private JButton btnAgregar, btnLimpiar;
    private JTextArea txtaMostrar;
    
    public Ejercicio4() {
        super("BOXLAYOUT");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanelSuperior();
        PanelCentral();
        PanelBotones();
        PanelInferior();
        Ventana();
    }
    
    public void PanelSuperior(){
        pnlSuperior =new JPanel();
        lblName= new JLabel("Nombre: ");
        txtName = new JTextField(10);
        pnlSuperior.setLayout(new BoxLayout(
                pnlSuperior, BoxLayout.X_AXIS));
        pnlSuperior.add(lblName);
        pnlSuperior.add(txtName);
    }
    
    public void PanelCentral(){
        pnlMedio=new JPanel();
        lblApellido= new JLabel("Apellido: ");
        txtApellido = new JTextField(10);
        pnlMedio.setLayout(new BoxLayout(pnlMedio, BoxLayout.X_AXIS));
        pnlMedio.add(lblApellido);
        pnlMedio.add(txtApellido);
    }
    
    public void PanelBotones(){
        pnlBotones = new JPanel();
        btnAgregar= new JButton("Agregar");
        btnAgregar.addActionListener(e -> {
            String nombre = txtName.getText();
            String apellido = txtApellido.getText();
                      
            txtaMostrar.append(nombre+"\t"+apellido+"\n");
            
            txtName.setText(null);
            txtApellido.setText(null);
        });
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(e -> {
            
            txtaMostrar.setText(null);
            txtaMostrar.append("   Nombre \tApellido\n");
        });
        
        pnlBotones.setLayout(new BoxLayout(
                pnlBotones,BoxLayout.LINE_AXIS));
        pnlBotones.add(btnAgregar);
        pnlBotones.add(btnLimpiar);
    }
    
    public void PanelInferior(){
        pnlInferior = new JPanel();
        txtaMostrar = new JTextArea(10,10);
        pnlInferior.setLayout(new BoxLayout(
                pnlInferior,BoxLayout.X_AXIS));
        pnlInferior.add(txtaMostrar);
    }
    
    public void Ventana(){
        lblDatos = new JLabel("Ingrese los siguientes datos");
        setLayout(new BorderLayout());
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(lblDatos);
        add(pnlSuperior);
        add(pnlMedio);
        add(pnlBotones);
        lblMostrar = new JLabel("Datos");
        add(lblMostrar);
        
        txtaMostrar.append("   Nombre \tApellido\n");
        add(pnlInferior);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio4();
    }
}
