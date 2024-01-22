import java.awt.GridLayout;
import java.awt.JButton;
import javax.swing.JFrame;



public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridBagLayout(3,3 , 0, 0)); // row column gap-right-left gap-top-bottom


        // JButton button1 = new JButton("1");
        // frame.add(button1);


        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));



        frame.setVisible(true)
    }

}
