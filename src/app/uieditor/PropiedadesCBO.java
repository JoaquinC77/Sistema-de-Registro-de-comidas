package app.uieditor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javafx.scene.layout.Border;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Santo Tomás
 */
public class PropiedadesCBO extends BasicComboBoxUI{
    public static ComboBoxUI createUI(JComponent component){
        return new PropiedadesCBO();
    }

    @Override
    protected JButton createArrowButton() {
        JButton button = new JButton();
        button.setBackground(new java.awt.Color(255, 255, 255));
        button.setForeground(new java.awt.Color(238, 112, 82));
        button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        button.setContentAreaFilled(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.setText("▼");
        return button;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(new java.awt.Color(255, 255, 255));
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
    
    @Override
    protected ListCellRenderer createRenderer(){
        return new DefaultListCellRenderer(){
            
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
                
                list.setSelectionBackground(new java.awt.Color(238, 112, 82));
                list.setSelectionForeground(new java.awt.Color(255, 255, 255));
                
                return this;
            }            
        };
    }
    
    
    
    

}
