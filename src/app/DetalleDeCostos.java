package app;

import app.uieditor.SimpleHeaderRenderer;
import exportar.ExportarExcel;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Encargado;
import model.clases.VistaConsultaDeCostos;
import model.clases.VistaRegistrosServiciosDetalle;
import model.ws.EmpresaWS;
import model.ws.EncargadoWS;
import model.ws.PasajeroWS;
import model.ws.VistaConsultaDeCostosWS;
import model.ws.VistaRegistrosServiciosDetalleWS;

public class DetalleDeCostos extends javax.swing.JFrame {

    private DefaultTableModel dtmModelo;
    private DefaultTableModel dtmModeloContrato;
    private DefaultTableModel dtmModeloDetalleRegistros;
    private VistaConsultaDeCostos costos;
    private VistaConsultaDeCostosWS conn;
    private List<VistaRegistrosServiciosDetalle> vistaRegistrosDetalle;
    public static String rutaExcel;
    public static Contrato contrato;

    public DetalleDeCostos() {
        initComponents();
        this.setLocationRelativeTo(null);

        btnExcel.setEnabled(false);
        btnEnviarCorreo.setEnabled(false);

        conn = new VistaConsultaDeCostosWS();
        contrato = ConsultarServicios.contrato;

        tblDetalleContrato.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
        tblDetalleDeCostos.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
        tblDetallesDeCosteo.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());

        formatoTabla();
        formatoTablaContrato();
        formatoTablaVistaRegistroDetallado();

