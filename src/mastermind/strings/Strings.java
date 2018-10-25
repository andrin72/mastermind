package mastermind.strings;

//this class contains all of the strings used in this project
public class Strings {
	
	public static void createPlaceHolder(String string, int additionalSpace) {
		
		int length = string.length();
		length += additionalSpace;
		String placeHolder = "";
		
		for (int i = 0; i < length; i++) {
			placeHolder += "-";
		}
		
		System.out.println(placeHolder);
		
	}
	
	public static void createEvaluationDialogue(int correctPosition, int correctColor) {
		
		System.out.println(evaluationTitle);
		createPlaceHolder(evaluationCorrectPosition, 2);
		System.out.println(evaluationCorrectPosition + correctPosition);
		createPlaceHolder(evaluationCorrectPosition, 2);
		System.out.println(evaluationCorrectColor + correctColor);
		createPlaceHolder(evaluationCorrectPosition, 2);
		
	}
	
	public static String codeInput = "Geben Sie den Code ein: ";
	public static String codeInputInvalid = "Die Eingabe war nicht korrekt, bitte versuchen Sie es erneut: ";
	
	public static String evaluationCorrectPosition = "Position: ->richtig<- | Farbe ->richtig<-: ";
	public static String evaluationCorrectColor = "Position: ->falsch<-  | Farbe ->richtig<-: ";
	public static String evaluationTitle = "Die eingebenen Farben entsprechen dem Geheimcode folgendermassen: ";
	
}
