import java.awt.*;
import java.awt.event.*;
import java.swing.*;


public class Main {
    public static void main(String[] args) {

        new MyFrame();

    }
}


public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton humburgerButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon humburgerIcon;
    ImageIcon hotdogIcon;

    MyFrame() {
        this.setDefaultCloseOption(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("pizza.png");
        humburgerIcon = new ImageIcon("humburger.png");
        hotdogIcon = new ImageIcon("hotdog.png");

        pizzaButton = new JRadioButton("pizza");
        pizzaButton.setIcon(pizzaIcon);

        humburgerButton = new JRadioButton("humburger");
        humburgerButton.setIcon(humburgerIcon);

        hotdogButton = new JRadioButton("hotdog");
        hotdogButton.setIcon(hotdogIcon);


        group.add(pizzaButton);
        group.add(humburgerButton);
        group.add(hotdogButton);

        ButtonGroup group = new ButtonGroup();

        pizzaButton.addActionListener(this);
        humburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);



        this.add(pizzaButton);
        this.add(humburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(e.getSource() == pizzaButton) {
            System.out.println("Pizza");
        } else if(event.getSource() == humburgerButton ) {
            System.out.println("Humburger");
        } else if(event.getSource() == hotdogButton) {
            System.out.println("Hot Dog");
        }
    }
}