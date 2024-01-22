import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> list = new ArrayList<String>();


        ArrayList<String> foodList = new ArrayList();
        foodList.add("Apple");
        foodList.add("Orange");
        foodList.add("Chocolate");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("coffee");
        drinkList.add("butterfly");
        drinkList.add("puppy");


        groceryList.add(foodList, drinkList);


        System.out.println(groceryList.get(0).get(0));
    }
}
