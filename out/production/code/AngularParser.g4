parser grammar AngularParser;

options {
    tokenVocab = AngularLexer;
    }
program
    : statement* EOF ;

statement
    : arrayDeclaration | enum  | variableDeclaration     | functionDeclaration | ifStatement
    | whileStatement | assignmentStatement | breakStatement | continueStatement| html_element
    | importStatement | component | exportClass | thisVarible | class | html ;

component: (Service|Component) OpenParen OpenBrace decorator CloseBrace CloseParen exportClass;
exportClass : Export class;
class : Class Identifier OpenBrace classBody CloseBrace;
classBody: (variableDeclaration | objectDeclataion | arrayDeclaration | functionDeclaration)*;
decorator:  argumentList? ;
argumentList: argument (Comma argument)* Comma?;
argument: Identifier ':' literalValue;
importStatement: Import OpenBrace Identifier CloseBrace From StringLiteral SemiColon;
thisVarible: This'.'Identifier Assign ((This('.'(Identifier|function_call))*)|(Identifier | Identifier'.'Identifier)) SemiColon;
enum: Enum Identifier OpenBrace enumValues* CloseBrace SemiColon;
enumValues: (enumValue (Comma enumValue)*);
enumValue: Identifier Assign literalValue;

variableDeclaration
    : Let_Identify? Identifier Colon (type) Assign expression SemiColon
    ;
arrayDeclaration
    : Let_Identify? Identifier Colon type OpenBracket CloseBracket Assign OpenBracket (literalValue (Comma literalValue)*)? CloseBracket SemiColon
    | Identifier Assign OpenBracket literalValue? (literalValue Comma?)* CloseBracket SemiColon;

functionDeclaration
    : (Identifier | Constructor) OpenParen (parameter (Comma parameter)*)? CloseParen (Colon type)* OpenBrace statement* Return expression SemiColon CloseBrace
    | (Identifier | Constructor) OpenParen (parameter (Comma parameter)*)? CloseParen (Colon Void)* block
    ;
objectDeclataion: Identifier Colon Identifier Assign New Identifier OpenParen (literalValue (Comma literalValue)*)* CloseParen SemiColon;
type
    : TypeNumber
    | TypeString
    | TypeBoolean
    | Array
    | Any
    ;
literalValue
    : NumberLiteral
    | StringLiteral
    | BooleanLiteral
    | listLiteral
    | mapLiteral
    | Null
    | html
    | css
    ;
mapLiteral: OpenBrace Identifier Colon literalValue (Comma (Identifier Colon literalValue) Comma?)* CloseBrace;
listLiteral: OpenBracket (Identifier | literalValue)* (Comma (Identifier | literalValue))* Comma? CloseBracket ;
assignmentStatement
    : Identifier Assign expression (Comma expression)* SemiColon
    | Identifier Assign OpenBracket (literalValue (Comma literalValue)*)? CloseBracket SemiColon
    ;

ifStatement
    : If OpenParen expression CloseParen block (elseIfStatement)* (Else block)?
    ;

whileStatement
    : While OpenParen expression CloseParen block
    ;

elseIfStatement
    : Else If OpenParen expression CloseParen block
    ;

breakStatement
    : Break SemiColon
    ;

continueStatement
    : Continue SemiColon
    ;

block
    : OpenBrace statement* CloseBrace
    ;

expression
    : expression Multiply expression       # Multiplication
    | expression Divide expression         # Division
    | expression Modulus expression        # Modulus
    | expression Plus expression           # Addition
    | expression Minus expression          # Subtraction
    | expression LessThan expression       # LessThanComparison
    | expression GreaterThan expression    # GreaterThanComparison
    | expression LessThanEquals expression # LessThanEqualsComparison
    | expression GreaterThanEquals expression # GreaterThanEqualsComparison
    | expression WeakEqual expression      # WeakEqualsComparison
    | expression StrongEqual expression    # StrongEqualsComparison
    | expression NOT_EQUAL expression                                       # NotEqualsComparison
    | expression And expression                                             # LogicalAndExpressionStatement
    | expression Or expression                                              # LogicalOrExpressionStatement
    | OpenParen expression CloseParen                                       # ParenthesizedExpression
    | Identifier OpenBracket expression CloseBracket                        # BracketExpression
    | AngularExpressionStart expression AngularExpressionEnd                # AngularExpreission
    | Identifier Dot Identifier                                             # PropertyAccess
    | literalValue                                                          # LiteralExpression
    | Identifier     # IdentifierExpression
    | html #dd
    ;



parameter
    : Identifier Colon type
    | Identifier Colon type Assign literalValue
    ;
function_call: Identifier '(' (expression (',' expression)*)? ')';


html:Backtick html_content Backtick;

html_content: (html_element+ |
 '{{' expression '}}' |
 NumberLiteral* Identifier NumberLiteral*)+;

html_element:
      '<' html_tag_name html_attributes? '>' html_content? '<' '/'html_tag_name '>'
    | '<' html_tag_name html_attributes? '>' | '<' html_tag_name html_attributes '/''>';

html_tag_name: Identifier;
//
html_attributes: html_attribute*;
//
html_attribute:
      (ngIfAttribute
              | ngForAttribute
              | onChangeAttribute
              | onClickAttribute
              | Identifier
       HtmlClassAttribute |
        '[' (Identifier | ((Identifier | HtmlClassAttribute) (access_suffix)*)) ']' |
         '(' (Identifier | HtmlClassAttribute) ')' | '*')
      ('=' html_attribute_value)?;
access_suffix
    : '.' Identifier
    | '[' expression ']'
    | '.' function_call
    ;
html_attribute_value: literalValue | expression;
css: OpenBracket Backtick css_content* Backtick CloseBracket;
css_content: Dot? Identifier (Colon Identifier)* OpenBrace css_class_content* CloseBrace;
css_class_content: Identifier Colon (Identifier|NumberLiteral (CssPixel | '%')? |function_call)+ (Comma (Identifier|NumberLiteral (CssPixel | '%')? |function_call)+)* SemiColon;
checkedAttribute
    : CheckedAttributeName Assign OpenBrace expression CloseBrace
    ;
onChangeAttribute
    : OpenParen OnChangeAttributeName CloseParen Assign StringLiteral
    ;
onClickAttribute
    : OpenParen OnClickAttributeName CloseParen Assign StringLiteral
    ;
onSubmitAttribute
    :  OpenParen OnSubmitAttributeName CloseParen Assign StringLiteral
    ;
gapAttribute
    : GapAttributeName Assign OpenBrace expression CloseBrace
    ;
directionAttribute
    : DirectionAttributeName Assign StringLiteral
    ;
durationAttribute
    : DurationAttributeName Assign StringLiteral
    ;
repeatAttribute
    : RepeatAttributeName Assign (NumberLiteral|StringLiteral)
    ;
ngForAttribute
    : NgForDirective Assign  expression
    ;
ngIfAttribute
    : NgIfDirective Assign expression
    ;
