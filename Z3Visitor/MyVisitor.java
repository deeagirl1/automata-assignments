import gen.Example2BaseVisitor;
import gen.Example2Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyVisitor extends Example2BaseVisitor<Integer> {
    int [][] SudokuGrid = new int[9][9];



    @Override public Integer visitTerminal(TerminalNode node) {
        if(Objects.equals(node.getText(), "<EOF>")){
            print2D(SudokuGrid);
            show();
        }
        return null;
    }

    @Override
    public Integer visitModelR(Example2Parser.ModelRContext ctx) {
        String id = ctx.ID().getText();
        SudokuGrid[Integer.parseInt(id.substring(1,2))-1][Integer.parseInt(id.substring(2,3))-1] = Integer.parseInt(ctx.NUMBER().getText());
        return null;
    }

    public void print2D(int arr[][])
    {
        for (int[] row : arr) {
            System.err.println(Arrays.toString(row));
        }
    }

    public void show() {
        System.err.println("**************************************************************************************************");
        for(int x = 0 ; x < 9 ; x++) {
            System.out.print("||\t");
            for(int y = 0 ; y < 9 ; y++)
            {
                System.out.print(SudokuGrid[x][y]);
                System.out.print("\t");
                if ((y + 1) % 3 == 0) {
                    System.out.print("||\t");
                }
            }
            System.out.println();
            if ((x + 1) % 3 == 0) {
                System.err.println("**************************************************************************************************");
            }
        }
    }
}