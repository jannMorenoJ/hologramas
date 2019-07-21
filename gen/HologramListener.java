// Generated from /home/jann/Documents/UN/algoritmos/prueba/Hologram.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HologramParser}.
 */
public interface HologramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HologramParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(HologramParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link HologramParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(HologramParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link HologramParser#holograma}.
	 * @param ctx the parse tree
	 */
	void enterHolograma(HologramParser.HologramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HologramParser#holograma}.
	 * @param ctx the parse tree
	 */
	void exitHolograma(HologramParser.HologramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HologramParser#solido}.
	 * @param ctx the parse tree
	 */
	void enterSolido(HologramParser.SolidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HologramParser#solido}.
	 * @param ctx the parse tree
	 */
	void exitSolido(HologramParser.SolidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HologramParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(HologramParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HologramParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(HologramParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HologramParser#rgb}.
	 * @param ctx the parse tree
	 */
	void enterRgb(HologramParser.RgbContext ctx);
	/**
	 * Exit a parse tree produced by {@link HologramParser#rgb}.
	 * @param ctx the parse tree
	 */
	void exitRgb(HologramParser.RgbContext ctx);
	/**
	 * Enter a parse tree produced by {@link HologramParser#figura}.
	 * @param ctx the parse tree
	 */
	void enterFigura(HologramParser.FiguraContext ctx);
	/**
	 * Exit a parse tree produced by {@link HologramParser#figura}.
	 * @param ctx the parse tree
	 */
	void exitFigura(HologramParser.FiguraContext ctx);
}