import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// AND &&
		// OR ||
		// NOT !
		int temp = 25;
		if( temp > 30) {
			System.out.println("It is hot outside");

		} else if( temp >=20 && temp <=30) {
			System.out.println("It is warm outside");

		} else {
			System.out.println("It is cold outside");
		}


		Scanner  scanner = new Scanner(System.in);
		System.out.println("You are playing a game\nPress q orQ to quit");
		String response = scanner.next();

		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You are quit the game");
		} else {
			System.out.println("You are still playing the game");
		}

	}
}


import java.util.Scanner;

public class Main {

	public static void main( String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("You are playing the game\nPress q or Q to quit!");;
		String response = scanner.next();

		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing the game");
		} else {
			System.out.println("You are quit the game");
		}
	}
}
