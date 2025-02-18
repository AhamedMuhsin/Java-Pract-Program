import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pract7_b extends JFrame implements ActionListener{
    JButton b1;
    JButton b2;
    JLabel l1;
    JLabel l2;
    JTextField t3;
    JTextField t1;
    JTextField t2;
    Pract7_b(){
        setTitle("Simple Calculator");
        setLayout(new GridLayout(4,2));
        b1 = new JButton("+");
        b2 = new JButton("-");
        l1 = new JLabel();
        l2 = new JLabel();
        t3 = new JTextField(10);
        t1 = new JTextField(10);
        t2 = new JTextField(10); 
        add(l1);
        add(t1);
        add(l2);
        add(t2);        
        l1.setText("Enter First Number : ");
        l2.setText("Enter Second Number : ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(b1);
        add(b2);
        add(t3);
        t3.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(500,500);
        //f.setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s = t1.getText();
        String s1 = t2.getText();
        int x = Integer.parseInt(s);
        int y = Integer.parseInt(s1);
        int c = 0;
        if(e.getSource()==b1){
            c= x+y;
        }else if(e.getSource()==b2){
            c=x-y;
        }
        String res = Integer.toString(c);
        t3.setText(res);
    }
    public static void main(String args[]){
        new Pract7_b();
    }
}

