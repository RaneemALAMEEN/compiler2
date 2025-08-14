package nodes.statement;

import nodes.ASTNode;

public class FunctionCallNode implements ASTNode {
    private String identifier;
    private ExpressionNode expression;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "FunctionCallNode{" +
                "identifier='" + identifier + '\'' +
                ", expression=" + expression +
                '}';
    }
}
