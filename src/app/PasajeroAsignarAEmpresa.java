package app;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Empresa;
import model.clases.Pasajero;
import model.ws.EmpresaPasajeroWS;
import model.ws.EmpresaWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class PasajeroAsignarAEmpresa extends javax.swing.JFrame {

    private Empresa empresa;
    private EmpresaWS conn;
    private Pasajero pasajero;

    /**
     * Creates new form PasajeroAsignarAEmpresa
     */
    public PasajeroAsignarAEmpresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        pasajero = Pasajeros.pasajero;

        txtRutHuesped.setText(pasajero.getRut());
        lblNombreHuesped.setText(pasajero.getNombre() + " " + pasajero.getApellidoP());
        txtRutHuesped.setEnabled(false);

        try {
            conn = new EmpresaWS();
            List<Empresa> lista = conn.getAllEmpresas();
            cargarCboEmpresas(lista);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR EMPRESAS");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cboEmpresas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtRutHuesped = new javax.swing.JTextField();
        lblNombreHuesped = new javax.swing.JLabel();
        btnAsignar = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Pasajero: Asignar a empresas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 610, 10));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel4.setText("Pasajero: Asignar a empresas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 610, 10));

        jPanel1.add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel5.setText("Pasajero: Asignar a empresas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtRutHuesped.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRutHuesped.setText("RUT HUESPED:");
        txtRutHuesped.setBorder(null);
        jPanel1.add(txtRutHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 30));

        lblNombreHuesped.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        lblNombreHuesped.setText("Pasajero: Asignar a empresas");
        jPanel1.add(lblNombreHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 230, 20));

        btnAsignar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(238, 112, 82));
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_save_floppy_disk_3380379.png"))); // NOI18N
        btnAsignar.setText("ASIGNAR");
        btnAsignar.setToolTipText("");
        btnAsignar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAsignar.setContentAreaFilled(false);
        btnAsignar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAsignarMouseMoved(evt);
            }
        });
        btnAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignarMouseExited(evt);
            }
        });
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 130, 47));

        btnVolver1.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(238, 112, 82));
        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnVolver1.setText("VOLVER");
        btnVolver1.setToolTipText("");
        btnVolver1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnVolver1.setContentAreaFilled(false);
        btnVolver1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolver1MouseMoved(evt);
            }
        });
        btnVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver1MouseExited(evt);
            }
        });
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 130, 47));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA_80PIX.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 0, 30, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        new Pasajeros().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        empresa = (Empresa) cboEmpresas.getSelectedItem();

        int confirmacion = JOptionPane.showConfirmDialog(this,
                "DESEA ASIGNAR HUESPED: " + pasajero.getNombre() + " " + pasajero.getApellidoP() + " A LA EMPRESA: " + empresa.getNombre(),
                "CONFIRMACION",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        //0=yes, 1=no, 2=cancel
        if (confirmacion == 0) {
            try {
                System.out.println("---------------");
                System.out.println("id p" + pasajero.getId());
                System.out.println("---------------");
                new EmpresaPasajeroWS().insertEmpresaPasajero(pasajero.getId(), empresa.getId());
                
                JOptionPane.showMessageDialog(null, "ASIGNACION CORRECTAMENTE REALIZADA","EXITO",JOptionPane.PLAIN_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL ASIGNAR HUESPED: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else if (confirmacion == 1) {
            System.out.println("Has pulsado No");
        } else if (confirmacion == 2) {
            System.out.println("Has pulsado Cancel");
        }

    }//GEN-LAST:event_btnAsignarActionPerformed

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
        btnVolver1.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolver1MouseExited

    private void btnVolver1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseMoved
        btnVolver1.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolver1MouseMoved

    private void btnAsignarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseExited
        btnAsignar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnAsignarMouseExited

    private void btnAsignarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseMoved
        btnAsignar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnAsignarMouseMoved

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
            java.util.logging.Logger.getLogger(PasajeroAsignarAEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasajeroAsignarAEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasajeroAsignarAEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasajeroAsignarAEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasajeroAsignarAEmpresa().setVisible(true);
            }
        });
    }

    public void cargarCboEmpresas(List<Empresa> empresas) {
        for (Empresa em : empresas) {
            cboEmpresas.addItem(em);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<Empresa> cboEmpresas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblNombreHuesped;
    private javax.swing.JTextField txtRutHuesped;
    // End of variables declaration//GEN-END:variables
}
