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
import validacionesCampos.InsertTextField;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class PasajeroAsignarAEmpresa extends javax.swing.JFrame {

    private Empresa empresa;
    private EmpresaWS conn;
    private Pasajero pasajero;
    private List<Empresa> listaEmpresa;

    /**
     * Creates new form PasajeroAsignarAEmpresa
     */
    public PasajeroAsignarAEmpresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        cboEmpresas.setUI(PropiedadesCBO.createUI(rootPane));
        txtRutEmpresa.setDocument(new InsertTextField(txtRutEmpresa, 10));

        pasajero = Pasajeros.pasajero;

        txtRutHuesped.setText(pasajero.getRut());
        lblNombreHuesped.setText(pasajero.getNombre() + " " + pasajero.getApellidoP());
        txtRutHuesped.setEnabled(false);

        try {
            conn = new EmpresaWS();
            listaEmpresa = conn.getAllEmpresas();
            cargarCboEmpresas(listaEmpresa);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR EMPRESAS", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        txtRutHuesped = new javax.swing.JTextField();
        lblNombreHuesped = new javax.swing.JLabel();
        btnAsignar = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtRutEmpresa = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cboEmpresas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNombredeEmpresa = new javax.swing.JTextField();
        lblRutEmpresa = new javax.swing.JTextField();
        lblDireccionEmpresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Pasajero: Asignar a empresas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1050, 10));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel4.setText("Pasajero: Asignar a empresas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 1050, 10));

        txtRutHuesped.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRutHuesped.setText("RUT HUESPED:");
        txtRutHuesped.setBorder(null);
        jPanel1.add(txtRutHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 30));

        lblNombreHuesped.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        lblNombreHuesped.setText("Pasajero: Asignar a empresas");
        jPanel1.add(lblNombreHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 230, 20));

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
        jPanel1.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, 200, 60));

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
        jPanel1.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 200, 60));

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
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel8.setText("Buscar por RUT: Ej(78777888-7):");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 40));

        txtRutEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRutEmpresa.setBorder(null);
        txtRutEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutEmpresaKeyReleased(evt);
            }
        });
        jPanel2.add(txtRutEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 40));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 10));

        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });
        jPanel2.add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel5.setText("Buscar por lista: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombredeEmpresa.setEnabled(false);
        jPanel3.add(lblNombredeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 40));

        lblRutEmpresa.setEnabled(false);
        jPanel3.add(lblRutEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 40));

        lblDireccionEmpresa.setEnabled(false);
        jPanel3.add(lblDireccionEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 320, 40));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel1.setText("Direccion: ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel6.setText("Nombre: ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel7.setText("RUT: ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 410, 290));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1060, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

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

                JOptionPane.showMessageDialog(null, "ASIGNACION CORRECTAMENTE REALIZADA", "EXITO", JOptionPane.PLAIN_MESSAGE, new IconOK().getIcon());
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

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
        try {
            empresa = (Empresa) cboEmpresas.getSelectedItem();

            lblNombredeEmpresa.setText(empresa.getNombre());
            lblRutEmpresa.setText(empresa.getRut());
            lblDireccionEmpresa.setText(empresa.getDireccion());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR EMPRESA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cboEmpresasActionPerformed

    private void txtRutEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutEmpresaKeyReleased
        try {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                for (Empresa emp : listaEmpresa) {
                    if (emp.getRut().equals(txtRutEmpresa.getText())) {
                        empresa = emp;
                        lblNombredeEmpresa.setText(empresa.getNombre());
                        lblRutEmpresa.setText(empresa.getRut());
                        lblDireccionEmpresa.setText(empresa.getDireccion());
                        break;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField lblDireccionEmpresa;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblNombreHuesped;
    private javax.swing.JTextField lblNombredeEmpresa;
    private javax.swing.JTextField lblRutEmpresa;
    private javax.swing.JTextField txtRutEmpresa;
    private javax.swing.JTextField txtRutHuesped;
    // End of variables declaration//GEN-END:variables
}
