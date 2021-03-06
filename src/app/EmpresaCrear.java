package app;

import java.awt.Color;
import java.io.IOException;
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
public class EmpresaCrear extends javax.swing.JFrame {

    private EmpresaWS conn;
    private String codigo;
    private Encargado representante;

    public EmpresaCrear() {
        initComponents();
        this.setLocationRelativeTo(null);

        conn = new EmpresaWS();
        representante = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefonoRepre = new javax.swing.JTextField();
        txtEmailRepre = new javax.swing.JTextField();
        txtNombreRepre = new javax.swing.JTextField();
        txtRutRepre = new javax.swing.JTextField();
        txtPuestoRepre = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel4.setText("Empresa: Crear");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        txtNombre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 30));

        txtRut.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRut.setBorder(null);
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 200, 30));

        txtDireccion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 200, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel8.setText("Contacto Representante: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 200, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 200, 10));

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel9.setText("Correo Electronico:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, 20));

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel10.setText("RUT: EJEMPLO (12123123-1)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel11.setText("Datos de la Empresa:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        txtTelefonoRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtTelefonoRepre.setText("8080");
        txtTelefonoRepre.setBorder(null);
        jPanel1.add(txtTelefonoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 200, 40));

        txtEmailRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtEmailRepre.setText("@gmail.com");
        txtEmailRepre.setBorder(null);
        jPanel1.add(txtEmailRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 200, 40));

        txtNombreRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtNombreRepre.setBorder(null);
        jPanel1.add(txtNombreRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 200, 40));

        txtRutRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRutRepre.setBorder(null);
        txtRutRepre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutRepreFocusLost(evt);
            }
        });
        jPanel1.add(txtRutRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 40));

        txtPuestoRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtPuestoRepre.setText("REPRESENTANTE");
        txtPuestoRepre.setBorder(null);
        jPanel1.add(txtPuestoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 200, 40));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 200, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 200, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 200, 10));

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel12.setText("Nombre:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel13.setText("RUT: EJEMPLO (12123123-1)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 20));

        jLabel14.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 20));

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel15.setText("Cargo:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 20));

        jLabel16.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel16.setText("N° Telefono: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 20));

        btnCancelar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(238, 112, 82));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnCancelar.setText("VOLVER");
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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 140, 48));

        btnCrear.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(238, 112, 82));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_document_3380387.png"))); // NOI18N
        btnCrear.setText("NUEVA EMPRESA");
        btnCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 15)));
        btnCrear.setContentAreaFilled(false);
        btnCrear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCrearMouseMoved(evt);
            }
        });
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearMouseExited(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 170, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Empresas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            if (txtDireccion.getText().isEmpty() || txtEmailRepre.getText().isEmpty() || txtNombre.getText().isEmpty()||
                    txtNombreRepre.getText().isEmpty() || txtPuestoRepre.getText().isEmpty() || txtRut.getText().isEmpty() ||
                    txtRutRepre.getText().isEmpty() || txtTelefonoRepre.getText().isEmpty()) {
                
                // si alguno de los campos esta vacio
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR TODOS LOS CAMPOS","ERROR DE INGRESO",JOptionPane.WARNING_MESSAGE);
                
                

            } else {
                if (representante == null) {
                    representante = new Encargado("", txtNombreRepre.getText().toUpperCase(),
                            txtRutRepre.getText(), txtPuestoRepre.getText().toUpperCase(),
                            txtTelefonoRepre.getText().toUpperCase(), txtEmailRepre.getText().toUpperCase());
                    
                    
                    new EncargadoWS().insertEncargado(representante);

                    int idRepresentante = new EncargadoWS().getUltimoIdRepresentante();

                    System.out.println(idRepresentante);
                    conn.insertEmpresa(new Empresa("", txtNombre.getText().toUpperCase(), txtRut.getText(), txtDireccion.getText().toUpperCase(), String.valueOf(idRepresentante)));

                } else {
                    conn.insertEmpresa(new Empresa("", txtNombre.getText().toUpperCase(), txtRut.getText(), txtDireccion.getText().toUpperCase(), representante.getId()));

                }

                JOptionPane.showMessageDialog(this, "Registro Exitoso");

                txtDireccion.setText("");
                txtEmailRepre.setText("");
                txtNombre.setText("");
                txtNombreRepre.setText("");
                txtPuestoRepre.setText("");
                txtRut.setText("");
                txtRutRepre.setText("");
                txtTelefonoRepre.setText("");
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "ERROR AL REGISTRAR");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtRutRepreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutRepreFocusLost
        try {
            String rut = txtRutRepre.getText();
            if (new EncargadoWS().getEncargadoForRut(rut) != null) {
                representante = new EncargadoWS().getEncargadoForRut(rut);

                txtNombreRepre.setText(representante.getNombre());
                txtPuestoRepre.setText(representante.getPuesto());
                txtEmailRepre.setText(representante.getEmail());
                txtTelefonoRepre.setText(representante.getTelefono());
            }
        } catch (Exception ex) {
            System.out.println("Entro en el cach");
        }
    }//GEN-LAST:event_txtRutRepreFocusLost

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
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

    private void btnCrearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseMoved
        btnCrear.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnCrearMouseMoved

    private void btnCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseExited
        btnCrear.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnCrearMouseExited

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
            java.util.logging.Logger.getLogger(EmpresaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresaCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
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
