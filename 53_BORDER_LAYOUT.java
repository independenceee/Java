import java.awt.BorderLayout;

public class Main {

    public static void main(String[] args) {

        // quản lý bố cục: xác định bố cục tự nhiên của các thành phần bên trong vùng chứa
        // đặt thành phần trong các khu vực đông, tây, nam, bắc, trung tâm
        // tất cả không gian được thêm ở khu vực trung tâm

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hiển thị x button /close
        frame.setSize(500, 500); // set with, height
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true); // hiển thị

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.orange);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        

    }

}
