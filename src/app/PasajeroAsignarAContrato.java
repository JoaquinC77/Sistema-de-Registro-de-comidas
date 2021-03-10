package app;

import app.uieditor.PropiedadesCBO;
import app.uieditor.SimpleHeaderRenderer;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.Empresa;
import model.clases.Pasajero;
import model.ws.ContratoPasajeroWS;
import model.ws.ContratoWS;
import model.ws.EmpresaWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class PasajeroAsignarAContrato extends javax.swing.JFrame {

    private Pasajero pasajero;
    private ContratoPasajeroWS conn;
    private EmpresaWS connEmpresa;
    private ContratoWS connContrato;
    private List<Empresa> listaEmpresa;
    private List<Contrato> listaContrato;
    private Empresa empresa;
    private DefaultTableModel dtmModeloContrato;
    private DefaultTableModel dtmModeloPasajero;
    private Contrato contrato;

    public PasajeroAsignarAContrato() {
        try {
            initComponents();
            
            this.setLocationRelativeTo(null);

            dtmModeloContrato = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;//To change body of generated methods, choose Tools | Templates.
                }
            };

            dtmModeloPasajero = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;//To change body of generated methods, choose Tools | Templates.
                }
            };

            pasajero = Pasajeros.pasajero;

            connEmpresa = new EmpresaWS();
            connContrato = new ContratoWS();
            conn = new ContratoPasajeroWS();

            empresa = connEmpresa.getEmpresaForIDPasajero(pasajero.getId());
            lblEmpresaNombre.setText(empresa.getNombre());
            
            listaContrato = connContrato.getContratosActivosoCaducosForIDEmpresa(empresa.getId(),true);
            llenarCBOContrato(listaContrato);
            cboContratos.setUI(PropiedadesCBO.createUI(rootPane));

            tblDatosContrato.setModel(dtmModeloContrato);
            dtmModeloContrato.addColumn("FECHA INICIO");
            dtmModeloContrato.addColumn("FECHA FIN");

            tblDatosPasajero.setModel(dtmModeloPasajero);
            dtmModeloPasajero.addColumn("RUT");
            dtmModeloPasajero.addColumn("NOMBRE");
            dtmModeloPasajero.addColumn("APELLIDO PATERNO");
            dtmModeloPasajero.addColumn("APELLIDO MATERNO");
            
            tblDatosContrato.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
            tblDatosPasajero.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());

            cargarTablaPasajero(pasajero);
        } catch (IOException ex) {
            Logger.getLogger(PasajeroAsignarAContrato.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosPasajero = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEmpresaNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboContratos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosContrato = new javax.swing.JTable();
        dateChooserFechaInicio = new com.toedter.calendar.JDateChooser();
        dateChooserFechaFin = new com.toedter.calendar.JDateChooser();
        btnCancelar = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();

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
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 40, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel8.setText("Asignacion: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 10));

        tblDatosPasajero.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tblDatosPasajero.setForeground(new java.awt.Color(238, 112, 82));
        tblDatosPasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDatosPasajero.setSelectionBackground(new java.awt.Color(238, 112, 82));
        tblDatosPasajero.setSelectionForeground(new java.awt.Color(220, 220, 220));
        jScrollPane1.setViewportView(tblDatosPasajero);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 680, 40));

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel9.setText("Pasajero: Asignar a contrato");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel5.setText("Ultima Empresa Asociada Al RUT de Pasajero: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lblEmpresaNombre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblEmpresaNombre.setText("  :");
        jPanel1.add(lblEmpresaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 280, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel6.setText("Contratos de Empresa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        cboContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContratosActionPerformed(evt);
            }
        });
        jPanel1.add(cboContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 180, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel7.setText("Vigencia de Contrato");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        tblDatosContrato.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        tblDatosContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tblDatosContrato);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 680, 40));

        dateChooserFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateChooserFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 310, 30));

        dateChooserFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateChooserFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 306, 30));

        btnCancelar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(238, 112, 82));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnCancelar.setText("VOLVER");
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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 140, 40));

        btnAsignar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(238, 112, 82));
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_save_floppy_disk_3380379.png"))); // NOI18N
        btnAsignar.setText("ASIGNAR");
        btnAsignar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAsignar.setContentAreaFilled(false);
        btnAsignar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAsignarMouseMoved(evt);
            }
        });
        btnAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignarMouseExited(evt);
            }
        });
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Pasajeros().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cboContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContratosActionPerformed
        limpiartablaContrato();
        
        if(cboContratos.getSelectedItem() != null){
            contrato = (Contrato) cboContratos.getSelectedItem();
            
            cargartablaFecha(contrato);
        }
    }//GEN-LAST:event_cboContratosActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
            
            String fechaInicio = String.valueOf(sdf.format(dateChooserFechaInicio.getDate()));
            String fechaFin = String.valueOf(sdf.format(dateChooserFechaFin.getDate()));
            
            if(conn.insertContratoPasajero(pasajero.getId(), contrato.getId(), fechaInicio, fechaFin)){
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO","EXITO",JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "ERROR DE INGRESO","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "POR FAVOR VERIFIQUE DATOS CORRECTAMENTE, Y VUELVA A INTENTARLO","ERROR DE INGRESO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
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

    private void btnAsignarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseExited
        btnAsignar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnAsignarMouseExited

    private void btnAsignarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseMoved
        btnAsignar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnAsignarMouseMoved

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
            java.util.logging.Logger.getLogger(PasajeroAsignarAContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasajeroAsignarAContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasajeroAsignarAContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasajeroAsignarAContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasajeroAsignarAContrato().setVisible(true);
            }
        });
    }

    public void llenarCBOContrato(List<Contrato> lista) {
        for (Contrato c : lista) {
            cboContratos.addItem(c);
        }
    }

    private void cargartablaFecha(Contrato co) {
        Object[] fila = new Object[2];

        fila[0] = co.getFechaInicio();
        fila[1] = co.getFechaFin();

        dtmModeloContrato.addRow(fila);
    }
    

    private void cargarTablaPasajero(Pasajero p) {
        Object[] fila = new Object[4];

        fila[0] = p.getRut();
        fila[1] = p.getNombre();
        fila[2] = p.getApellidoP();
        fila[3] = p.getApellidoM();

        dtmModeloPasajero.addRow(fila);
    }
    
    private void limpiartablaContrato(){
        if (dtmModeloContrato.getRowCount() > 0) {
            for (int i = dtmModeloContrato.getRowCount() - 1; i > -1; i--) {
                dtmModeloContrato.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<Contrato> cboContratos;
    private com.toedter.calendar.JDateChooser dateChooserFechaFin;
    private com.toedter.calendar.JDateChooser dateChooserFechaInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEmpresaNombre;
    private javax.swing.JLabel lblExit;
    private javax.swing.JTable tblDatosContrato;
    private javax.swing.JTable tblDatosPasajero;
    // End of variables declaration//GEN-END:variables
}
