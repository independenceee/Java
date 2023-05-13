import java.io.File;

public class Main {
    public static void main(String[] args ) {

        File file = new File("index.txt");
        File file = new File("C:/Users/Cakow/Desktop/secret_message.txt");

        if(file.exists()) {
            System.out.println("File exists");
            System.out.println(file.getPath()); // index.txt
            System.out.println(file.getAbsolutePath()); // C:/Users/Cakow/Desktop/secret_message.txt
            System.out.println(file.isFile()); // true - false
            file.delete();
        } else {
            System.out.println("File is not found");
        }


    }
}
