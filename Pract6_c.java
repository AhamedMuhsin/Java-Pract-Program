//6_c Create a Swing application to demonstrate use of scrollpane to change its color selected using colour chooser.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class pract6_c extends JFrame implements ActionListener{
    JButton b;
    Container c;
    pract6_c(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("Color");
        b.addActionListener(this);
        c.add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
    }
    public void actionPerformed(ActionEvent e){
        Color intial = Color.red;
        Color color = JColorChooser.showDialog(this,"Select Color", intial);
        c.setBackground(color);
    }
    public static void main(String args[]){
        new pract6_c();
    }
}
