package nodes.html_node;

import nodes.ASTNode;

public class HtmlNode implements ASTNode {
    private HtmlContentNode content;


    public HtmlContentNode getContent() {
        return content;
    }

    public void setContent(HtmlContentNode content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HtmlNode{" +
                "content=" + content +
                '}';
    }
}
