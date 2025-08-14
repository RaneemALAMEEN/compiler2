package nodes.statement;

import nodes.ASTNode;

// Node for property access
public class PropertyAccessNode implements ASTNode {
    public  String object;
    public  String property;

    public PropertyAccessNode(String object, String property) {
        this.object = object;
        this.property = property;
    }

    @Override
    public String toString() {
        return "PropertyAccess(object=" + object + ", property=" + property + ")";
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
