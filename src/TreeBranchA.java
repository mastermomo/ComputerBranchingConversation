import java.util.*;
/*
 * @author Mohammad Khan
 * @version 1.0
 * 
 * This class serves as one of the three dialogue paths given to the user 
 * after their initial choice of "A" or "a" is given in response to the
 * the computer's first dialogue to them.
 */

public class TreeBranchA {
	/*
	 * Provides a branching dialogie path to the user
	 * if their first choice in response to the computer 
	 * was "A" or "a".
	 * @param name A parameter for the name the user 
	 * inputs at the beginning of the program's run.
	 */
	public void branchA(String name) {
		Scanner scan = new Scanner(System.in); // Scanner object that scans the option the user chooses when asked.
		
		// Objects from each of the dialogue classes, used to call dialogue from those classes.
		FightingDialogue fight = new FightingDialogue();
		MildDialogue question = new MildDialogue();
		FriendlyDialogue friend = new FriendlyDialogue();

		String optionChosen; // String used for letter choices given to the user.
		
		question.dontBeatYourselfUp(); // Dialogue 1 from MildDialogue - "Huh, why would you say that???"
		System.out.println("");

		// Dialogue options provide to the user to move forward.
		System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
				+ "\na) \"Because when a computer compliments my name, I know somethings going on.\"" // Leads to dialogue from FightingDialogue
				+ "\nb) \"I dunno, I just wanted to test you. Thought I was hallucinating haha!\"" // Leads to dialogue from FriendlyDialogue
				+ "\nc) \"I wish my parents named me something better... Like... Goku.\""); // Leads to dialogue from QuestioningDialogue
		optionChosen = scan.nextLine(); // Scans for the the letter choice made by the user.

		// A branching dialogue that is a result of "a" or "A" being chosen.
		if (optionChosen.equals("a") || optionChosen.equals("A")) {
			fight.fightingWords(); // Dialogue 2 from FightingDialogue - "I'll take you on anytime, anywhere, anyday!"
			System.out.println("");
			// Dialogue options provide to the user to move forward.
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
					+ "\na) *Begin fight with Computer*" // Leads to dialogue from FightingDialogue
					+ "\nb) \"Alright, alright! Just take it easy man...\""); // Leads to dialogue from FriendlyDialogue
			String optionChosenFightOrEase = scan.nextLine(); // Scans for the next dialogue option from the user.
			
			if (optionChosenFightOrEase.equals("a") || optionChosenFightOrEase.equals("A")) {
				fight.pokemonBattleStarts(); // Dialogue 6 from FightingDialogue class - "Oh you want to fight? Okay, I choose you, 
				 							 // SQUIRTLE! \n*The computer throws a ball. It flashes and a blue reptile foaming at the 
											 // mouth appears... \nDon't let that thing bite you..."
				System.out.println("");
				// Dialogue options provide to the user to move forward.
				System.out.println("Please choose a POKEMON by typing in one of the following letters and pressing enter:"
						+ "\na) *Choose Pikachu*" // Activates the FightingDialogue pokemonBattlePikachu method.
						+ "\nb) *Choose Charmander*" // Activates the FightingDialogue pokemonBattleCharmander method.
						+ "\nc) *Choose Bulbasaur*"); // Activates the FightingDialogue pokemonBattleBulbasaur method.
				String optionChosenPokemonBattle = scan.nextLine(); // Scans for the the letter choice made by the user.
				
				// Pokemon battle ensues with you choosing Pikachu.
				if (optionChosenPokemonBattle.equals("a") || optionChosenPokemonBattle.equals("A")) {
					fight.pokemonBattlePikachu(name); // Leads to the end of the dialogue branch.
				}
				// Pokemon battle ensues with you choosing Charmander.
				else if (optionChosenPokemonBattle.equals("b") || optionChosenPokemonBattle.equals("B")) {
					fight.pokemonBattleCharmander(name); // Leads to the end of the dialogue branch.
				}
				// Pokemon battle ensues with you choosing Bulbasaur.
				else if (optionChosenPokemonBattle.equals("c") || optionChosenPokemonBattle.equals("C")) {
					fight.pokemonBattleBulbasaur(name); // Leads to the end of the dialogue branch.
				}
			}
			else if (optionChosenFightOrEase.equals("b") || optionChosenFightOrEase.equals("B")) {
				friend.proveYourFriendship(); // Dialogue 6 from FriendlyDialogue - "If you want me to calm down... Buy me some cake!".
				System.out.println("");
				// Dialogue options provide to the user to move forward.
				System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
						+ "\na) \"Cake?! How are you going to eat cake? The cake is a lie!\"" // FightingDialogue
						+ "\nb) *Go buy cake*"); // FriendlyDialogue
				String optionCakeOrNoCake = scan.nextLine(); // Scans for the next dialogue option from the user.
				
