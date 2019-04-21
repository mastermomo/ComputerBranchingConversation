import java.util.Scanner;
/*
 * @author Mohammad Khan
 * @version 1.0
 * 
 * This class serves as one of the three dialogue paths given to the user 
 * after their initial choice of "C" or "c" is given in response to the
 * the computer's first dialogue to them.
 */

public class TreeBranchC {
	/*
	 * Provides a branching dialogie path to the user
	 * if their first choice in response to the computer 
	 * was "C" or "c".
	 * @param name A parameter for the name the user 
	 * inputs at the beginning of the program's run.
	 */
	public void branchC(String name) {
		Scanner scan = new Scanner(System.in);// Scanner object that scans the option the user chooses when asked.
		
		// Objects from each of the dialogue classes, used to call dialogue from those classes.
		FightingDialogue fight = new FightingDialogue();
		MildDialogue question = new MildDialogue();
		FriendlyDialogue friend = new FriendlyDialogue();

		String optionChosen; // String used for letter choices given to the user.
		
		friend.technologyIsAnswer(); // Dialogue 1 from FriendlyDialogue class - "Good question, because... TECHNOLOGY!"
		System.out.println("");

		// Dialogue options provide to the user to move forward.
		System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
				+ "\na) \"Oh cool, do you know any tricks you could show me?\"" // Leads to dialogue from QuestioningDialogue
				+ "\nb) \"Calm down dude. You sound like a nerd.\"" // Leads to dialogue from FightingDialogue
				+ "\nc) \"That's pretty cool. What do you do in your free time?\""); // Leads to dialogue from FriendlyDialogue

		String optionChosen2 = scan.nextLine(); // String used for letter choices given to the user.

		// A branching dialogue that is a result of "a" or "A" being chosen.
		if (optionChosen2.equals("a") || optionChosen2.equals("A")) {
			question.whatWouldYouLike(); // Dialogue 4 from MildDialogue class - "Sure, what would you like to see?".
			System.out.println("");
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
					+ "\na) \"Can you start up Fortnite for me?\"" // Leads to dialogue from FightingDialogue
					+ "\nb) \"Make the Windows XP startup noise!\"" // Leads to dialogue from FriendlyDialogue
					+ "\nc) \"Download a movie for me.\""); // Leads to dialogue from MildDialogue 
			String optionChosen3 = scan.nextLine(); // String used for letter choices given to the user.
			
			if(optionChosen3.equals("a") || optionChosen3.equals("A")) {
				fight.imNotDoingFortnite(); // Dialogue 7 from FightingDialogue - "Oka-WHAT?! FORNITE?! IM A SENTIENT COMPUTER AND YOU WANT ME TO BOOT UP FORNITE?!"
				System.out.println("");
				System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
						+ "\na) \"Please...?\"" // Leads to dialogue from FriendlyDialogue
						+ "\nb) \"Don't like games??\""); // Leads to dialogue from MildDialogue 
				String optionChosen4 = scan.nextLine(); // String used for letter choices given to the user.
				
				if(optionChosen4.equals("a") || optionChosen4.equals("A")) {
					friend.playFortnite(); // Dialogue 8 from FriendlyDialogue - End of Dialogue Branch (The computer runs the game and begins to 
										   // like them, leading to the two of you becoming buddies).
				}
				else if(optionChosen4.equals("b") || optionChosen4.equals("B")) {
					question.noDontAskAgain(name); // Dialogue 7 from MildDialogue - You stole the parts off the computer here and are asked if you want to sell or keep them.
					System.out.println("");
					System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
							+ "\na) \"I want to sell them!\"" // Leads to dialogue from MildDialogue
							+ "\nb) \"I'll keep them. Could make a killer PC with these parts.\""); // Leads to dialogue from MildDialogue 
					String optionChosen5 = scan.nextLine(); // String used for letter choices given to the user.
					
