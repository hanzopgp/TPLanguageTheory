// Generated from C:/Users/karna/Desktop/JavaProject/TPLanguageTheory/src/TP4\AnBn.g4 by ANTLR 4.9.1
package TP4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnBnParser}.
 */
public interface AnBnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnBnParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AnBnParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnBnParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AnBnParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnBnParser#anbn}.
	 * @param ctx the parse tree
	 */
	void enterAnbn(AnBnParser.AnbnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnBnParser#anbn}.
	 * @param ctx the parse tree
	 */
	void exitAnbn(AnBnParser.AnbnContext ctx);
}