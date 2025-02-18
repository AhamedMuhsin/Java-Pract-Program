//10 Demonstrate the use of Anonymous Inner Class in Event Handling 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Pract10 extends JFrame implements ItemListener{
    JComboBox clr;
    Container c;
    public Pract10(){
        c = getContentPane();
        setLayout(new FlowLayout());
        clr = new JComboBox();
        clr.addItem("Red");
        clr.addItem("Green");
        clr.addItem("Blue");
        clr.addItem("Pink");
        clr.addItemListener(this);
        add(clr);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setSize(400,400);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        String s = (String) clr.getSelectedItem();
        int n = clr.getSelectedIndex();
        System.out.println("Selected Color: "+s+"\nSelected Index: "+n);
        if(s.equals("Red"))
            c.setBackground(Color.RED);
        else if(s.equals("Green"))
            c.setBackground(Color.GREEN);
        else if(s.equals("Blue"))
            c.setBackground(Color.BLUE);
        else if(s.equals("Pink"))
            c.setBackground(Color.PINK);
    }
    public static void main(String[] args) {
        new Pract10();
    }
}
