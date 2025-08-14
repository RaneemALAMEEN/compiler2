import nodes.BaseVisitor;
import nodes.exception.TypeMismatchException;
import nodes.exception.VariableRedefinitionException;


public class Main {
    public static void main(String[] args) throws TypeMismatchException, VariableRedefinitionException {
    BaseVisitor baseVisitor = new BaseVisitor();
    baseVisitor.printAst();

    }
}