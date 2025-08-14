package nodes.SymboleTables;

import nodes.Row;

import java.util.ArrayList;
import java.util.List;

public class NgIfMissingExprTable {
    List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }


    public void print(){
        System.out.println("Symbol table of Ng If Missing Expression Error: ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-40s | %-40s\n", "Type", "Value");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Row row : rows) {
            System.out.printf("%-40s | %-40s\n", row.getType() , row.getValue());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
