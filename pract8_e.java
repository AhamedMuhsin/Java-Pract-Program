
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pract8_e extends JFrame implements FocusListener {
    JTextField t1;
    JPasswordField p1;
    pract8_e(){
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Enter UserId : "));
        t1 = new JTextField(20);
        panel1.add(t1);
        add(panel1,"North");
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Enter Password : "));
        p1=new JPasswordField(20);
        panel2.add(p1);
        add(panel2);
        t1.addFocusListener(this);
        p1.addFocusListener(this);
    }
    public void focusGained(FocusEvent e){
        Component c = (Component)e.getSource();
        Color green = new Color(0,200,0);
        c.setBackground(green);
    }
    public void focusLost(FocusEvent e){
        Component c = (Component)e.getSource();
        Color white = new Color(255,255,255);
        c.setBackground(white);
    }
    public static void main(String[] args){
        pract8_e frame = new pract8_e();
        frame.setTitle("FocusLisetener java explain");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
