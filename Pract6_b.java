//6_b Create a Swing application to demonstrate use of TextArea using scrollpane to show contest of text file in textarea selected using file chooser. 
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;
public class Pract6_b extends JFrame implements ActionListener{
    JTextArea textArea = new JTextArea();
    JMenuBar menubar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem open = new JMenuItem("open");
    JMenuItem close = new JMenuItem("close");
    public Pract6_b(){
        setTitle("Opening text file");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        menubar.add(file);
        textArea= new JTextArea(40,40);
        file.setText("file");
        file.add(open);
        file.add(close);
        setJMenuBar(menubar);
        open.setText("open");
        close.setText("close");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JScrollPane js = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(js);
        open.addActionListener(this);
        close.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==open) {
            try{
                JFileChooser open1 = new JFileChooser();
                int option = open1.showOpenDialog(this);
                File f1 = new File(open1.getSelectedFile().getPath());
                FileReader fr = new FileReader(f1);
                BufferedReader br = new BufferedReader(fr);
                String s;
                while ((s=br.readLine())!=null) {
                    textArea.append(s+"\n");
                }
                fr.close();
            }catch(Exception ae){
                System.out.println("ae");
            }
        }
        else if (e.getSource() == close) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Pract6_b x = new Pract6_b();
    }
}
