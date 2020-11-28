package app;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Buscar Pasajero: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 90, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTEL INFORMATICO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 11, 369, 65));

        jLabel2.setText("logo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 35, 65));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Pasajero");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 546, 10));

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 176, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Datos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 546, 10));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, 540, 100));

        btnNuevoPasajero.setText("Registro");
        btnNuevoPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPasajeroActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 124, 40));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 349, 126, 40));

        btnAsignacionEmpresa.setText("Asign/Empresas");
        btnAsignacionEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignacionEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 349, 127, 40));

        btnAsignacionContrato.setText("Asign/Contrato");
        btnAsignacionContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionContratoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignacionContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (Login.tipouser.equals("0")) {
            new InicioUser().setVisible(true);
            this.setVisible(false);
        } else if (Login.tipouser.equals("1")) {
            new InicioTrabajador().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevoPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPasajeroActionPerformed
        new PasajeroCrear().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoPasajeroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPasajero(txtRut.getText());

        cargarTabla();

        btnAsignacionEmpresa.setEnabled(true);
        btnAsignacionContrato.setEnabled(true);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarPasajero(txtRut.getText());

            cargarTabla();

            btnAsignacionEmpresa.setEnabled(true);
            btnAsignacionContrato.setEnabled(true);
        }
    }//GEN-LAST:event_txtRutKeyReleased

    private void btnAsignacionEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionEmpresaActionPerformed
        new PasajeroAsignarAEmpresa().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsignacionEmpresaActionPerformed

    private void btnAsignacionContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionContratoActionPerformed
        new PasajeroAsignarAContrato().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsignacionContratoActionPerformed

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

    public void buscarPasajero(String rut) {
        try {
            pasajero = conn.getPasajero(rut);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignacionContrato;
    private javax.swing.JButton btnAsignacionEmpresa;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevoPasajero;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblDatosPasajero;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
