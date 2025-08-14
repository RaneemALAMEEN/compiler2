package nodes.statement;

import nodes.ASTNode;

import java.util.List;

// Node for block
public class BlockNode implements ASTNode {
    public  List<ASTNode> statements;

    public BlockNode(List<ASTNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Block(statements=" + statements + ")";
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    public void setStatements(List<ASTNode> statements) {
        this.statements = statements;
    }
}
