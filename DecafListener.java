// Generated from Decaf.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DecafParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DecafParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_varDeclaration}
	 * labeled alternative in {@link DecafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_varDeclaration(DecafParser.Single_varDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_varDeclaration}
	 * labeled alternative in {@link DecafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_varDeclaration(DecafParser.Single_varDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_varDeclaration}
	 * labeled alternative in {@link DecafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_varDeclaration(DecafParser.Array_varDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_varDeclaration}
	 * labeled alternative in {@link DecafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_varDeclaration(DecafParser.Array_varDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(DecafParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(DecafParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterInt_varType(DecafParser.Int_varTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitInt_varType(DecafParser.Int_varTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterChar_varType(DecafParser.Char_varTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitChar_varType(DecafParser.Char_varTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_varType(DecafParser.Boolean_varTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_varType(DecafParser.Boolean_varTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structImpl_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterStructImpl_varType(DecafParser.StructImpl_varTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structImpl_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitStructImpl_varType(DecafParser.StructImpl_varTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structDecl_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl_varType(DecafParser.StructDecl_varTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structDecl_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl_varType(DecafParser.StructDecl_varTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVoid_varType(DecafParser.Void_varTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_varType}
	 * labeled alternative in {@link DecafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVoid_varType(DecafParser.Void_varTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_methodDeclaration(DecafParser.Int_methodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_methodDeclaration(DecafParser.Int_methodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChar_methodDeclaration(DecafParser.Char_methodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChar_methodDeclaration(DecafParser.Char_methodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_methodDeclaration(DecafParser.Boolean_methodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_methodDeclaration(DecafParser.Boolean_methodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVoid_methodDeclaration(DecafParser.Void_methodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_methodDeclaration}
	 * labeled alternative in {@link DecafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVoid_methodDeclaration(DecafParser.Void_methodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_parameterDeclaration}
	 * labeled alternative in {@link DecafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterSingle_parameterDeclaration(DecafParser.Single_parameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_parameterDeclaration}
	 * labeled alternative in {@link DecafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitSingle_parameterDeclaration(DecafParser.Single_parameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_parameterType}
	 * labeled alternative in {@link DecafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterInt_parameterType(DecafParser.Int_parameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_parameterType}
	 * labeled alternative in {@link DecafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitInt_parameterType(DecafParser.Int_parameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_parameterType}
	 * labeled alternative in {@link DecafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterChar_parameterType(DecafParser.Char_parameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_parameterType}
	 * labeled alternative in {@link DecafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitChar_parameterType(DecafParser.Char_parameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_parameterType}
	 * labeled alternative in {@link DecafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_parameterType(DecafParser.Boolean_parameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_parameterType}
	 * labeled alternative in {@link DecafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_parameterType(DecafParser.Boolean_parameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(DecafParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(DecafParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(DecafParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(DecafParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(DecafParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(DecafParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethod_statement(DecafParser.Method_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethod_statement(DecafParser.Method_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(DecafParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(DecafParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(DecafParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(DecafParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_assign_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterChar_assign_statement(DecafParser.Char_assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_assign_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitChar_assign_statement(DecafParser.Char_assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(DecafParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_statement}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(DecafParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_location}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterSingle_location(DecafParser.Single_locationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_location}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitSingle_location(DecafParser.Single_locationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_location}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterArray_location(DecafParser.Array_locationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_location}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitArray_location(DecafParser.Array_locationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_literal_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal_expression(DecafParser.Int_literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_literal_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal_expression(DecafParser.Int_literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot_expression(DecafParser.Not_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot_expression(DecafParser.Not_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_op_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRel_op_expression(DecafParser.Rel_op_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_op_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRel_op_expression(DecafParser.Rel_op_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall_expression(DecafParser.MethodCall_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall_expression(DecafParser.MethodCall_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_location_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar_location_expression(DecafParser.Var_location_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_location_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar_location_expression(DecafParser.Var_location_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq_op_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEq_op_expression(DecafParser.Eq_op_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq_op_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEq_op_expression(DecafParser.Eq_op_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative_expression(DecafParser.Negative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative_expression(DecafParser.Negative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_literal_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal_expression(DecafParser.Char_literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_literal_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal_expression(DecafParser.Char_literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_literal_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal_expression(DecafParser.Bool_literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_literal_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal_expression(DecafParser.Bool_literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arith_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(DecafParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arith_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(DecafParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_op_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_op_expression(DecafParser.Cond_op_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_op_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_op_expression(DecafParser.Cond_op_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens_expression(DecafParser.Parens_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens_expression}
	 * labeled alternative in {@link DecafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens_expression(DecafParser.Parens_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(DecafParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(DecafParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(DecafParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(DecafParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(DecafParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(DecafParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(DecafParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(DecafParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(DecafParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(DecafParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(DecafParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(DecafParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(DecafParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(DecafParser.Bool_literalContext ctx);
}