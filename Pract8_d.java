//8_d selectionevent
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pract8_d extends JFrame implements ItemListener{
    JPanel northpanel,southpanel;
    JTextField jfield;
    JCheckBox java,oops,python;
    JRadioButton theory,practical;
    ButtonGroup bg;
    public Pract8_d(){
        northpanel = new JPanel();
        southpanel = new JPanel();
        northpanel.setBackground(Color.pink);
        southpanel.setBackground(Color.magenta);
        jfield = new JTextField("click and see");
        jfield.setBackground(Color.cyan);
        java = new JCheckBox("Java");
        oops = new JCheckBox("oops");
        python = new JCheckBox("python");
        theory = new  JRadioButton("Theory");
        practical = new JRadioButton("Practical");
        bg = new ButtonGroup();
        bg.add(theory);
        bg.add(practical);
        northpanel.add(oops);
        northpanel.add(java);
        northpanel.add(python);
        southpanel.add(theory);
        southpanel.add(practical);
        java.addItemListener(this);
        oops.addItemListener(this);
        python.addItemListener(this);
        theory.addItemListener(this);
        practical.addItemListener(this);
        Container c = getContentPane();
        c.add(northpanel,BorderLayout.NORTH);
        c.add(southpanel,BorderLayout.SOUTH);
        c.add(jfield,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        String str = "";
        if(theory.isSelected()){
            str = " You like theory";
        }else if(practical.isSelected()){
            str = " You like practical";
        }
        jfield.setText("java : "+java.isSelected()+" oops : "+oops.isSelected()+" python : "+python.isSelected()+" and "+str);
    }
    public static void main(String[] args){
        JFrame f = new Pract8_d();
        f.setSize(400,200);
        f.setVisible(true);
    }
}
