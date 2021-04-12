package app;

import app.uieditor.PropiedadesCBO;
import iconook.IconOK;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Pasajero;
import model.ws.ConexionWS;
import model.ws.ContratoWS;
import model.ws.EmpresaWS;
import model.ws.PasajeroWS;
import model.ws.RegistroServicioWS;
import validacionesCampos.InsertTextField;

public class RegistroManualServicios extends javax.swing.JFrame {

    /**
     * Creates new form RegistroManualServicios
     */
    
    private RegistroServicioWS conn;
    private Pasajero pasajero;
    private Contrato contrato;
    private Empresa empresa;
    
    
    public RegistroManualServicios() {
        initComponents();
        setLocationRelativeTo(null);
        txtRutABuscar.setDocument(new InsertTextField(txtRutABuscar, 10));
        
        conn = new RegistroServicioWS();
        
        cargarCBO();
        cboServicios.setEnabled(false);
        cboServicios.setUI(PropiedadesCBO.createUI(rootPane));
                
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarConsumo = new javax.swing.JButton();
        txtRutABuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblcontra = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        cboServicios = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblNombrePasajero = new javax.swing.JLabel();
        lblNombreContrato = new javax.swing.JLabel();
        lblcontra1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarConsumo.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarConsumo.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnRegistrarConsumo.setForeground(new java.awt.Color(238, 112, 82));
        btnRegistrarConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_save_floppy_disk_3380379.png"))); // NOI18N
        btnRegistrarConsumo.setText("REGISTRAR");
        btnRegistrarConsumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnRegistrarConsumo.setContentAreaFilled(false);
        btnRegistrarConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarConsumo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegistrarConsumoMouseMoved(evt);
            }
        });
        btnRegistrarConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarConsumoMouseExited(evt);
            }
        });
        btnRegistrarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConsumoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 140, 46));

        txtRutABuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txtRutABuscar.setBorder(null);
        txtRutABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutABuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtRutABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 260, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, 10));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setText("Modulo de Registros Manuales: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        lblcontra.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        lblcontra.setText("Empresa:");
        jPanel1.add(lblcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 150, 20));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel6.setText("Seleccionar Servicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 710, 10));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 30));

        cboServicios.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel1.add(cboServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 150, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel7.setText("Ingrese RUT: Ej(12123123-1)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        lblEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel1.add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 290, 20));

        lbl.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        lbl.setText("Nombre: ");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 20));

        lblNombrePasajero.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel1.add(lblNombrePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 290, 20));

        lblNombreContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel1.add(lblNombreContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 290, 20));

        lblcontra1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        lblcontra1.setText("Contrato Asociado: ");
        jPanel1.add(lblcontra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 20));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(238, 112, 82));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnVolver.setText("VOLVER");
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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 46));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarConsumoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarConsumoMouseMoved
        btnRegistrarConsumo.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnRegistrarConsumoMouseMoved

    private void btnRegistrarConsumoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarConsumoMouseExited
        btnRegistrarConsumo.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnRegistrarConsumoMouseExited

    private void btnRegistrarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConsumoActionPerformed
        String servicio = getServicioDeCbo();
        System.out.println(servicio);
        try {
            if (!conn.getValidacionRegistroExistente(pasajero.getId(), Integer.parseInt(servicio))) {
                try {
                    
                    conn.insertRegistroServicio(pasajero.getId(), contrato.getId(), servicio);

                    JOptionPane.showMessageDialog(null, "REGISTRO DE SERVICIO MANUAL EXITOSO", "EXITO", JOptionPane.PLAIN_MESSAGE, new IconOK().getIcon());
                    
                    txtRutABuscar.setText("");
                    lblEmpresa.setText("");
                    lblNombreContrato.setText("");
                    lblNombrePasajero.setText("");
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "USTED YA ACCEDIO A ESTE SERVICIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarConsumoActionPerformed

    private void txtRutABuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutABuscarKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String rut = txtRutABuscar.getText();
                
                pasajero = new PasajeroWS().getPasajero(rut);
                
                lblNombrePasajero.setText(pasajero.getNombre()+" "+pasajero.getApellidoP());
                
                empresa = new EmpresaWS().getEmpresaForIDPasajero(pasajero.getId());
                
                lblEmpresa.setText(empresa.getNombre());
                
                contrato = new ContratoWS().getContratoForIDEmpresaIDPasajero(pasajero.getId(), empresa.getId());
                
                lblNombreContrato.setText(contrato.getNombre());
                
                cboServicios.setEnabled(true);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR, PASAJERO NO EXISTE O NO ESTA ASIGNADO A UN CONTRATO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtRutABuscarKeyReleased

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
         btnVolver.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolverMouseMoved

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new Pasajeros().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroManualServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroManualServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroManualServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroManualServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroManualServicios().setVisible(true);
            }
        });
    }
    
    private void cargarCBO(){
        cboServicios.addItem("DESAYUNO");
        cboServicios.addItem("ALMUERZO");
        cboServicios.addItem("CENA");
    }
    
    private String getServicioDeCbo(){
        String servicio = "";
        if(cboServicios.getSelectedIndex() == 0){
            servicio = "1";
        }else if(cboServicios.getSelectedIndex() == 1){
            servicio = "2";
        }else if(cboServicios.getSelectedIndex() == 2){
            servicio = "3";
        }
        
        return servicio;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarConsumo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboServicios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblNombreContrato;
    private javax.swing.JLabel lblNombrePasajero;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblcontra1;
    private javax.swing.JTextField txtRutABuscar;
    // End of variables declaration//GEN-END:variables
}
