public class Main {

        public static void main(String[] args) {

            Car car = new Car();
            Bicycle bicycle = new Bicycle();
            Boat boat = new Boat();


            Vehicle[] racers = {car, bicycle, boat};


            for(Vehicle x : racers) {
                x.go();
            }

        }

}


public class Vehicle {

}

public class Car extends Vehicle {

    public void go() {
        System.out.println("")
    }

}

public class Bicycle extends Vehicle {
    public void go() {
        System.out.println("")
    }
}

public class Boat extends Vehicle {

    public void go() {
        System.out.println("")
    }
}