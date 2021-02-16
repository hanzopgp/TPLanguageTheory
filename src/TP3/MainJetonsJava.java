package TP3;

import org.antlr.v4.runtime.*;

class MainJetonsJava {
    public static void main(String args[]) throws Exception {
        ANTLRInputStream inputStream = args.length == 0
                ? new ANTLRInputStream(System.in)
                : new ANTLRFileStream(args[0]);

        JetonsJava lex = new JetonsJava(inputStream);

        while(true) {
            Token token = lex.nextToken();
            if (token.getType() == Token.EOF)
                break;
            System.out.println(token);
        }
    }
}