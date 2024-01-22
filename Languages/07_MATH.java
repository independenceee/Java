import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double z = Math.min(x, y);
        double z = Math.abs(x, y);
        double z = Math.sqrt(x, y);
        double z = Math.pow(x, y);
        double z = Math.floor(x, y);

        double a;
        double b;
        double c;
        double d;
        double e;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        a = scanner.nextDouble();

        System.out.println("Enter side y: ");
        b = scanner.nextDouble();

        double f = Math.sqrt((x*x) + (y*y));

        System.out.println("Result: "+ f);
        scanner.close();

        System.out.println(z);
    } 
}
