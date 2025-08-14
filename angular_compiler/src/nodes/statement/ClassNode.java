package nodes.statement;

import nodes.ASTNode;

import java.util.ArrayList;
import java.util.List;

// Class node
public class ClassNode implements ASTNode {
    private  String identifier;
    private  ClassBodyNode classBody ;


    @Override
    public String toString() {
        if(classBody!=null){
        return "\nClassNode{" +
                "class Name='" + identifier + '\'' +
                "}\n";
        }
        return "\nClassNode{" +
                "class Name='" + identifier + '\'' +
                ", classBody=" + classBody +
                "}\n";
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ClassBodyNode getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBodyNode classBody) {
        this.classBody = classBody;
    }
}
