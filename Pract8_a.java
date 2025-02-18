//8_a actionevent
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pract8_a extends JFrame implements ActionListener{
    JButton b1;
    JLabel l1;
    Pract8_a(){
        setTitle("Button Example");
        b1 = new JButton("Click Me!");
        l1 = new JLabel();
        setLayout(new FlowLayout());
        add(l1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(b1);
        b1.addActionListener(this);
        setSize(500,500);
        //f.setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        l1.setText("Welcome");
    }
    public static void main(String args[]){
        new Pract8_a();
    }
}