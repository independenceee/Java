
public class Main {

    public static void main(String[] args) {
        
        Car myCar = new Car();
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println();
        myCar.driver();
        myCar.brake();

    }

}

public class Car {
    String name = "mercedes";
    String model = "2019";
    int year = 2019;
    String color = "blue";
    double price = 50000.00;

    void driver() {
        System.out.println("Driver in charge");
    }

    void brake() {
        System.out.println("Bravo in charge");
    }
}