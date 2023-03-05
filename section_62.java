// JCommonBox


public class Main {

    public static void main(String[] args) {

        

    }

}




public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox

    MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] aninals = { "Dog", "Cat", "Bird"};
        Interger[] numbers =  { 1 ,2 , 3};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        comboBox.setEditable(true); // Đổi tên sự lựa chọn thành input
        comboBox.getItemCount(); // số lượng item sự lựa chọn
        comboBox.addItem("Horse"); // thêm items
        comboBox.insertItemAt(item, index); // chèn phần tử vào chỉ số
        comboBox.setSelectedIndex(0); // ràng buộc một chỉ số
        comboBox.removeItem("cat"); // xóa Items
        comboBox.removeItemAt(0); // xóa Items ở index
        comboBox.removeAllItems(); // xóa Items all


        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == comboBox) {
           System.out.println( comboBox.getSelectedItems()); // phần tử
           System.out.println( comboBox.getSelectedIndex()); // chỉ số
        }
    }
   
}
 