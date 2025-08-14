package nodes.statement;

import nodes.ASTNode;

import java.util.ArrayList;
import java.util.List;

// Node for array declaration
public class ArrayDeclarationNode implements ASTNode {
    public  String identifier;
    public  TypeNode type;
    public  List<LiteralValueNode> values;

    @Override
    public String toString() {
        return "ArrayDeclaration(identifier=" + identifier + ", type=" + type + ", values=" + values + ")";
    }


    public String getIdentifier() {
        return identifier;
    }

    public TypeNode getType() {
        return type;
    }

    public List<LiteralValueNode> getValues() {
        return values;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setType(TypeNode type) {
        this.type = type;
    }

    public void setValues(List<LiteralValueNode> values) {
        this.values = values;
    }
}
