package model.table;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class ModelTablaPersonalizada{
    private DefaultTableModel df;

    public ModelTablaPersonalizada() {
        this.df = new DefaultTableModel();
        
        this.df.addColumn("");
        this.df.addColumn("");
    }
    
    
    
    
    
}
