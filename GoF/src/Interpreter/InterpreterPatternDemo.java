package Interpreter;

public class InterpreterPatternDemo {

	public static Expression getMaleExpression(){

		Expression robert = new TerminalExpression("Robert");
		Expression jhon = new TerminalExpression("Jhon");

		return new OrExpression(robert, jhon);
	}

	public static Expression getMarriedWomanExpression(){

		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");

		return new OrExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		
		System.out.println( "John is male? " + isMale.interpret( "Jhon" ));
		System.out.println( "Julie is a married women? "+ isMarriedWoman.interpret( "Married Julie" ));
	}

}