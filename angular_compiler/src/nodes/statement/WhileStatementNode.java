package nodes.statement;

import nodes.ASTNode;

// Node for while statement
public class WhileStatementNode implements ASTNode {
    public  ASTNode condition;
    public  BlockNode block;



    @Override
    public String toString() {
        return "WhileStatement(condition=" + condition + ", block=" + block + ")";
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
