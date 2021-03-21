package app;

import app.uieditor.SimpleHeaderRenderer;
import iconook.IconOK;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.Encargado;
import model.ws.ContratoWS;
import model.ws.EncargadoWS;
import validacionN.ValidacionN;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class ContratoEditar extends javax.swing.JFrame {

    private DefaultTableModel modelDatos;
    private ContratoWS conn;
    private Contrato contrato;
    private Encargado encargado;

    public ContratoEditar() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            conn = new ContratoWS();

            System.out.println(Contratos.codigoEstatico);

            contrato = conn.getContratoForCodigo(Contratos.codigoEstatico);

            lblTituloContrato.setText("CONTRATO N°: " + contrato.getCodigo());

            //Se rescatan los datos del administrador
            encargado = new EncargadoWS().getEncargadoForId(contrato.getIdAdmin());

            cargarTablaDatos();

            lblFechaInicio.setText(contrato.getFechaInicio());
            lblFechaFin.setText(contrato.getFechaFin());

            txtNombreAdmin.setText(encargado.getNombre());
            txtRutAdmin1.setText(encargado.getRut());
            txtEmailAdmin.setText(encargado.getEmail());
            txtPuestoAdmin.setText(encargado.getPuesto());
            txtTelefonoAdmin.setText(encargado.getTelefono());

            txtNombreAdmin.setEnabled(false);
            txtRutAdmin1.setEnabled(false);

            tblDatosContrato1.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());

        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        lblFechaFin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        lblFechaInicio = new javax.swing.JLabel();
        lblTituloContrato = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosContrato1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtRutAdmin1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtTelefonoAdmin = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtNombreAdmin = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPuestoAdmin = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtEmailAdmin = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaFin.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 160, 30));

        lblFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaFin.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblFechaFin.setText("jLabel3");
        lblFechaFin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFechaFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jPanel1.add(lblFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 160, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel4.setText("Vigencia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel5.setText("Contacto Administrador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txtFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaInicio.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, 30));

        lblFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaInicio.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblFechaInicio.setText("jLabel3");
        lblFechaInicio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFechaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jPanel1.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 30));

        lblTituloContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        lblTituloContrato.setText("Contrato (numero contrato)");
        jPanel1.add(lblTituloContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

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
        tblDatosContrato1.setGridColor(new java.awt.Color(255, 255, 255));
        tblDatosContrato1.setSelectionBackground(new java.awt.Color(220, 220, 220));
        tblDatosContrato1.setSelectionForeground(new java.awt.Color(238, 112, 82));
        jScrollPane2.setViewportView(tblDatosContrato1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 840, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 820, 10));

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(238, 112, 82));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnCancelar.setText("VOLVER");
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

        btnGuardar.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(238, 112, 82));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_save_floppy_disk_3380379.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 150, 40));

        txtRutAdmin1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRutAdmin1.setForeground(new java.awt.Color(153, 153, 153));
        txtRutAdmin1.setToolTipText("INGRESAR RUT");
        txtRutAdmin1.setBorder(null);
        txtRutAdmin1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRutAdmin1.setName(""); // NOI18N
        txtRutAdmin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutAdmin1KeyReleased(evt);
            }
        });
        jPanel1.add(txtRutAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 180, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 180, 10));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel8.setText("Telefono Celular");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        txtTelefonoAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefonoAdmin.setToolTipText("INGRESAR RUT");
        txtTelefonoAdmin.setBorder(null);
        txtTelefonoAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefonoAdmin.setName(""); // NOI18N
        txtTelefonoAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoAdminFocusGained(evt);
            }
        });
        jPanel1.add(txtTelefonoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 180, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 180, 20));

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtNombreAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreAdmin.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreAdmin.setToolTipText("INGRESAR RUT");
        txtNombreAdmin.setBorder(null);
        txtNombreAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreAdmin.setName(""); // NOI18N
        jPanel1.add(txtNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 180, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 180, 10));

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel13.setText("RUT: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel12.setText("Puesto: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        txtPuestoAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPuestoAdmin.setToolTipText("INGRESAR RUT");
        txtPuestoAdmin.setBorder(null);
        txtPuestoAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPuestoAdmin.setName(""); // NOI18N
        jPanel1.add(txtPuestoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 180, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 180, 10));

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel10.setText("Correo Electronico:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        txtEmailAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmailAdmin.setToolTipText("INGRESAR RUT");
        txtEmailAdmin.setBorder(null);
        txtEmailAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmailAdmin.setName(""); // NOI18N
        txtEmailAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailAdminFocusGained(evt);
            }
        });
        txtEmailAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailAdminKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmailAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 180, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 10));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseMoved
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnCancelarMouseMoved

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Contratos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseMoved
        btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnGuardarMouseMoved

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (txtEmailAdmin.getText().isEmpty() || txtFechaFin.getDateFormatString().isEmpty()
                    || txtFechaInicio.getDateFormatString().isEmpty() || txtNombreAdmin.getText().isEmpty()
                    || txtPuestoAdmin.getText().isEmpty() || txtRutAdmin1.getText().isEmpty()
                    || txtTelefonoAdmin.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "DEBE INGRESAR TODOS LOS CAMPOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            } else {
                if (!txtPuestoAdmin.getText().equals(encargado.getPuesto())
                        || !txtEmailAdmin.getText().equals(encargado.getEmail())
                        || !txtTelefonoAdmin.getText().equals(encargado.getTelefono())) {

                    encargado.setPuesto(txtPuestoAdmin.getText().toUpperCase());
                    encargado.setEmail(txtEmailAdmin.getText().toUpperCase());
                    encargado.setTelefono(txtTelefonoAdmin.getText().toUpperCase());

                    if (new EncargadoWS().updateEncargado(encargado)) {
                        JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO", "EXITO", JOptionPane.PLAIN_MESSAGE, new IconOK().getIcon());
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO","ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }

                SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
                if (txtFechaInicio.getDate() != null || txtFechaFin.getDate() != null) {

                    String datefechaInicio = dFormat.format(txtFechaInicio.getDate());
                    String datefechaFin = dFormat.format(txtFechaFin.getDate());

                    if (!datefechaInicio.equals(contrato.getFechaInicio())
                            || !datefechaFin.equals(contrato.getFechaFin())) {

                        contrato.setFechaInicio(datefechaInicio);
                        contrato.setFechaFin(datefechaFin);

                        if (conn.updateContrato(contrato)) {
                            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO", "EXITO", JOptionPane.PLAIN_MESSAGE, new IconOK().getIcon());
                        } else {
                            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO","ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    System.out.println("NULL");
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE IGRESO DE DATOS","ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRutAdmin1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutAdmin1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRutAdmin1.transferFocus();
        }
    }//GEN-LAST:event_txtRutAdmin1KeyReleased

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void txtEmailAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAdminKeyReleased
        if (txtEmailAdmin.getText().isEmpty()) {
            System.out.println("vacia");
        } else {
            String campoTexto = txtEmailAdmin.getText();

            txtEmailAdmin.setText(new ValidacionN().validar(campoTexto));
        }
    }//GEN-LAST:event_txtEmailAdminKeyReleased

    private void txtEmailAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailAdminFocusGained
        txtEmailAdmin.selectAll();
    }//GEN-LAST:event_txtEmailAdminFocusGained

    private void txtTelefonoAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoAdminFocusGained
        txtTelefonoAdmin.selectAll();
    }//GEN-LAST:event_txtTelefonoAdminFocusGained

    private void cargarTablaDatos() {
        modelDatos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelDatos.addColumn("NUMERO");
        modelDatos.addColumn("EMPRESA");
        modelDatos.addColumn("NOMBRE");

        Object[] filaDatos = new Object[3];

        filaDatos[0] = contrato.getCodigo();
        filaDatos[1] = contrato.getIdEmpresa();
        filaDatos[2] = contrato.getNombre();

        modelDatos.addRow(filaDatos);

        tblDatosContrato1.setModel(modelDatos);
    }

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
            java.util.logging.Logger.getLogger(ContratoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContratoEditar().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblTituloContrato;
    private javax.swing.JTable tblDatosContrato1;
    private javax.swing.JTextField txtEmailAdmin;
    private com.toedter.calendar.JDateChooser txtFechaFin;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    private javax.swing.JTextField txtNombreAdmin;
    private javax.swing.JTextField txtPuestoAdmin;
    private javax.swing.JTextField txtRutAdmin1;
    private javax.swing.JTextField txtTelefonoAdmin;
    // End of variables declaration//GEN-END:variables
}
