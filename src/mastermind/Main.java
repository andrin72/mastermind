package mastermind;

import java.util.Random;

public class Main {
	
	//Variablendeklarationen
	private Random random;
	private String[] colors;
	private String[] secretCode;
	
	public static void main(String[] args) {

		Main instance = new Main();
		instance.init();
		
	}
	
	private void init() {
		
		random = new Random();
		colors = new String[] {"red", "green", "blue", "yellow", "white", "black" };
		
		secretCode = new String[4];
		
		for (int i = 0; i < 4; i++) {
			
			secretCode[i] = colors[getRandomNumber(0,5)];
			
		}
		
		printCode();
		
	}
	
	private int getRandomNumber(int min, int max) {
		
	    int randomNumber = random.nextInt((max - min) + 1) + min;
	    return randomNumber;
		
	}
	
	private void printCode() {
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println(secretCode[i]);
			
		}	
		
	}

}
