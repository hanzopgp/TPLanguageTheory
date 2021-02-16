package TP3;

import org.antlr.v4.runtime.*;

public class MainJetonsJava {
    public static void main(String args[]) throws Exception {
        ANTLRInputStream inputStream = args.length == 0 ? new ANTLRInputStream(System.in)
                : new ANTLRFileStream(args[0]);

        JetonsJava lex = new JetonsJava(inputStream);

        HTMLFileCreation html = new HTMLFileCreation("index.html");
        while (true) {
            Token token = lex.nextToken();
            if (token.getType() == Token.EOF)
                break;
            switch (token.getType()) {
                case 1:
                    html.writeOperator(token.getText());
                    break;
                case 2:
                    html.writeKeyword(token.getText());
                    break;
                case 4:
                    if (token.getText().contains("\n")) {
                        html.writeLineBreak(token.getText());
                    } else if (token.getText().contains("\t")) {
                        System.out.println("ok");
                        html.writeTab();
                    } else {
                        html.write(token.getText());
                    }
                    break;
                case 5:
                    html.writeNumber(token.getText());
                    break;
                case 6:
                    html.writeComment(token.getText());
                    break;
                case 7:
                    html.writeMultilineComment(token.getText());
                    break;
                default:
                    if (token.getText().equals(" ")) {
                        html.writeWhiteSpace();
                    } else {
                        html.write(token.getText());
                    }
                    break;
            }
            // System.out.println(token);
            // double truc = 10.03;
            // double exp = 1e+3;
            /*
             * Test sur plusieurs lignes eeeee
             * eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
             * eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
             */
        }
        html.closeFile();
    }
}

//class MainJetonsJava {
//    public static void main(String args[]) throws Exception {
//        ANTLRInputStream inputStream = args.length == 0
//                ? new ANTLRInputStream(System.in)
//                : new ANTLRFileStream(args[0]);
//
//        JetonsJava lex = new JetonsJava(inputStream);
//
//        while(true) {
//            Token token = lex.nextToken();
//            if (token.getType() == Token.EOF)
//                break;
//        }
//    }
//}