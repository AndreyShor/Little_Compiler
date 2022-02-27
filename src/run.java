import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class run {

    public static void main(String[] args) throws IOException {


        CharStream in = CharStreams.fromFileName("./src/test.andrey_lan");

        andrey_lanLexer lexer = new andrey_lanLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        andrey_lanParser parser = new andrey_lanParser(tokens);

        ParseTree parseTree = parser.expr();
        System.out.println(parseTree.toStringTree());
    }

}
