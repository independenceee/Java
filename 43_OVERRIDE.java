import Java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal;

        System.out.println("What is animal? for want ?");
        System.out.println("1 = dog, 2 = cat");

        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if(choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice is not invalid")
        }
    }
}


public class Animal {
    public void speak() {
        System.out.println("Animal");
    }
}

public class Cat extends Animal {


    @Override
    public void speak() {
        System.out.println("Dog goes park")
    }
}

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Dog goes park")
    }
}
