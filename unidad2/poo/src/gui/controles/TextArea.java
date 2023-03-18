/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Nico
 */
public class TextArea extends JFrame {
    JTextField txtNum1, txtNum2;
    JTextArea textArea;
    
    public TextArea(){
        
        super("Tabla de Multiplicar");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        txtNum1 = new JTextField(10);
        txtNum2 = new JTextField(10);
        
        JButton btnMostrar = new JButton("Mostrar");
        
        btnMostrar.addActionListener(e ->{
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            
            textArea.setText("");
            
            for (int i = 1; i <= n2; i++) {
                textArea.append(n1+"x"+i+"="+(n1*i)+"\n"); 
            }
            
        });
        
        textArea = new JTextArea(20, 50);
        
        add(txtNum1);
        add(txtNum2);
        add(btnMostrar);
        add(textArea);
        
        if(txtNum1== null && txtNum2==null){
            System.out.println("Campo vacio");
        }else{
            System.out.println("Tabla del: "+txtNum1);
        }
    }

    public static void main(String[] args) {
        TextArea app = new TextArea();
        app.setVisible(true);
    }
}
