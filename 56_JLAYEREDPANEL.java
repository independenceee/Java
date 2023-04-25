import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLayeredPane: cung cấp thành thần thứ 3 
        // tại định vị bán độ sâu z-index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.RED);
        label2.setBounds(100, 100, 200, 200);


        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.RED);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBuonds(0, 0, 500, 500);

        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label1, Interget.valueOf(0)); // zindex
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);


        // default -> Palette -> Modal -> PopUp -> Drag :: thứ tự hiển thị

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(true);
        frame.setVisible(true);

    }
}
