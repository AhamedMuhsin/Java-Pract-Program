//7_a flow Layout
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pract7_a extends JFrame implements ActionListener{
    JButton b1;
    JLabel l1;
    JLabel l2;
    JTextField t1;
    Pract7_a(){
        setTitle("Factorial Example");
        setLayout(new FlowLayout());
        b1 = new JButton("Calculate");
        l1 = new JLabel();
        l2 = new JLabel();
        t1 = new JTextField(20);
        add(l1);
        add(l2);
        l2.setText("Enter a Number : ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(b1);
        add(t1);
        b1.addActionListener(this);
        setSize(500,500);
        //f.setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s = t1.getText();
        int x = Integer.parseInt(s);
        int f = 1;
        for(int i =1;i<=x;i++){
            f=f*i;
        }
        String res = Integer.toString(f);
        l1.setText("Factorial of "+x+" is "+res);
        
    }
    public static void main(String args[]){
        new Pract7_a();
    }
}
