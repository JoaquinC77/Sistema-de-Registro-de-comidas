package app;

import app.uieditor.PropiedadesCBO;
import iconook.IconOK;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Encargado;
import model.ws.ContratoWS;
import model.ws.EmpresaWS;
import model.ws.EncargadoWS;
import validacionN.ValidacionN;

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

        cboEmpresas.setUI(PropiedadesCBO.createUI(rootPane));

        try {
            lista = new EmpresaWS().getAllEmpresas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE SERVIDOR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        for (Empresa em : lista) {
            cboEmpresas.addItem(em);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloContrato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboEmpresas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtRutAdmin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombreAdmin = new javax.swing.JTextField();
        txtPuestoAdmin = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtTelefonoAdmin = new javax.swing.JTextField();
        txtEmailAdmin = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtNombreContrato = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        lblTituloContrato.setText("Contrato: Crear");
        jPanel1.add(lblTituloContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 790, 10));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel3.setText("Empresa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel6.setText("Nombre: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        cboEmpresas.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        cboEmpresas.setForeground(new java.awt.Color(238, 112, 82));
        cboEmpresas.setBorder(null);
        cboEmpresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel4.setText("Vigencia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaFin.setForeground(new java.awt.Color(238, 112, 82));
        txtFechaFin.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        jPanel1.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 160, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Fin:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        txtFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaInicio.setForeground(new java.awt.Color(238, 112, 82));
        txtFechaInicio.setToolTipText("");
        txtFechaInicio.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        jPanel1.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 160, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Inicial: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setText("Contacto Administrador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel13.setText("RUT: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel8.setText("Telefono Celular");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel12.setText("Puesto: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel10.setText("Correo Electronico:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 150, 40));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 150, 40));

        txtRutAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRutAdmin.setForeground(new java.awt.Color(153, 153, 153));
        txtRutAdmin.setToolTipText("INGRESAR RUT");
        txtRutAdmin.setBorder(null);
        txtRutAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRutAdmin.setName(""); // NOI18N
        txtRutAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutAdminFocusLost(evt);
            }
        });
        txtRutAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutAdminKeyReleased(evt);
            }
        });
        jPanel1.add(txtRutAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 180, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 220, 10));

        txtNombreAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreAdmin.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreAdmin.setToolTipText("INGRESAR RUT");
        txtNombreAdmin.setBorder(null);
        txtNombreAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreAdmin.setName(""); // NOI18N
        txtNombreAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreAdminKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 180, 30));

        txtPuestoAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPuestoAdmin.setForeground(new java.awt.Color(153, 153, 153));
        txtPuestoAdmin.setText("ADMINISTRADOR");
        txtPuestoAdmin.setToolTipText("INGRESAR RUT");
        txtPuestoAdmin.setBorder(null);
        txtPuestoAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPuestoAdmin.setName(""); // NOI18N
        txtPuestoAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPuestoAdminFocusGained(evt);
            }
        });
        jPanel1.add(txtPuestoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 180, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 180, 10));

        txtTelefonoAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefonoAdmin.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefonoAdmin.setText("998765432");
        txtTelefonoAdmin.setToolTipText("INGRESAR RUT");
        txtTelefonoAdmin.setBorder(null);
        txtTelefonoAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefonoAdmin.setName(""); // NOI18N
        txtTelefonoAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoAdminFocusGained(evt);
            }
        });
        jPanel1.add(txtTelefonoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 180, 30));

        txtEmailAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmailAdmin.setForeground(new java.awt.Color(153, 153, 153));
        txtEmailAdmin.setToolTipText("INGRESAR RUT");
        txtEmailAdmin.setBorder(null);
        txtEmailAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmailAdmin.setName(""); // NOI18N
        txtEmailAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailAdminKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmailAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 180, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 180, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 180, 10));

        txtNombreContrato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreContrato.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreContrato.setToolTipText("INGRESAR RUT");
        txtNombreContrato.setBorder(null);
        txtNombreContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreContrato.setName(""); // NOI18N
        txtNombreContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreContratoKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombreContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 220, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 540));

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
        if (txtEmailAdmin.getText().isEmpty() || txtNombreAdmin.getText().isEmpty() || txtNombreContrato.getText().isEmpty()
                || txtPuestoAdmin.getText().isEmpty() || txtRutAdmin.getText().isEmpty() || txtTelefonoAdmin.getText().isEmpty()
                || txtFechaInicio.getDateFormatString().isEmpty() || txtFechaFin.getDateFormatString().isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE INGRESAR TODOS LOS CAMPOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else {

            Empresa empresa = (Empresa) cboEmpresas.getSelectedItem();

            String nombre = txtNombreContrato.getText().toUpperCase();

            try {
                String fechaInicio = new SimpleDateFormat("YYYY-MM-dd").format(txtFechaInicio.getDate());
                String fechaFin = new SimpleDateFormat("YYYY-MM-dd").format(txtFechaFin.getDate());

                if (adminContrato == null) {
                    String nombreAdmin = txtNombreAdmin.getText().toUpperCase();
                    String rutAdmin = txtRutAdmin.getText().toUpperCase();
                    String puesto = txtPuestoAdmin.getText().toUpperCase();
                    String telefono = txtTelefonoAdmin.getText().toUpperCase();
                    String email = txtEmailAdmin.getText().toUpperCase();

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

                if (conn.insertContrato(contrato) == false) {
                    JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR CONTRATO Y/O DATOS DE ADMINISTRADOR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO","EXITO",JOptionPane.PLAIN_MESSAGE, new IconOK().getIcon());
                limpiarPantalla();

            } catch (HeadlessException | IOException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR CONTRATO Y/O DATOS DE ADMINISTRADOR", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRutAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutAdminKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRutAdmin.transferFocus();
        }
    }//GEN-LAST:event_txtRutAdminKeyReleased

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

    private void txtNombreContratoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreContratoKeyReleased
        if (txtNombreContrato.getText().isEmpty()) {
            System.out.println("vacia");
        } else {
            String campoTexto = txtNombreContrato.getText();

            txtNombreContrato.setText(new ValidacionN().validar(campoTexto));
        }
    }//GEN-LAST:event_txtNombreContratoKeyReleased

    private void txtNombreAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAdminKeyReleased
        if (txtNombreAdmin.getText().isEmpty()) {
            System.out.println("vacia");
        } else {
            String campoTexto = txtNombreAdmin.getText();

            txtNombreAdmin.setText(new ValidacionN().validar(campoTexto));
        }
    }//GEN-LAST:event_txtNombreAdminKeyReleased

    private void txtPuestoAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPuestoAdminFocusGained
        txtPuestoAdmin.selectAll();
    }//GEN-LAST:event_txtPuestoAdminFocusGained

    private void txtTelefonoAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoAdminFocusGained
        txtTelefonoAdmin.selectAll();
    }//GEN-LAST:event_txtTelefonoAdminFocusGained

    private void txtEmailAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAdminKeyReleased
        if (txtEmailAdmin.getText().isEmpty()) {
            System.out.println("vacia");
        } else {
            String campoTexto = txtEmailAdmin.getText();

            txtEmailAdmin.setText(new ValidacionN().validar(campoTexto));
        }
    }//GEN-LAST:event_txtEmailAdminKeyReleased

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblExit;
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
