// Generated from C:/Users/karna/Desktop/JavaProject/TPLanguageTheory/src/TP4\AnBn.g4 by ANTLR 4.9.1
package TP4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnBnParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnBnVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnBnParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AnBnParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnBnParser#anbn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnbn(AnBnParser.AnbnContext ctx);
}