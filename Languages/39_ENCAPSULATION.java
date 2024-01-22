// Encapsulation =  các thuộc tính của lớp sẽ bị ẩn hoặc riêng tư

public class Main {
    public static void main(String[] args) {

        Car  car = new Car("", "", 2023);
        System.out.println(car.getMake());       

    }
}

public class Car {
    private String make;
    private String model;
    private int year;


    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.getYear(x.getYear());
    }
}
