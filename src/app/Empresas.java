package app;


import app.uieditor.PropiedadesCBO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.clases.Empresa;
import model.clases.Encargado;
import model.ws.EmpresaWS;
import model.ws.EncargadoWS;
import validacionesCampos.InsertTextField;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Empresas extends javax.swing.JFrame {

    private List<Empresa> lista;
    public static Empresa empresa;
    private EmpresaWS conn;

    public Empresas() {
        initComponents();
        this.setLocationRelativeTo(null);
        cboEmpresas.setUI(PropiedadesCBO.createUI(rootPane));
        txtRutBuscar.setDocument(new InsertTextField(txtRutBuscar, 10));

        conn = new EmpresaWS();

        try {
            lista = conn.getAllEmpresas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR EMPRESAS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        for (Empresa em : lista) {
            cboEmpresas.addItem(em);
        }

        btnEditar.setEnabled(false);
        btnEditar.setForeground(new Color(153, 153, 153));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cboEmpresas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnNuevaEmpresa = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblRutEmpresa = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblPuestoRepre = new javax.swing.JLabel();
        lblRutRepre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblNombreRepre = new javax.swing.JLabel();
        lblTelefonoRepre = new javax.swing.JLabel();
        lblEmailRepre = new javax.swing.JLabel();
        txtRutBuscar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblExit = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel3.setText("Empresas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 820, 10));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel4.setText("Buscar Empresas por RUT: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        cboEmpresas.setName(""); // NOI18N
        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });
        jPanel1.add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel5.setText("Datos de la Empresa: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel6.setText("Contacto Representante: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(238, 112, 82));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_wheel_49631.png"))); // NOI18N
        btnEditar.setText("MODIFICAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEditar.setContentAreaFilled(false);
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
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 140, 40));

        btnNuevaEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevaEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnNuevaEmpresa.setForeground(new java.awt.Color(238, 112, 82));
        btnNuevaEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_social_statistics_piechart_diagram_web_information_info_2701085.png"))); // NOI18N
        btnNuevaEmpresa.setText("NUEVA EMPRESA");
        btnNuevaEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnNuevaEmpresa.setContentAreaFilled(false);
        btnNuevaEmpresa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNuevaEmpresaMouseMoved(evt);
            }
        });
        btnNuevaEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaEmpresaMouseExited(evt);
            }
        });
        btnNuevaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 170, 41));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(238, 112, 82));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnVolver.setContentAreaFilled(false);
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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 140, 41));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setLabelFor(lblNombreEmpresa);
        jLabel7.setText("Nombre");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 112, 82));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rut");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 112, 82));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Direccion");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, 40));

        lblRutEmpresa.setBackground(new java.awt.Color(255, 204, 153));
        lblRutEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblRutEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRutEmpresa.setText("rut");
        lblRutEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblRutEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, 40));

        lblNombreEmpresa.setBackground(new java.awt.Color(255, 204, 153));
        lblNombreEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreEmpresa.setText("nom");
        lblNombreEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, 40));

        lblDireccion.setBackground(new java.awt.Color(255, 204, 153));
        lblDireccion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDireccion.setText("direccion");
        lblDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 190, 40));

        lblPuestoRepre.setBackground(new java.awt.Color(255, 204, 153));
        lblPuestoRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblPuestoRepre.setText("puesto");
        lblPuestoRepre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblPuestoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 190, 40));

        lblRutRepre.setBackground(new java.awt.Color(255, 204, 153));
        lblRutRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblRutRepre.setText("rut");
        lblRutRepre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblRutRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 190, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 112, 82));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nombre");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 90, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 112, 82));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Rut");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 90, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 112, 82));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Puesto");
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 90, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 112, 82));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Telefono");
        jLabel13.setToolTipText("");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 90, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 112, 82));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Email");
        jLabel14.setToolTipText("");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 90, 40));

        lblNombreRepre.setBackground(new java.awt.Color(255, 204, 153));
        lblNombreRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblNombreRepre.setText("nom2");
        lblNombreRepre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblNombreRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 190, 40));

        lblTelefonoRepre.setBackground(new java.awt.Color(255, 204, 153));
        lblTelefonoRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblTelefonoRepre.setText("telefono");
        lblTelefonoRepre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblTelefonoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 190, 40));

        lblEmailRepre.setBackground(new java.awt.Color(255, 204, 153));
        lblEmailRepre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblEmailRepre.setText("email");
        lblEmailRepre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lblEmailRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 190, 40));

        txtRutBuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        txtRutBuscar.setText("Ingrese Rut");
        txtRutBuscar.setBorder(null);
        txtRutBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRutBuscarFocusGained(evt);
            }
        });
        txtRutBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtRutBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 30));

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel15.setText("Busca En Lista de empresas: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 820, 10));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 210, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new InicioUsuario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        new EmpresaEditar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaEmpresaActionPerformed
        new EmpresaCrear().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevaEmpresaActionPerformed

    private void txtRutBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutBuscarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                empresa = conn.getEmpresaPorRut(txtRutBuscar.getText());

                lblNombreEmpresa.setText(empresa.getNombre());
                lblRutEmpresa.setText(empresa.getRut());
                lblDireccion.setText(empresa.getDireccion());

                Encargado encargado = new EncargadoWS().getEncargadoForId(empresa.getIdRepresentante());

                lblNombreRepre.setText(encargado.getNombre());
                lblRutRepre.setText(encargado.getRut());
                lblTelefonoRepre.setText(encargado.getTelefono());
                lblEmailRepre.setText(encargado.getEmail());
                lblPuestoRepre.setText(encargado.getPuesto());

                btnEditar.setEnabled(true);
                btnEditar.setForeground(new Color(238,112,82));
            } catch (IOException ex) {
                Logger.getLogger(Empresas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtRutBuscarKeyReleased

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
        empresa = (Empresa) cboEmpresas.getSelectedItem();

        lblNombreEmpresa.setText(empresa.getNombre());
        lblRutEmpresa.setText(empresa.getRut());
        lblDireccion.setText(empresa.getDireccion());

        try {
            Encargado encargado = new EncargadoWS().getEncargadoForId(empresa.getIdRepresentante());

            lblNombreRepre.setText(encargado.getNombre());
            lblRutRepre.setText(encargado.getRut());
            lblTelefonoRepre.setText(encargado.getTelefono());
            lblEmailRepre.setText(encargado.getEmail());
            lblPuestoRepre.setText(encargado.getPuesto());

            btnEditar.setEnabled(true);
            btnEditar.setForeground(new Color(238,112,82));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE SERVIDOR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cboEmpresasActionPerformed

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolverMouseMoved

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseMoved
        btnEditar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnEditarMouseMoved

    private void btnNuevaEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaEmpresaMouseExited
        btnNuevaEmpresa.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnNuevaEmpresaMouseExited

    private void btnNuevaEmpresaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaEmpresaMouseMoved
        btnNuevaEmpresa.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnNuevaEmpresaMouseMoved

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void txtRutBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutBuscarFocusGained
        txtRutBuscar.selectAll();
    }//GEN-LAST:event_txtRutBuscarFocusGained

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
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevaEmpresa;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Empresa> cboEmpresas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmailRepre;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreRepre;
    private javax.swing.JLabel lblPuestoRepre;
    private javax.swing.JLabel lblRutEmpresa;
    private javax.swing.JLabel lblRutRepre;
    private javax.swing.JLabel lblTelefonoRepre;
    private javax.swing.JTextField txtRutBuscar;
    // End of variables declaration//GEN-END:variables
}
