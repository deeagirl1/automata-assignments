import gen.Example2BaseVisitor;
import gen.Example2Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.parseBoolean;


public class MyVisitor extends Example2BaseVisitor<Value> {

    private final Map<String, Value> valueMap = new HashMap<>();

    @Override
    public Value visitTerminal(TerminalNode node) {
        System.err.println("[" + node.getText() + "]");
        return (new Value(node.getText()));
    }

    @Override
    public Value visitIntAssign(Example2Parser.IntAssignContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(ctx.mathExpression() == null){
            value = new Value(0);
        }else {
            value = this.visit(ctx.mathExpression());
        }
        valueMap.put(id, value);
        System.err.println("memory put: " + id + " = " + value);
        return value;
    }

    @Override
    public Value visitIntAssignValue(Example2Parser.IntAssignValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(valueMap.get(id) != null){
            value = this.visit(ctx.mathExpression());
            valueMap.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }
        return value;
    }

    @Override
    public Value visitAdd(Example2Parser.AddContext ctx) {
        Value left = visit(ctx.mathExpression(0));
        Value right = visit(ctx.mathExpression(1));

        return new Value(Integer.parseInt(left.asString()) + Integer.parseInt(right.asString()));
    }

    @Override
    public Value visitSub(Example2Parser.SubContext ctx) {
        Value left = visit(ctx.mathExpression(0));
        Value right = visit(ctx.mathExpression(1));

        return new Value(Integer.parseInt(left.asString()) - Integer.parseInt(right.asString()));
    }

    @Override
    public Value visitDiv(Example2Parser.DivContext ctx) {
        Value left = visit(ctx.mathExpression(0));
        Value right = visit(ctx.mathExpression(1));

        return new Value(Integer.parseInt(left.asString()) / Integer.parseInt(right.asString()));


    }

    @Override
    public Value visitMul(Example2Parser.MulContext ctx) {
        Value left = visit(ctx.mathExpression(0));
        Value right = visit(ctx.mathExpression(1));
        return new Value(Integer.parseInt(left.asString()) * Integer.parseInt(right.asString()));
    }

    @Override
    public Value visitValueVariable(Example2Parser.ValueVariableContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(valueMap.get(id) != null){
            value = valueMap.get(id);
            valueMap.put(id, value);
            System.err.println("Added id to letterstack: "+id+" meaning adding "+ value +" to numberstack");
        }
        return value;
    }

    @Override
    public Value visitFact(Example2Parser.FactContext ctx) {
        Value number = visit(ctx.mathExpression());
        int fact = 1;
        for (int i = 2; i <= Integer.parseInt(number.asString()); i++) {
            fact = fact * i;
        }
        System.err.println("Factorial of "+number+ " is "+ fact);
        return new Value(fact);
    }

    @Override
    public Value visitStringAssign(Example2Parser.StringAssignContext ctx) {
        String id = ctx.ID().getText();
        Value variable = null;
        if(ctx.STRING() == null){
            variable = new Value("");
            valueMap.put(id, variable);
            System.err.println("memory put: " + id + " = " + variable);
        }else {
            String value = removeFirstAndLast(ctx.STRING().getText());
            variable = new Value(value);
            valueMap.put(id,variable);
            System.err.println("memory put: " + id + " = " + removeFirstAndLast(value));
        }
        return variable;
    }

    private String removeFirstAndLast(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length() - 1);
        sb.deleteCharAt(0);
        return sb.toString();
    }

    @Override
    public Value visitStringAssignValue(Example2Parser.StringAssignValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = new Value(removeFirstAndLast(ctx.STRING().getText()));
        valueMap.replace(id, value);
        System.err.println("memory put: " + id + " = " + value);

        return value;
    }

    @Override
    public Value visitPrintVar(Example2Parser.PrintVarContext ctx) {
        Value value = null;
        if (ctx.op.getType() == Example2Parser.ID) {
            String id = ctx.ID().getText();
            if(valueMap.get(id) != null){
                value = valueMap.get(id);

                System.err.println("print "+ id + " = " + value);
            }
        }
        if(ctx.op.getType() == Example2Parser.STRING){
            String id = ctx.STRING().getText();
            System.err.println("print "+ removeFirstAndLast(id));
            value = new Value(removeFirstAndLast(id));
        }
        if(ctx.op.getType() == Example2Parser.INT) {
            String id = ctx.INT().getText();
            System.err.println("print "+ id);
            value = new Value(id);
        }
        if(ctx.op.getType() == Example2Parser.BOOLEAN) {
            String id = ctx.BOOLEAN().getText();
            System.err.println("print "+ id);
            value = new Value(id);
        }
        return value;
    }

    @Override
    public Value visitPrintExpr(Example2Parser.PrintExprContext ctx) {
        Value value = visit(ctx.mathExpression());
        System.err.println("printed "+ctx.mathExpression().getText()+" = "+ value);
        return value;
    }

    @Override
    public Value visitBoolAssign(Example2Parser.BoolAssignContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if (ctx.BOOLEAN() == null){
            value = new Value(false);
            valueMap.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        } else {
            value = new Value(parseBoolean(ctx.BOOLEAN().getText().toLowerCase()));
            valueMap.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }
        return value;
    }

    @Override
    public Value visitBoolAssignValue(Example2Parser.BoolAssignValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        value = new Value(parseBoolean(ctx.BOOLEAN().getText().toLowerCase()));
        valueMap.put(id, value);
        System.err.println("memory put: " + id + " = " + value);

        return value;
    }

    @Override
    public Value visitParens(Example2Parser.ParensContext ctx) {
        return visit(ctx.mathExpression());
    }

    @Override
    public Value visitPow(Example2Parser.PowContext ctx) {
        Value left = visit(ctx.mathExpression(0));
        Value right = visit(ctx.mathExpression(1));
        int result = 0;
        result = (int) Math.pow(Double.parseDouble(left.asString()), Double.parseDouble(right.asString()));
        System.err.println(left + " to the power of " + right);
        return new Value(result);

    }
}

