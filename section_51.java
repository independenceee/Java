import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;


public class Main {

    public static void main(String[] args) {

        ImageIcon icon  = new ImageIcon("index.png");


        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVericalAlignment(JLabel.TOP); // căn trên dưới
        label.setHorizontalAligment(JLabel.TOP); // căn trái phải


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(x, y, width, height);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.red);
        bluePanel.setBounds(x, y, width, height);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.red);
        greenPanel.setBounds(x, y, width, height);
        greenPanel.setLayout(new BorderLayout());



        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);


        
        redPanel.add(label);
        bluePanel.add(label);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }

}