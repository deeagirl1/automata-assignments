import gen.MyGrammarBaseListener;
import gen.MyGrammarLexer;
import gen.MyGrammarParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

import static java.lang.Boolean.parseBoolean;

class MyListener extends MyGrammarBaseListener
{
	private final Stack<Integer> numberStack = new Stack<>();
	private final Stack<String> StringStack = new Stack<>();
	private final Stack<Boolean> BooleanStack = new Stack<>();

	private final Map<String,Integer> integerMap = new HashMap<>();
	private final Map<String,String> StringMap = new HashMap<>();
	private final Map<String,Boolean> BooleanMap = new HashMap<>();

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
	public void exitValueNumber(MyGrammarParser.ValueNumberContext ctx) {
		int i = Integer.parseInt(ctx.INT().getText());
		numberStack.push(i);
	}

	@Override
	public void enterValueBoolean(MyGrammarParser.ValueBooleanContext ctx) {
		String i = (ctx.BOOLEAN().getText());
		BooleanStack.push(parseBoolean(i.toLowerCase()));
	}

	@Override
	public void exitOtherExpr(MyGrammarParser.OtherExprContext ctx) {
		int result = numberStack.pop();
		System.err.println("Final result is: " + result);
	}


	@Override
	public void exitStringAssign(MyGrammarParser.StringAssignContext ctx) {
		String id = ctx.ID().getText();
		if(ctx.STRING() == null){
			String value = "";
			StringMap.put(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}else {
			String value = ctx.STRING().getText();
			StringMap.put(id, removeFirstandLast(value));
			System.err.println("memory put: " + id + " = " + removeFirstandLast(value));
		}
	}

	@Override
	public void exitStringAssignValue(MyGrammarParser.StringAssignValueContext ctx) {
		String id = ctx.ID().getText();
		String value = ctx.STRING().getText();
		StringMap.replace(id, removeFirstandLast(value));
		System.err.println("memory put: " + id + " = " + removeFirstandLast(value));
	}


	@Override
	public void exitIntAssign(MyGrammarParser.IntAssignContext ctx) {
		String id = ctx.ID().getText();
		if(ctx.mathExpression() == null){
			int value = 0;
			integerMap.put(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}else {
			int value = numberStack.pop();
			integerMap.put(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}
	}

	@Override
	public void exitIntAssignValue(MyGrammarParser.IntAssignValueContext ctx) {
		String id = ctx.ID().getText();
		if(integerMap.get(id) != null){
			int value = numberStack.pop();
			integerMap.put(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}
		if(StringMap.get(id) != null){
			String value = StringStack.pop();
			StringMap.replace(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}
		if(BooleanMap.get(id) != null){
			boolean value = BooleanStack.pop();
			BooleanMap.put(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}
	}

	@Override
	public void exitBoolAssign(MyGrammarParser.BoolAssignContext ctx) {
		String id = ctx.ID().getText();
		if(ctx.BOOLEAN() == null){
			boolean value = false;
			BooleanMap.put(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}else {
			boolean value = parseBoolean(ctx.BOOLEAN().getText().toLowerCase());
			BooleanMap.put(id, value);
			System.err.println("memory put: " + id + " = " + value);
		}
	}

	@Override
	public void exitBoolAssignValue(MyGrammarParser.BoolAssignValueContext ctx) {
		String id = ctx.ID().getText();
		boolean value = parseBoolean(ctx.BOOLEAN().getText().toLowerCase());
		BooleanMap.put(id, value);
		System.err.println("memory put: " + id + " = " + value);
	}

	@Override
	public void exitPrintVar(MyGrammarParser.PrintVarContext ctx) {
		if (ctx.op.getType() == MyGrammarParser.ID) {
			String id = ctx.ID().getText();

			if(BooleanMap.get(id) != null){
				boolean value = BooleanMap.get(id);
				BooleanMap.put(id, value);
				System.err.println("print "+ id + " = " +value);
			}
			else if(StringMap.get(id) != null){
				String value = StringMap.get(id);
				StringMap.put(id, value);
				System.err.println("print "+ id + " = " +value);
			}
			else if (integerMap.get(id) != null){
				int value = integerMap.get(id);
				integerMap.put(id, value);
				System.err.println("print "+ id + " = " +value);
			}
		}
		if(ctx.op.getType() == MyGrammarParser.STRING){
			String id = ctx.STRING().getText();
			System.err.println("print "+ removeFirstandLast(id));
		}
		if(ctx.op.getType() == MyGrammarParser.INT) {
			String id = ctx.INT().getText();
			System.err.println("print "+ id);
		}
		if(ctx.op.getType() == MyGrammarParser.BOOLEAN) {
			String id = ctx.BOOLEAN().getText();
			System.err.println("print "+ id);
		}
	}

	@Override
	public void exitPrintExpr(MyGrammarParser.PrintExprContext ctx) {
		int value= numberStack.pop();
		System.err.println("printed "+ctx.mathExpression().getText()+" = "+value);
	}

	@Override
	public void exitValueVariable(MyGrammarParser.ValueVariableContext ctx) {
		String id = ctx.ID().getText();
		if(integerMap.get(id) != null){
			int number=integerMap.get(id);
			numberStack.push(number);
			System.err.println("Added id to letterstack: "+id+" meaning adding "+number+" to numberstack");
		}
	}

	@Override
	public void exitValueString(MyGrammarParser.ValueStringContext ctx) {
		String id = ctx.STRING().getText();
		StringStack.push(removeFirstandLast(id));
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

	private String removeFirstandLast(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.deleteCharAt(str.length() - 1);
		sb.deleteCharAt(0);
		return sb.toString();
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