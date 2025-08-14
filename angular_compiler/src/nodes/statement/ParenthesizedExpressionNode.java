package nodes.statement;

import nodes.ASTNode;

// Node for parenthesized expression
public class ParenthesizedExpressionNode implements ASTNode {
    public  ASTNode expression;

    public ParenthesizedExpressionNode(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ParenthesizedExpression(expression=" + expression + ")";
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }
}
