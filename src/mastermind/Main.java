package mastermind;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import mastermind.strings.Strings;

public class Main {
	
	//declarations of variables
	private Random random;
	private static final char[] COLORS = new char[] {'r', 'g', 'b', 'y', 'w', 's' };
	private char[] secretCodeGenerated;
	private char[] secretCodeInput;
	private InputStreamReader inputStreamReader;
	
	//creates instance and calls init() method
	public static void main(String[] args) {

		Main instance = new Main();
		instance.init();
		
	}
	
	//initializes most important variables in the beginning of the game
	private void init() {
		
		random = new Random();
		
		secretCodeGenerated = new char[4];
		secretCodeInput = new char[4];
		
		for (int i = 0; i < 4; i++) {
			
			secretCodeGenerated[i] = COLORS[getRandomNumber(0,5)];
			
		}
		
		printCodeGenerated();
		
		readUserCode();
		
		evaluateUserCode();
		
		
		
	}
	
	private void runGame() {
		
		
		
	}
	
	//evaluates code from the user
	private void evaluateUserCode() {
		
		int correctPosition = 0;
		int correctColor = 0;
		char[] temp = new char[4];
		boolean test;
		int countAmount;
		
		for (int i = 0; i < secretCodeGenerated.length; i++) {
			
			countAmount = 0;
			
			for (int j = 0; j < secretCodeInput.length; j++) {
				
				if(secretCodeInput[j] == secretCodeGenerated[i]) {
					
					if(i == j) {
						
						correctPosition++;
						temp[j] = secretCodeInput[j];
						
					} else {
						
						test = true;
						
						for (int k = 0; k < temp.length; k++) {
							
							if(secretCodeInput[j] == temp[k]) {
								test = false;
							}
							
						}
						
						if(test && countAmount < 1) {
							correctColor++;
							}
						
						countAmount++;
						
					}
					
				}
				
			}
			
			
			
		}
		
		Strings.createEvaluationDialogue(correctPosition, correctColor);
		
	}
	
	private void readUserCode() {
		
		System.out.print(Strings.codeInput);
		
		
		do {
			
			try {
				readUserInput();
					
			} catch (IOException e) {

				e.printStackTrace();
					
			}
			
		} while (!validateInput());
		
		Strings.createPlaceHolder("Der eingegebene Code lautet:", false);
		System.out.println("Der eingegebene Code lautet: ");
		System.out.println("----------------------------");
		printCodeInput();
		System.out.println("----");
		
	}
	
	//reads user input in form of 4 chars which are stored in an array
	private void readUserInput() throws IOException {
		
		inputStreamReader = new InputStreamReader(System.in);
		inputStreamReader.read(secretCodeInput, 0, 4);
		
				
	}
	
	//returns random number
	private int getRandomNumber(int min, int max) {
		
	    int randomNumber = random.nextInt((max - min) + 1) + min;
	    return randomNumber;
		
	}
	
	//prints generated code
	private void printCodeGenerated() {
		
		for (int i = 0; i < secretCodeGenerated.length ; i++) {
			
			System.out.print(secretCodeGenerated[i]);
			
		}	
		
		System.out.println();
		
	}
	
	//prints code by user
	private void printCodeInput() {
		
		for (int i = 0; i < 4; i++) {
			
			System.out.print(secretCodeInput[i]);
			
		}	
		
		System.out.println();
		
	}
	
	
	//Validates input and returns if the validation was succesful (true) or not (false)
	private boolean validateInput() {
		
		for (int j = 0; j < secretCodeInput.length; j++) {
			
				if (secretCodeInput[j] != COLORS[0] && secretCodeInput[j] != COLORS[1] && secretCodeInput[j] != COLORS[2] && secretCodeInput[j] != COLORS[3] && secretCodeInput[j] != COLORS[4] && secretCodeInput[j] != COLORS[5]) {
					
					System.out.print(Strings.codeInputInvalid);
					
					return false;
					
				}
			
		}
			
		return true;
		
	}

}
