package nodes.statement;

import nodes.ASTNode;
import nodes.html_node.HtmlNode;
// Statement node
public class StatementNode implements ASTNode {
    ArrayDeclarationNode arrayDeclarationNodeList ;
    EnumNode enumNodes ;
    VariableDeclarationNode variableDeclarationNodes ;
    FunctionDeclarationNode functionDeclarationNodes ;
    IfStatementNode ifStatementNodes;
    WhileStatementNode whileStatementNodes;
    AssignmentStatementNode assignmentStatementNodes;
    BreakStatementNode breakStatementNodes;
    ContinueStatementNode continueStatementNodes;
    ImportStatementNode importStatementNodes;
    ComponentNode componentNodes;

    ClassNode classNodes ;
    ExportClassNode exportClassNode ;
    HtmlElementNode htmlElementNodes ;
    HtmlNode htmlNodes ;

    public HtmlNode getHtmlNodes() {
        return htmlNodes;
    }

    public void setHtmlNodes(HtmlNode htmlNodes) {
        this.htmlNodes = htmlNodes;
    }

    public ExportClassNode getExportClassNode() {
        return exportClassNode;
    }

    public void setExportClassNode(ExportClassNode exportClassNode) {
        this.exportClassNode = exportClassNode;
    }
    public ArrayDeclarationNode getArrayDeclarationNodeList() {
        return arrayDeclarationNodeList;
    }

    public void setArrayDeclarationNodeList(ArrayDeclarationNode arrayDeclarationNodeList) {
        this.arrayDeclarationNodeList = arrayDeclarationNodeList;
    }

    public EnumNode getEnumNodes() {
        return enumNodes;
    }

    public void setEnumNodes(EnumNode enumNodes) {
        this.enumNodes = enumNodes;
    }

    public VariableDeclarationNode getVariableDeclarationNodes() {
        return variableDeclarationNodes;
    }

    public void setVariableDeclarationNodes(VariableDeclarationNode variableDeclarationNodes) {
        this.variableDeclarationNodes = variableDeclarationNodes;
    }

    public FunctionDeclarationNode getFunctionDeclarationNodes() {
        return functionDeclarationNodes;
    }

    public void setFunctionDeclarationNodes(FunctionDeclarationNode functionDeclarationNodes) {
        this.functionDeclarationNodes = functionDeclarationNodes;
    }

    public IfStatementNode getIfStatementNodes() {
        return ifStatementNodes;
    }

    public void setIfStatementNodes(IfStatementNode ifStatementNodes) {
        this.ifStatementNodes = ifStatementNodes;
    }

    public WhileStatementNode getWhileStatementNodes() {
        return whileStatementNodes;
    }

    public void setWhileStatementNodes(WhileStatementNode whileStatementNodes) {
        this.whileStatementNodes = whileStatementNodes;
    }

    public AssignmentStatementNode getAssignmentStatementNodes() {
        return assignmentStatementNodes;
    }

    public void setAssignmentStatementNodes(AssignmentStatementNode assignmentStatementNodes) {
        this.assignmentStatementNodes = assignmentStatementNodes;
    }

    public BreakStatementNode getBreakStatementNodes() {
        return breakStatementNodes;
    }

    public void setBreakStatementNodes(BreakStatementNode breakStatementNodes) {
        this.breakStatementNodes = breakStatementNodes;
    }

    public ContinueStatementNode getContinueStatementNodes() {
        return continueStatementNodes;
    }

    public void setContinueStatementNodes(ContinueStatementNode continueStatementNodes) {
        this.continueStatementNodes = continueStatementNodes;
    }

    public ImportStatementNode getImportStatementNodes() {
        return importStatementNodes;
    }

    public void setImportStatementNodes(ImportStatementNode importStatementNodes) {
        this.importStatementNodes = importStatementNodes;
    }

    public ComponentNode getComponentNodes() {
        return componentNodes;
    }

    public void setComponentNodes(ComponentNode componentNodes) {
        this.componentNodes = componentNodes;
    }

    public ClassNode getClassNodes() {
        return classNodes;
    }

    public void setClassNodes(ClassNode classNodes) {
        this.classNodes = classNodes;
    }

    public HtmlElementNode getHtmlElementNodes() {
        return htmlElementNodes;
    }

    public void setHtmlElementNodes(HtmlElementNode htmlElementNodes) {
        this.htmlElementNodes = htmlElementNodes;
    }

    @Override
    public String toString() {
        if (arrayDeclarationNodeList != null) {
            return "StatementNode{" +
                    "arrayDeclarationNodeList=" + arrayDeclarationNodeList +
                    '}';
        }
        if (classNodes != null) {
            return "StatementNode{" +
                    "classNodes=" + classNodes +
                    '}';
        }
        if (enumNodes != null) {
            return "StatementNode{" +
                    "enumNodes=" + enumNodes +
                    '}';
        }
        if (variableDeclarationNodes != null) {
            return "StatementNode{" +
                    "variableDeclarationNodes=" + variableDeclarationNodes +
                    '}';
        }
        if (functionDeclarationNodes != null) {
            return "StatementNode{" +
                    "functionDeclarationNodes=" + functionDeclarationNodes +
                    '}';
        }
        if (ifStatementNodes != null) {
            return "StatementNode{" +
                    "ifStatementNodes=" + ifStatementNodes +
                    '}';
        }
        if (whileStatementNodes != null) {
            return "StatementNode{" +
                    "whileStatementNodes=" + whileStatementNodes +
                    '}';
        }
        if (assignmentStatementNodes != null) {
            return "StatementNode{" +
                    "assignmentStatementNodes=" + assignmentStatementNodes +
                    '}';
        }
        if (breakStatementNodes != null) {
            return "StatementNode{" +
                    "breakStatementNodes=" + breakStatementNodes +
                    '}';
        }
        if (continueStatementNodes != null) {
            return "StatementNode{" +
                    "continueStatementNodes=" + continueStatementNodes +
                    '}';
        }
        if (importStatementNodes != null) {
            return "StatementNode{" +
                    "importStatementNodes=" + importStatementNodes +
                    '}';
        }
        if (componentNodes != null) {
            return "StatementNode{" +
                    "componentNodes=" + componentNodes +
                    '}';
        }
        if(htmlNodes!=null){
            return "StatementNode{" +
                    "htmlNodes=" + htmlNodes +
                    '}';
        }
        if (htmlElementNodes != null) {
            return "StatementNode{" +
                    "htmlElementNodes=" + htmlElementNodes +
                    '}';
        }
        return "StatementNode{}";
    }
}
