package nodes.statement;
import nodes.ASTNode;

// Component node
public class ComponentNode implements ASTNode {
    private  DecoratorNode decorator ;
    private  ExportClassNode exportClass ;

    @Override
    public String toString() {
        return "ComponentNode{" +
                "decorator=" + decorator +
                ", exportClass=" + exportClass +
                '}';
    }

    public DecoratorNode getDecorator() {
        return decorator;
    }

    public void setDecorator(DecoratorNode decorator) {
        this.decorator = decorator;
    }

    public ExportClassNode getExportClass() {
        return exportClass;
    }

    public void setExportClass(ExportClassNode exportClass) {
        this.exportClass = exportClass;
    }
}
