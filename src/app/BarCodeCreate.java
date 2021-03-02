package app;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.clases.Pasajero;
import model.ws.PasajeroWS;

public class BarCodeCreate extends javax.swing.JFrame {

    /**
     * Creates new form BarCodeCreate
     */
    private Pasajero pasajero;

    public BarCodeCreate() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtNombre.setEnabled(false);
        txtApellidoP.setEnabled(false);
        btnGenerarBarCode.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtRutBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnGenerarBarCode = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Buscar Pasajero: (EJ: 12123456-7):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 470, 10));

        txtRutBuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRutBuscar.setBorder(null);
        txtRutBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtRutBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 170, 30));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 30));

        txtNombre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 30));

        txtApellidoP.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtApellidoP.setBorder(null);
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 190, 30));

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel13.setText("Nombre: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel15.setText("Apellido Paterno:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 120, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 190, 10));

        btnGenerarBarCode.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        btnGenerarBarCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_scanning-barcode_3583307 (1).png"))); // NOI18N
        btnGenerarBarCode.setText("Generar Codigo");
        btnGenerarBarCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnGenerarBarCode.setContentAreaFilled(false);
        btnGenerarBarCode.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGenerarBarCodeMouseMoved(evt);
            }
        });
        btnGenerarBarCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarBarCodeMouseExited(evt);
            }
        });
        btnGenerarBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBarCodeActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 190, 50));

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

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

    private void btnGenerarBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBarCodeActionPerformed
        try {
            try {
                abrirPdfBarCode();
            } catch (Exception e) {
                generarPdfBarCode();
                abrirPdfBarCode();
            }
        } catch (Exception ex) {
            System.out.println("ERROR "+ex.getMessage());
            System.out.println("ERROR "+ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnGenerarBarCodeActionPerformed

    private void txtRutBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutBuscarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                pasajero = new PasajeroWS().getPasajero(txtRutBuscar.getText());
                if (pasajero != null) {
                    txtNombre.setText(pasajero.getNombre());
                    txtApellidoP.setText(pasajero.getApellidoP());

                    btnGenerarBarCode.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR DE BUSQUEDA");
                }

            } catch (IOException ex) {
                System.out.println("ERROR " + ex.getLocalizedMessage());
            }

        }
    }//GEN-LAST:event_txtRutBuscarKeyReleased

    private void btnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseMoved
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnCancelarMouseMoved

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Pasajeros().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerarBarCodeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarBarCodeMouseMoved
        btnGenerarBarCode.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnGenerarBarCodeMouseMoved

    private void btnGenerarBarCodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarBarCodeMouseExited
        btnGenerarBarCode.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnGenerarBarCodeMouseExited

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
            java.util.logging.Logger.getLogger(BarCodeCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarCodeCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarCodeCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarCodeCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarCodeCreate().setVisible(true);
            }
        });
    }
    
    private void generarPdfBarCode() throws FileNotFoundException, DocumentException{
        FileOutputStream archivo = new FileOutputStream("codigos/"+pasajero.getRut()+".pdf");
            
            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            Barcode128 code = new Barcode128();
            code.setCode(pasajero.getRut());
            
            Image img = code.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
            
            Font fTitulo = new Font(Font.FontFamily.TIMES_ROMAN, 14.0f, Font.BOLD, BaseColor.BLACK);
            Font fTituloRut = new Font(Font.FontFamily.TIMES_ROMAN, 12.0f, Font.BOLD, BaseColor.BLACK);
            
            Paragraph titulo = new Paragraph("Nombre: "+pasajero.getNombre()+" "+pasajero.getApellidoP(), fTitulo);
            Paragraph tituloRut = new Paragraph("RUT: "+pasajero.getRut(), fTituloRut);
            
            doc.add(titulo);
            doc.add(tituloRut);
            doc.add(img);
            
            doc.close();
    }
    
    private void abrirPdfBarCode(){
        try {
            File path = new File("codigos/"+pasajero.getRut()+".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarBarCode;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRutBuscar;
    // End of variables declaration//GEN-END:variables
}
