import gen.MyGrammarBaseListener;
import gen.MyGrammarLexer;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	private final Stack<String> indexStack = new Stack<>();
	private final Stack<String> nameStack = new Stack<>();

	private final List<String> functionsName= new ArrayList<>();

	private Graph graph = new Graph();

	public Graph getGraph()
	{
		return graph;
	}

	@Override()
	public void exitValueString(MyGrammarParser.ValueStringContext ctx) {
		if(check()) return;
		String value = ctx.TEXT().getText().replace("\"", "");
		if (value.contains(":")) {
			String[] values = ctx.TEXT().getText().split(":");

			for (var string : values) {
				graph.addEndNode(string.replace("\"", ""));
			}
		} else if (value.length() == 1) {
			nameStack.push(value);
		}
	}

	@Override()
	public void enterValueBasicNumber(MyGrammarParser.ValueBasicNumberContext ctx) {
		if(check()) return;
		indexStack.push(ctx.NUMBER().getText());
	}

    @Override
    public void exitValueLogicalExpr(MyGrammarParser.ValueLogicalExprContext ctx) {
		if(check()) return;
		var endIndex = indexStack.pop();
		var startIndex = indexStack.pop();
		String name = nameStack.pop();
		Connection connection = new Connection(startIndex, endIndex, name);
		graph.addConnection(connection);
    }


	@Override
	public void exitMyStart(MyGrammarParser.MyStartContext ctx) {
		if(check()) return;
		indexStack.clear();
		nameStack.clear();
	}

	@Override
	public void exitStatementFunction(MyGrammarParser.StatementFunctionContext ctx) {
		String name = ctx.ID().getText();
		functionsName.add(name);
		if (name.contains("InitState") || name.contains("MaxState") || name.contains("FinalStates") || name.contains("A")){
			if (name.contains("InitState")) {
				graph.setInitState(indexStack.pop());
			} else if (name.equals("MaxState")) {
				graph.setMaxState(indexStack.pop());
			}
		}

	}

	private boolean check() {
		return functionsName.size() > 3;
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
		
		MyListener listener = new MyListener();
		ParseTreeWalker.DEFAULT.walk(listener, tree);

		GraphViz graphViz = new GraphViz();
		try {

			File file = new File("abc.dot");
			if (!file.exists() && file.createNewFile())
			{
				System.out.println(file.getAbsolutePath());
			}

			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(graphViz.drawGraph(listener.getGraph()));
			fileWriter.close();

			String[] cmd = {"C:\\Program Files\\Graphviz\\bin\\dot.exe", "-Tpng", "-oabc.png", "abc.dot"};

			Process p = Runtime.getRuntime().exec(cmd);
			p.waitFor();

		} catch (Exception e) {
			System.out.println("Failed to call graphViz" + e.getMessage());
			return;
		}
		System.out.println("Image generated");
    }
}