import gen.Example2BaseVisitor;
import gen.Example2Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;


public class MyVisitor extends Example2BaseVisitor<Value> {

    private final Map<String, Value> valueMap = new HashMap<>();
    Map<String, Value> secondMemory = new HashMap<>();
    Map<String,Example2Parser.Function_blockContext> functionCode_blockMemory = new HashMap<>();

    @Override
    public Value visitTerminal(TerminalNode node) {
        return (new Value(node.getText()));
    }

    @Override
    public Value visitIntAssign(Example2Parser.IntAssignContext ctx) {
        String id = ctx.ID().getText();
        Value value;
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
    public Value visitIncrementAndDecrementInt(Example2Parser.IncrementAndDecrementIntContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        Value old = valueMap.get(id);
        if (ctx.children.get(1).getText().equals("+=")) {
            Value newVal = this.visit(ctx.mathExpression());
            System.err.println("The new value is " + " = " + (Integer.parseInt(old.asString()) + Integer.parseInt(newVal.asString())));
            value = new Value(Integer.parseInt(old.asString()) + Integer.parseInt(newVal.asString()));
            valueMap.put(id, value);
        }else if(ctx.children.get(1).getText().equals("-=")){
            Value newVal = this.visit(ctx.mathExpression());
            System.err.println("The new value is " + " = " + (Integer.parseInt(old.asString()) - Integer.parseInt(newVal.asString())));
            value = new Value(Integer.parseInt(old.asString()) - Integer.parseInt(newVal.asString()));
            valueMap.put(id, value);
        } else if (ctx.children.stream().anyMatch(e -> e.getText().equals("++"))) {
            System.err.println("The new value is " + " = " + (Integer.parseInt(old.asString()) + 1));
            value = new Value(Integer.parseInt(old.asString()) + 1);
            valueMap.put(id, value);
        } else if (ctx.children.stream().anyMatch(e -> e.getText().equals("--"))) {
            System.err.println("The new value is " + " = " + (Integer.parseInt(old.asString()) - 1));
            value = new Value(Integer.parseInt(old.asString()) - 1);
            valueMap.put(id, value);
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
        Value variable;
        if(ctx.expression() == null){
            variable = new Value("");
            valueMap.put(id, variable);
            System.err.println("memory put: " + id + " = " + variable);
        }else {
            Value value = this.visit(ctx.expression());
            variable = new Value(value);
            valueMap.put(id,variable);
            System.err.println("memory put: " + id + " = " + value.toString());
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
        Value value = this.visit(ctx.expression());
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
            System.err.println("print "+ id);
            value = new Value(id);
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
        Value value = this.visit(ctx.mathExpression());
        System.err.println("printed "+ctx.mathExpression().getText()+" = "+ value);
        return value;
    }

    @Override
    public Value visitBoolAssign(Example2Parser.BoolAssignContext ctx) {
        String id = ctx.ID().getText();
        Value value;
        if (ctx.expression() == null){
            value = new Value(false);
        } else {
            value = this.visit(ctx.expression());
        }
        valueMap.put(id, value);
        System.err.println("memory put: " + id + " = " + value);
        return value;
    }

    @Override
    public Value visitBoolAssignValue(Example2Parser.BoolAssignValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expression());
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
        int result;
        result = (int) Math.pow(Double.parseDouble(left.asString()), Double.parseDouble(right.asString()));
        System.err.println(left + " to the power of " + right);
        return new Value(result);

    }

    @Override
    public Value visitComparisonExpression(Example2Parser.ComparisonExpressionContext ctx) {
        Value leftValue = visit(ctx.expression(0));
        Value rightValue = visit(ctx.expression(1));
        int left = Integer.parseInt(leftValue.asString());
        int right = Integer.parseInt(rightValue.asString());

        switch (ctx.getChild(1).getText()) {
            case ">":
                System.err.println("The result is " + " = " + (left > right));
                return new Value(left > right);
            case "<":
                System.err.println("The result is " + " = " + (left < right));
                return new Value(left < right);
            case "<=":
                System.err.println("The result is " + " = " + (left <= right));
                return new Value(left <= right);
            case ">=":
                System.err.println("The result is " + " = " + (left >= right));
                return new Value(left >= right);
            case "==":
                System.err.println("The result is " + " = " + (left == right));
                return new Value(left == right);
            case "!=":
                System.err.println("The result is " + " = " + (left != right));
                return new Value(left != right);
            default:
                return new Value(new Object());
        }
    }

    @Override
    public Value visitAndExpression(Example2Parser.AndExpressionContext ctx) {
        Value value = new Value(this.visit(ctx.expression(0)).asBoolean() && this.visit(ctx.expression(1)).asBoolean());
        System.err.println("The result is of {and} Expr " + " = " + (value));
        return value;
    }

    @Override
    public Value visitOrExpression(Example2Parser.OrExpressionContext ctx) {
        Value value = new Value(this.visit(ctx.expression(0)).asBoolean() || this.visit(ctx.expression(1)).asBoolean());
        System.err.println("The result is of {or} Expr " + " = " + (value));
        return value;
    }

    @Override
    public Value visitWhile_statement(Example2Parser.While_statementContext ctx) {
        Value value = this.visit(ctx.condition_block().expression());

        while (Boolean.TRUE.equals(value.asBoolean())) {
            // Visit code block
            this.visit(ctx.condition_block().code_block());

            // Evaluate expression
            value = this.visit(ctx.condition_block().expression());
        }
        return value;
    }

    @Override
    public Value visitIf_statement(Example2Parser.If_statementContext ctx) {
        var evaluatedBlock = false;
        Value evaluated = this.visit(ctx.condition_block().expression());

        if (Boolean.TRUE.equals(evaluated.asBoolean())) {
            evaluatedBlock = true;

            this.visit(ctx.condition_block().code_block());
        }

        if (!evaluatedBlock && ctx.code_block() != null) {

            this.visit(ctx.code_block());
        }

        return new Value(new Object());
    }

    @Override
    public Value visitFunction_declaration(Example2Parser.Function_declarationContext ctx) {
        String id=(ctx.ID().getText());
        //we save the context in memory so we can visit it later
        functionCode_blockMemory.put(id,ctx.function_block());
        return Value.VOID;
    }

    @Override
    public Value visitFunction_call(Example2Parser.Function_callContext ctx) {
        String name=ctx.ID().getText();

        Map<String, Value> functVariablesMemory = new HashMap<>();

        for (int i = 0; i < functionCode_blockMemory.get(name).parameters_funcDec().ID().size(); i++)
        {
            String formalParam= functionCode_blockMemory.get(name).parameters_funcDec().ID().get(i).getText();
            Value actualParam= this.visit(ctx.parameters_funcCall().expression(i));
            functVariablesMemory.put(formalParam,actualParam);
            print("Formal Parameter: " +formalParam + " -> " + "Actual Parameter: " + actualParam);
        }

        secondMemory.putAll(valueMap);
        valueMap.putAll(functVariablesMemory);


        // TODO only visit the statements
        Value v = null;
        for (Example2Parser.StatementContext statement : functionCode_blockMemory.get(name).code_block().statement()) {
            v = this.visit(statement); //Execute all statements
        }

        valueMap.clear();
        valueMap.putAll(secondMemory);
        return v;
    }

    @Override
    public Value visitReturnStat(Example2Parser.ReturnStatContext ctx) {
        return this.visit(ctx.expression());
    }


    private void print(String val){
        System.err.println(val);
    }
}

