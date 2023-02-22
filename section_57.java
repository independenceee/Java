import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

    }
}

public class LaunchPage implements ActionListener {


    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");
    LaunchPage() {


        myButton.setBounds(100, 160, 200 , 400);
        myButton.setFocusable(true);
        myButton.addActionListener(this);


        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myButton) {
            frame.dispose(); // chỉ tạo ra một win dow mới
            NewWindow myWindow = new NewWindow() ;
        }
    }

}

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    NewWindow() {

        label.setBounds(0,0,100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}