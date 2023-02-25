import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;


public class Main {

    public static void main(String args[]) {
    
        MyFrame();

    }
}

public class MyFrame extends JFrame implements ActionListener {

    JMenubar menubar;
    
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        JMenubar menubar = new JMenubar();
        JMenu  fileMenu = new JMenu("file");
        JMenu  editMenu = new JMenu("edit");
        JMenu  helpMenu = new JMenu("help");

        JMenuItem loadItem = new JMenuItem("load");
        JMenuItem saveItem = new JMenuItem("save");
        JMenuItem exitItem = new JMenuItem("exit");

        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("exit.png");

        fileMenu.setMnemonic(KeyEvent.VK_M); // alt + M

        loadItem.setMnemonic(KeyEvent.VK_L); // l
        saveItem.setMnemonic(KeyEvent.VK_S); // s
        exitItem.setMnemonic(KeyEvent.VK_E); // e

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveIcon.setIcon(saveIcon);
        exitIcon.setIcon(exitIcon);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);

        this.setMenubar(menubar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource() == loadItem) {
            System.out.println("Loadding ...");
        }

        if(event.getSource() == saveItem) {
            System.out.println("Saving ...");
        }

        if(event.getSource() == exitItem) {
            System.exit(0);
        }

    }

}