package nodes.statement;

import nodes.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ObjectDeclarationNode implements ASTNode {
    public  String identifier;
    public  String className;
    public  List<LiteralValueNode> constructorArgs = new ArrayList<>();

    @Override
    public String toString() {
        return "ObjectDeclaration(identifier=" + identifier + ", className=" + className + ", constructorArgs=" + constructorArgs + ")";
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<LiteralValueNode> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<LiteralValueNode> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }
}
