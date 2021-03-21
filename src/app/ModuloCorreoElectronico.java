package app;

import static app.DetalleDeCostos.contrato;
import correo.EnvioDeCorreo;
import iconook.IconOK;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.clases.Contrato;
import model.clases.Encargado;
import model.ws.EncargadoWS;

public class ModuloCorreoElectronico extends javax.swing.JFrame {

    private String rutaExcel;
    private Contrato contrato;
    private Encargado administradorContrato;

    public ModuloCorreoElectronico() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        rutaExcel = DetalleDeCostos.rutaExcel;
        contrato = DetalleDeCostos.contrato;

        txtAsunto.setText("Detalle de costos de contrato N°: " + contrato.getCodigo());
        txtCuerpoMensaje.setText("Junto con saludar, se adjunta planilla con detalle\n"
                + "de costos de contrato: \n"
                + "N°: " + contrato.getCodigo() + "\n"
                + "Nombre: " + contrato.getNombre() + "\n"
                + "Fecha Inicio: " + contrato.getFechaInicio() + " - Fecha Fin: " + contrato.getFechaFin());

        try {
            administradorContrato = new EncargadoWS().getEncargadoForId(contrato.getIdAdmin());

            lblTitulo.setText("Envio de Informe de Ventas a: " + administradorContrato.getEmail());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL BUSCAR DATOS DE ADMINISTRADOR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        lbldireccion.setText(rutaExcel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCuerpoMensaje = new javax.swing.JTextArea();
        lbldireccion = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        btnVolver3 = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        lblExit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Asunto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Envio de Informe de Ventas a: ");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 590, 30));

        txtCuerpoMensaje.setColumns(20);
        txtCuerpoMensaje.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtCuerpoMensaje.setRows(5);
        txtCuerpoMensaje.setText("Junto con saludar, se adjunta planilla con detalle\nde costos de contrato.");
        txtCuerpoMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCuerpoMensaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCuerpoMensajeFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtCuerpoMensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 380, 120));

        lbldireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 380, 30));

        txtAsunto.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtAsunto.setBorder(null);
        txtAsunto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAsuntoFocusGained(evt);
            }
        });
        jPanel1.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 380, 30));

        btnVolver3.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(238, 112, 82));
        btnVolver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnVolver3.setText("VOLVER");
        btnVolver3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnVolver3.setContentAreaFilled(false);
        btnVolver3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolver3MouseMoved(evt);
            }
        });
        btnVolver3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver3MouseExited(evt);
            }
        });
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 140, 50));

        btnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(238, 112, 82));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_112-gmail_email_mail_4202011.png"))); // NOI18N
        btnEnviar.setText("Enviar Correo");
        btnEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEnviarMouseMoved(evt);
            }
        });
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 160, 50));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cuerpo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Archivo adj:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 252, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 540));

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

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String correo = "cuentapruebasjava@gmail.com";
        String pass = "";

        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, pf, "INGRESAR CONTRASEÑA", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (okCxl == JOptionPane.OK_OPTION) {
            pass = new String(pf.getPassword());

            String asunto = txtAsunto.getText();
            String cuerpo = txtCuerpoMensaje.getText();
            String destinatario = administradorContrato.getEmail().toLowerCase();
            System.out.println(rutaExcel);

            try {
                new EnvioDeCorreo().enviarConGmail(destinatario, asunto, cuerpo, pass, correo, rutaExcel);

                JOptionPane.showMessageDialog(null, "ARCHIVO ENVIADO CORRECTAMENTE", "EXITO", JOptionPane.PLAIN_MESSAGE, new IconOK().getIcon());

                new DetalleDeCostos().setVisible(true);
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR ENVIAR ARCHIVO POR CORREO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtAsuntoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAsuntoFocusGained
        txtAsunto.selectAll();
    }//GEN-LAST:event_txtAsuntoFocusGained

    private void txtCuerpoMensajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuerpoMensajeFocusGained
        txtCuerpoMensaje.selectAll();
    }//GEN-LAST:event_txtCuerpoMensajeFocusGained

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseMoved
        btnEnviar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnEnviarMouseMoved

    private void btnVolver3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseMoved
        btnVolver3.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolver3MouseMoved

    private void btnVolver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseExited
        btnVolver3.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolver3MouseExited

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        new DetalleDeCostos().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolver3ActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloCorreoElectronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloCorreoElectronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloCorreoElectronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloCorreoElectronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloCorreoElectronico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextArea txtCuerpoMensaje;
    // End of variables declaration//GEN-END:variables
}
