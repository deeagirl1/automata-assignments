import gen.Example2Lexer;
import gen.Example2Parser;
import gen.Example2Visitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {
		
        CharStream input = CharStreams.fromStream(System.in);
		Example2Lexer lexer = new Example2Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Example2Parser parser = new Example2Parser(tokens);

        ParseTree tree = parser.start2();
		
        Example2Visitor<Value> visitor = new MyVisitor();
        visitor.visit(tree);
    }
}