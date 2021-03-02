package app;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.clases.Contrato;
import model.clases.Encargado;
import model.ws.ContratoWS;
import model.ws.EncargadoWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class ContratoVer extends javax.swing.JFrame {

    private ContratoWS conn;
    private DefaultTableModel modelDatos, modelVigencia, modelAdmin;
    private Contrato contrato;

    public ContratoVer() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);

            conn = new ContratoWS();
            
            System.out.println(Contratos.codigoEstatico);
            
            contrato = conn.getContratoForCodigo(Contratos.codigoEstatico);

            lblTituloContrato.setText("Contrato: " + contrato.getCodigo());

            //Se rescatan los datos del administrador
            Encargado en = new EncargadoWS().getEncargadoForId(contrato.getIdAdmin());
            
            
            //se cargan las tablas
            cargarTablaDatosContrato();
            cargarTablaVigenciaContrato();
            cargarTablaDatosAdmin(en);
            

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(this, "ERROR AL CARGAR LOS DATOS DEL CONTRATO" + ex.getMessage());
            System.out.println(ex.getMessage());
            System.out.println("--------------");
            System.out.println(ex.getLocalizedMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloContrato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosContrato1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVigenciaContrato1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContactoAdmin = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        lblTituloContrato.setText("Contrato (numero contrato)");
        jPanel1.add(lblTituloContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 740, 10));

        tblDatosContrato1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tblDatosContrato1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDatosContrato1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 740, 95));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel4.setText("Vigencia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        tblVigenciaContrato1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tblVigenciaContrato1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblVigenciaContrato1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 740, 95));

        tblContactoAdmin.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tblContactoAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblContactoAdmin);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 740, 95));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel5.setText("Contacto Administrador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        btnEditar.setBackground(new java.awt.Color(153, 153, 153));
        btnEditar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(238, 112, 82));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_wheel_49631.png"))); // NOI18N
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEditarMouseMoved(evt);
            }
        });
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 150, 40));

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(238, 112, 82));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void btnEditarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseMoved
        btnEditar.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_btnEditarMouseMoved

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        new ContratoEditar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseMoved
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_btnCancelarMouseMoved

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Contratos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ContratoVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratoVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratoVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratoVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContratoVer().setVisible(true);
            }
        });
    }

    public void cargarTablaDatosContrato() {
        //LLenado de la tabla de datos del contrato
        modelDatos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        modelDatos.addColumn("Numero");
        modelDatos.addColumn("Empresa");
        modelDatos.addColumn("Nombre");

        Object[] filaDatos = new Object[3];

        filaDatos[0] = contrato.getCodigo();
        filaDatos[1] = contrato.getIdEmpresa();
        filaDatos[2] = contrato.getNombre();

        modelDatos.addRow(filaDatos);

        tblDatosContrato1.setModel(modelDatos);
    }

    public void cargarTablaVigenciaContrato() {
        //LLenado de la tabla de datos de fechas de vigencia de contrato
        modelVigencia = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        modelVigencia.addColumn("Fecha Inicio");
        modelVigencia.addColumn("Fecha Fin");

        Object[] filaDatoVigencia = new Object[3];

        filaDatoVigencia[0] = contrato.getFechaInicio();
        filaDatoVigencia[1] = contrato.getFechaFin();

        modelVigencia.addRow(filaDatoVigencia);

        tblVigenciaContrato1.setModel(modelVigencia);
    }
    
    public void cargarTablaDatosAdmin(Encargado en){
        //LLenado de la tabla de datos del administrador
            modelAdmin = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; //To change body of generated methods, choose Tools | Templates.
                }
            };
            modelAdmin.addColumn("Nombre");
            modelAdmin.addColumn("RUT");
            modelAdmin.addColumn("E-Mail");
            modelAdmin.addColumn("Telefono");

            Object[] filaDatosAdmin = new Object[4];

            filaDatosAdmin[0] = en.getNombre();
            filaDatosAdmin[1] = en.getRut();
            filaDatosAdmin[2] = en.getEmail();
            filaDatosAdmin[3] = en.getTelefono();

            modelAdmin.addRow(filaDatosAdmin);
            tblContactoAdmin.setModel(modelAdmin);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblTituloContrato;
    private javax.swing.JTable tblContactoAdmin;
    private javax.swing.JTable tblDatosContrato1;
    private javax.swing.JTable tblVigenciaContrato1;
    // End of variables declaration//GEN-END:variables
}
