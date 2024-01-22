// inheritance : quá trình kế thừa lớp 
// các thuộc tính và phương thức của lớp


public class Main {


    public static void main(String[] args) {

        Car car = new Car();
        car.go();


        Bycycle bike = new Bycycle();
        bike.stop();


        bike.speed;
        car.speed;
    }
}




public class Vehicle {
    double speed;

    void go() {
        System.out.println("Vehicle Go");
    }
    void stop() {
        System.out.println("Vehicle Stop");
    }
}


public class Car extends Vehicle  {
    int wheels = 4;
    boolean door= true;
}


public class Bycycle extends Vehicle {
    int wheels = 2;
    boolean door = false;
}
