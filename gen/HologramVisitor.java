// Generated from /home/jann/Documents/UN/algoritmos/prueba/Hologram.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HologramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HologramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HologramParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(HologramParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link HologramParser#holograma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHolograma(HologramParser.HologramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HologramParser#solido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolido(HologramParser.SolidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HologramParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(HologramParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HologramParser#rgb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgb(HologramParser.RgbContext ctx);
	/**
	 * Visit a parse tree produced by {@link HologramParser#figura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigura(HologramParser.FiguraContext ctx);
}