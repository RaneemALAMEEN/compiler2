package nodes.statement;
import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ClassBodyNode implements ASTNode {
    private List<VariableDeclarationNode> variableDeclarationNodes = new ArrayList<VariableDeclarationNode>();
    private List<FunctionDeclarationNode> functionDeclarationNodes= new ArrayList<FunctionDeclarationNode>();
    private List<ObjectDeclarationNode> objectDeclarationNodes= new ArrayList<ObjectDeclarationNode>();
    private List<ArrayDeclarationNode> arrayDeclarationNodeList= new ArrayList<ArrayDeclarationNode>();


    public List<VariableDeclarationNode> getVariableDeclarationNodes() {
        return variableDeclarationNodes;
    }

    public void setVariableDeclarationNodes(List<VariableDeclarationNode> variableDeclarationNodes) {
        this.variableDeclarationNodes = variableDeclarationNodes;
    }

    public List<FunctionDeclarationNode> getFunctionDeclarationNodes() {
        return functionDeclarationNodes;
    }

    public void setFunctionDeclarationNodes(List<FunctionDeclarationNode> functionDeclarationNodes) {
        this.functionDeclarationNodes = functionDeclarationNodes;
    }

    public List<ObjectDeclarationNode> getObjectDeclarationNodes() {
        return objectDeclarationNodes;
    }

    public void setObjectDeclarationNodes(List<ObjectDeclarationNode> objectDeclarationNodes) {
        this.objectDeclarationNodes = objectDeclarationNodes;
    }

    public List<ArrayDeclarationNode> getArrayDeclarationNodeList() {
        return arrayDeclarationNodeList;
    }

    public void setArrayDeclarationNodeList(List<ArrayDeclarationNode> arrayDeclarationNodeList) {
        this.arrayDeclarationNodeList = arrayDeclarationNodeList;
    }

    @Override
    public String toString() {
        return "ClassBody{" +
                "variableDeclarationNodes=" + variableDeclarationNodes +
                ", functionDeclarationNodes=" + functionDeclarationNodes +
                ", objectDeclarationNodes=" + objectDeclarationNodes +
                ", arrayDeclarationNodeList=" + arrayDeclarationNodeList +
                '}';
    }
}
