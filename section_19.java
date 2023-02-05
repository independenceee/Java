import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();


        list.add("Nguyen");
        list.add("Duy");
        list.add("Khanh");
        list.add("Nguyen");

        // list.get(index);
        // list.set(index, element);
        // list.remove(index);
        // list.clear(index);

        list.set(5, "Giang");
        list.set(6);
        list.clear();


        for(int i=0;i<list.size();i++) {

            System.out.println(list.get(i));

        }
}