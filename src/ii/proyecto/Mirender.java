package ii.proyecto;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Mirender extends DefaultTableCellRenderer {
    /**
     *
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return
     */
    @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){
        super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
        if ("R".equals(String.valueOf(value))){
            this.setBackground(Color.red);
        }else if("W".equals(String.valueOf(value))){
            this.setBackground(Color.white);
        }
      return this;
   }
}