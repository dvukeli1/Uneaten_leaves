/**
 * 
 */
package controller;

import java.util.Scanner;

public class Main {

	static String consoleInput = "";
	private static int uneatenCount;
	private static Scanner scanner;
	static int leavesNumber = -1;
	static int[] caterpillarPosition = new int[0];

	public static void main(String[] args) throws Exception {
		
		LeavesCounter leavesCounter = new LeavesCounterImpl();
		UserInput input = new UserInputImpl();
		clearConsole();

		input("Insert number of leaves ( 1-10) :");
		leavesNumber = input.numberOfLeaves(consoleInput);
		while (leavesNumber == -1) {
			System.out.println("Wrong input !!");
			input("\nInsert number of leaves ( 1-10) :");
			leavesNumber = input.numberOfLeaves(consoleInput);
		}
		input("Insert caterpilar position (x,y,z) : ");
		caterpillarPosition = input.caterpillarsPosition(consoleInput);
		while (caterpillarPosition.length == 0) {
			System.out.println("Wrong input !!");
			input("\nInsert caterpilar position (x,y,z) : ");
			caterpillarPosition = input.caterpillarsPosition(consoleInput);
		}
		uneatenCount = leavesCounter.uneatenLeavesCounter(leavesNumber, caterpillarPosition);
		System.out.println("There are " + uneatenCount + " leaves left uneaten");

	}

	/**
	 * User input 
	 * @param text - question
	 * @return user consoleInput
	 */
	private static void input(String text) {
		System.out.println(text);
		scanner = new Scanner(System.in);
		consoleInput = scanner.nextLine();
		//return consoleInput;
	}

	/**
	 * Clear console function
	 */
	private final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name"); // get OS name

			if (os.contains("Windows")) // windows function
			{
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear"); // unix function
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}
}
