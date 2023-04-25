import javax.swing.JOptionPane;



public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "This is some useless info", 'title', JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", 'title', JOptionPane.INFOMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", 'title', JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", 'title', JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", 'title', JOptionPane.ERORR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "quét nhà", 'title', JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showConfirmDialog(null, "quét nhà", 'title', JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println( JOptionPane.showConfirmDialog(null, "quét nhà", 'title', JOptionPane.YES_NO_CANCEL_OPTION));
        

        String name = JOptionPane.showInputDialog("What is your name", );
        System.out.println("Name"+ name);

        String[] response = {
            "", 
            "", 
            ""
        }

        ImageIcon icon = new ImageIcon("");

        JOptionPane.showOptionDialog(
            null,
            "You are awesome"
            , "serect message"
            , JOptionPane.YES_NO_CANCEL_OPTION
            ,JOptionPane.INFORMATION_MESSAGE
            ,icon, 
            response,
             0)
    }

}
