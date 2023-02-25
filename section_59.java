import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

    }

}


public class MyFrame extends JFrame implements ActionListener {


    JButton button;
    JTextField textField;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Submit");
        button.addActionListener(this);

        JTextField textField = new JTextField();
        textField.setPreferredSize( new Dimension(250, 40));
        textField.setFont(new Font("Arial", Font.BOLD, 25));
        textField.setForeground(new Color(255, 255, 255));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("username");
        textFeild.setEditable(false); // not working

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button) {

            System.out.println("Welcome "+ textField.getText());
            button.setEnabled(true);
            textField.setEditable(false);
            
        }

    }

}