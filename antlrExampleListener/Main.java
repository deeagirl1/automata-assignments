import gen.MyGrammarBaseListener;
import gen.MyGrammarLexer;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	private final Stack<Integer> numberStack = new Stack<>();
	private final Stack<String> letterStack = new Stack<>();
	private final Stack<Boolean> boolStack = new Stack<>();
	private final Map<String, Integer> variablesMapping = new HashMap<>();
	// 3 dictionaries (?) (1 for integers, 1 for booleans, 1 for strings), but in case more var types are added this would not be optimal.

	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx)
	{
		System.err.println("enterMyStart()");
	}

	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx)
	{
		System.err.println("exitMyStart()");
	}

	@Override public void visitTerminal(TerminalNode node)
	{
		System.err.println("terminal-node: '" + node.getText() + "'");
	}

	@Override
	public void exitInt(MyGrammarParser.IntContext ctx) {
		int i = Integer.parseInt(ctx.INT().getText());
		numberStack.push(i);
	}

	@Override
	public void exitString(MyGrammarParser.StringContext ctx) {
		String i = ctx.STRING().getText();
		letterStack.push(i);
	}

	@Override
	public void exitBool(MyGrammarParser.BoolContext ctx) {
		Boolean i = Boolean.valueOf(ctx.BOOL().getText());
		boolStack.push(i);
	}

	@Override
	public void exitOtherExpression(MyGrammarParser.OtherExpressionContext ctx) {
//		int result = numberStack.pop();
//		System.err.println("Final result is: " + result);
		if (Objects.equals(ctx.expression().getText(), "INT"))
		{
			int resultIntegers = numberStack.pop();
			System.err.println("Final result is: " + resultIntegers);
		}
		else if (Objects.equals(ctx.expression().getText(), "BOOL")) {
			boolean resultBoolean = boolStack.pop();
			System.err.println("Final result is: " + resultBoolean);
		}
		else if (Objects.equals(ctx.expression().getText(), "STRING")) {
			String resultString = letterStack.pop();
			System.err.println("Final result is: " + resultString);
		}
	}

	@Override
	public void exitFact(MyGrammarParser.FactContext ctx) {
		int number = numberStack.pop();
		int fact = 1;
		for (int i = 2; i <= number; i++) {
			fact = fact * i;
		}
		numberStack.push(fact);
		System.err.println("Factorial of "+number+ " is "+ fact);

	}

	@Override
	public void exitPow(MyGrammarParser.PowContext ctx) {
		int right = numberStack.pop();
		int left = numberStack.pop();
		int result = 0;
		if (ctx.op.getType() == MyGrammarParser.POW) {
			result = (int) Math.pow(left, right);
			System.err.println(left + " to the power of " + right);
			numberStack.push(result);
		}


	}

	@Override
	public void exitAdd(MyGrammarParser.AddContext ctx) {
		int right = numberStack.pop();
		int left = numberStack.pop();
		int result = left + right;
		System.err.println("Added " + left + " with " + right);
		numberStack.push(result);
	}

	@Override
	public void exitSub(MyGrammarParser.SubContext ctx) {
		int right = numberStack.pop();
		int left = numberStack.pop();
		int result = left - right;
		System.err.println("Subtracted " + left + " with " + right);
		numberStack.push(result);
	}

	@Override
	public void exitMul(MyGrammarParser.MulContext ctx) {
		int right = numberStack.pop();
		int left = numberStack.pop();
		int result = left * right;
		System.err.println("Multiplied " + left + " with " + right);
		numberStack.push(result);
	}

	@Override
	public void exitDiv(MyGrammarParser.DivContext ctx) {
		int right = numberStack.pop();
		int left = numberStack.pop();
		if (right == 0 )
		{
			throw new ArithmeticException("Cannot divide by zero!");
		}
		int result = left / right;
		System.err.println("Divided " + left + " with " + right);
		numberStack.push(result);
	}

	@Override
	public void exitPrintAssignment(MyGrammarParser.PrintAssignmentContext ctx) {
		int value = numberStack.pop();
		System.err.println("print "+ctx.print_statement().expression().getText()+ " = "+ value);
	}

	@Override
	public void exitIdentifier(MyGrammarParser.IdentifierContext ctx) {
		String identifier = ctx.IDENTIFIER().getText();
		int value = Integer.parseInt(String.valueOf(variablesMapping.get(identifier)));
		numberStack.push(value);
		System.err.println("Value of " + identifier + " is " + value + " in the dictionary");




	}

	@Override
	public void exitAssignment(MyGrammarParser.AssignmentContext ctx) {
		String identifier = ctx.assign_var().IDENTIFIER().getText();
		if (Objects.equals(ctx.assign_var().expression().getText(), "INT"))
		{
		int value = numberStack.pop();
		variablesMapping.put(identifier, value);
		System.err.println(identifier + " is equal to " + value );
		}
		else if (Objects.equals(ctx.assign_var().expression().getText(), "BOOL"))
		{
			boolean value = boolStack.pop();
			variablesMapping.put(identifier, value);
			System.err.println(identifier + " is equal to " + value );
		}
		else if (Objects.equals(ctx.assign_var().expression().getText(), "STRING"))
		{
			String value = letterStack.pop();
			variablesMapping.put(identifier, value);
			System.err.println(identifier + " is equal to " + value );
		}

	}
}

public class Main
{
	public static void main(String[] args) throws Exception
	{
		CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);


		MyGrammarParser parser = new MyGrammarParser(tokens);

		ParseTree tree = parser.myStart();

		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
	}
}