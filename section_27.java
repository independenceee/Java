
public class Main {
    public static void main(String[] args) {

        Human human = new Human("Khanh", 20, 70);
        Human human2 = new Human("Independence", 20, 68);
        System.out.println(human.name);

        human2.eat();
        human1.drink();

    }
}

public class Human {
   String name;
   int age;
   double weight;

    Human(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + ": " + this.age);
    }

    void drink() {
        System.out.println(this.name + " drinks");
    }

}