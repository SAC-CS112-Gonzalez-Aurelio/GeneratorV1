import java.util.Scanner;

public class GeneratorGame {

	public static void main(String[] args) {
		int rand;
		int userNum;
		Scanner input = new Scanner(System.in);
		System.out.println ("Guess a number from 1 to 10: ");

		rand = 1 + (int) (Math.random() * 10);
		// system.out.printf("Debug for me only %d", rand);
		do {

			userNum = input.nextInt();

			if (userNum > rand)
				System.out.printf("Number is too big");

			if (userNum < rand)

				System.out.printf("Sorry number is too small ");

		} while (rand != userNum);
		System.out.println("Congratulations");
	}
}
