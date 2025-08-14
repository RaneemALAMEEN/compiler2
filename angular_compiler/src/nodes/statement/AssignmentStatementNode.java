package nodes.statement;

import nodes.ASTNode;

import java.util.List;

// Node for assignment statement
public class AssignmentStatementNode implements ASTNode {
    public  String identifier;
    public  ASTNode expression;
    public  List<ASTNode> values;


    @Override
    public String toString() {
        return "AssignmentStatement(identifier=" + identifier + ", expression=" + expression + ", values=" + values + ")";
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    public List<ASTNode> getValues() {
        return values;
    }

    public void setValues(List<ASTNode> values) {
        this.values = values;
    }
}
