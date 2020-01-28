import java.util.Random;
import java.util.Scanner;

public class RollDice {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus Casino.");
		int sides;
		char looper = 'y';

		while (looper == 'y') {
			System.out.println("How many sides should each die have?");
			sides = scnr.nextInt();

			randomDieRoll(sides);
			System.out.println("Would you like to play again? (y/n)");
			String playMore = scnr.next();
			looper = playMore.charAt(0);
		} System.out.println("Thanks for playing, goodbye");
	}

	public static void randomDieRoll(int a) {

		int a2 = (getRandomNumber(a));
		int a3 = (getRandomNumber(a));

		if (a == 6) {
			if (craps(a2, a3)) {
				System.out.println("Craps...");
			} 
		if (snakeEyes(a2, a3)) {
				System.out.println("Snake Eyes!");
			} 
		if (boxCars(a2, a3)) {
				System.out.println("Box Cars!!");

			}
		}
		System.out.println(a2);
		System.out.println(a3);
	}

	public static int dieRoll(int a) {

		int b = (int) (Math.random() * a) + 1;

		return b;
	}

	public static boolean snakeEyes(int a, int b) {
		if ((a + b == 2)) {
			return true;
		}
		return false;
	}

	public static boolean boxCars(int a, int b) {
		if ((a == b) && (a == 6)) {
			return true;
		}
		return false;
	}

	public static boolean craps(int a, int b) {
		if ((a + b == 2) || (a + b == 3) || (a + b == 12)) {
			return true;
		}
		return false;
	}

	public static int getRandomNumber(int a) {
		Random randomInt = new Random();
		int rand = randomInt.nextInt(a);
		return rand + 1;
	}
}