					if(optionChosen5.equals("a") || optionChosen5.equals("A")) {
						question.sellParts(); // Dialogue 8 from MildDialogue - End of Dialogue Branch (You sell the parts and become rich).
					}
					else if(optionChosen5.equals("b") || optionChosen5.equals("B")) {
						question.keepParts(); // Dialogue 9 from MidlDialogue - End of Dialogue Branch (You make a PC that blows up and sends you to the hospital).
					}
				}
			}
			else if(optionChosen3.equals("b") || optionChosen3.equals("B")) {
				friend.windowsXpSound(); // Dialogue 7 from FriendlyDialogue - End of Dialogue Branch (The computer restarts 
										 // and after making the XP start up sound it shuts off completely because 				reverting to XP caused the computer to fry).
				System.out.println("");
			}
			else if(optionChosen3.equals("c") || optionChosen3.equals("C")) {
				question.imNotDoingIllegalThings(); // Dialogue 6 from MildDialogue - "I'm not downloading movies Illegally for you..."
				System.out.println("");
				System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
						+ "\na) \"Wow, what a scardy cat..\"" // Leads to dialogue from FightingDialogue
						+ "\nb) *Hold gun to computer's head*"); // Leads to dialogue from FriendlyDialogue
				String optionChosen6 = scan.nextLine(); // String used for letter choices given to the user.
				
				if(optionChosen6.equals("a") || optionChosen6.equals("A")) {
					fight.pokemonBattleStarts(); // Dialogue 6 - "Oh you want to fight? Okay, I choose you, SQUIRTLE! \n*The computer throws a ball. 
												 //It flashes and a blue reptile foaming at the mouth appears... \nDon't let that thing bite you..." 
					System.out.println("");
					System.out.println("You have made the computer angry! \nPlease choose a POKEMON by typing in one of the following letters and pressing enter:"
							+ "\na) *Choose Pikachu*" // Activates the FightingDialogue pokemonBattlePikachu method.
							+ "\nb) *Choose Charmander*" // Activates the FightingDialogue pokemonBattleCharmander method.
							+ "\nc) *Choose Bulbasaur*"); // Activates the FightingDialogue pokemonBattleBulbasaur method
					String optionChosenPokemon = scan.nextLine(); // String used for letter choices given to the user.
					
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
				else if(optionChosen6.equals("b") || optionChosen6.equals("B")) {
					friend.woahHeyManPutItDown(name); // Dialogue 9 from FriendlyDialogue- "W-Woah... Hey " + name + ", calm 
													  // down man... Okay, just tell me what movie you want..."
					System.out.println("");
					System.out.println("Please choose a POKEMON by typing in one of the following letters and pressing enter:"
							+ "\na) \"Download Shazam!\"" // Leads to dialogue from FriendlyDialogue
							+ "\nb) *Shoot gun* (Why even choose this?!) "); // Leads to dialogue from FightingDialogue
					String optionChosen7 = scan.nextLine(); // String used for letter choices given to the user.
					
					if(optionChosen7.equals("a") || optionChosen7.equals("A")) {
						friend.downloadShazam(); // Dialogue 10 from FriendlyDialogue - End of Dialogue Branch (You end up in 
												 // jail and the computer in the evidence room).
					}
					else if(optionChosen7.equals("b") || optionChosen7.equals("B")) {
						fight.iCantBelieveYouShotHim(); // Dialogue 8 from FightingDialogue - End of Dialogue Branch (You shot the computer...).
					}
				}
			}
		}
		// A branching dialogue that is a result of "b" or "B" being chosen.
		else if (optionChosen2.equals("b") || optionChosen2.equals("B")) {
			fight.imNoNerd(); // Dialogue 4 from FightingDialogue class - "NERD?! I'll show you nerd. Let's go, right now, right here. BEEP BOOP BITCH."
			System.out.println("");
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
					+ "\na) *Fight*" // Leads to dialogue from FightingDialogue
					+ "\nb) \"Sorry dude, you just sounded kind of cringy...\""); // Leads to dialogue from MildDialogue
			String optionFightOrSorry = scan.nextLine(); // String used for letter choices given to the user.
			
			if(optionFightOrSorry.equals("a") || optionFightOrSorry.equals("A")) {
				fight.youAskedForIt(); // Dialogue 9 from FightingDialogue - End of Dialogue Branch (You're sent to Guantanamo Bay).
			}
			else if(optionFightOrSorry.equals("b") || optionFightOrSorry.equals("B")) {
				fight.tryToSaySorry(); // Dialogue 10 from FightingDialogue - End of Dialogue Branch (You try to say sorry, but end up in a fight that leads to both of you dying).
			}
		}
		// A branching dialogue that is a result of "c" or "C" being chosen.
		else if (optionChosen2.equals("c") || optionChosen2.equals("C")) {
			friend.iDoWhatever(); // Dialogue 4 from FriendlyDialogue class - "Oh I check on thermals, watch what my clock 
								  // speed is. I even go into sleep mode if things aren't too hectic. \nWhat about you?" 
			System.out.println("");
			System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
					+ "\na) \"That stuff is lame! How don't you get bored?!\"" // Leads to dialogue from FightingDialogue
					+ "\nb) \"I like to code!\"" // Leads to dialogue from FriendlyDialogue
					+ "\nc) \"I like to play video games... Do you have any games to play?\""); // MildDialogue
			String optionWhatUserDoes = scan.nextLine(); // String used for letter choices given to the user.
			
			if(optionWhatUserDoes.equals("a") || optionWhatUserDoes.equals("A")) {
				fight.existentialCrisis(); // Dialogue 11 from FightingDialogue - End of Dialogue Branch (You made the computer sad you jerk :(...).
			}
			else if(optionWhatUserDoes.equals("b") || optionWhatUserDoes.equals("B")) {
				friend.codingIsAmazing(); // Dialogue 11 from FriendlyDialogue - "I love coding!!! I mean I can 
										  // code, but it's all automated. When a user codes on me, it's\nlike getting a massage!"
				System.out.println("");
				System.out.println("Please choose a dialogue option by typing in one of the following letters and pressing enter:"
						+ "\na) \"Alright, let me code in Java on you!\"" // Leads to dialogue from  MildDialogue
						+ "\nb) \"That just... sounds really weird...\""); // Leads to dialogue from FightingDialogue
				String toCodeOrNotToCode = scan.nextLine(); // String used for letter choices given to the user.
				
				if(toCodeOrNotToCode.equals("a") || toCodeOrNotToCode.equals("A")) {
					question.pythonIsBetter(); // Dialogue 11 from MildDialogue - "*Scoffs* Java?! Why would I let a Java pleblian code on me? PYTHON GANG RULES!"
					System.out.println("");
					System.out.println("Please choose a dialogue option by typing in one of the following letters:"
							+ "\na) *Return computer*" // Leads to dialogue from FightingDialogue
							+ "\nb) *Ask if it can do mobile programming*"); // Leads to dialogue from FriendlyDialogue
					String optionJavaOrPython = scan.nextLine(); // String used for letter choices given to the user.
					
					if(optionJavaOrPython.equals("a") || optionJavaOrPython.equals("A")) {
						fight.itsNotWeird(); // Dialogue 12 from FightingDialogue - End of Dialogue Branch (The computer was just too weird and you returned it).
					}
					else if(optionJavaOrPython.equals("b") || optionJavaOrPython.equals("B")) {
						friend.noMobileProgramming(); // Dialogue 12 from FriendlyDialogue - End of Dialogue Branch (You both live your lives coding in Java).
					}
				}
				else if(toCodeOrNotToCode.equals("b") || toCodeOrNotToCode.equals("B")) {
					fight.itsNotWeird(); // Dialogue 12 from FightingDialogue - End of Dialogue Branch (The computer was just to weird and you returned it).
				}
			}
			else if(optionWhatUserDoes.equals("c") || optionWhatUserDoes.equals("C")) {
				question.noGamesMan(); // Dialogue 10 in MildDialogue - End of Dialogue Branch (You killed the computer with Skyrim).
			}
		}
	}
}