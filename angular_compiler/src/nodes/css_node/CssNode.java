package nodes.css_node;

import nodes.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssNode implements ASTNode {
    private List<CssContentNode> cssContentNode = new ArrayList<>();

    public List<CssContentNode> getCssContentNode() {
        return cssContentNode;
    }

    public void setCssContentNode(List<CssContentNode> cssContentNode) {
        this.cssContentNode = cssContentNode;
    }

    @Override
    public String toString() {
        return "CssNode{" +
                "cssContentNode=" + cssContentNode +
                '}';
    }
}
