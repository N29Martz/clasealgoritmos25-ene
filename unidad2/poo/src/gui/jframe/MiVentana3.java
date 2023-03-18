package gui.jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana3 extends JFrame implements ActionListener{
    
    private JTextField txtN1, txtN2;
    private JLabel lblResultado;
    private JButton btnSumar, btnRestar, btnMult, btnDividir;
    
    public MiVentana3(){
        
        super("Calculadora");
        setLayout(new FlowLayout());
        
        txtN1 = new JTextField(10);
        txtN2 = new JTextField(10);
        lblResultado = new JLabel("Resultado: ");
        
        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Resta");
        btnMult = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");
        
        add(txtN1);
        add(txtN2);
        add(lblResultado);
        add(btnSumar);
        add(btnRestar);
        add(btnMult);
        add(btnDividir);
        
        btnSumar.addActionListener(this);
        btnRestar.addActionListener(this);
        btnMult.addActionListener(this);
        btnDividir.addActionListener(this);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(txtN1.getText());
        double num2 = Double.parseDouble(txtN1.getText());
        DecimalFormat formato = new DecimalFormat("#.00");
        
        if(e.getSource() == btnSumar){
            lblResultado.setText("Resultado"+ 
                    formato.format(num1 + num2));
        } else if(e.getSource() == btnRestar){
            lblResultado.setText("Resultado"+ 
                    formato.format(num1 - num2));
        } else if(e.getSource() == btnMult){
            lblResultado.setText("Resultado"+ 
                    formato.format(num1 * num2));
        }
    }
    
    public static void main(String[] args) {
        MiVentana3 app = new MiVentana3();
        app.setSize(300,150);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
