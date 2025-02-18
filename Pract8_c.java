
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pract8_c extends JFrame implements KeyListener{
    JLabel l1,l2;
    JTextField t1;

    public Pract8_c(){
        setLayout(new FlowLayout());
        l1 = new JLabel("Enter character");
        l2 = new JLabel("",JLabel.CENTER);
        add(l1);
        t1 = new JTextField(20);
        add(t1);
        add(l2);
        t1.addKeyListener(this);
        setVisible(true);
        setSize(400,200);
    }
    public void keyPressed(KeyEvent e){
        l2.setText("key down");
    }
    public void keyReleased(KeyEvent e){
        l2.setText("key up");
    }
    public void keyTyped(KeyEvent e){
        //l2.setText("recently typed characters are "+e.getKeyChar());
    }
    public static void main(String[] args){
        new Pract8_c();
    }
}