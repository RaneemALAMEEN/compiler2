package nodes.statement;

import nodes.ASTNode;

// Node for parameter
public class ParameterNode implements ASTNode {
    public  String identifier;
    public  TypeNode type;
    public  LiteralValueNode defaultValue;



    @Override
    public String toString() {
        return "Parameter(identifier=" + identifier + ", type=" + type + ", defaultValue=" + defaultValue + ")";
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public TypeNode getType() {
        return type;
    }

    public void setType(TypeNode type) {
        this.type = type;
    }

    public ASTNode getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(LiteralValueNode defaultValue) {
        this.defaultValue = defaultValue;
    }
}
