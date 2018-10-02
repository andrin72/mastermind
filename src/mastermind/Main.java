package mastermind;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

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
		
		inputStreamReader = new InputStreamReader(System.in);
		random = new Random();
		
		secretCodeGenerated = new char[4];
		secretCodeInput = new char[4];
		
		for (int i = 0; i < 4; i++) {
			
			secretCodeGenerated[i] = COLORS[getRandomNumber(0,5)];
			
		}
		
		printCodeGenerated();
		
		System.out.print("Geben Sie den Code ein: ");
		
		
		
		do {
			try {
				readUserInput();
			} catch (IOException e) {

				e.printStackTrace();
				
			}
		} while (!validateInput());
		
		printCodeInput();
		
		
		
	}
	
	//Reads user input in form of 4 chars which are stored in an array
	private char readUserInput() throws IOException {
		
		char input;
		inputStreamReader.read(secretCodeInput, 0, 4);
		return 0;
		
	}
	
	//Returns random number
	private int getRandomNumber(int min, int max) {
		
	    int randomNumber = random.nextInt((max - min) + 1) + min;
	    return randomNumber;
		
	}
	
	private void printCodeGenerated() {
		
		for (int i = 0; i < secretCodeGenerated.length ; i++) {
			
			System.out.print(secretCodeGenerated[i]);
			
		}	
		
		System.out.println();
		
	}
	
	private void printCodeInput() {
		
		for (int i = 0; i < 4; i++) {
			
			System.out.print(secretCodeInput[i]);
			
		}	
		
		System.out.println();
		
	}
	
	
	//Validates input and returns if the validation was succesful (true) or not (fals)
	//Has to be fixed -> runs loop 4 times no matter if it was succesful or not
	private boolean validateInput() {
		
		for (int j = 0; j < secretCodeInput.length; j++) {
			
				if (secretCodeInput[j] != COLORS[0] && secretCodeInput[j] != COLORS[1] && secretCodeInput[j] != COLORS[2] && secretCodeInput[j] != COLORS[3] && secretCodeInput[j] != COLORS[4] && secretCodeInput[j] != COLORS[5]) {
					
					System.out.println("In dem eingegeben Code sind Fehler vorhanden, bitte wiederholen: ");
					return false;
					
				}
			
		}
			
		return true;
		
	}

}
