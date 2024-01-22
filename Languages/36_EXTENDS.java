public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Batman", 42,);
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);


    }
}


public class Person {
    String name;
    String age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString () {
        return this.name + " " + this.age;
    }
}

public class Hero extends Person {

    String power;
    
    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString () {
        return super.toString() + " " + this.power;
    }
}
