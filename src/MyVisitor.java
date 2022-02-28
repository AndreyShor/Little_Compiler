import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends andrey_lanBaseVisitor<Float> {

    Map<String, Float> memory = new HashMap<>();

    @Override public Float visitProg(andrey_lanParser.ProgContext ctx) {return visitChildren(ctx); }

    @Override public Float visitPrintExpr(andrey_lanParser.PrintExprContext ctx) {
        Float value = visit(ctx.expr());
        return 0.0f;
    }

    @Override public Float visitAssign(andrey_lanParser.AssignContext ctx) {
        // get variable ID from parse tree
        String variableID = ctx.VARIABLE().getText();
        // get variable value from parse tree
        Float variableValue = visit(ctx.expr());
        // save value into memory array
        memory.put(variableID, variableValue);

        // Part for pretty print, print variable declaration
        System.out.println("Variable " + variableID + " = " + variableValue);
        return variableValue;
    }

    @Override public Float visitBlank(andrey_lanParser.BlankContext ctx) { return visitChildren(ctx); }

    @Override public Float visitParens(andrey_lanParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Float visitVar(andrey_lanParser.VarContext ctx) {
        // convert variable into integer value during calculation process
        String variableID = ctx.VARIABLE().getText();
        if(memory.containsKey(variableID)){
            return memory.get(variableID);
        }
        return 0.0f;

    }

    @Override public Float visitInt(andrey_lanParser.IntContext ctx) {
        // Convert integer to the float for "common measure"
        int value = Integer.parseInt(ctx.INTTEGER().getText());
        return (float) value;
    }

    @Override public Float visitFloat(andrey_lanParser.FloatContext ctx) {
        // Extract float number
        return Float.valueOf(ctx.FLOATING().getText());
    }



    @Override public Float visitAddSub(andrey_lanParser.AddSubContext ctx) {
        // get left side between operator
        Float left = visit(ctx.expr(0));
        // get right side between operator
        Float right = visit(ctx.expr(1));
        // check type of operation ADD or SUB
        if (ctx.op.getType() == andrey_lanParser.ADD) {
            System.out.println("Operation Done: " + left + " + " + right);
            return left + right;
        }
        System.out.println("Operation Done: " + left + " - " + right);
        return left - right;

    }


    @Override public Float visitMulDiv(andrey_lanParser.MulDivContext ctx) {
        // get left side between operator
        Float left = visit(ctx.expr(0));
        // get right side between operator
        Float right = visit(ctx.expr(1));
        // check type of operation MUL or DIV
        if (ctx.op.getType() == andrey_lanParser.MUL) {
            System.out.println("Operation Done: " + left + " * " + right);
            return left * right;
        }
        System.out.println("Operation Done: " + left + " / " + right);
        return left * right;
    }
}
