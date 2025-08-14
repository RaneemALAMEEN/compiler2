package nodes.statement;

import nodes.ASTNode;

import java.util.List;

// Node for if statement
public class IfStatementNode implements ASTNode {
    public  ASTNode condition;
    public  BlockNode block;
    public  List<ElseIfStatementNode> elseIfStatements;
    public  BlockNode elseBlock;



    @Override
    public String toString() {
        return "IfStatement(condition=" + condition + ", block=" + block + ", elseIfStatements=" + elseIfStatements + ", elseBlock=" + elseBlock + ")";
    }

    public ASTNode getCondition() {
        return condition;
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
    }

    public BlockNode getBlock() {
        return block;
    }

    public void setBlock(BlockNode block) {
        this.block = block;
    }

    public List<ElseIfStatementNode> getElseIfStatements() {
        return elseIfStatements;
    }

    public void setElseIfStatements(List<ElseIfStatementNode> elseIfStatements) {
        this.elseIfStatements = elseIfStatements;
    }

    public BlockNode getElseBlock() {
        return elseBlock;
    }

    public void setElseBlock(BlockNode elseBlock) {
        this.elseBlock = elseBlock;
    }
}
