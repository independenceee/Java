import javax.swing.JFrame;
import javax.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing;



public class Main {

    public static void main(String[] args) {



    }

}

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("index.png");
        ImageIcon icon2 = new ImageIcon("face.png");
        label = new JLabel();

        label.setIcon(icon2);
        icon2.setBounds(x , y, width , height);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(x, y, width, height);
        button.addActionListener(e -> System.out.println("pô"));
        button.setText("button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setVericalAlignment(JLabel.CENTER); // căn trên dưới
        button.setHorizontalAligment(JLabel.CENTER); // căn trái phải
        button.setFont(new Font("Arial", Font.BOLD));
        button.setIconTextGap(-15);
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEtcheBorder());
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            label.setVisible(true);
            System.out.println("Click");
            button.setEnabled(false);
        }
    }

}