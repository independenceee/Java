// Key Listeners

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class Main {

    public static void main(String[] arguments) {
        
        new MyFrame();

    } 

}




public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        this.addKeyListener(this);

        icon = new ImageIcon("roket.png");
        label.setIcon(icon)l


        label = new  JLabel();
        label.setBounds(x, y, width, height); // tạo ra ô vuông có with và height
        label.setBackground(Color.RED);
        label.setOpaque(true);


        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
    }
    

    @Override
    public void keyTyped(KeyEvent event) {
        switch(event.getKeyChar()) {
            case "a": label.setLocation(label.getX() -1, label.getY());
                break;
            case "w": label.setLocation(label.getX(), label.getY() -1);
                break;
            case "s": label.setLocation(label.getX(), label.getY() + 1);
                break;
            case "d": label.setLocation(label.getX() +1, label.getY());
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent event) {
        switch(event.getKeyChar()) {
            case 37: label.setLocation(label.getX() -1, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY() -1);
                break;
            case 39: label.setLocation(label.getX(), label.getY() + 1);
                break;
            case 40: label.setLocation(label.getX() +1, label.getY());
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent event) {
        System.out.println(event.getKeyChar());// đưa ra các dấu ấn
        System.out.println(event.getKeyCode());
    }

}
