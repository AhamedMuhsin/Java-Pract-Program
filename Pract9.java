//9 Demonstrate the use of Adapter Class in Event Handling 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JFrame;
public class Pract9 extends MouseAdapter{
    JFrame f;
    public Pract9(){
        f=new JFrame("Mouse Adapter");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        f.addMouseMotionListener(this);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseMoved(MouseEvent e){
        Random r = new Random();
        Graphics g = f.getGraphics();
        Color c = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        g.setColor(c);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }
    public static void main(String[] args) {
        new Pract9();
    }
}
