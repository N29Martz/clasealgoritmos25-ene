package forolayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Uso de GridLayou
 * @author Nico
 */
public final class Ejercicio3 extends JFrame{
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JPanel pnlBotones;
    
    public Ejercicio3() {
        
        super("GRIDLAYOU");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        pnlBotones = new JPanel();
        setContentPane(pnlBotones);
        pnlBotones.setLayout(new GridLayout(3,3));
        
        
        btn1 = new JButton("O");
        btn1.addActionListener(e -> {
            if(btn1.getText().equals("O")){
                btn1.setText("X");
            }else{
                btn1.setText("O");
            }
        });
        btn2 = new JButton("X");
        btn2.addActionListener(e -> {
            if(btn2.getText().equals("O")){
                btn2.setText("X");
            }else{
                btn2.setText("O");
            }
        });
        btn3 = new JButton("O");
        btn3.addActionListener(e -> {
            if(btn3.getText().equals("O")){
                btn3.setText("X");
            }else{
                btn3.setText("O");
            }
        });
        btn4 = new JButton("X");
        btn4.addActionListener(e -> {
            if(btn4.getText().equals("O")){
                btn4.setText("X");
            }else{
                btn4.setText("O");
            }
        });
        btn5 = new JButton("O");
        btn5.addActionListener(e -> {
            if(btn5.getText().equals("O")){
                btn5.setText("X");
            }else{
                btn5.setText("O");
            }
        });
        btn6 = new JButton("X");
        btn6.addActionListener(e -> {
            if(btn6.getText().equals("O")){
                btn6.setText("X");
            }else{
                btn6.setText("O");
            }
        });
        btn7 = new JButton("O");
        btn7.addActionListener(e -> {
            if(btn7.getText().equals("O")){
                btn7.setText("X");
            }else{
                btn7.setText("O");
            }
        });
        btn8 = new JButton("X");
        btn8.addActionListener(e -> {
            if(btn8.getText().equals("O")){
                btn8.setText("X");
            }else{
                btn8.setText("O");
            }
        });
        btn9 = new JButton("O");
        btn9.addActionListener(e -> {
            if(btn9.getText().equals("O")){
                btn9.setText("X");
            }else{
                btn9.setText("O");
            }
        });
        
        pnlBotones.add(btn1);
        pnlBotones.add(btn2);
        pnlBotones.add(btn3);
        pnlBotones.add(btn4);
        pnlBotones.add(btn5);
        pnlBotones.add(btn6);
        pnlBotones.add(btn7);
        pnlBotones.add(btn8);
        pnlBotones.add(btn9);
        setVisible(true);
    }
  
    public static void main(String[] args) {
        new Ejercicio3();
    }
}