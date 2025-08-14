package nodes.statement;

import nodes.ASTNode;

public class IdentifierNode implements ASTNode {
    public String name;


    @Override
    public String toString() {
        return "Identifier(name=" + name + ")";
    }
    public void setName (String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
