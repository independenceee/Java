public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        char[] characters = new char[3];
        String[] strings = new String[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hotdog");
        Food food3 = new Food("Humburgers");
        Food[] foods = new Food[3];

        Food[] foods = {food1, food2, food3};


        foods[0] = food1;
        foods[1] = food2;
        foods[2] = food3;

        System.out.println(foods[0].name);
        System.out.println(foods[2].name);
        System.out.println(foods[3].name);

    }



}


public class Food {

    String name;
    Food(String name)  {
        this.name = name;
    }
}