package nodes.statement;

import nodes.ASTNode;

// Node for else-if statement
public class ElseIfStatementNode implements ASTNode {
    public  ASTNode condition;
    public  BlockNode block;

    public ElseIfStatementNode(ASTNode condition, BlockNode block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public String toString() {
        return "ElseIfStatement(condition=" + condition + ", block=" + block + ")";
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
}
