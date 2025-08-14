package nodes.statement;

import nodes.ASTNode;

// Node for literal value
public class LiteralValueNode implements ASTNode {
    public String stirngValue;
    public String numValue;
    public String arrayValue;
    public String booleanValue;
    public ListLiteralNode listLiteralNode;
    public boolean isNull;

    public ListLiteralNode getListLiteralNode() {
        return listLiteralNode;
    }

    public void setListLiteralNode(ListLiteralNode listLiteralNode) {
        this.listLiteralNode = listLiteralNode;
    }

    public String getStirngValue() {
        return stirngValue;
    }

    public void setStirngValue(String stirngValue) {
        this.stirngValue = stirngValue;
    }

    public String getNumValue() {
        return numValue;
    }

    public void setNumValue(String numValue) {
        this.numValue = numValue;
    }

    public String getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(String arrayValue) {
        this.arrayValue = arrayValue;
    }

    public String getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(String booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        isNull = aNull;
    }

    @Override
    public String toString() {
        return "LiteralValueNode{" +
                "stirngValue='" + stirngValue + '\'' +
                ", numValue='" + numValue + '\'' +
                ", arrayValue='" + arrayValue + '\'' +
                ", booleanValue='" + booleanValue + '\'' +
                ", listLiteralNode=" + listLiteralNode +
                ", isNull=" + isNull +
                '}';
    }
}