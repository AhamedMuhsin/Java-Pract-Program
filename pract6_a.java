//6_a Create a swing application that randomly changes color on button click. 
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class pract6_a extends JFrame implements ActionListener{
    JButton b;
    Container c;     
    pract6_a(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("color");
        b.addActionListener(this);
        c.add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
    }
    public void actionPerformed(ActionEvent e){
        Random rand = new Random();
        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue= rand.nextFloat();
        Color randomColor = new Color(red,green,blue);
        c.setBackground(randomColor);
    }
    public static void main(String args[]){
        
        new pract6_a();
    }
}
