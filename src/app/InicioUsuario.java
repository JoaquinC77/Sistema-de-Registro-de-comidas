package app;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class InicioUsuario extends javax.swing.JFrame {

    public InicioUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnConsultarServicios = new javax.swing.JButton();
        btnContratos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnEmpresas = new javax.swing.JButton();
        btnPasajeros = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Servicios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 470, 10));

        btnConsultarServicios.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarServicios.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnConsultarServicios.setForeground(new java.awt.Color(238, 112, 82));
        btnConsultarServicios.setText("Consultar Servicios");
        btnConsultarServicios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnConsultarServicios.setContentAreaFilled(false);
        btnConsultarServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarServicios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnConsultarServiciosMouseMoved(evt);
            }
        });
        btnConsultarServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarServiciosMouseExited(evt);
            }
        });
        btnConsultarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 230, 40));

        btnContratos.setBackground(new java.awt.Color(153, 153, 153));
        btnContratos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnContratos.setForeground(new java.awt.Color(238, 112, 82));
        btnContratos.setText("Contratos");
        btnContratos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnContratos.setContentAreaFilled(false);
        btnContratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContratos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnContratosMouseMoved(evt);
            }
        });
        btnContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContratosMouseExited(evt);
            }
        });
        btnContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratosActionPerformed(evt);
            }
        });
        jPanel1.add(btnContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 470, 10));

        btnEmpresas.setBackground(new java.awt.Color(153, 153, 153));
        btnEmpresas.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnEmpresas.setForeground(new java.awt.Color(238, 112, 82));
        btnEmpresas.setText("Empresas");
        btnEmpresas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEmpresas.setContentAreaFilled(false);
        btnEmpresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpresas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEmpresasMouseMoved(evt);
            }
        });
        btnEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpresasMouseExited(evt);
            }
        });
        btnEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, 40));

        btnPasajeros.setBackground(new java.awt.Color(153, 153, 153));
        btnPasajeros.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnPasajeros.setForeground(new java.awt.Color(238, 112, 82));
        btnPasajeros.setText("Pasajeros");
        btnPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnPasajeros.setContentAreaFilled(false);
        btnPasajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasajeros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnPasajerosMouseMoved(evt);
            }
        });
        btnPasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasajerosMouseExited(evt);
            }
        });
        btnPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasajerosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setText("Bienvenido: Administrador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 0, 40, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA_80PIX.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratosActionPerformed
        new Contratos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContratosActionPerformed

    private void btnConsultarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarServiciosActionPerformed
        new ConsultarServicios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultarServiciosActionPerformed

    private void btnEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresasActionPerformed
        new Empresas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpresasActionPerformed

    private void btnPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasajerosActionPerformed
        new Pasajeros().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPasajerosActionPerformed

    private void btnContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContratosMouseExited
        btnContratos.setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
    }//GEN-LAST:event_btnContratosMouseExited

    private void btnContratosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContratosMouseMoved
        btnContratos.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_btnContratosMouseMoved

    private void btnEmpresasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpresasMouseExited
        btnEmpresas.setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
    }//GEN-LAST:event_btnEmpresasMouseExited

    private void btnEmpresasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpresasMouseMoved
        btnEmpresas.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_btnEmpresasMouseMoved

    private void btnPasajerosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasajerosMouseExited
        btnPasajeros.setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
    }//GEN-LAST:event_btnPasajerosMouseExited

    private void btnPasajerosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasajerosMouseMoved
        btnPasajeros.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_btnPasajerosMouseMoved

    private void btnConsultarServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarServiciosMouseExited
        btnConsultarServicios.setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
    }//GEN-LAST:event_btnConsultarServiciosMouseExited

    private void btnConsultarServiciosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarServiciosMouseMoved
        btnConsultarServicios.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_btnConsultarServiciosMouseMoved

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

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
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarServicios;
    private javax.swing.JButton btnContratos;
    private javax.swing.JButton btnEmpresas;
    private javax.swing.JButton btnPasajeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExit;
    // End of variables declaration//GEN-END:variables
}
