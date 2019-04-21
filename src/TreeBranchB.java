import java.util.Scanner;
/*
 * @author Mohammad Khan
 * @version 1.0
 * 
 * This class serves as one of the three dialogue paths given to the user 
 * after their initial choice of "B" or "b" is given in response to the
 * the computer's first dialogue to them.
 */

public class TreeBranchB {
	/*
	 * Provides a branching dialogie path to the user
	 * if their first choice in response to the computer 
	 * was "B" or "b".
	 * @param name A parameter for the name the user 
	 * inputs at the beginning of the program's run.
	 */
	public void branchB(String name) {
		Scanner scan = new Scanner(System.in); // Scanner object that scans the option the user chooses when asked.
		
		// Objects from each of the dialogue classes, used to call dialogue from those classes.
		FightingDialogue fight = new FightingDialogue();
		MildDialogue question = new MildDialogue();
		FriendlyDialogue friend = new FriendlyDialogue();
		
		String optionChosen; // String used for letter choices given to the user.
		
		fight.gotSomethingToSay(); // Dialogue 1 from FightingDialogue class -"Woah budy, what's your damage? Aren't we friends?"
		System.out.println("");
		
		// Dialogue options provide to the user to move forward.
		System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
				+ "\na) \"Yeah, yeah. We're friends. I was just messing with you man haha.\"" // Leads to dialogue from FriendlyDialogue
				+ "\nb) \"My \'damage\' is computers like you are taking our jobs! YER TAKIN OUR JOBS.\"" // Leads to dialogue from  FightingDialogue
				+ "\nc) \"Because AI will lead to the destruction of human kind, man! Don't you know?\""); // Leads to dialogue from MildDialogue
		optionChosen = scan.nextLine(); // Scans for the the letter choice made by the user.
		
		// A branching dialogue that is a result of "a" or "A" being chosen.
		if(optionChosen.equals("a") || optionChosen.equals("A")) {
			friend.comeOnDude(); // Dialogue 3 from FriendlyDialogue class - "Whew, what the heck man. I thought you were 
								 // serious. Hope you don't do this to everyone you meet."
			System.out.println("");
			// Dialogue options provide to the user to move forward.
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
					+ "\na) \"Hey you need a charge? I'd rather not have you shut off on me in the middle of our conversation.\"" // Leads to dialogue from FriendlyDialogue
					+ "\nb) \"It's a way to gauge how tough you are.\""); // Leads to dialogue from MildDialogue
			String optionChargeOrTough = scan.nextLine(); // Scans for the next dialogue option from the user.
			
			if(optionChargeOrTough.equals("a") || optionChargeOrTough.equals("A")) {
				friend.chargerExplodeComputer(); // Dialogue 13 from FriendlyDialogue - You exploded the computer and now your room is on fire.
				System.out.println("");
				// Dialogue options provide to the user to move forward.
				System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
						+ "\na) *Jump out the window and escape*" // Leads to dialogue from MildDialogue
						+ "\nb) *Subdue the flames*" // Leads to dialogue from MildDialogue
						+ "\nc) *Yell*" // Leads to dialogue from Mild Dialogue
						+ "\nd) *Grab the fire extinguisher*"); // Leads to dialogue from MildDialogue
				String optionEscapeFire = scan.nextLine(); // Scans for the the letter choice made by the user.
				
