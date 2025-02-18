//7_c Border layout
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pract7_c extends JFrame implements AdjustmentListener {
    JScrollBar r = new JScrollBar(0, 1, 1, 0, 255);
    JScrollBar g = new JScrollBar(0, 1, 1, 0, 255);
    JScrollBar b = new JScrollBar(0, 1, 1, 0, 255);
    JLabel l;
    Container c1;
    JPanel p = new JPanel();

    public Pract7_c() {
        l = new JLabel();
        c1 = getContentPane();
        p.setLayout(new GridLayout(3, 1));
        setLayout(new BorderLayout());
        p.add(r);
        p.add(g);
        p.add(b);
        add(p, "North");
        add(l, "Center"); // Add the label to the center of the frame
        r.addAdjustmentListener(this);
        g.addAdjustmentListener(this);
        b.addAdjustmentListener(this);
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on exit
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int r1 = r.getValue(); // Get the value from the red scrollbar
        int g1 = g.getValue(); // Get the value from the green scrollbar
        int b1 = b.getValue(); // Get the value from the blue scrollbar
        Color c = new Color(r1, g1, b1);
        l.setText("Color is Red = " + r1 + " Green = " + g1 + " Blue = " + b1);
        c1.setBackground(c);
    }

    public static void main(String[] args) {
        new Pract7_c();
    }
}