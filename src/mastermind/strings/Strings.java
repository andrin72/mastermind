package mastermind.strings;

//this class contains all of the strings used in this project
public class Strings {
	
	public static void createPlaceHolder(String string, boolean variableOutput) {
		
		int length = string.length();
		if(variableOutput) {
			length += 1;
		}
		String placeHolder = "";
		
		for (int i = 0; i < length; i++) {
			placeHolder += "-";
		}
		
		System.out.println(placeHolder);
		
	}
	
	public static void createEvaluationDialogue(int correctPosition, int correctColor) {
		
		System.out.println(evaluationTitle);
		System.out.println(evaluationPlaceHolder);
		System.out.println(evaluationCorrectPosition + correctPosition);
		System.out.println(evaluationCorrectColor + correctColor);
		System.out.println(evaluationPlaceHolder);
		
	}
	
	public static String codeInput = "Geben Sie den Code ein: ";
	public static String codeInputInvalid = "Die Eingabe war nicht korrekt, bitte versuchen Sie es erneut: ";
	
	public static String evaluationCorrectPosition = "Position: ->richtig<- | Farbe ->richtig<-: -->";
	public static String evaluationCorrectColor = "Position: ->falsch<-  | Farbe ->richtig<-: -->";
	public static String evaluationPlaceHolder = "-----------------------------------------------";
	public static String evaluationTitle = "Die eingebenen Farben entsprechen dem Geheimcode folgendermassen: ";
	
}
