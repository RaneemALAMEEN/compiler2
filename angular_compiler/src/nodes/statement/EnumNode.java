package nodes.statement;

import nodes.ASTNode;
import nodes.enum_node.EnumValue;

import java.util.List;

public class EnumNode implements ASTNode {
    private String name;
    private List<EnumValue> values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EnumValue> getValues() {
        return values;
    }

    public void setValues(List<EnumValue> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "name='" + name + '\'' +
                ", values=" + values +
                '}';
    }
}





