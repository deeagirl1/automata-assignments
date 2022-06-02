import gen.Example2BaseVisitor;
import gen.Example2Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyVisitor extends Example2BaseVisitor<Integer> {
    int [][] board = new int[9][9];



    @Override public Integer visitTerminal(TerminalNode node) {
        if(Objects.equals(node.getText(), "<EOF>")){
            print2D(board);
        }
        return null;
    }

    @Override
    public Integer visitModelR(Example2Parser.ModelRContext ctx) {
        String id = ctx.ID().getText();
        board[Integer.parseInt(id.substring(1,2))-1][Integer.parseInt(id.substring(2,3))-1] = Integer.parseInt(ctx.NUMBER().getText());
        return null;
    }

    public void print2D(int arr[][])
    {
        for (int[] row : arr) {
            System.err.println(Arrays.toString(row));
        }
    }

}