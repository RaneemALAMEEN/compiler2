package nodes.html_node;

import nodes.ASTNode;
import nodes.statement.ClassNode;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributeNode implements ASTNode {
    private String identifierNode;
    private String classNode;
    private List<AccessSufNode> accessSufNode = new ArrayList<AccessSufNode>();
    private  HtmlAttributeValueNode htmlAttributeValueNode;

    public String getIdentifierNode() {
        return identifierNode;
    }

    public void setIdentifierNode(String identifierNode) {
        this.identifierNode = identifierNode;
    }

    public String getClassNode() {
        return classNode;
    }

    public void setClassNode(String classNode) {
        this.classNode = classNode;
    }

    public List<AccessSufNode> getAccessSufNode() {
        return accessSufNode;
    }

    public void setAccessSufNode(List<AccessSufNode> accessSufNode) {
        this.accessSufNode = accessSufNode;
    }

    public HtmlAttributeValueNode getHtmlAttributeValueNode() {
        return htmlAttributeValueNode;
    }

    public void setHtmlAttributeValueNode(HtmlAttributeValueNode htmlAttributeValueNode) {
        this.htmlAttributeValueNode = htmlAttributeValueNode;
    }

    @Override
    public String toString() {
        if(htmlAttributeValueNode!=null){
            return "HtmlAttributeNode{" +
                    "identifierNode=" + identifierNode +
                    ", classNode=" + classNode +
                    ", accessSufNode=" + accessSufNode +
                    '}';

        }
        if(accessSufNode.isEmpty()){
            return "HtmlAttributeNode{" +
                    "identifierNode=" + identifierNode +
                    ", classNode=" + classNode +
                ", htmlAttributeValueNode=" + htmlAttributeValueNode +
                    '}';

        }
        return "HtmlAttributeNode{" +
                "identifierNode=" + identifierNode +
                ", classNode=" + classNode +
                ", accessSufNode=" + accessSufNode +
                ", htmlAttributeValueNode=" + htmlAttributeValueNode +
                '}';
    }
}
