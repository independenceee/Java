public class Main {

    public static void main(String[] args) {

        String[][] cars = new String[3][3];

        int[][] numbers = {
            { 1, 2, 3},
            { 2, 3, 4},
            { 3, 4, 5}
        };


        cars[0][0] = "1";
        cars[0][1] = "2";
        cars[0][2] = "3";
        cars[1][0] = "4";
        cars[1][1] = "5";
        cars[1][2] = "6";
        cars[2][0] = "7";
        cars[2][1] = "8";
        cars[2][2] = "9";

        for (int i=0;i<cars.length;i++) {
            System.out.println();

            for (int j=0;j<cars.length;j++) {

                System.out.println(cars[i][j] + "  ");

            }

        }

    }
}