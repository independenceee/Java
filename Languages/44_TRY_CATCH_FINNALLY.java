import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a whole number to devide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to devide: ");
            int y = scanner.nextInt();
            int z = x/y;
            System.out.println("result: " + z);
        } catch(Arithetic e) {
            System.out.println(e);
        } catch(Input e) {
            System.out.println(e);
        } finally {
            System.out.println("Error");
            scanner.close();
        }
    }
}
