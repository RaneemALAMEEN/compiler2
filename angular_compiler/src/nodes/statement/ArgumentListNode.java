package nodes.statement;

import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ArgumentListNode implements ASTNode {
    private List<ArgumentNode> argumentNodeList = new ArrayList<>();

    public List<ArgumentNode> getArgumentNodeList() {
        return argumentNodeList;
    }

    public void setArgumentNodeList(List<ArgumentNode> argumentNodeList) {
        this.argumentNodeList = argumentNodeList;
    }

    @Override
    public String toString() {
        return "ArgumentListNode{" +
                "argumentNodeList=" + argumentNodeList +
                '}';
    }
}
