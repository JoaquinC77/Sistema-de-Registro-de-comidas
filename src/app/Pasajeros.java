package app;

import app.uieditor.SimpleHeaderRenderer;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Pasajero;
import model.ws.ContratoWS;
import model.ws.EmpresaWS;
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
    public static Contrato contrato;
    public static Empresa empresa;
    private PasajeroWS conn;
    private DefaultTableModel modelPasajero, modelEmpresa, modelContrato;
    int num;

    public Pasajeros() {
        initComponents();

        btnAsignacionEmpresa.setEnabled(false);
        btnAsignacionContrato.setEnabled(false);
        btnEditarPasajero.setEnabled(false);
        btnAsignacionEmpresa.setForeground(new Color(153, 153, 153));
        btnAsignacionContrato.setForeground(new Color(153, 153, 153));
        btnEditarPasajero.setForeground(new Color(153, 153, 153));

        this.setLocationRelativeTo(null);

        tblContratoAsociado1.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
        tblDatosPasajero1.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
        tblEmpresaAsociada1.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());

        createTableEmpresa();
        createTablaContrato();
        formatoTablaPasajero();

        conn = new PasajeroWS();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtRut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnNuevoPasajero = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAsignacionEmpresa = new javax.swing.JButton();
        btnAsignacionContrato = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresaAsociada1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatosPasajero1 = new javax.swing.JTable();
        btnEditarPasajero = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblContratoAsociado1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel4.setText("Buscar Pasajero: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(238, 112, 82));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_5_330396.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBuscarMouseMoved(evt);
            }
        });
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 120, 50));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Pasajero");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 780, 10));

        txtRut.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txtRut.setForeground(new java.awt.Color(153, 153, 153));
        txtRut.setBorder(null);
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setText("Datos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 780, 10));

        btnNuevoPasajero.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnNuevoPasajero.setForeground(new java.awt.Color(238, 112, 82));
        btnNuevoPasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_add_user_1902270.png"))); // NOI18N
        btnNuevoPasajero.setText("REGISTRO");
        btnNuevoPasajero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnNuevoPasajero.setContentAreaFilled(false);
        btnNuevoPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPasajero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNuevoPasajeroMouseMoved(evt);
            }
        });
        btnNuevoPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoPasajeroMouseExited(evt);
            }
        });
        btnNuevoPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPasajeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 120, 40));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 120, 40));

        btnAsignacionEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnAsignacionEmpresa.setForeground(new java.awt.Color(238, 112, 82));
        btnAsignacionEmpresa.setText("ASIGN/EMPRESAS");
        btnAsignacionEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAsignacionEmpresa.setContentAreaFilled(false);
        btnAsignacionEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignacionEmpresa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAsignacionEmpresaMouseMoved(evt);
            }
        });
        btnAsignacionEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignacionEmpresaMouseExited(evt);
            }
        });
        btnAsignacionEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacionEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 160, 40));

        btnAsignacionContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnAsignacionContrato.setForeground(new java.awt.Color(238, 112, 82));
        btnAsignacionContrato.setText("ASIGN/CONTRATO");
        btnAsignacionContrato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAsignacionContrato.setContentAreaFilled(false);
        btnAsignacionContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignacionContrato.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAsignacionContratoMouseMoved(evt);
            }
        });
        btnAsignacionContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignacionContratoMouseExited(evt);
            }
        });
        btnAsignacionContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionContratoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignacionContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 160, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, 10));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblEmpresaAsociada1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        tblEmpresaAsociada1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Fecha Inicial", "Fecha Fin", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpresaAsociada1.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmpresaAsociada1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblEmpresaAsociada1.setSelectionForeground(new java.awt.Color(238, 112, 82));
        jScrollPane1.setViewportView(tblEmpresaAsociada1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 780, 50));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblDatosPasajero1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        tblDatosPasajero1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "RUT", "Nombre "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatosPasajero1.setGridColor(new java.awt.Color(255, 255, 255));
        tblDatosPasajero1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblDatosPasajero1.setSelectionForeground(new java.awt.Color(238, 112, 82));
        jScrollPane3.setViewportView(tblDatosPasajero1);
        tblDatosPasajero1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 780, 50));

        btnEditarPasajero.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnEditarPasajero.setForeground(new java.awt.Color(238, 112, 82));
        btnEditarPasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_wheel_49631.png"))); // NOI18N
        btnEditarPasajero.setText("MODIFICAR");
        btnEditarPasajero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEditarPasajero.setContentAreaFilled(false);
        btnEditarPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPasajero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEditarPasajeroMouseMoved(evt);
            }
        });
        btnEditarPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarPasajeroMouseExited(evt);
            }
        });
        btnEditarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPasajeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 120, 40));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblContratoAsociado1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblContratoAsociado1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        tblContratoAsociado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblContratoAsociado1.setGridColor(new java.awt.Color(255, 255, 255));
        tblContratoAsociado1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblContratoAsociado1.setSelectionForeground(new java.awt.Color(238, 112, 82));
        jScrollPane4.setViewportView(tblContratoAsociado1);
        tblContratoAsociado1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 780, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignacionEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionEmpresaActionPerformed
        new PasajeroAsignarAEmpresa().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsignacionEmpresaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (Login.tipouser.equals("0")) {
            new InicioUsuario().setVisible(true);
            this.setVisible(false);
        } else if (Login.tipouser.equals("1")) {
            new InicioTrabajador().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        limpiarTablaEmpresa();
        limpiarTablaContrato();
        try {
            boolean ok = buscarPasajero(txtRut.getText());
            if (ok == false) {
                JOptionPane.showMessageDialog(this, "NO SE ENCUENTRA PASAJERO ", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                cargarTablaPasajero();
                boolean okEmpresa = buscarEmpresa(pasajero.getId());
                if (okEmpresa == false) {
                    JOptionPane.showMessageDialog(this, "0 EMPRESA ASOCIADA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btnAsignacionEmpresa.setEnabled(true);
                    btnAsignacionEmpresa.setForeground(new Color(238, 112, 82));
                } else {
                    cargarTablaEmpresa();
                    btnAsignacionEmpresa.setEnabled(false);
                    btnAsignacionEmpresa.setForeground(new Color(153, 153, 153));
                    btnEditarPasajero.setEnabled(true);
                    btnEditarPasajero.setForeground(new Color(238, 112, 82));

                    boolean okContrato = buscarContrato(pasajero.getId(), empresa.getId());
                    if (okContrato == false) {
                        JOptionPane.showMessageDialog(this, "0 CONTRATO ASOCIADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        cargarTablaContrato();
                    }

                }
                btnAsignacionContrato.setEnabled(true);
                btnAsignacionContrato.setForeground(new Color(238, 112, 82));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE BUSQUEDA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPasajeroActionPerformed
        new PasajeroCrear().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoPasajeroActionPerformed

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        limpiarTabla();
        limpiarTablaEmpresa();
        limpiarTablaContrato();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean ok = buscarPasajero(txtRut.getText());
            if (ok == false) {
                JOptionPane.showMessageDialog(this, "NO SE ENCUENTRA PASAJERO ", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                cargarTablaPasajero();
                boolean okEmpresa = buscarEmpresa(pasajero.getId());
                if (okEmpresa == false) {
                    JOptionPane.showMessageDialog(this, "0 EMPRESA ASOCIADA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btnAsignacionEmpresa.setEnabled(true);
                    btnAsignacionEmpresa.setForeground(new Color(238, 112, 82));
                } else {
                    cargarTablaEmpresa();
                    btnAsignacionEmpresa.setEnabled(false);
                    btnAsignacionEmpresa.setForeground(new Color(153, 153, 153));
                    btnEditarPasajero.setEnabled(true);
                    btnEditarPasajero.setForeground(new Color(238, 112, 82));

                    boolean okContrato = buscarContrato(pasajero.getId(), empresa.getId());
                    if (okContrato == false) {
                        JOptionPane.showMessageDialog(this, "0 CONTRATO ASOCIADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        cargarTablaContrato();
                    }

                }
                btnAsignacionContrato.setEnabled(true);
                btnAsignacionContrato.setForeground(new Color(238, 112, 82));
            }

        }
    }//GEN-LAST:event_txtRutKeyReleased

    private void btnAsignacionContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionContratoActionPerformed
        new PasajeroAsignarAContrato().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsignacionContratoActionPerformed

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseMoved
        btnBuscar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnBuscarMouseMoved

    private void btnNuevoPasajeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoPasajeroMouseExited
        btnNuevoPasajero.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnNuevoPasajeroMouseExited

    private void btnNuevoPasajeroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoPasajeroMouseMoved
        btnNuevoPasajero.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnNuevoPasajeroMouseMoved

    private void btnAsignacionContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionContratoMouseExited
        btnAsignacionContrato.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnAsignacionContratoMouseExited

    private void btnAsignacionContratoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionContratoMouseMoved
        btnAsignacionContrato.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnAsignacionContratoMouseMoved

    private void btnAsignacionEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionEmpresaMouseExited
        btnAsignacionEmpresa.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnAsignacionEmpresaMouseExited

    private void btnAsignacionEmpresaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignacionEmpresaMouseMoved
        btnAsignacionEmpresa.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnAsignacionEmpresaMouseMoved

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolverMouseMoved

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnEditarPasajeroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPasajeroMouseMoved
        btnEditarPasajero.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnEditarPasajeroMouseMoved

    private void btnEditarPasajeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPasajeroMouseExited
        btnEditarPasajero.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnEditarPasajeroMouseExited

    private void btnEditarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPasajeroActionPerformed
        new PasajeroEditar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarPasajeroActionPerformed

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

    public boolean buscarPasajero(String rut) {
        try {
            if (conn.getPasajero(rut) == null) {
                return false;
            } else {
                pasajero = conn.getPasajero(rut);
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean buscarEmpresa(String idPasajero) {
        try {
            if (new EmpresaWS().getEmpresaForIDPasajero(idPasajero) == null) {
                return false;
            } else {
                empresa = new EmpresaWS().getEmpresaForIDPasajero(idPasajero);
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean buscarContrato(String idPasajero, String idEmpresa) {
        try {
            if (new ContratoWS().getContratoForIDEmpresaIDPasajero(idPasajero, idEmpresa) == null) {
                return false;
            } else {
                contrato = new ContratoWS().getContratoForIDEmpresaIDPasajero(idPasajero, idEmpresa);
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
            return false;
        }
    }

    private void createTableEmpresa() {
        modelEmpresa = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelEmpresa.addColumn("RUT");
        modelEmpresa.addColumn("Nombre");

        tblEmpresaAsociada1.setModel(modelEmpresa);
    }

    private void createTablaContrato() {
        modelContrato = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelContrato.addColumn("NUMERO");
        modelContrato.addColumn("NOMBRE");
        modelContrato.addColumn("FECHA INICIO");
        modelContrato.addColumn("FECHA FIN");
        modelContrato.addColumn("ESTADO");

        tblContratoAsociado1.setModel(modelContrato);
    }

    private void cargarTablaContrato() {
        Object[] filaContrato = new Object[5];
        filaContrato[0] = contrato.getCodigo();
        filaContrato[1] = contrato.getNombre();
        filaContrato[2] = contrato.getFechaInicio();
        filaContrato[3] = contrato.getFechaFin();
        String estado = "";
        if (contrato.getEstado().equals("1")) {
            estado = "ACTIVO";
        } else {
            estado = "DESACTIVO";
        }

        filaContrato[4] = estado;

        modelContrato.addRow(filaContrato);
    }

    private void cargarTablaEmpresa() {
        Object[] filaEmpresa = new Object[2];
        filaEmpresa[0] = empresa.getRut();
        filaEmpresa[1] = empresa.getNombre();

        modelEmpresa.addRow(filaEmpresa);
    }

    private void limpiarTablaEmpresa() {
        if (modelEmpresa.getRowCount() > 0) {
            for (int i = modelEmpresa.getRowCount() - 1; i > -1; i--) {
                modelEmpresa.removeRow(i);
            }
        }
    }

    public void formatoTablaPasajero() {
        modelPasajero = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;// return false para que asi la tabla no pueda ser editable
            }
        };

        modelPasajero.addColumn("RUT");
        modelPasajero.addColumn("Nombre");
        modelPasajero.addColumn("Apellido P");
        modelPasajero.addColumn("Apellido M");
        modelPasajero.addColumn("Direccion");

        tblDatosPasajero1.setModel(modelPasajero);
    }

    public void cargarTablaPasajero() {

        Object[] fila = new Object[5];
        fila[0] = pasajero.getRut();
        fila[1] = pasajero.getNombre();
        fila[2] = pasajero.getApellidoP();
        fila[3] = pasajero.getApellidoM();
        fila[4] = pasajero.getDireccion();

        modelPasajero.addRow(fila);
    }

    private void limpiarTabla() {
        if (modelPasajero.getRowCount() > 0) {
            for (int i = modelPasajero.getRowCount() - 1; i > -1; i--) {
                modelPasajero.removeRow(i);
            }
        }
    }
    
    private void limpiarTablaContrato() {
        if (modelContrato.getRowCount() > 0) {
            for (int i = modelContrato.getRowCount() - 1; i > -1; i--) {
                modelContrato.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignacionContrato;
    private javax.swing.JButton btnAsignacionEmpresa;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarPasajero;
    private javax.swing.JButton btnNuevoPasajero;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTable tblContratoAsociado1;
    private javax.swing.JTable tblDatosPasajero1;
    private javax.swing.JTable tblEmpresaAsociada1;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
