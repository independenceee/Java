


public class Main {
    public static void main(String[] args) {

        String[] cars = {"BMW", "MERCEDES", "Testla"};
        cars[0] = "Mustang";
        System.out.println(cars[4]);




        String[] cars = new String[3];

        cars[0] = "BMW";
        cars[1] = "Testla";
        cars[2] = "Mustang";


        for(int i=1;i< cars.length;i++) {

            System.out.println(cars[i]);

        }

    }
}
