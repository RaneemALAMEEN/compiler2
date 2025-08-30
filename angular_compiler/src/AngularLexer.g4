lexer grammar AngularLexer;

NgIfDirective: '*ngIf';
NgForDirective: '*ngFor';

Import:'import';
Export:'export';
Component:'@Component';
Service:'@Injectable';
Class: 'Class';
HtmlClassAttribute: 'class' ;
InlineAttributeName: 'inline';
BackgroundColorAttributeName: 'backgroundColor';
TextColorAttributeName: 'textColor';
TypeAttributeName: 'type';
LabelAttributeName: 'label';
ValueAttributeName: 'value';
PlaceHolderAttributeName: 'placeholder';
CheckedAttributeName: 'chacked';
TargetAttributeName: 'target';
OnSubmitAttributeName: 'submit';
OnChangeAttributeName: 'change';
OnClickAttributeName: 'click';
HeadingLevelAttributeName: 'level';
DirectionAttributeName: 'direction';
DurationAttributeName: 'duration';
RepeatAttributeName: 'repeat';

OpenBracket: '[';
CloseBracket: ']';
OpenParen: '(';
CloseParen: ')';
OpenBrace: '{';
CloseBrace: '}';
SemiColon: ';';
Comma: ',';
Assign: '=';
Colon: ':';
QuestionMark: '?';
Dot: '.';
Plus: '+';
Minus: '-';
Multiply: '*';
At:'@';
Divide: '/';
Modulus: '%';
Not: '!';
LessThan: '<';
GreaterThan: '>';
LessThanEquals: '<=';
GreaterThanEquals: '>=';
NOT_EQUAL: '!=';
WeakEqual: '==';
StrongEqual:'===';
And:'&&';
Or:'||';


AngularExpressionStart : '{{';
AngularExpressionEnd : '}}';

Let_Identify: 'let';
If: 'if';
Else: 'else';
While: 'while';
Break: 'break';
Void: 'void';
Continue: 'continue';
Function: 'function';
Return: 'return';
From: 'from';
Null: 'null';
Enum: 'enum';
Array: 'Array';
Any: 'any';
TypeNumber: 'number';
TypeString: 'string';
TypeBoolean: 'boolean';
This: 'this';
Constructor: 'constructor';
New: 'new';

NumberLiteral: [0-9]+ ('.' [0-9]+)?;
StringLiteral: '"' .*? '"' | ('\'' .*? '\'');
BooleanLiteral: 'true' | 'false';

Backtick: '`';

Identifier: [a-zA-Z_][a-zA-Z0-9_-]*;

CssPixel: 'px';

SingleLineComment: '//' ~[\r\n]* -> channel(HIDDEN);
MultiLineComment: '/*' .*? '*/' -> channel(HIDDEN);

WS: [ \t\r\n]+ -> skip;
