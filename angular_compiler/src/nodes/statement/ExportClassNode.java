package nodes.statement;

import nodes.ASTNode;

// Export class node
public class ExportClassNode implements ASTNode {
    private  ASTNode classNode;

    @Override
    public String toString() {
        return "ExportClassNode{" + "classNode=" + classNode + '}';
    }

    public ASTNode getClassNode() {
        return classNode;
    }

    public void setClassNode(ASTNode classNode) {
        this.classNode = classNode;
    }
}
