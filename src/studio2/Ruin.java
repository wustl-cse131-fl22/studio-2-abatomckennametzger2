package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money are you starting with?");
		double startAmount = in.nextDouble();
		double original = startAmount;

		System.out.println("What is your probability of winning?");
		double winChance = in.nextDouble();

		System.out.println("What is your win limit (ie: amount of money you want to make"
				+ " before caling the day a success and leaving");
		double winLimit = in.nextDouble();

		System.out.println("How many days would you like to play?");
		int totalSimulations = in.nextInt();

		for (int day = 1; day <= totalSimulations; day++) {

			while ((startAmount < winLimit) && (startAmount > 0)) {

				if (Math.random() <= winChance) {
					startAmount++;
					
				} else {
					startAmount--;
				}
				if (startAmount == 0) {
					System.out.println("Ruin on day" + day);
				} if (startAmount == winLimit) {
					System.out.println("SUCCESS on day " + day);
				} 

			}
			startAmount = original;
		}

	}

}
