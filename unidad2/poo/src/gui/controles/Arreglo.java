package gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Arreglo extends JFrame{
    private JTextField txtCant, txtNum;
    private JTextArea mostrar;
    private int contador=0;
    private int[] numero;
    
    public Arreglo() {
        super("Arreglo");
        setSize(570, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        txtCant = new JTextField(10);
        JButton btnCrear = new JButton("Crear");
        
        txtNum = new JTextField(10);
        JButton btnAdd = new JButton("Add");
        
        JButton btnMostrar = new JButton("Mostrar");   
        
        btnCrear.addActionListener(e -> {
        
            numero = new int[Integer.parseInt(txtCant.getText())];
            mostrar.append("Se creo el arreglo\n");
            contador=0;
        
        });
        
        btnAdd.addActionListener(e ->{

            numero[contador] = Integer.parseInt(txtNum.getText());
            mostrar.append("Se agregro el numero\n");
            contador++;
            
            if(contador>= Integer.parseInt(txtCant.getText())){
                mostrar.append("Ya no se puede ingresar más datos");
            }
            
        });
        
        btnMostrar.addActionListener(e ->{
            mostrar.setText("");
            for (int i = 0; i < numero.length; i++) {
                mostrar.append(" Numero["+(i+1)+"]:"+numero[i] + "\n");
            }
            
        });
        
        mostrar = new JTextArea(20, 50);
        
        add(txtCant);
        add(btnCrear);
        add(txtNum);
        add(btnAdd);
        add(btnMostrar);
        add(mostrar);
    }
    
    public static void main(String[] args) {
        Arreglo app = new Arreglo();
        app.setVisible(true);
    }
    
}
