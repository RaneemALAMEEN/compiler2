package nodes.statement;

import nodes.ASTNode;

import java.util.List;

// Node for list literal
public class ListLiteralNode implements ASTNode {
    public  List<String> identifiers;


    @Override
    public String toString() {
        return "ListLiteral(identifiers=" + identifiers + ")";
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }
}
