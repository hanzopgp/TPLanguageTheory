// Generated from C:/Users/karna/Desktop/JavaProject/TPLanguageTheory/src/TP4\AnBn.g4 by ANTLR 4.9.1
package TP4;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link AnBnVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class AnBnBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements AnBnVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFile(AnBnParser.FileContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnbn(AnBnParser.AnbnContext ctx) { return visitChildren(ctx); }
}