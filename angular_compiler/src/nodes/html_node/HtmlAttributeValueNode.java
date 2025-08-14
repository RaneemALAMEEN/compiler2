package nodes.html_node;

import nodes.ASTNode;
import nodes.statement.ExpressionNode;
import nodes.statement.LiteralValueNode;

public class HtmlAttributeValueNode implements ASTNode {
    LiteralValueNode value;
    ExpressionNode expression;

    public LiteralValueNode getValue() {
        return value;
    }

    public void setValue(LiteralValueNode value) {
        this.value = value;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "HtmlAttributeValueNode{" +
                "value=" + value +
                ", expression=" + expression +
                '}';
    }
}
