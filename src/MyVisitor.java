import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends andrey_lanBaseVisitor<Float> {

    Map<String, Float> memory = new HashMap<>();

    @Override public Float visitProg(andrey_lanParser.ProgContext ctx) { return visitChildren(ctx); }

    // Evaluator
    @Override public Float visitPrintExpr(andrey_lanParser.PrintExprContext ctx) {
        Float value = visit(ctx.expr());
        System.out.println(value);
        return 0.0f;
    }

    @Override public Float visitAssign(andrey_lanParser.AssignContext ctx) {

        String variableID = ctx.VARIABLE().getText();
        Float variableValue = visit(ctx.expr());
        memory.put(variableID, variableValue);
        return variableValue;
    }

    @Override public Float visitBlank(andrey_lanParser.BlankContext ctx) { return visitChildren(ctx); }

    @Override public Float visitParens(andrey_lanParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Float visitVar(andrey_lanParser.VarContext ctx) {
        String variableID = ctx.VARIABLE().getText();
        if(memory.containsKey(variableID)){
            return memory.get(variableID);
        }
        return 0.0f;

    }

    @Override public Float visitInt(andrey_lanParser.IntContext ctx) {
        int value = Integer.parseInt(ctx.INTTEGER().getText());
        return (float) value;
    }

    @Override public Float visitFloat(andrey_lanParser.FloatContext ctx) {
        return Float.valueOf(ctx.FLOATING().getText());
    }



    @Override public Float visitAddSub(andrey_lanParser.AddSubContext ctx) {
        Float left = visit(ctx.expr(0));
        Float right = visit(ctx.expr(1));
        if (ctx.op.getType() == andrey_lanParser.ADD) {
            return left + right;
        }
        return left - right;
    }


    @Override public Float visitMulDiv(andrey_lanParser.MulDivContext ctx) {

        Float left = visit(ctx.expr(0));
        Float right = visit(ctx.expr(1));
        if (ctx.op.getType() == andrey_lanParser.MUL) {
            return left * right;
        }
        return left * right;
    }
}
