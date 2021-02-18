// Generated from C:/Users/karna/Desktop/JavaProject/TPLanguageTheory/src/TP4\Calculette.g4 by ANTLR 4.9.1
package TP4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculetteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculetteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CalculetteParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculetteParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalculetteParser.ExprContext ctx);
}