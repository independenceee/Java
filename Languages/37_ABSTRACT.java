// abstract = các lớp trừu tượng không thể được khởi tạo
// nhưng chúng có thể có một phương thức trừu tượng của lớp, 
// được khai báo mà không cần triển khai    


public class Main {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();
    }
}

public class Car extends Vehicle {
    @override
    void go() {
        System.out.println("Go")
    }
}


public abstract class Vehicle {
    abstract void go();
}
