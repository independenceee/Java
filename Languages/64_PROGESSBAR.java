// Progess Bar
import java.awt.*;
import javax.swing.*;



public class Main {

    public static void main(String[] args) {

        ProgressBarDemo demo = new ProgressBarDemo();

    }

}


public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Arial", Font.BOLD));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void fill() {
        int counter = 0;
        while(counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }


        bar.setString("Done!")
     }

}
