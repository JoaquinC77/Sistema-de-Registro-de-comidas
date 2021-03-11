package app;

import app.uieditor.SimpleHeaderRenderer;
import java.awt.Color;
import java.io.IOException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.Pasajero;
import model.clases.RegistroServicios;
import model.ws.RegistroServicioWS;

public class DetallesDeRegistros extends javax.swing.JFrame {

    /**
     * Creates new form DetallesDeRegistros
     */
    private Pasajero pasajero;
    private Contrato contrato;
    private List<RegistroServicios> listaRegistros;
    private DefaultTableModel dtmDetallesDeRegistros;

    public DetallesDeRegistros() {
        initComponents();
        setLocationRelativeTo(null);
        
        formatoTabla();
        tblDetallesDeRegistros.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
        
        pasajero = ConsultarServicios.pasajeroBuscar;
        contrato =  ConsultarServicios.contrato;
        
        try {
            listaRegistros = new RegistroServicioWS().getRegistrosPorPasajeroyContrato(pasajero.getId(), contrato.getId());
            
            cargarTabla(listaRegistros);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "PASAJERO SIN REGISTROS", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetallesDeRegistros = new javax.swing.JTable();
        btnVolver3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("DETALLES DE REGISTROS: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 690, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_delete_51514.png"))); // NOI18N
        lblExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblExitMouseMoved(evt);
            }
        });
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblDetallesDeRegistros.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        tblDetallesDeRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDetallesDeRegistros.setGridColor(new java.awt.Color(255, 255, 255));
        tblDetallesDeRegistros.setSelectionBackground(new java.awt.Color(220, 220, 220));
        tblDetallesDeRegistros.setSelectionForeground(new java.awt.Color(238, 112, 82));
        jScrollPane1.setViewportView(tblDetallesDeRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 690, 250));

        btnVolver3.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(238, 112, 82));
        btnVolver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnVolver3.setText("VOLVER");
        btnVolver3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnVolver3.setContentAreaFilled(false);
        btnVolver3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolver3MouseMoved(evt);
            }
        });
        btnVolver3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver3MouseExited(evt);
            }
        });
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void btnVolver3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseMoved
        btnVolver3.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolver3MouseMoved

    private void btnVolver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseExited
        btnVolver3.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolver3MouseExited

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        new ConsultarServicios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetallesDeRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesDeRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesDeRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesDeRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesDeRegistros().setVisible(true);
            }
        });
    }

    private void formatoTabla() {
        dtmDetallesDeRegistros = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tblDetallesDeRegistros.setModel(dtmDetallesDeRegistros);
        dtmDetallesDeRegistros.addColumn("SERVICIO");
        dtmDetallesDeRegistros.addColumn("FECHA y HORA");
    }

    private void cargarTabla(List<RegistroServicios> lista) {
        for (RegistroServicios registro : lista) {
            String servicio = "";
            Object[] fila = new Object[2];

            switch (Integer.parseInt(registro.getIdServicio())) {
                case 1:
                    servicio = "DESAYUNO";
                    break;
                case 2:
                    servicio = "ALMUERZO";
                    break;
                case 3:
                    servicio = "CENA";
                    break;
            }
            
            
            fila[0] = servicio;
            fila[1] = registro.getFecha();
            
            dtmDetallesDeRegistros.addRow(fila);

        }
    }
    
    private void limpiarTablaPasajeros() {
        if (dtmDetallesDeRegistros.getRowCount() > 0) {
            for (int i = dtmDetallesDeRegistros.getRowCount() - 1; i > -1; i--) {
                dtmDetallesDeRegistros.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTable tblDetallesDeRegistros;
    // End of variables declaration//GEN-END:variables
}
