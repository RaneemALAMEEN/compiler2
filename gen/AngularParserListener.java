// Generated from C:/Users/ITE/Desktop/code/angular_compiler/src/AngularParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngularParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportClass}.
	 * @param ctx the parse tree
	 */
	void enterExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportClass}.
	 * @param ctx the parse tree
	 */
	void exitExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(AngularParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(AngularParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(AngularParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(AngularParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#thisVarible}.
	 * @param ctx the parse tree
	 */
	void enterThisVarible(AngularParser.ThisVaribleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#thisVarible}.
	 * @param ctx the parse tree
	 */
	void exitThisVarible(AngularParser.ThisVaribleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(AngularParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(AngularParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void enterEnumValues(AngularParser.EnumValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void exitEnumValues(AngularParser.EnumValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(AngularParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(AngularParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectDeclataion}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclataion(AngularParser.ObjectDeclataionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectDeclataion}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(AngularParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(AngularParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteral(AngularParser.MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteral(AngularParser.MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(AngularParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(AngularParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dd}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDd(AngularParser.DdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dd}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDd(AngularParser.DdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsComparison(AngularParser.NotEqualsComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsComparison(AngularParser.NotEqualsComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpressionStatement}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpressionStatement(AngularParser.LogicalOrExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpressionStatement}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpressionStatement(AngularParser.LogicalOrExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(AngularParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(AngularParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(AngularParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(AngularParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrongEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStrongEqualsComparison(AngularParser.StrongEqualsComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrongEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStrongEqualsComparison(AngularParser.StrongEqualsComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AngularExpreission}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAngularExpreission(AngularParser.AngularExpreissionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AngularExpreission}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAngularExpreission(AngularParser.AngularExpreissionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqualsComparison(AngularParser.GreaterThanEqualsComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqualsComparison(AngularParser.GreaterThanEqualsComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanComparison(AngularParser.GreaterThanComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanComparison(AngularParser.GreaterThanComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(AngularParser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(AngularParser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(AngularParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(AngularParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(AngularParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(AngularParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulus(AngularParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulus(AngularParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WeakEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterWeakEqualsComparison(AngularParser.WeakEqualsComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WeakEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitWeakEqualsComparison(AngularParser.WeakEqualsComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(AngularParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(AngularParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpressionStatement}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpressionStatement(AngularParser.LogicalAndExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpressionStatement}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpressionStatement(AngularParser.LogicalAndExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqualsComparison(AngularParser.LessThanEqualsComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqualsComparison(AngularParser.LessThanEqualsComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanComparison(AngularParser.LessThanComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanComparison(AngularParser.LessThanComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AngularParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AngularParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngularParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html_content}.
	 * @param ctx the parse tree
	 */
	void enterHtml_content(AngularParser.Html_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html_content}.
	 * @param ctx the parse tree
	 */
	void exitHtml_content(AngularParser.Html_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterHtml_element(AngularParser.Html_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitHtml_element(AngularParser.Html_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html_tag_name}.
	 * @param ctx the parse tree
	 */
	void enterHtml_tag_name(AngularParser.Html_tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html_tag_name}.
	 * @param ctx the parse tree
	 */
	void exitHtml_tag_name(AngularParser.Html_tag_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html_attributes}.
	 * @param ctx the parse tree
	 */
	void enterHtml_attributes(AngularParser.Html_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html_attributes}.
	 * @param ctx the parse tree
	 */
	void exitHtml_attributes(AngularParser.Html_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void enterHtml_attribute(AngularParser.Html_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void exitHtml_attribute(AngularParser.Html_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#access_suffix}.
	 * @param ctx the parse tree
	 */
	void enterAccess_suffix(AngularParser.Access_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#access_suffix}.
	 * @param ctx the parse tree
	 */
	void exitAccess_suffix(AngularParser.Access_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html_attribute_value}.
	 * @param ctx the parse tree
	 */
	void enterHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html_attribute_value}.
	 * @param ctx the parse tree
	 */
	void exitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#css}.
	 * @param ctx the parse tree
	 */
	void enterCss(AngularParser.CssContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#css}.
	 * @param ctx the parse tree
	 */
	void exitCss(AngularParser.CssContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#css_content}.
	 * @param ctx the parse tree
	 */
	void enterCss_content(AngularParser.Css_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#css_content}.
	 * @param ctx the parse tree
	 */
	void exitCss_content(AngularParser.Css_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#css_class_content}.
	 * @param ctx the parse tree
	 */
	void enterCss_class_content(AngularParser.Css_class_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#css_class_content}.
	 * @param ctx the parse tree
	 */
	void exitCss_class_content(AngularParser.Css_class_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#checkedAttribute}.
	 * @param ctx the parse tree
	 */
	void enterCheckedAttribute(AngularParser.CheckedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#checkedAttribute}.
	 * @param ctx the parse tree
	 */
	void exitCheckedAttribute(AngularParser.CheckedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#onChangeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterOnChangeAttribute(AngularParser.OnChangeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#onChangeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitOnChangeAttribute(AngularParser.OnChangeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#onClickAttribute}.
	 * @param ctx the parse tree
	 */
	void enterOnClickAttribute(AngularParser.OnClickAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#onClickAttribute}.
	 * @param ctx the parse tree
	 */
	void exitOnClickAttribute(AngularParser.OnClickAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#onSubmitAttribute}.
	 * @param ctx the parse tree
	 */
	void enterOnSubmitAttribute(AngularParser.OnSubmitAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#onSubmitAttribute}.
	 * @param ctx the parse tree
	 */
	void exitOnSubmitAttribute(AngularParser.OnSubmitAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#gapAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGapAttribute(AngularParser.GapAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#gapAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGapAttribute(AngularParser.GapAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#directionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDirectionAttribute(AngularParser.DirectionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#directionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDirectionAttribute(AngularParser.DirectionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#durationAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDurationAttribute(AngularParser.DurationAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#durationAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDurationAttribute(AngularParser.DurationAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#repeatAttribute}.
	 * @param ctx the parse tree
	 */
	void enterRepeatAttribute(AngularParser.RepeatAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#repeatAttribute}.
	 * @param ctx the parse tree
	 */
	void exitRepeatAttribute(AngularParser.RepeatAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngForAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNgForAttribute(AngularParser.NgForAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngForAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNgForAttribute(AngularParser.NgForAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngIfAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNgIfAttribute(AngularParser.NgIfAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngIfAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNgIfAttribute(AngularParser.NgIfAttributeContext ctx);
}