import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
       try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.println((char)data );
                int data = reader.read();
            }
            reader.close();
       } catch(FileNotFoundException error) {
            error.printStackTrace();
       }

    }
} 
