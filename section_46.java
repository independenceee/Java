import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red");
            write.append("\n(Apoem by default)");
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}