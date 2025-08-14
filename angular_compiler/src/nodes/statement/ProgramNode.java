package nodes.statement;

import nodes.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode implements ASTNode {
    private  List<StatementNode> statements;
    public ProgramNode() {
        // Initialize the list
        this.statements = new ArrayList<>();
    }

    public List<StatementNode> getStatements() {
        return statements;
    }
    public void setStatements(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "ProgramNode{" + "statements=" + statements + '}';
    }


}
