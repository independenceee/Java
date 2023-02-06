// override: Khai báo một phương thức trong lớp con
// mà đã có sẵn trong lớp cha, được thể hiện để một lớp con 
// có thể đưa ra để triển khai cho riêng mình


public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak();
        
    }

}


public class Animal {
    void speak () {
        System.out.println("Barking up ...");
    }
}

public class Dog extends Animal {

    @Override
    void speak () {
        System.out.println("Barking up ...");
    }
}