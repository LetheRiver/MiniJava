// Generated from C:\Users\Angel\Desktop\MiniJava\src\MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void enterMainclass(MiniJavaParser.MainclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void exitMainclass(MiniJavaParser.MainclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(MiniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(MiniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(MiniJavaParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(MiniJavaParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclaration(MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclaration(MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MiniJavaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MiniJavaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 */
	void enterLessExpr(MiniJavaParser.LessExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 */
	void exitLessExpr(MiniJavaParser.LessExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(MiniJavaParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(MiniJavaParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(MiniJavaParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(MiniJavaParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MiniJavaParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MiniJavaParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewarrayExpr(MiniJavaParser.NewarrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewarrayExpr(MiniJavaParser.NewarrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewidExpr(MiniJavaParser.NewidExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewidExpr(MiniJavaParser.NewidExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(MiniJavaParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(MiniJavaParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MiniJavaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MiniJavaParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MiniJavaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MiniJavaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(MiniJavaParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(MiniJavaParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#specialElement}.
	 * @param ctx the parse tree
	 */
	void enterSpecialElement(MiniJavaParser.SpecialElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#specialElement}.
	 * @param ctx the parse tree
	 */
	void exitSpecialElement(MiniJavaParser.SpecialElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MiniJavaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MiniJavaParser.IntegerContext ctx);
}