import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Font;




public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("index.png");
        Border border = new BorderFactory.createLineBorder(Color.green, 3);


        JLabel label = new JLabel();
        label.setText("Bro, do you code even"); // set text label
        label.setIcon(image); // set icon image
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT, BOTTOM of imageicon
        label.setVerticalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT, BOTTOM of imageicon
        label.setForeground(new Color(0, 0, 0, 0)); // set text color 
        label.setFont(new Font("Arial", Font.PLAIN, 20)); // set font
        label.setIconTextGap(100); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border
        label.setVericalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAligment(JLabel.CENTER); // set horizontal position of icon + text within label
        label.setBounds(x, y, width, height); // position within frame as well as dimesions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // set default position not use with height
    }
}