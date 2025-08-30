package nodes.statement;

import nodes.ASTNode;

// Node for expression
public class ExpressionNode implements ASTNode {
    public  String operator;
    public  ASTNode left;
    public  ASTNode right;

    @Override
    public String toString() {
        return "Expression(operator=" + operator + ", left=" + left + ", right=" + right + ")";
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ASTNode getLeft() {
        return left;
    }

    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public ASTNode getRight() {
        return right;
    }

    public void setRight(ASTNode right) {
        this.right = right;
    }
}