        limpiarTablaContrato();
        try {
            cargartablaContrato();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR DATOS DE CONTRATO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleDeCostos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver3 = new javax.swing.JButton();
        lblExit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalleContrato = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtDesde = new com.toedter.calendar.JDateChooser();
        txtHasta = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetallesDeCosteo = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnEnviarCorreo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblDetalleDeCostos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        tblDetalleDeCostos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Contrato", "Fecha Inicio", "Fecha Fin", "Valor de Menu", "Total de Comidas a la Fecha", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Trabajadores Asignados", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalleDeCostos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDetalleDeCostos.setFillsViewportHeight(true);
        tblDetalleDeCostos.setGridColor(new java.awt.Color(255, 255, 255));
        tblDetalleDeCostos.setSelectionBackground(new java.awt.Color(220, 220, 220));
        tblDetalleDeCostos.setSelectionForeground(new java.awt.Color(238, 112, 82));
        tblDetalleDeCostos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalleDeCostosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalleDeCostos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1300, 40));

        lblTotal.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL DE COSTEO: ");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 190, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

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
        jPanel1.add(btnVolver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 140, 50));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 40, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel5.setText("Hasta: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 60, 40));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblDetalleContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tblDetalleContrato.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDetalleContrato.setGridColor(new java.awt.Color(255, 255, 255));
        tblDetalleContrato.setSelectionBackground(new java.awt.Color(220, 220, 220));
        tblDetalleContrato.setSelectionForeground(new java.awt.Color(238, 112, 82));
        jScrollPane2.setViewportView(tblDetalleContrato);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1300, 40));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel6.setText("DETALLES DE CONTRATO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        txtDesde.setBackground(new java.awt.Color(255, 255, 255));
        txtDesde.setForeground(new java.awt.Color(238, 112, 82));
        txtDesde.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel1.add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 160, 40));

        txtHasta.setBackground(new java.awt.Color(255, 255, 255));
        txtHasta.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel1.add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 160, 40));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel7.setText("Detalle de Costos: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel8.setText("Desde:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 60, 40));

        tblDetallesDeCosteo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tblDetallesDeCosteo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDetallesDeCosteo.setGridColor(new java.awt.Color(255, 255, 255));
        tblDetallesDeCosteo.setSelectionBackground(new java.awt.Color(238, 112, 82));
        tblDetallesDeCosteo.setSelectionForeground(new java.awt.Color(220, 220, 220));
        jScrollPane3.setViewportView(tblDetallesDeCosteo);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 630, 270));

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel9.setText("Resumen de Costos:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(238, 112, 82));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_5_330396.png"))); // NOI18N
        btnGenerar.setText("GENERAR");
        btnGenerar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGenerarMouseMoved(evt);
            }
        });
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarMouseExited(evt);
            }
        });
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 160, 150, 40));

        btnExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnExcel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(238, 112, 82));
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_119_Excel_logo_logos_4373169.png"))); // NOI18N
        btnExcel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnExcel.setContentAreaFilled(false);
        btnExcel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnExcelMouseMoved(evt);
            }
        });
        btnExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcelMouseExited(evt);
            }
        });
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, 140, 50));

        btnEnviarCorreo.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviarCorreo.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnEnviarCorreo.setForeground(new java.awt.Color(153, 153, 153));
        btnEnviarCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_112-gmail_email_mail_4202011.png"))); // NOI18N
        btnEnviarCorreo.setText("ENVIAR");
        btnEnviarCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEnviarCorreo.setContentAreaFilled(false);
        btnEnviarCorreo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEnviarCorreoMouseMoved(evt);
            }
        });
        btnEnviarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarCorreoMouseExited(evt);
            }
        });
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 600, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDetalleDeCostosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetalleDeCostosMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = tblDetalleDeCostos.rowAtPoint(evt.getPoint());
            int columna = tblDetalleDeCostos.columnAtPoint(evt.getPoint());
            if ((fila > -1) && (columna > -1)) {
                JOptionPane.showMessageDialog(null, dtmModelo.getValueAt(fila, 0));
            }
        }
    }//GEN-LAST:event_tblDetalleDeCostosMouseClicked

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

    private void btnVolver3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseMoved
        btnVolver3.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolver3MouseMoved

    private void btnVolver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseExited
        btnVolver3.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolver3MouseExited

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        new ConsultarServicios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver3ActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaDesde = txtDesde.getDate();
            Date fechaHasta = txtHasta.getDate();

            System.out.println("Date-1: "
                    + dFormat.format(fechaDesde));
            System.out.println("Date-2: "
                    + dFormat.format(fechaHasta));

            Date fechaInicioContrato = dFormat.parse(contrato.getFechaInicio());
            Date fechaFinContrato = dFormat.parse(contrato.getFechaFin());

            if (fechaDesde.before(fechaInicioContrato) || fechaHasta.after(fechaFinContrato)) {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL RANGO DEFECHAS ENTRE LAS FECHAS DEL CONTRATO", "ERROR", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    costos = conn.getCostosPorContrato(contrato.getCodigo(), dFormat.format(fechaDesde), dFormat.format(fechaHasta));

                    limpiarTabla();
                    cargartabla(costos);

                    limpiarTablaDetallesRegistros();
                    try {
                        cargarTablaRegistrosDetallada(new VistaRegistrosServiciosDetalleWS().getRegistroDetallado(contrato.getId(), dFormat.format(fechaDesde), dFormat.format(fechaHasta)));
                        System.out.println("tabla cargada se supone");

                        btnExcel.setEnabled(true);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "ERROR AL CARGAR DETALLES DE REGISTROS", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                    lblTotal.setText("TOTAL DE COSTEO: $" + costos.getTotal());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR DE BUSQUEDA DE DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

            /*
             */
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE INGRESO DE DATOS DE FECHA" + e.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        try {
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
            
            System.out.println(contrato.getIdEmpresa());
            
            String fechaDesde = dFormat.format(txtDesde.getDate());
            String fechaHasta = dFormat.format(txtHasta.getDate());
            
            new ExportarExcel().exportarExcel(
                    tblDetalleContrato, tblDetalleDeCostos, tblDetallesDeCosteo
                    ,contrato.getIdEmpresa(), new EncargadoWS().getEncargadoForId(contrato.getIdAdmin())
                    ,fechaDesde, fechaHasta);

            rutaExcel = ExportarExcel.rutaExcel;

            btnEnviarCorreo.setEnabled(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR EXCEL", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnGenerarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseExited
        btnGenerar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnGenerarMouseExited

    private void btnGenerarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseMoved
        btnGenerar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnGenerarMouseMoved

    private void btnExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMouseExited
        if (btnExcel.isEnabled()) {
            btnExcel.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        }
    }//GEN-LAST:event_btnExcelMouseExited

    private void btnExcelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMouseMoved
        if (btnExcel.isEnabled()) {
            btnExcel.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
        } else {
            btnExcel.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        }
    }//GEN-LAST:event_btnExcelMouseMoved

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        new ModuloCorreoElectronico().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void btnEnviarCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarCorreoMouseExited
        if (btnEnviarCorreo.isEnabled()) {
            btnEnviarCorreo.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
            btnEnviarCorreo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_btnEnviarCorreoMouseExited

    private void btnEnviarCorreoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarCorreoMouseMoved
        if (btnEnviarCorreo.isEnabled()) {
            btnEnviarCorreo.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
            btnEnviarCorreo.setForeground(new Color(238, 112, 82));
        } else {
            btnEnviarCorreo.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
            btnEnviarCorreo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_btnEnviarCorreoMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalleDeCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleDeCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleDeCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleDeCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleDeCostos().setVisible(true);
            }
        });
    }

    private void formatoTabla() {
        dtmModelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };

        tblDetalleDeCostos.setModel(dtmModelo);

        dtmModelo.addColumn("CANT DESAY.");
        dtmModelo.addColumn("VALOR DESAY.");
        dtmModelo.addColumn("SUBTOTAL DESAY.");
        dtmModelo.addColumn("CANT ALM.");
        dtmModelo.addColumn("VALOR ALM.");
        dtmModelo.addColumn("SUBTOTAL ALM.");
        dtmModelo.addColumn("CANT CENAS.");
        dtmModelo.addColumn("VALOR CENA.");
        dtmModelo.addColumn("SUBTOTAL CENA.");
        dtmModelo.addColumn("CANT TOTAL SERVICIOS.");
        dtmModelo.addColumn("TOTAL VENTAS.");
    }

    private void formatoTablaContrato() {
        dtmModeloContrato = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };

        tblDetalleContrato.setModel(dtmModeloContrato);

        dtmModeloContrato.addColumn("NUMERO");
        dtmModeloContrato.addColumn("NOMBRE");
        dtmModeloContrato.addColumn("FECHA INICIO");
        dtmModeloContrato.addColumn("FECHA FIN");
        dtmModeloContrato.addColumn("N° TRABAJADORES ASIGNADOS");
        dtmModeloContrato.addColumn("ESTADO");
    }

    private void formatoTablaVistaRegistroDetallado() {
        dtmModeloDetalleRegistros = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dtmModeloDetalleRegistros.addColumn("NOMBRE");
        dtmModeloDetalleRegistros.addColumn("APELLIDO");
        dtmModeloDetalleRegistros.addColumn("SERVICIO");
        dtmModeloDetalleRegistros.addColumn("FECHA");

        tblDetallesDeCosteo.setModel(dtmModeloDetalleRegistros);
    }

    private void cargartablaContrato() throws IOException {
        String estado = "";
        if (contrato.getEstado().equals("0")) {
            estado = "CADUCO";
        } else if (contrato.getEstado().equals("1")) {
            estado = "ACTIVO";
        }

        Object[] fila = new Object[6];

        fila[0] = contrato.getCodigo();
        fila[1] = contrato.getNombre();
        fila[2] = contrato.getFechaInicio();
        fila[3] = contrato.getFechaFin();
        fila[4] = new PasajeroWS().getCantidadDePasajerosPorContrato(contrato.getCodigo());
        fila[5] = estado;

        dtmModeloContrato.addRow(fila);
    }

    private void cargarTablaRegistrosDetallada(List<VistaRegistrosServiciosDetalle> lista) {
        Object[] fila = new Object[4];

        for (VistaRegistrosServiciosDetalle vista : lista) {
            fila[0] = vista.getNombrePasajero();
            fila[1] = vista.getApellidoPasajero();
            fila[2] = vista.getServicio();
            fila[3] = vista.getFecha();

            dtmModeloDetalleRegistros.addRow(fila);
        }
    }

    private void cargartabla(VistaConsultaDeCostos costosContrato) {

        Object[] fila = new Object[11];

        fila[0] = costosContrato.getCantidadDesayunosServidos();
        fila[1] = "$ "+costosContrato.getValorDesayuno();

        if (costosContrato.getTotalDesayuno() == 0) {
            fila[2] = "$ 0";
        } else {
            fila[2] = "$ "+costosContrato.getTotalDesayuno();
        }

        fila[3] = costosContrato.getCantidadAlmuerzoServidos();
        fila[4] = "$ "+costosContrato.getValorAlmuerzo();

        if (costosContrato.getTotalAlmuerzo() == 0) {
            fila[5] = "$ 0";
        } else {
            fila[5] = "$ "+costosContrato.getTotalAlmuerzo();
        }

        fila[6] = costosContrato.getCantidadCenasServidas();
        fila[7] = "$ "+costosContrato.getValorCena();

        if (costosContrato.getTotalCenas() == 0) {
            fila[8] = "$ 0";
        } else {
            fila[8] = "$ "+costosContrato.getTotalCenas();
        }

        if (costosContrato.getTotalDeServiciosServidos() == 0) {
            fila[9] = "0";
        } else {
            fila[9] = costosContrato.getTotalDeServiciosServidos();
        }

        if (costosContrato.getTotal() == 0) {
            fila[10] = "$ 0";
        } else {
            fila[10] = "$ "+costosContrato.getTotal();
        }

        dtmModelo.addRow(fila);
    }

    private void limpiarTabla() {
        if (dtmModelo.getRowCount() > 0) {
            for (int i = dtmModelo.getRowCount() - 1; i > -1; i--) {
                dtmModelo.removeRow(i);
            }
        }
    }

    private void limpiarTablaDetallesRegistros() {
        if (dtmModeloDetalleRegistros.getRowCount() > 0) {
            for (int i = dtmModeloDetalleRegistros.getRowCount() - 1; i > -1; i--) {
                dtmModeloDetalleRegistros.removeRow(i);
            }
        }
    }

    private void limpiarTablaContrato() {
        if (dtmModeloContrato.getRowCount() > 0) {
            for (int i = dtmModeloContrato.getRowCount() - 1; i > -1; i--) {
                dtmModeloContrato.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarCorreo;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblDetalleContrato;
    private javax.swing.JTable tblDetalleDeCostos;
    private javax.swing.JTable tblDetallesDeCosteo;
    private com.toedter.calendar.JDateChooser txtDesde;
    private com.toedter.calendar.JDateChooser txtHasta;
    // End of variables declaration//GEN-END:variables
}
