public class Main {

    public static void main(String[] args) {

        String day = "Monday";

        switch(day) {
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            case "Sunday": System.out.println("It is Sunday");
            break;
            default: System.out.println("It is an unknown day");
            break;
        }

    }
}