package app;

import app.uieditor.PropiedadesCBO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Pasajero;
import model.ws.ContratoWS;
import model.ws.EmpresaPasajeroWS;
import model.ws.EmpresaWS;
import model.ws.PasajeroWS;

public class ConsultarServicios extends javax.swing.JFrame {

    private Empresa empresa;
    private ContratoWS conn;
    private List<Contrato> listaContratos;
    private List<Empresa> listaEmpresas;
    private DefaultTableModel dtmModeloContratos;
    private DefaultTableModel dtmModeloPasajeros;
    private List<Contrato> listaContratosAC_DES;
    private List<Pasajero> listaPasajeros;
    public static Contrato contrato;
    
    public ConsultarServicios() {
        initComponents();
        this.setLocationRelativeTo(null);
        cboEmpresas.setUI(PropiedadesCBO.createUI(rootPane));
        txtCodigo.setEnabled(false);
        btnVerDetalles.setEnabled(false);

        conn = new ContratoWS();

        try {
            listaEmpresas = new EmpresaWS().getAllEmpresas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error de servidor");
        }

        for (Empresa em : listaEmpresas) {
            cboEmpresas.addItem(em);
        }

        formatoTabla();
        formatoTablaPasajeros();

        tblDatosEmpresa.setEnabled(false);
        txtCodigo.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cboEmpresas = new javax.swing.JComboBox<>();
        txtRutABuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        rbContratoActivo = new javax.swing.JRadioButton();
        rbContratosTodos = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbContratosCaducados1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosEmpresa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPasajerosAsignados = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnVerDetalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 40, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel3.setText("Modulo de Consultas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1090, 10));

        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });
        jPanel1.add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, 40));

        txtRutABuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtRutABuscar.setText("Ingrese Rut Empresa");
        txtRutABuscar.setBorder(null);
        txtRutABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutABuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtRutABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 480, 10));

        txtCodigo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtCodigo.setBorder(null);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 480, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, 10));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel5.setText("Estado Contrato: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        buttonGroup1.add(rbContratoActivo);
        rbContratoActivo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        rbContratoActivo.setText("ACTIVO");
        rbContratoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbContratoActivoActionPerformed(evt);
            }
        });
        jPanel1.add(rbContratoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 223, 190, 30));

        buttonGroup1.add(rbContratosTodos);
        rbContratosTodos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        rbContratosTodos.setText("TODOS");
        rbContratosTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbContratosTodosActionPerformed(evt);
            }
        });
        jPanel1.add(rbContratosTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 190, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel6.setText("Buscar Empresas: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        buttonGroup1.add(rbContratosCaducados1);
        rbContratosCaducados1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        rbContratosCaducados1.setText("CADUCADO");
        rbContratosCaducados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbContratosCaducados1ActionPerformed(evt);
            }
        });
        jPanel1.add(rbContratosCaducados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 190, 30));

        tblDatosEmpresa.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tblDatosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDatosEmpresa.setGridColor(new java.awt.Color(0, 0, 0));
        tblDatosEmpresa.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tblDatosEmpresa.setSelectionForeground(new java.awt.Color(238, 112, 82));
        tblDatosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosEmpresaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatosEmpresa);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 690, 100));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel7.setText("Trabajadores Asignados:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel8.setText("Buscar Contrato por Codigo: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 30));

        tblPasajerosAsignados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPasajerosAsignados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 680, 150));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 140, 50));

        btnVerDetalles.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnVerDetalles.setForeground(new java.awt.Color(238, 112, 82));
        btnVerDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_reload_79528.png"))); // NOI18N
        btnVerDetalles.setText("GENERAR COSTEO");
        btnVerDetalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnVerDetalles.setContentAreaFilled(false);
        btnVerDetalles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVerDetallesMouseMoved(evt);
            }
        });
        btnVerDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerDetallesMouseExited(evt);
            }
        });
        btnVerDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetallesActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 560));

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

    private void txtRutABuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutABuscarKeyReleased
        limpiarTabla();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String rut = txtRutABuscar.getText();

                if (new EmpresaWS().getEmpresaPorRut(rut) != null) {
                    empresa = new EmpresaWS().getEmpresaPorRut(rut);
                    listaContratos = conn.getContratosForIDEmpresa(empresa.getId());

                    cargartabla(listaContratos);
                    txtCodigo.setEnabled(true);

                } else {
                    System.out.println("objeto null no existe");
                }
            } catch (IOException ex) {
                System.out.println("Cayo en el cach");
            }
        }
    }//GEN-LAST:event_txtRutABuscarKeyReleased

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
        if (dtmModeloContratos != null) {
            empresa = (Empresa) cboEmpresas.getSelectedItem();

            limpiarTabla();

            try {
                listaContratos = conn.getContratosForIDEmpresa(empresa.getId());

                cargartabla(listaContratos);
            } catch (IOException ex) {
                System.out.println("Cayo en el catch");
            }
        }
    }//GEN-LAST:event_cboEmpresasActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        String codigo = txtCodigo.getText().toLowerCase();
        List<Contrato> listaContratosBuscados = new ArrayList<>();

        try {
            for (Contrato c : listaContratos) {
                if (c.getNombre().toLowerCase().contains(codigo)) {
                    listaContratosBuscados.add(c);
                    limpiarTabla();
                    cargartabla(listaContratosBuscados);
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void rbContratoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbContratoActivoActionPerformed
        try {
            listaContratos.clear();
            listaContratos = conn.getContratosActivosoCaducosForIDEmpresa(empresa.getId(), true);

            limpiarTabla();
            cargartabla(listaContratos);

            tblDatosEmpresa.setEnabled(true);
            txtCodigo.setEnabled(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE SERVIDOR");
        }
    }//GEN-LAST:event_rbContratoActivoActionPerformed

    private void rbContratosTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbContratosTodosActionPerformed
        try {
            listaContratos.clear();
            listaContratos = conn.getContratosForIDEmpresa(empresa.getId());

            limpiarTabla();
            cargartabla(listaContratos);

            tblDatosEmpresa.setEnabled(true);
            txtCodigo.setEnabled(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE SERVIDOR");
        }
    }//GEN-LAST:event_rbContratosTodosActionPerformed

    private void rbContratosCaducados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbContratosCaducados1ActionPerformed
        try {
            listaContratos.clear();
            listaContratos = conn.getContratosActivosoCaducosForIDEmpresa(empresa.getId(), false);

            limpiarTabla();
            cargartabla(listaContratos);

            tblDatosEmpresa.setEnabled(true);
            txtCodigo.setEnabled(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE SERVIDOR");
        }
    }//GEN-LAST:event_rbContratosCaducados1ActionPerformed

    private void tblDatosEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosEmpresaMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = tblDatosEmpresa.rowAtPoint(evt.getPoint());
            int columna = tblDatosEmpresa.columnAtPoint(evt.getPoint());
            if ((fila > -1) && (columna > -1)) {
                JOptionPane.showMessageDialog(null, dtmModeloContratos.getValueAt(fila, 0));

                int confirmacion = JOptionPane.showConfirmDialog(this,
                        "DESEA VER DETALLE DE CONTRATO: " + String.valueOf(dtmModeloContratos.getValueAt(fila, 1)),
                        "CONFIRMACION",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                //0=yes, 1=no, 2=cancel
                if (confirmacion == 0) {
                    try {
                        limpiarTablaPasajeros();
                        System.out.println("---------------");
                        System.out.println("buscar por codigo: " + dtmModeloContratos.getValueAt(fila, 0));
                        System.out.println("---------------");
                        
                        String codigoContrato = String.valueOf(dtmModeloContratos.getValueAt(fila, 0));
                        
                        
                        listaPasajeros = new PasajeroWS().getPasajerosPorContrato(codigoContrato);
                        contrato = conn.getContratoForCodigo(codigoContrato);
                        btnVerDetalles.setEnabled(true);
                        cargartablaPasajeros(listaPasajeros);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "NO HAY TRABAJADORES EN ESTE CONTRATO");
                    }
                    
                } else if (confirmacion == 1) {
                    System.out.println("Has pulsado No");
                } else if (confirmacion == 2) {
                    System.out.println("Has pulsado Cancel");
                }
            }
        }
    }//GEN-LAST:event_tblDatosEmpresaMouseClicked

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolverMouseMoved

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new InicioUsuario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVerDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetallesActionPerformed
        new DetalleDeCostos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerDetallesActionPerformed

    private void btnVerDetallesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetallesMouseExited
        btnVerDetalles.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVerDetallesMouseExited

    private void btnVerDetallesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetallesMouseMoved
        btnVerDetalles.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVerDetallesMouseMoved

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
            java.util.logging.Logger.getLogger(ConsultarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarServicios().setVisible(true);
            }
        });
    }

    public void formatoTabla() {
        dtmModeloContratos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };

        tblDatosEmpresa.setModel(dtmModeloContratos);

        dtmModeloContratos.addColumn("Numero");
        dtmModeloContratos.addColumn("Nombre");
        dtmModeloContratos.addColumn("Fecha Inicio");
        dtmModeloContratos.addColumn("Fecha Fin");
        dtmModeloContratos.addColumn("Estado");
    }
    
    public void formatoTablaPasajeros(){
        dtmModeloPasajeros = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }};
        
        
        tblPasajerosAsignados.setModel(dtmModeloPasajeros);
        dtmModeloPasajeros.addColumn("RUT");
        dtmModeloPasajeros.addColumn("NOMBRES");
        dtmModeloPasajeros.addColumn("APELLIDO PATERNO");
    }
    
    private void cargartablaPasajeros(List<Pasajero> lista) {
        for (Pasajero p : lista) {
            Object[] fila = new Object[5];

            fila[0] = p.getRut();
            fila[1] = p.getNombre();
            fila[2] = p.getApellidoP();

            dtmModeloPasajeros.addRow(fila);
        }
    }


    private void cargartabla(List<Contrato> lista) {
        for (Contrato c : lista) {
            Object[] fila = new Object[5];

            fila[0] = c.getCodigo();
            fila[1] = c.getNombre();
            fila[2] = c.getFechaInicio();
            fila[3] = c.getFechaFin();
            fila[4] = c.getEstado();

            dtmModeloContratos.addRow(fila);
        }
    }

    private void limpiarTabla() {
        if (dtmModeloContratos.getRowCount() > 0) {
            for (int i = dtmModeloContratos.getRowCount() - 1; i > -1; i--) {
                dtmModeloContratos.removeRow(i);
            }
        }
    }
    
    private void limpiarTablaPasajeros() {
        if (dtmModeloPasajeros.getRowCount() > 0) {
            for (int i = dtmModeloPasajeros.getRowCount() - 1; i > -1; i--) {
                dtmModeloPasajeros.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerDetalles;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Empresa> cboEmpresas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblExit;
    private javax.swing.JRadioButton rbContratoActivo;
    private javax.swing.JRadioButton rbContratosCaducados1;
    private javax.swing.JRadioButton rbContratosTodos;
    private javax.swing.JTable tblDatosEmpresa;
    private javax.swing.JTable tblPasajerosAsignados;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtRutABuscar;
    // End of variables declaration//GEN-END:variables
}
