package app;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Empresa;
import model.clases.Encargado;
import model.ws.EmpresaWS;
import model.ws.EncargadoWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class EmpresaEditar extends javax.swing.JFrame {

    /**
     * Creates new form EmpresaEditar
     */
    private Empresa empresa;
    private Encargado representante;
    private EncargadoWS connEncargado;
    private EmpresaWS connEmpresa;

    public EmpresaEditar() {
        initComponents();
        this.setLocationRelativeTo(null);

        connEmpresa = new EmpresaWS();
        connEncargado = new EncargadoWS();

        
        txtRut.setEnabled(false);
        txtRutRepre.setEnabled(false);
        txtNombreRepre.setEnabled(false);

        if (Empresas.empresa != null) {
            try {
                empresa = Empresas.empresa;

                txtNombre.setText(empresa.getNombre());
                txtRut.setText(empresa.getRut());
                txtDireccion.setText(empresa.getDireccion());

                representante = connEncargado.getEncargadoForId(empresa.getIdRepresentante());

                txtNombreRepre.setText(representante.getNombre());
                txtPuestoRepre.setText(representante.getPuesto());
                txtEmailRepre.setText(representante.getEmail());
                txtRutRepre.setText(representante.getRut());
                txtTelefonoRepre.setText(representante.getTelefono());
            } catch (IOException ex) {
                System.out.println("ERROR DE BUSQUEDA");
            }
        } else {
            System.out.println("ESTA NULL");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreRepre = new javax.swing.JTextField();
        txtRutRepre = new javax.swing.JTextField();
        txtPuestoRepre = new javax.swing.JTextField();
        txtTelefonoRepre = new javax.swing.JTextField();
        txtEmailRepre = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 10));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel4.setText("Empresa: Editar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel11.setText("Datos de la Empresa:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        txtNombre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 200, 30));

        txtRut.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRut.setBorder(null);
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 30));

        txtDireccion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 200, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 200, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 200, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 200, 10));

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel12.setText("Nombre:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 20));

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel13.setText("RUT: EJEMPLO (12123123-1)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, 20));

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel15.setText("Cargo:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 20));

        jLabel14.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 20));

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel10.setText("RUT: EJEMPLO (12123123-1)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel8.setText("Contacto Representante: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        txtNombreRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtNombreRepre.setBorder(null);
        jPanel1.add(txtNombreRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 200, 30));

        txtRutRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRutRepre.setBorder(null);
        jPanel1.add(txtRutRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 30));

        txtPuestoRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtPuestoRepre.setBorder(null);
        jPanel1.add(txtPuestoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 200, 30));

        txtTelefonoRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtTelefonoRepre.setBorder(null);
        jPanel1.add(txtTelefonoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 40));

        txtEmailRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtEmailRepre.setBorder(null);
        jPanel1.add(txtEmailRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 200, 40));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 200, 10));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 200, 10));

        jLabel16.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel16.setText("N° Telefono: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel9.setText("Correo Electronico:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, 20));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 200, 10));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 200, 10));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCancelarMouseMoved(evt);
            }
        });
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 48));

        btnGuardar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_document_3380387.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnGuardar.setContentAreaFilled(false);
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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 150, 48));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Empresas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (!txtNombre.getText().equals(empresa.getNombre()) || 
                    !txtDireccion.getText().equals(empresa.getDireccion())) {
                empresa.setNombre(txtNombre.getText());
                empresa.setDireccion(txtDireccion.getText());

                if (connEmpresa.updateEmpres(empresa) != false) {
                    JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA");
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR INTENTANDO MODIFICACION");
                }
            }
            
            if(!txtTelefonoRepre.getText().equals(representante.getTelefono()) || 
                    !txtPuestoRepre.getText().equals(representante.getPuesto()) || 
                    !txtEmailRepre.getText().equals(representante.getEmail())){
                
                representante.setTelefono(txtTelefonoRepre.getText());
                representante.setEmail(txtEmailRepre.getText());
                representante.setPuesto(txtPuestoRepre.getText());
                
                if(connEncargado.updateEncargado(representante) != false){
                    JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA");
                }else{
                    JOptionPane.showMessageDialog(this, "ERROR INTENTANDO MODIFICACION");
                }
            }
        } catch (IOException ex) {
            System.out.println("ERROR DE SERVIDOR");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseMoved
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnCancelarMouseMoved

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseMoved
        btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnGuardarMouseMoved

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
            java.util.logging.Logger.getLogger(EmpresaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresaEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmailRepre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreRepre;
    private javax.swing.JTextField txtPuestoRepre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtRutRepre;
    private javax.swing.JTextField txtTelefonoRepre;
    // End of variables declaration//GEN-END:variables
}
