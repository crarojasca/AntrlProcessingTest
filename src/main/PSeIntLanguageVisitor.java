// Generated from PSeIntLanguage.g by ANTLR 4.5.3
package main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PSeIntLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PSeIntLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PSeIntLanguageParser#mainprocess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainprocess(PSeIntLanguageParser.MainprocessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeIntLanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PSeIntLanguageParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSeIntLanguageParser#drawellipse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawellipse(PSeIntLanguageParser.DrawellipseContext ctx);
}