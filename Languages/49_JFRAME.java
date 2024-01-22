import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main {

    public static void main(String[] args) {

        // JFrame frame = new JFrame(); // create a frame
        // frame.setTitle("JFrame title goes here"); // set title of frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.HIRE_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // frame.setResizable(false); // prevent resizing
        // frame.setSize(420,420); // set size 
        // frame.setVisible(true); // make frame visible

        // ImageIcon image = new ImageIcon("logo.png"); // import file image
        // frame.setIconImage(image.getImage()); // change icon to iframe
        // frame.getContentPane().setBackground(Color.green); // set background
        // frame.getContentPane().setBackground(new Color(0,0,0)); // set background
        // frame.getContentPane().setBackground(new Color(0x12345)); // set background

        MyFrame myFrame = new MyFrame();

    }

}


public class MyFrame extends Frame {
    MyFrame() {
         JFrame frame = new JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.HIRE_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false); // prevent resizing
        frame.setSize(420,420); // set size 
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("logo.png"); // import file image
        frame.setIconImage(image.getImage()); // change icon to iframe
        frame.getContentPane().setBackground(Color.green); // set background
        frame.getContentPane().setBackground(new Color(0,0,0)); // set background
        frame.getContentPane().setBackground(new Color(0x12345)); // set background
    }
}
