package iconook;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconOK {
    public static Icon icono;
    
    

    public Icon getIcon(){
        icono = new ImageIcon(getClass().getResource("/img/iconfinder_f-check_256_282474.png"));
        return icono;
    }
}
