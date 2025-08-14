package nodes.statement;

import nodes.ASTNode;

import java.util.List;

// Node for function declaration
public class FunctionDeclarationNode implements ASTNode {
    public  String identifier;
    public  List<ParameterNode> parameters;
    public  String returnType;
    public  List<ASTNode> body;
    public  ASTNode returnExpression;


    @Override
    public String toString() {
        return "FunctionDeclaration(identifier=" + identifier + ", parameters=" + parameters + ", returnType=" + returnType + ", body=" + body + ", returnExpression=" + returnExpression + ")";
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public void setBody(List<ASTNode> body) {
        this.body = body;
    }

    public ASTNode getReturnExpression() {
        return returnExpression;
    }

    public void setReturnExpression(ASTNode returnExpression) {
        this.returnExpression = returnExpression;
    }
}
