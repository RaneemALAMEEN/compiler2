package nodes.statement;

import nodes.ASTNode;

// Node for type
public class TypeNode implements ASTNode {
    public  String number;
    public  String anboolean;
    public  String array;
    public  String string;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAnboolean() {
        return anboolean;
    }

    public void setAnboolean(String anboolean) {
        this.anboolean = anboolean;
    }

    public String getArray() {
        return array;
    }

    public void setArray(String array) {
        this.array = array;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "TypeNode{" +
                "number='" + number + '\'' +
                ", anboolean='" + anboolean + '\'' +
                ", array='" + array + '\'' +
                ", string='" + string + '\'' +
                '}';
    }
}
