// JSlider

import java.awt.*;
import java.swing.*;
import javax.swing.event.*;

public class Main {
    public static void main(String[] args) {
        SilderDemo silderDemo = new SilderDemo();
    }
}


public class SilderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SilderDemo() {

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Arial", Font.BOLD, 15));
        label.setFont(new Font("Arial", Font.BOLD, 15));

        slider.setOrientation(SwingConstants.VERTICAL); // dọc
        slider.setHorizontalAlignment(SwingConstants.HORIZONTAL); // ngang -> default


        label.setText("*C = " + slider.getValue() )


        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420, 420);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent event) {
        label.setText("*C = " + slider.getValue());
    }

}