				if(optionCakeOrNoCake.equals("a") ||optionCakeOrNoCake.equals("A")) {
					System.out.println("");
					// Dialogue options provide to the user to move forward.
					System.out.println("You have upset the computer and now it refuses anything but battle!"
							+ "\nPlease choose a POKEMON by typing in one of the following letters and pressing enter:"
							+ "\na) *Choose Pikachu*" // Activates the FightingDialogue pokemonBattlePikachu method.
							+ "\nb) *Choose Charmander*" // Activates the FightingDialogue pokemonBattleCharmander method.
							+ "\nc) *Choose Bulbasaur*"); // Activates the FightingDialogue pokemonBattleBulbasaur method.
					String optionChosenPokemon = scan.nextLine(); // Scans for the next dialogue option from the user.
					
					// Pokemon battle ensues with you choosing Pikachu.
					if (optionChosenPokemon.equals("a") || optionChosenPokemon.equals("A")) {
						fight.pokemonBattlePikachu(name); // Leads to the end of the dialogue branch.
					}
					// Pokemon battle ensues with you choosing Charmander.
					else if (optionChosenPokemon.equals("b") || optionChosenPokemon.equals("B")) {
						fight.pokemonBattleCharmander(name); // Leads to the end of the dialogue branch.
					}
					// Pokemon battle ensues with you choosing Bulbasaur.
					else if (optionChosenPokemon.equals("c") || optionChosenPokemon.equals("C")) {
						fight.pokemonBattleBulbasaur(name); // Leads to the end of the dialogue branch.
					}
				}
				else if(optionCakeOrNoCake.equals("b") ||optionCakeOrNoCake.equals("B")) {
					friend.cakeBuy(); // Dialogue 15 from friendlyDialogue - End of Dialogue Branch (The computer just 
									  // wanted to buy cake and you get very angry).
				}
			}
			
		}
		// A branching dialogue that is a result of "b" or "B" being chosen.
		else if (optionChosen.equals("b") || optionChosen.equals("B")) {
			friend.imAliveMan(); // Dialogue 2 from FriendlyDialogue class - "Nope! You're not hallucianating. As Dr. 
								 // Frankenstien once said, \"IT'S ALIVE!!!\"".
			System.out.println("");
			// Dialogue options provide to the user to move forward.
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
					+ "\na) *Beleive computer*" // Leads to dialogue from FriendlyDialogue
					+ "\nb) \"Shut the hell up!\""); // Leads to dialogue from MildDialogue
			String optionBelieveOrBerate = scan.nextLine(); // Scans for the next dialogue option from the user.
			
			if(optionBelieveOrBerate.equals("a") || optionBelieveOrBerate.equals("A")) {
				friend.believeHallucination(); // Dialogue 16 from FriendlyDialogue - End of Dialogue Branch (You believe 
											   // the hallucination, end up hurt, and win millions in a lawsuit against the computer). 
			}
			else if(optionBelieveOrBerate.equals("b") || optionBelieveOrBerate.equals("B")) {
				question.whatTheHeckUser(); // Dialogue 17 from MildDialogue - "Jeez, what the heck is wrong with you? You 
										    // buy me and you treat me like an asshole.\nYou don't have any friends do you?!"
				System.out.println("");
				// Dialogue options provide to the user to move forward.
				System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
						+ "\na) \"... I've got lots of friends! That's it."
						+ "\n         G A U N T L E T  T H R O W N!"
						+ "\n               *Start battle*\"" // Leads to dialogue from FightingDialogue
						+ "\nb) \"Uhhh....\""); // Leads to dialogue from FriendlyDialogue
				String optionFriendsOrNone = scan.nextLine(); // Scans for the next dialogue option from the user.
				
				if(optionFriendsOrNone.equals("a") || optionFriendsOrNone.equals("A")) {
					System.out.println("");
					// Dialogue options provide to the user to move forward.
					System.out.println("You have upset the computer and now it refuses anything but battle!"
							+ "\nPlease choose a POKEMON by typing in one of the following letters and pressing enter:"
							+ "\na) *Choose Pikachu*" // Activates the FightingDialogue pokemonBattlePikachu method.
							+ "\nb) *Choose Charmander*" // Activates the FightingDialogue pokemonBattleCharmander method.
							+ "\nc) *Choose Bulbasaur*"); // Activates the FightingDialogue pokemonBattleBulbasaur method.
					String optionChosenPokemon2 = scan.nextLine(); // Scans for the next dialogue option from the user.
					
					// Pokemon battle ensues with you choosing Pikachu.
					if (optionChosenPokemon2.equals("a") || optionChosenPokemon2.equals("A")) {
						fight.pokemonBattlePikachu(name); // Leads to the end of the dialogue branch.
					}
					// Pokemon battle ensues with you choosing Charmander.
					else if (optionChosenPokemon2.equals("b") || optionChosenPokemon2.equals("B")) {
						fight.pokemonBattleCharmander(name); // Leads to the end of the dialogue branch.
					}
					// Pokemon battle ensues with you choosing Bulbasaur.
					else if (optionChosenPokemon2.equals("c") || optionChosenPokemon2.equals("C")) {
						fight.pokemonBattleBulbasaur(name); // Leads to the end of the dialogue branch.
					}
				}
				else if(optionFriendsOrNone.equals("b") || optionFriendsOrNone.equals("B")) {
					friend.letMeBeAFriend(); // Dialogue 17 from FriendlyDialogue - End of Dialogue Branch (You two become friends).
				}
			}
		}
		// A branching dialogue that is a result of "c" or "C" being chosen.
		else if (optionChosen.equals("c") || optionChosen.equals("C")) {
			question.whyNameYourselfGoku(); // Dialogue 2 from MildDialogue class -"Heh, youuuuu like anime or something?"
			System.out.println("");
			// Dialogue options provide to the user to move forward.
			System.out.println("Please choose a dialogue option by typing in one of the following letters YOU WEEB and pressing enter:"
					+ "\na) \"Yes.\""); // MildDialogue
			String optionUserIsGoku = scan.nextLine(); // Scans for the next dialogue option from the user.
			
			if(optionUserIsGoku.equals("a") || optionUserIsGoku.equals("A")) {
				question.computerIsDoneWithYou(name); // Dialogue 18 from MildDialogue - End of Dialogue Branch (The 
													  // computer wants to be returned and you end up buying a new computer in its place).
			}
		}
	}
}