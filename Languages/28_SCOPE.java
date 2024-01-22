// local 
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DiceRoller  diceroller = new DiceRoller();

    }

}



public class DiceRoller {

    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) +1;
        System.out.println(number);
    }
}

// global


import java.util.Random;
public class Main {
    public static void main(String[] args) {
        DiceRoller  diceroller = new DiceRoller();
    }
}

public class DiceRoller {
    random = new Random();
    int number;

    DiceRoller() {
       random = new Random();
       roll();
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) +1;
        System.out.println(number);
    }

}
