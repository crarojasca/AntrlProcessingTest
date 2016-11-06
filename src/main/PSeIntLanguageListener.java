// Generated from PSeIntLanguage.g by ANTLR 4.5.3
package main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSeIntLanguageParser}.
 */
public interface PSeIntLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSeIntLanguageParser#mainprocess}.
	 * @param ctx the parse tree
	 */
	void enterMainprocess(PSeIntLanguageParser.MainprocessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntLanguageParser#mainprocess}.
	 * @param ctx the parse tree
	 */
	void exitMainprocess(PSeIntLanguageParser.MainprocessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PSeIntLanguageParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PSeIntLanguageParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSeIntLanguageParser#drawellipse}.
	 * @param ctx the parse tree
	 */
	void enterDrawellipse(PSeIntLanguageParser.DrawellipseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSeIntLanguageParser#drawellipse}.
	 * @param ctx the parse tree
	 */
	void exitDrawellipse(PSeIntLanguageParser.DrawellipseContext ctx);
}