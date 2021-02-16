package TP3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLFileCreation {
    private final PrintWriter out;

    HTMLFileCreation(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
        this.out = new PrintWriter(filename);
        this.write("<html lang=\"fr\"><head><title>Code coloré</title><style>.number {color: #a2ed51;} .operator {color: #eba834;} .keyword {color: #f01a70; font-weight: bold;} .comment {color: #468755;}</style></head><body>");
    }

    void writeWhiteSpace() throws IOException {
        this.write("&nbsp;");
    }

    void writeOperator(String op) throws IOException {
        this.write("<span class=\"operator\">" + op + "</span>");
    }

    void writeKeyword(String keyword) throws IOException {
        this.write("<span class=\"keyword\">" + keyword + "</span>");
    }

    void writeNumber(String number) throws IOException {
        this.write("<span class=\"number\">" + number + "</span>");
    }

    void writeComment(String comment) throws IOException {
        this.write("<span class=\"comment\">" + comment + "</span>");
    }

    void writeMultilineComment(String comment) throws IOException {
        comment = comment.replaceAll(" ", "&nbsp;");
        comment = comment.replaceAll("\\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
        comment = comment.replaceAll("\\n", "<br />");
        this.writeComment("<span class=\"comment\">" + comment + "</span>");
    }

    void writeLineBreak(String content) throws IOException {
        content = content.replaceAll("\\n", "<br />");
        this.write(content);
    }

    void writeTab() throws IOException {
        this.writeWhiteSpace();
        this.writeWhiteSpace();
        this.writeWhiteSpace();
        this.writeWhiteSpace();
    }

    void write(String value) throws IOException {
        this.out.print(value);
    }

    void closeFile() throws IOException {
        String value = "</body></html>";
        this.write(value);
        this.out.close();
    }
}