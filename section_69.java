// Mourse Listener

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        new MyFrame();

    }
}   


public class MyFrame extends JFrame implements MourseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon pain;
    ImageIcon dizzy;
    ImageIcon nervous;


    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        smile = new ImageIcon("smile.png");
        pain = new ImageIcon("pain.png");
        dizzy = new ImageIcon("dizzy.png");
        nervous = new ImageIcon("nervous.png");

        this.pack();
        thí.setLocationRelativeTo(null);



        label = new JLabel();
        label.setIcon(smile);

        label.setBounds(x,y,width, height);
        label.setOpaque(true);
        this.addMourseListener(this);


        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void mourseClicked(MourseEvent event) {
        System.out.println("click");
        label.setBackground(Color.WHITE);
    }

    @Override
    public void moursePressed(MouseEvent event) {
        System.out.println("Pressed");
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        System.out.println("Released");
        label.setIcon(pain);
        
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        System.out.println("Entered");
        label.setIcon(pain);

    }

    @Override
    public void mouseExited(MouseEvent event) {
        System.out.println("Exited");
        label.setIcon(pain);
    }
}