package nodes.html_node;

import nodes.ASTNode;
import nodes.statement.IdentifierNode;

public class HtmlTagNode implements ASTNode {
    private String identifierNode;

    public String getIdentifierNode() {
        return identifierNode;
    }

    public void setIdentifierNode(String identifierNode) {
        this.identifierNode = identifierNode;
    }

    @Override
    public String toString() {
        return "HtmlTagNode{" +
                "identifierNode=" + identifierNode +
                '}';
    }
}
