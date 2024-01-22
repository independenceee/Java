// toString() : phương thức đặc biệt mà tất cả đối tượng 
// kế thừa trả về một chuỗi đại diện bằng văn bản cho một đối tượng
// có thể được sử dụng ngầm và rõ ràng.


public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.toString());

    }

}

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2022;

    Car() {

    }


    public String toString() {

        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;

    }

}
