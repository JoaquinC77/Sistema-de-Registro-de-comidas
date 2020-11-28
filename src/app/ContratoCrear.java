/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Encargado;
import model.ws.ConexionWS;
import model.ws.ContratoWS;
import model.ws.EmpresaWS;
import model.ws.EncargadoWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class ContratoCrear extends javax.swing.JFrame {

    private List<Empresa> lista;
    private Empresa empresa;
    private ContratoWS conn;
    private Encargado adminContrato;
    private Contrato contrato;
    
    /**
     * Creates new form ContratoCrear
     */
    public ContratoCrear() {
        initComponents();
        this.setLocationRelativeTo(null);

        conn = new ContratoWS();
        adminContrato = null;

        try {
            lista = new EmpresaWS().getAllEmpresas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error de servidor");
        }

        for (Empresa em : lista) {
            cboEmpresas.addItem(em);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloContrato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtPuestoAdmin = new javax.swing.JTextField();
        txtTelefonoAdmin = new javax.swing.JTextField();
        txtEmailAdmin = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRutAdmin = new javax.swing.JTextField();
        txtNombreContrato = new javax.swing.JTextField();
        cboEmpresas = new javax.swing.JComboBox<>();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloContrato.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTituloContrato.setText("Contrato: Crear");
        getContentPane().add(lblTituloContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 770, 10));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTEL INFORMATICO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 369, 65));

        txtPuestoAdmin.setText("Administrador");
        getContentPane().add(txtPuestoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 160, 30));

        txtTelefonoAdmin.setText("80808080");
        getContentPane().add(txtTelefonoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 160, 30));

        txtEmailAdmin.setText("@gmail.com");
        getContentPane().add(txtEmailAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 160, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 160, 46));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_volver.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 446, 150, 70));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Vigencia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtNombreAdmin.setText("Nombre Admin");
        getContentPane().add(txtNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Contacto Administrador");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        txtRutAdmin.setText("11111111-1");
        txtRutAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutAdminFocusLost(evt);
            }
        });
        getContentPane().add(txtRutAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 160, 30));

        txtNombreContrato.setText("Nombre Contrato");
        getContentPane().add(txtNombreContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 230, -1));

        getContentPane().add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, -1));
        getContentPane().add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 160, 30));
        getContentPane().add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Empresa:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Fin:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Telefono Celular");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Inicial: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Correo Electronico:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Puesto: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("RUT: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoestilo3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Contratos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Empresa empresa = (Empresa) cboEmpresas.getSelectedItem();

        String nombre = txtNombreContrato.getText();
        String fechaInicio = new SimpleDateFormat("YYYY-MM-dd").format(txtFechaInicio.getDate());
        String fechaFin = new SimpleDateFormat("YYYY-MM-dd").format(txtFechaFin.getDate());

        try {
            if (adminContrato == null) {
                String nombreAdmin = txtNombreAdmin.getText();
                String rutAdmin = txtRutAdmin.getText();
                String puesto = txtPuestoAdmin.getText();
                String telefono = txtTelefonoAdmin.getText();
                String email = txtEmailAdmin.getText();

                adminContrato = new Encargado("", nombreAdmin, rutAdmin, puesto, telefono, email);

                new EncargadoWS().insertEncargado(adminContrato);
                int idAdmin = new EncargadoWS().getUltimoIdRepresentante();

                // se debe de generar codigo numerico aleatorio para la columna codigo
                contrato = new Contrato("", "", empresa.getId(), nombre, String.valueOf(idAdmin), fechaInicio, fechaFin, "1");

            } else {
                // se debe de generar codigo numerico aleatorio para la columna codigo
                contrato = new Contrato("", "", empresa.getId(), nombre, adminContrato.getId(), fechaInicio, fechaFin, "1");

            }

            System.out.println(contrato);

            if(conn.insertContrato(contrato) == false){
                JOptionPane.showMessageDialog(this, "Error al registrar contrato y/o datos de administrador");
            }

            JOptionPane.showMessageDialog(this, "Registro Exitoso");
            limpiarPantalla();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar contrato y/o datos de administrador");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRutAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutAdminFocusLost
        try {
            String rut = txtRutAdmin.getText();
            if (new EncargadoWS().getEncargadoForRut(rut) != null) {
                adminContrato = new EncargadoWS().getEncargadoForRut(rut);

                txtNombreAdmin.setText(adminContrato.getNombre());
                txtPuestoAdmin.setText(adminContrato.getPuesto());
                txtEmailAdmin.setText(adminContrato.getEmail());
                txtTelefonoAdmin.setText(adminContrato.getTelefono());
            }
        } catch (Exception ex) {
            System.out.println("Entro en el cach");
        }
    }//GEN-LAST:event_txtRutAdminFocusLost

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
            java.util.logging.Logger.getLogger(ContratoCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratoCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratoCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratoCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContratoCrear().setVisible(true);
            }
        });
    }

    public void limpiarPantalla() {
        txtEmailAdmin.setText("");
        txtNombreAdmin.setText("");
        txtNombreContrato.setText("");
        txtPuestoAdmin.setText("");
        txtRutAdmin.setText("");
        txtTelefonoAdmin.setText("");
    }

    public int generarCodigo() {
        int cod = ThreadLocalRandom.current().nextInt(100, 100000000 + 1);
        return cod;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Empresa> cboEmpresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTituloContrato;
    private javax.swing.JTextField txtEmailAdmin;
    private com.toedter.calendar.JDateChooser txtFechaFin;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    private javax.swing.JTextField txtNombreAdmin;
    private javax.swing.JTextField txtNombreContrato;
    private javax.swing.JTextField txtPuestoAdmin;
    private javax.swing.JTextField txtRutAdmin;
    private javax.swing.JTextField txtTelefonoAdmin;
    // End of variables declaration//GEN-END:variables

}
