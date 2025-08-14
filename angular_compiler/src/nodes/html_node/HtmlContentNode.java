package nodes.html_node;

import nodes.ASTNode;
import nodes.statement.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class HtmlContentNode implements ASTNode {
    private List<HtmlElementNode> htmlElementNode= new ArrayList<>();
    private ExpressionNode expressionNode ;
    private String identifierNode ;

    public List<HtmlElementNode> getHtmlElementNode() {
        return htmlElementNode;
    }

    public void setHtmlElementNode(List<HtmlElementNode> htmlElementNode) {
        this.htmlElementNode = htmlElementNode;
    }

    public ExpressionNode getExpressionNode() {
        return expressionNode;
    }

    public void setExpressionNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    public String getIdentifierNode() {
        return identifierNode;
    }

    public void setIdentifierNode(String identifierNode) {
        this.identifierNode = identifierNode;
    }

    @Override
    public String toString() {
        if(htmlElementNode.isEmpty()){
            return "HtmlContentNode{" +
                    ", expressionNode=" + expressionNode +
                    ", identifierNode=" + identifierNode +
                    '}';
        }
        return "HtmlContentNode{" +
                "htmlElementNode=" +
                 htmlElementNode +
                ", expressionNode=" + expressionNode +
                ", identifierNode=" + identifierNode +
                '}';
    }
}
