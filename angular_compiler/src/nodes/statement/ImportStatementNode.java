package nodes.statement;

import nodes.ASTNode;

// Import statement node
public class ImportStatementNode implements ASTNode {
    private String identifier;
    private  String source;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Import" +
                "identifier='" + identifier + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
