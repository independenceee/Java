import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {

        // MyInterface myInterface = new MyInterface() {

        //     public void message();

        // }

        // String name = "Nguyễn Khánh";

        // MyInterface myInterface = (name) -> {
        //     System.out.println("Hello");
        // }


        // myInterface.message();




    }

}




public class MyFrame extends JFrame {

    JButton myButton = new JButton("Submit");

    MyFrame() {
        myButton.setBounds(100, 100, 100, 100);
        myButton.addActionListener(
            (e) -> System.out.println("Nguyễn Duy Khánh");

        )

        // có thể set nhiều button

        this.add(myButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(true);
        this.setVisible(true);
    }


}





@FunctionalInterface
public interface MyInterface {

    public void message(String name);

}
