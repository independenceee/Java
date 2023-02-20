import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException{
        Scanner scanner = new Scanner(System.io);

        File file = new File("index.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";

    }

}