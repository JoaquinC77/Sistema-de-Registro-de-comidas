package app;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.VistaConsultaDeCostos;
import model.ws.VistaConsultaDeCostosWS;

public class DetalleDeCostos extends javax.swing.JFrame {

    private DefaultTableModel dtmModelo;
    private DefaultTableModel dtmModeloContrato;
    private VistaConsultaDeCostos costos;
    private VistaConsultaDeCostosWS conn;
    private Contrato contrato;

    public DetalleDeCostos() {
        initComponents();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        conn = new VistaConsultaDeCostosWS();
        contrato = ConsultarServicios.contrato;

        formatoTabla();
        formatoTablaContrato();

        try {
            costos = conn.getCostosPorContrato(contrato.getCodigo());

            limpiarTabla();
            limpiarTablaContrato();
            cargartabla(costos);
            cargartablaContrato(costos);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE BUSQUEDA DE DATOS");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleDeCostos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver3 = new javax.swing.JButton();
        lblExit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalleContrato = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetalleDeCostos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
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
        tblDetalleDeCostos.setGridColor(new java.awt.Color(0, 0, 0));
        tblDetalleDeCostos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tblDetalleDeCostos.setSelectionForeground(new java.awt.Color(238, 112, 82));
        tblDetalleDeCostos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalleDeCostosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalleDeCostos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1240, 100));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel4.setText("DETALLES DE CONTRATO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

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
        jPanel1.add(btnVolver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 140, 50));

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 40, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setText("Detalle de Costo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));

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
        jScrollPane2.setViewportView(tblDetalleContrato);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1240, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 530));

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

        dtmModelo.addColumn("N° DESAYUNOS SERVIDOS");
        dtmModelo.addColumn("VALOR DESAYUNO");
        dtmModelo.addColumn("SUBTOTAL DESAYUNO");
        dtmModelo.addColumn("N° ALMUERZOS SERVIDOS");
        dtmModelo.addColumn("VALOR ALMUERZO");
        dtmModelo.addColumn("SUBTOTAL ALMUERZO");
        dtmModelo.addColumn("N° CENAS SERVIDAS");
        dtmModelo.addColumn("VALOR CENA");
        dtmModelo.addColumn("SUBTOTAL CENA");
        dtmModelo.addColumn("N° SERVICIOS TOTAL");
        dtmModelo.addColumn("TOTAL VENTAS");
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

    private void cargartablaContrato(VistaConsultaDeCostos costosContrato) {
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
        fila[4] = costosContrato.getCantidadTrabajadores();
        fila[5] = estado;

        dtmModeloContrato.addRow(fila);
    }

    private void cargartabla(VistaConsultaDeCostos costosContrato) {

        Object[] fila = new Object[11];

        fila[0] = costosContrato.getCantidadDesayunosServidos();
        fila[1] = costosContrato.getValorDesayuno();
        fila[2] = costosContrato.getTotalDesayuno();
        fila[3] = costosContrato.getCantidadAlmuerzoServidos();
        fila[4] = costosContrato.getValorAlmuerzo();
        fila[5] = costosContrato.getTotalAlmuerzo();
        fila[6] = costosContrato.getCantidadCenasServidas();
        fila[7] = costosContrato.getValorCena();
        fila[8] = costosContrato.getTotalCenas();
        fila[9] = costosContrato.getTotalDeServiciosServidos();
        fila[10] = costosContrato.getTotal();

        dtmModelo.addRow(fila);
    }

    private void limpiarTabla() {
        if (dtmModelo.getRowCount() > 0) {
            for (int i = dtmModelo.getRowCount() - 1; i > -1; i--) {
                dtmModelo.removeRow(i);
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
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTable tblDetalleContrato;
    private javax.swing.JTable tblDetalleDeCostos;
    // End of variables declaration//GEN-END:variables
}
