import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Main {

     public static void main(String[] args) {



     }
}


public class MyFrame extends JFrame ActionListener {

    JButton button;
    JCheckBox checkbox;
    ImageIcon xIcon;
    ImageIcon yIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("x.png");
        yIcon = new ImageIcon("y.png");

        JCheckBox checkbox = new JCheckBox();
        JButton button = new JButton();
        button.setText("Submit");
        button.setActionListener(this);

        checkbox.setText("I am not a robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 20));

        checkbox.setIcon(xIcon);
        checkbox.setSlectedIcon(yIcon);

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button) {

            System.out.println(checkbox.isSelected());

        }

    }

} 
