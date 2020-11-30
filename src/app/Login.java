/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Usuario;
import model.ws.LoginWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public static String tipouser;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRut = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRut.setForeground(new java.awt.Color(153, 153, 153));
        txtRut.setToolTipText("INGRESAR RUT");
        txtRut.setBorder(null);
        txtRut.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRut.setName(""); // NOI18N
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 220, 30));
        txtRut.getAccessibleContext().setAccessibleName("INGRESAR RUT");

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setForeground(new java.awt.Color(238, 112, 82));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setToolTipText("");
        btnIngresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnIngresarMouseMoved(evt);
            }
        });
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 310, 38));

        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setBorder(null);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, 30));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, 30));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("RUT:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_web_3_3924898 (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 252, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 252, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_web_3_3924898___.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 30, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_unlock__access__key__password_2542133.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 30, 30));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String rut, pass;
        
        rut = txtRut.getText();
        pass = String.valueOf(txtPass.getPassword());
        
        iniciarSesion(rut, pass);
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            iniciarSesion(txtRut.getText(), String.valueOf(txtPass.getPassword()));
        }
    }//GEN-LAST:event_txtPassKeyReleased

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRut.transferFocus();
        }
    }//GEN-LAST:event_txtRutKeyReleased

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnIngresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseMoved
        btnIngresar.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
        
    }//GEN-LAST:event_btnIngresarMouseMoved

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_lblExitMouseMoved
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public void iniciarSesion(String rut, String pass){
        try{
            
            Usuario usuario = new LoginWS().loginIniciar(rut, pass);

            if(usuario.getTipo().equals("0")){
                    tipouser = "0";
                    new InicioUsuario().setVisible(true);
                    this.setEnabled(false);
                    this.setVisible(false);
                }else if(usuario.getTipo().equals("1")){
                    tipouser = "1";
                    new InicioTrabajador().setVisible(true);
                    this.setEnabled(false);
                    this.setVisible(false);
                }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error de ingreso: "+ex.getLocalizedMessage());
            txtPass.setText("");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