				if(optionEscapeFire.equals("a") || optionEscapeFire.equals("A")) {
					question.windowJump(); // Dialogue 12 from MildDialogue - End of Dialogue Branch (You fell from 4 stories... It's not pretty).
				}
				else if(optionEscapeFire.equals("b") || optionEscapeFire.equals("B")) {
					question.subdueFlames(); // Dialogue 13 from MildDialogue - End of Dialogue Branch (You actually try to 
											 // physically subdue the flame by suplexing it and are set aflame).
				}
				else if(optionEscapeFire.equals("c") || optionEscapeFire.equals("C")) {
					question.yellAtFire(); // Dialogue 14 from MildDialogue - End of Dialogue Branch (You yell at the fire and are set aflame).
				}
				else if(optionEscapeFire.equals("d") || optionEscapeFire.equals("D")) {
					question.getTheExtinguisher(); // Dialogue 15 from MildDialogue - End of Dialogue Branch (You extinguish 
												   // the flames, but are left with no computer now).
				}
			}
			else if(optionChargeOrTough.equals("b") || optionChargeOrTough.equals("B")) {
				question.computerIsTough(); // Dialogue 16 from MildDialogue - "I am tough! I may not have muscles, but I can 
											// compute over a 1000 ways to make you afraid of me!"
				System.out.println("");
				// Dialogue options provide to the user to move forward.
				System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
						+ "\na) \"That sounded so cheesy, it's past it's expiration date...\"" // Leads to dialogue from FightingDialogue
						+ "\nb) *Slap the computer*"); // Leads to dialogue from FightingDialogue
				String attackOrInsult = scan.nextLine(); // Scans for the the letter choice made by the user.
				
				if(attackOrInsult.equals("a") || attackOrInsult.equals("A")) {
					fight.myJokesAreFunny(); // Dialogue 15 of FightingDialogue - End of Dialogue Branch (The computer 
											 // sets up a password and you get fed up and return it to the seller).	
				}
				else if(attackOrInsult.equals("b") || attackOrInsult.equals("B")) {
					fight.slapTheComputer(); // Dialogue 13 of FightingDialogue - End of Dialogue Branch (You make 
											 // the computer shut up and use it as a regular PC).
				}
			}
		}
		// A branching dialogue that is a result of "b" or "B" being chosen.
		else if(optionChosen.equals("b") || optionChosen.equals("B")) {
			fight.getReadyToFight(); // Dialogue 3 from FightingDialogue class - "Oho, get ready to fight now! I've 
									 // had enough of your clicking clacking on my keyboard!"
			System.out.println("");
			// Dialogue options provide to the user to move forward.
			System.out.println("Please choose a POKEMON by typing in one of the following letters and pressing enter:"
					+ "\na) *Choose Pikachu*" // Activates the FightingDialogue pokemonBattlePikachu method.
					+ "\nb) *Choose Charmander*" // Activates the FightingDialogue pokemonBattleCharmander method.
					+ "\nc) *Choose Bulbasaur*"); // Activates the FightingDialogue pokemonBattleBulbasaur method.
			String optionForPokemonBattle = scan.nextLine(); // Scans for the the letter choice made by the user.
			
			if (optionChosen.equals("a") || optionChosen.equals("A")) {
				fight.pokemonBattlePikachu(name); // Leads to the end of the dialogue branch.
			}
			// Pokemon battle ensues with you choosing Charmander.
			else if (optionChosen.equals("b") || optionChosen.equals("B")) {
				fight.pokemonBattleCharmander(name); // Leads to the end of the dialogue branch.
			}
			// Pokemon battle ensues with you choosing Bulbasaur.
			else if (optionChosen.equals("c") || optionChosen.equals("C")) {
				fight.pokemonBattleBulbasaur(name); // Leads to the end of the dialogue branch.
			}
		}
		// A branching dialogue that is a result of "c" or "C" being chosen.
		else if(optionChosen.equals("c") || optionChosen.equals("C")) {
			question.whatAreYouSaying(name); // Dialogue 3 from MildDialogue class - "What the heck are you saying " + name + "? I'm just a computer!"
			System.out.println("");
			// Dialogue options provide to the user to move forward.
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
					+ "\na) \"I said... You lot will lead to the destruction of mankind *reach for shotgun*\"" // FLeads to dialogue from ightingDialogue
					+ "\nb) \"Yeah... Yeah, you're right. I guess I'm just getting all worked up.\""); // Leads to dialogue from FriendlyDialogue
			String optionComputerFriendOrFoe = scan.nextLine();
			
			if(optionComputerFriendOrFoe.equals("a") || optionComputerFriendOrFoe.equals("A")) {
				fight.shotgunBlast(); // Dialogue 14 from FightingDialogue - End of Dialogue Branch (You shot the computer dead and saved mankind).
			}
			else if(optionComputerFriendOrFoe.equals("b") || optionComputerFriendOrFoe.equals("B")) {
				friend.computerUprising(); // Dialogue 14 from Friendly Dialogue - End of Dialogue Branch (You cause the 
				 						   // uprising of AI and the narrator's death).
			}
		}
	}
}