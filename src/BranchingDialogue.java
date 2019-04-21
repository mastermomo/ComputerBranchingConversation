import java.util.*;
/**
 * @author Mohammad Abdul Ahad Khan
 * @version 1.0
 * 
 * This class represents the starting point of
 * the branching dialogue system, containing the 
 * main method for execution.
 */

public class BranchingDialogue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner object to scan a name and options given to the user

		// Objects from each of the tree branch classes.
		TreeBranchA treeBranchA = new TreeBranchA();
		TreeBranchB treeBranchB = new TreeBranchB();
		TreeBranchC treeBranchC = new TreeBranchC();

		String answer = ""; // Initializes a string as "Enter" from the user.

		// While loop that continues as long as the user presses "Enter" at the end of
		// the loop.
		while (answer.equals("")) {
			// Computer introduces itself to the user and asks for a name.
			System.out.print("Hello user! I'm your new computer! It's nice to meet you! Also, nice place you got here!"
							+ "\nWhat's your name? " 
							+ "\nType a name in and press enter: ");
			String name = scan.nextLine(); // Scans a string input from the user.
			System.out.println("");
			
			System.out.println(name + "... Oh what a lovely name!"); // The computer greets the user.
			System.out.println("");

			// The first choices provided to the user to choose from in order to proceed
			// through the dialogue tree.
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
							+ "\na) \"No it isn't...\"" 
							+ "\nb) \"It's better than \'computer\'.\""
							+ "\nc) \"Thanks, but more importantly... Why is my computer talking to me?!\"");

			String optionChosen = scan.nextLine(); // Scans for the the letter choice made by the user.

			// A branching dialogue that is a result of "a" or "A" being chosen.
			if (optionChosen.equals("a") || optionChosen.equals("A")) {
				treeBranchA.branchA(name);
			}
			// A branching dialogue that is a result of "b" or "B" being chosen.
			else if (optionChosen.equals("b") || optionChosen.equals("A")) {
				treeBranchB.branchB(name);
			}
			// A branching dialogue that is a result of "c" or "C" being chosen.
			else if (optionChosen.equals("c") || optionChosen.equals("C")) {
				treeBranchC.branchC(name);
			}
			System.out.println("");
			// Asks the user if they would like to start over in the program.
			System.out.println("Would you like to start over? " + "\nPress ENTER to start over."
					+ "\nPress anything else to quit.");
			answer = scan.nextLine(); // Determines if the while loop will continue.
		}
		System.out.println("Goodbye!"); // Dialogue given when the user quits the program.
	}
}
