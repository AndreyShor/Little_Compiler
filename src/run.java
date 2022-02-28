import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Trees;
import org.w3c.dom.traversal.TreeWalker;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class run {

    public static void main(String[] args) throws IOException {

            // Print Menu
            System.out.println("////////////////////////////////////////");
            System.out.println(" ____  _      ____  ____  ________  _   _     ____  _     \n" +
                    "/  _ \\/ \\  /|/  _ \\/  __\\/  __/\\  \\//  / \\   /  _ \\/ \\  /|\n" +
                    "| / \\|| |\\ ||| | \\||  \\/||  \\   \\  /   | |   | / \\|| |\\ ||\n" +
                    "| |-||| | \\||| |_/||    /|  /_  / /    | |_/\\| |-||| | \\||\n" +
                    "\\_/ \\|\\_/  \\|\\____/\\_/\\_\\\\____\\/_/     \\____/\\_/ \\|\\_/  \\|\n" +
                    "                                                          ");
            System.out.println("");
            System.out.println("Start of the Compiler for andrey_lan");
            System.out.println("");
            System.out.println("////////////////////////////////////////");

            // take url to the file e.g ./src/test.txt
            System.out.println("Please enter URL for a file to compile:");
            Scanner input = new Scanner(System.in);  // Create a Scanner object

            String fileURl = input.nextLine();


            CharStream in = CharStreams.fromFileName(fileURl);
            // automatically check for errors
            System.out.println("Founded syntax error:");
            andrey_lanLexer lexer = new andrey_lanLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            andrey_lanParser parser = new andrey_lanParser(tokens);
            ParseTree parseTree = parser.prog();
            System.out.println("Able to continue");
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("1) Print Parse Tree");
            System.out.println("2) Print Pretty print and execute code");
            System.out.println("3) Exit from the program");
            // input options of use
            String option = input.nextLine();
            int command = Integer.parseInt(option);
            switch (command) {
                case 1:
                    System.out.println( printSyntaxTree(parser, parseTree));
                    break;
                case 2:
                    MyVisitor evaluation = new MyVisitor();
                    evaluation.visit(parseTree);
                    break;
                case 3:
                    break;
            }

    }

    public static String printSyntaxTree(Parser parser, ParseTree root) {
        // String builder create string representation of the tree
        StringBuilder buf = new StringBuilder();
        recursive(root, buf, 0, Arrays.asList(parser.getRuleNames()));
        return buf.toString();
    }

    // Function which recursively check all nodes in a tree
    private static void recursive(ParseTree aRoot, StringBuilder buf, int offset, List<String> ruleNames) {
        for (int i = 0; i < offset; i++) {
            buf.append("  ");
        }
        buf.append(Trees.getNodeText(aRoot, ruleNames)).append("\n");
        if (aRoot instanceof ParserRuleContext) {
            ParserRuleContext prc = (ParserRuleContext) aRoot;
            if (prc.children != null) {
                for (ParseTree child : prc.children) {
                    recursive(child, buf, offset + 1, ruleNames);
                }
            }
        }
    }

}
