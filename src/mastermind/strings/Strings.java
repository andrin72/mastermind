package mastermind.strings;

//this class contains all of the strings used in this project
public class Strings {
	
	public static String createPlaceHolder(String string, int additionalSpace) {
		
		int length = string.length();
		length += additionalSpace;
		String placeHolder = "";
		
		for (int i = 0; i < length; i++) {
			placeHolder += "-";
		}
		
		return placeHolder;
		
	}
	
	public static void createEvaluationDialogue(int correctPosition, int correctColor) {
		
		System.out.println(createPlaceHolder(evaluationCorrectPosition, 2));
		System.out.println(evaluationCorrectPosition + correctPosition);
		System.out.println(createPlaceHolder(evaluationCorrectPosition, 2));
		System.out.println(evaluationCorrectColor + correctColor);
		System.out.println(createPlaceHolder(evaluationCorrectPosition, 2));
		
	}
	
	public static String wordwrap = "\n";
	
	public static String gameExplanation1 = "Willkommen zu dem Spiel Mastermind!";
		
	public static String gameExplanation2 = "In diesem Spiel geht es darum, einen" + wordwrap +
											"Geheimcode der aus vier Farben in" + wordwrap +
											"einer bestimmten Reihenfolge besteht," + wordwrap +
											"zu erraten. Nach jedem Ratezug wird" + wordwrap +
											"dem Spieler angegeben wie viele" + wordwrap +
											"Farben richtig sind, und wie viele" + wordwrap + 
											"dieser Farben auf der richtigen" + wordwrap +
											"Position sind. Anhand dieser Infos" + wordwrap +
											"sollte es immer leichter werden," + wordwrap +
											"den Code zu erraten.";
											
	public static String availableColors = "Folgende Farben stehen zur Auswahl: r, g, b, y, w, s";
	public static String codeInput = "Versuchen Sie den geheimen Code zu erraten: ";
	public static String codeInputInvalid = "Die Eingabe war nicht korrekt, bitte versuchen Sie es erneut: ";
	
	public static String evaluationCorrectPosition = "Position: ->richtig<- | Farbe ->richtig<-: ";
	public static String evaluationCorrectColor = "Position: ->falsch<-  | Farbe ->richtig<-: ";
	
	public static String gameFinished = "Glückwunsch, Sie haben den Geheimcode erraten!";
	
}
