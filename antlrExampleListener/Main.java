import gen.MyGrammarBaseListener;
import gen.MyGrammarLexer;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	private final Stack<Integer> numberStack = new Stack<>();

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
	public void exitStat(MyGrammarParser.StatContext ctx) {
		int result = numberStack.pop();
		System.err.println("Final result is: " + result);
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
			result = (int) Math.pow(left,right);
			System.err.println(left+ " to the power of "+ right);
			numberStack.push(result);
		}


	}

	@Override
	public void exitAddSub(MyGrammarParser.AddSubContext ctx) {
		int right = numberStack.pop();
		int left = numberStack.pop();

		int result = 0;
		if (ctx.op.getType() == MyGrammarParser.ADD) {
			result = left + right;
			System.err.println("Added "+left+ " with "+right);
		} else {
			result = left - right;
			System.err.println("Subtracted "+left+ " with "+right);
		}
		numberStack.push(result);

	}

	@Override
	public void exitMulDiv(MyGrammarParser.MulDivContext ctx) {
		int right = numberStack.pop();
		int left = numberStack.pop();

		int result = 0;
		if (ctx.op.getType() == MyGrammarParser.MUL) {
			result = left * right;
			System.err.println("Multiplied "+left+ " with "+right);
		} else {
			result = left / right;
			System.err.println("Divided "+left+ " with "+right);
		}
		numberStack.push(result);

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

//import gen.MyGrammarBaseListener;
//import gen.MyGrammarParser;
//import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.tree.*;
//import java.util.*;
//
//class MyListener extends MyGrammarBaseListener
//{
//	private Stack<Integer> numberStack = new Stack<Integer>();
//
//	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx)
//	{
//		System.err.println("enterMyStart()");
//	}
//
//	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx)
//	{
//		System.err.println("exitMyStart()");
//	}
//
//	@Override public void visitTerminal(TerminalNode node)
//	{
//		System.err.println("terminal-node: '" + node.getText() + "'");
//	}
//
//	@Override
//    public void exitAddSub(MyGrammarParser.AddSubContext ctx) {
//		int right = numberStack.pop();
//		int left = numberStack.pop();
//
//        int result;
//        if (ctx.op.getType() == MyGrammarParser.ADD) {
//            result = left + right;
//			System.err.println("-------------------------------------------------");
//			System.err.println("added "+left+ " with "+right + " = " + result);
//		} else {
//            result = left - right;
//			System.err.println("-------------------------------------------------");
//			System.err.println("subtracted "+left+ " with "+right + " = " + result);
//		}
//		System.err.println("-------------------------------------------------");
//		numberStack.push(result);
//
//    }
//
//	@Override
//    public void exitMulDiv(MyGrammarParser.MulDivContext ctx) {
//        int right = numberStack.pop();
//		int left = numberStack.pop();
//
//        int result;
//        if (ctx.op.getType() == MyGrammarParser.MUL) {
//            result = left * right;
//			System.err.println("-------------------------------------------------");
//			System.err.println("multiplied "+left+ " with "+right + " = " + result);
//		} else {
//            result = left / right;
//			System.err.println("-------------------------------------------------");
//			System.err.println("divided "+left+ " by "+right + " = " + result);
//		}
//		System.err.println("-------------------------------------------------");
//		numberStack.push(result);
//    }
//
//
//	@Override
//	public void exitFact(MyGrammarParser.FactContext ctx) {
//		int number = numberStack.pop();
//		int i,fact=1;
//		for(i=1;i<=number;i++){
//			fact=fact*i;
//		}
//		System.err.println("-------------------------------------------------");
//		System.err.println("Factorial of "+number+" is: "+fact);
//		System.err.println("-------------------------------------------------");
//        numberStack.push(fact);
//	}
//
//	@Override
//	public void exitPow(MyGrammarParser.PowContext ctx) {
//		int right = numberStack.pop();
//		int left = numberStack.pop();
//		int result = 0;
//		if (ctx.op.getType() == MyGrammarParser.POW) {
//			result = (int) Math.pow(left,right);
//			System.err.println(left+ " to the power of "+ right);
//			numberStack.push(result);
//		}
//	}
//
//	@Override
//	public void exitInt(MyGrammarParser.IntContext ctx) {
//		String integ=ctx.INT().getText();
//		numberStack.push(Integer.valueOf(integ));
//		System.err.println("Added integ to numberStack: "+integ);
//	}
//
//
//}
//
//public class Main
//{
//    public static <MyGrammarLexer> void main(String[] args) throws Exception {
//		CharStream input = CharStreams.fromStream(System.in);
//		gen.MyGrammarLexer lexer = new gen.MyGrammarLexer(input);
//
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//
//		MyGrammarParser parser = new MyGrammarParser(tokens);
//
//		ParseTree tree = parser.myStart();
//
//		MyListener m = new MyListener();
//		ParseTreeWalker.DEFAULT.walk(m, tree);
//    }
//}