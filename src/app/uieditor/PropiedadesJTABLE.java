package app.uieditor;

import javax.swing.JComponent;
import javax.swing.plaf.TableUI;
import javax.swing.plaf.basic.BasicTableUI;

/**
 *
 * @author Santo Tomás
 */
public class PropiedadesJTABLE extends BasicTableUI{
    public static TableUI createUI(JComponent component){
        return new PropiedadesJTABLE();
    }
    
    
}
