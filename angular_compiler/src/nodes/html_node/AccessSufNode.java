package nodes.html_node;

import nodes.ASTNode;
import nodes.statement.ExpressionNode;
import nodes.statement.FunctionCallNode;

public class AccessSufNode implements ASTNode {
    private String identifierNode;
    private ExpressionNode expressionNode;
    private FunctionCallNode functionCallNode;

    public String getIdentifierNode() {
        return identifierNode;
    }

    public void setIdentifierNode(String identifierNode) {
        this.identifierNode = identifierNode;
    }

    public ExpressionNode getExpressionNode() {
        return expressionNode;
    }

    public void setExpressionNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    public FunctionCallNode getFunctionCallNode() {
        return functionCallNode;
    }

    public void setFunctionCallNode(FunctionCallNode functionCallNode) {
        this.functionCallNode = functionCallNode;
    }

    @Override
    public String toString() {
        if(expressionNode!=null){
        return ", expressionNode=" + expressionNode +
                '}';
        }
        if(identifierNode!=null){

            return  "AccessSufNode{" +   "identifierNode=" + identifierNode + '}';
        }
        return "AccessSufNode{" +
                ", functionCallNode=" + functionCallNode +
                '}';
    }
}
