package app;

import app.uieditor.PropiedadesCBO;
import iconook.IconOK;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Empresa;
import model.clases.Pasajero;
import model.ws.EmpresaPasajeroWS;
import model.ws.EmpresaWS;
import model.ws.PasajeroWS;

public class PasajeroEditar extends javax.swing.JFrame {

    /**
     * Creates new form PasajeroEditar
     */
    private PasajeroWS connPasajero;
    private EmpresaWS connEmpresa;
    private Pasajero pasajero;
    private EmpresaPasajeroWS connEP;
    private Empresa empresaAntigua;
    private Empresa empresaNueva;
    private List<Empresa> listaEmpresas;

    public PasajeroEditar() {
        initComponents();
        this.setLocationRelativeTo(null);

        pasajero = Pasajeros.pasajero;
        connEP = new EmpresaPasajeroWS();
        cboEmpresas.setUI(PropiedadesCBO.createUI(rootPane));

        llenarCampos();

        try {
            empresaAntigua = new EmpresaWS().getEmpresaForIDPasajero(pasajero.getId());

            lblNombreEmpresa.setText(empresaAntigua.getNombre());

            connEmpresa = new EmpresaWS();
            listaEmpresas = connEmpresa.getAllEmpresas();
            cargarCboEmpresas(listaEmpresas);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR EMPRESAS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtRutEmpresa = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        cboEmpresas = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNuevaEmpresa = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblNombreEmpresa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Pasajero: Editar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1060, 10));

        txtNombre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 190, 30));

        txtApellidoP.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtApellidoP.setBorder(null);
        txtApellidoP.setEnabled(false);
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 190, 30));

        txtApellidoM.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtApellidoM.setBorder(null);
        txtApellidoM.setEnabled(false);
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 190, 30));

        txtRut.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRut.setBorder(null);
        txtRut.setEnabled(false);
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 30));

        txtDireccion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.setEnabled(false);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 30));

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel11.setText("Apellido Materno: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel12.setText("Direccion: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel13.setText("Nombre: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 190, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 190, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 190, 10));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel4.setText("Empresa Asociada:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1060, 10));

        jLabel16.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel16.setText("Apellido Paterno:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel15.setText("RUT:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(238, 112, 82));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_document_3380387.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGuardarMouseMoved(evt);
            }
        });
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 200, 60));

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
        jPanel1.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 200, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel14.setText("Buscar por RUT: Ej (72789987-7)");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        txtRutEmpresa.setBorder(null);
        txtRutEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutEmpresaKeyReleased(evt);
            }
        });
        jPanel3.add(txtRutEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 230, 40));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 230, 10));

        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });
        jPanel3.add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 230, 40));

        jLabel17.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel17.setText("Busque en lista");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuevaEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        lblNuevaEmpresa.setText("jTextField1");
        lblNuevaEmpresa.setEnabled(false);
        jPanel2.add(lblNuevaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 40));

        jLabel18.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel18.setText("Nueva Empresa:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 280, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        lblNombreEmpresa.setText("jTextField1");
        lblNombreEmpresa.setEnabled(false);
        jPanel4.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 40));

        jLabel19.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel19.setText("Empresa Actual");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 230));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1040, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

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

    private void btnGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseMoved
        btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnGuardarMouseMoved

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtApellidoM.getText().isEmpty() || txtApellidoP.getText().isEmpty() || txtDireccion.getText().isEmpty()
                || txtNombre.getText().isEmpty() || txtRut.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE INGRESAR TODOS LOS CAMPOS SOLICITADOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                boolean ok = new EmpresaPasajeroWS().updateEmpresPasajero(empresaNueva.getId(), pasajero.getId(), empresaAntigua.getId());
                if (ok != false) {
                    JOptionPane.showMessageDialog(null, "MODIFICACION EXITOSA", "EXITO", JOptionPane.PLAIN_MESSAGE, new IconOK().getIcon());
                } else {
                    JOptionPane.showMessageDialog(null, "MODIFICACION FALLIDA", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                System.out.println("ERROR: " + ex.getLocalizedMessage());
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolver1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseMoved
        btnVolver1.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolver1MouseMoved

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
        btnVolver1.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolver1MouseExited

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        new Pasajeros().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
        try {
            empresaNueva = (Empresa) cboEmpresas.getSelectedItem();
            
            lblNuevaEmpresa.setText(empresaNueva.getNombre());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR NUEVA EMPRESA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cboEmpresasActionPerformed

    private void txtRutEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutEmpresaKeyReleased
        try {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                for (Empresa emp : listaEmpresas) {
                    if (emp.getRut().equals(txtRutEmpresa.getText())) {
                        empresaNueva = emp;
                        lblNuevaEmpresa.setText(empresaNueva.getNombre());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "EMPRESA NO ENCONTRADA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR EMPRESA", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_txtRutEmpresaKeyReleased

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
            java.util.logging.Logger.getLogger(PasajeroEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasajeroEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasajeroEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasajeroEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasajeroEditar().setVisible(true);
            }
        });
    }

    private void llenarCampos() {
        txtRut.setText(pasajero.getRut());
        txtNombre.setText(pasajero.getNombre());
        txtApellidoP.setText(pasajero.getApellidoP());
        txtApellidoM.setText(pasajero.getApellidoM());
        txtDireccion.setText(pasajero.getDireccion());
    }

    public void cargarCboEmpresas(List<Empresa> empresas) {
        for (Empresa em : empresas) {
            cboEmpresas.addItem(em);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<Empresa> cboEmpresas;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTextField lblNombreEmpresa;
    private javax.swing.JTextField lblNuevaEmpresa;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtRutEmpresa;
    // End of variables declaration//GEN-END:variables
}
