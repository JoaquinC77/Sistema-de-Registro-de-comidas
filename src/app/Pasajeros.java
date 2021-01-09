package app;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clases.Pasajero;
import model.ws.PasajeroWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Pasajeros extends javax.swing.JFrame {

    /**
     * Creates new form Pasajeros
     */
    public static Pasajero pasajero;
    private PasajeroWS conn;
    private DefaultTableModel model;

    public Pasajeros() {
        initComponents();

        btnAsignacionEmpresa.setEnabled(false);
        btnAsignacionContrato.setEnabled(false);

        this.setLocationRelativeTo(null);

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;//To change body of generated methods, choose Tools | Templates.
            }
        };

        conn = new PasajeroWS();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtRut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosPasajero = new javax.swing.JTable();
        btnNuevoPasajero = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAsignacionEmpresa = new javax.swing.JButton();
        btnAsignacionContrato = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel4.setText("Buscar Pasajero: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_5_330396.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBuscarMouseMoved(evt);
            }
        });
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 120, 50));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Pasajero");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 660, 10));

        txtRut.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txtRut.setForeground(new java.awt.Color(153, 153, 153));
        txtRut.setBorder(null);
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setText("Datos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 660, 10));

        tblDatosPasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RUT", "Nombre", "Apellido P", "Apellido M"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatosPasajero);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 660, 110));

        btnNuevoPasajero.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnNuevoPasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_add_user_1902270.png"))); // NOI18N
        btnNuevoPasajero.setText("Registro");
        btnNuevoPasajero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnNuevoPasajero.setContentAreaFilled(false);
        btnNuevoPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPasajero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNuevoPasajeroMouseMoved(evt);
            }
        });
        btnNuevoPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoPasajeroMouseExited(evt);
            }
        });
        btnNuevoPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPasajeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 120, 40));

        btnVolver.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolverMouseMoved(evt);
            }
        });
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 40));

        btnAsignacionEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnAsignacionEmpresa.setText("Asign/Empresas");
        btnAsignacionEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAsignacionEmpresa.setContentAreaFilled(false);
        btnAsignacionEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignacionEmpresa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAsignacionEmpresaMouseMoved(evt);
            }
        });
        btnAsignacionEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignacionEmpresaMouseExited(evt);
            }
        });
        btnAsignacionEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacionEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 160, 40));

        btnAsignacionContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnAsignacionContrato.setText("Asign/Contrato");
        btnAsignacionContrato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAsignacionContrato.setContentAreaFilled(false);
        btnAsignacionContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignacionContrato.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAsignacionContratoMouseMoved(evt);
            }
        });
        btnAsignacionContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignacionContratoMouseExited(evt);
            }
        });
        btnAsignacionContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionContratoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacionContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 160, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignacionEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionEmpresaActionPerformed
        new PasajeroAsignarAEmpresa().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsignacionEmpresaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (Login.tipouser.equals("0")) {
            new InicioUsuario().setVisible(true);
            this.setVisible(false);
        } else if (Login.tipouser.equals("1")) {
            new InicioTrabajador().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPasajero(txtRut.getText());

        limpiarTabla();
        cargarTabla();

        btnAsignacionEmpresa.setEnabled(true);
        btnAsignacionContrato.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPasajeroActionPerformed
        new PasajeroCrear().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoPasajeroActionPerformed

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        limpiarTabla();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean ok = buscarPasajero(txtRut.getText());
            if (ok == false) {
                JOptionPane.showMessageDialog(this, "NO SE ENCUENTRA PASAJERO ", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                cargarTabla();

                btnAsignacionEmpresa.setEnabled(true);
                btnAsignacionContrato.setEnabled(true);
            }

        }
    }//GEN-LAST:event_txtRutKeyReleased

    private void btnAsignacionContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionContratoActionPerformed
        new PasajeroAsignarAContrato().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsignacionContratoActionPerformed

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseMoved
        btnBuscar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnBuscarMouseMoved

    private void btnNuevoPasajeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoPasajeroMouseExited
        btnNuevoPasajero.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnNuevoPasajeroMouseExited

    private void btnNuevoPasajeroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoPasajeroMouseMoved
        btnNuevoPasajero.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnNuevoPasajeroMouseMoved

    private void btnAsignacionContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionContratoMouseExited
        btnAsignacionContrato.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnAsignacionContratoMouseExited

    private void btnAsignacionContratoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionContratoMouseMoved
        btnAsignacionContrato.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnAsignacionContratoMouseMoved

    private void btnAsignacionEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionEmpresaMouseExited
        btnAsignacionEmpresa.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnAsignacionEmpresaMouseExited

    private void btnAsignacionEmpresaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionEmpresaMouseMoved
        btnAsignacionEmpresa.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnAsignacionEmpresaMouseMoved

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolverMouseMoved

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

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
            java.util.logging.Logger.getLogger(Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pasajeros().setVisible(true);
            }
        });
    }

    public boolean buscarPasajero(String rut) {
        try {
            if (conn.getPasajero(rut) == null) {
                return false;
            } else {
                pasajero = conn.getPasajero(rut);
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public void cargarTabla() {
        model.addColumn("RUT");
        model.addColumn("Nombre");
        model.addColumn("Apellido P");
        model.addColumn("Apellido M");
        model.addColumn("Direccion");

        Object[] fila = new Object[5];
        fila[0] = pasajero.getRut();
        fila[1] = pasajero.getNombre();
        fila[2] = pasajero.getApellidoP();
        fila[3] = pasajero.getApellidoM();
        fila[4] = pasajero.getDireccion();

        model.addRow(fila);

        tblDatosPasajero.setModel(model);
    }

    private void limpiarTabla() {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignacionContrato;
    private javax.swing.JButton btnAsignacionEmpresa;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevoPasajero;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTable tblDatosPasajero;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
